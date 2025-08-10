// SPDX-FileCopyrightText: © 2022-2025 Greg Christiana <maxuser@minescript.net>
// SPDX-License-Identifier: GPL-3.0-only

package net.minescript.common.events;

import net.minescript.common.Jsonable;

public class SoundEvent extends Jsonable {
  public String type = "sound";
  public String sound;
  public double[] position = new double[3];
  public double x;
  public double y;
  public double z;
  public double time;
  public float volume;
  public float pitch;
  public String source;
}
