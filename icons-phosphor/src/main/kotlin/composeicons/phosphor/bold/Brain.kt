package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Brain: ImageVector
    get() {
        if (_brain != null) return _brain!!
        _brain = phosphorBoldIcon(
            name = "Brain",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M252 124C251.974 101.749 239.665 81.331 220 70.92 219.54 49.215 205.644 30.081 185.147 22.927 164.65 15.773 141.866 22.105 128 38.81 114.134 22.105 91.35 15.773 70.853 22.927 50.356 30.081 36.46 49.215 36 70.92 16.313 81.304 3.992 101.733 3.992 123.99c0 22.257 12.321 42.686 32.008 53.07 .452 21.708 14.345 40.85 34.844 48.009 20.499 7.159 43.288 .828 57.156-15.879 13.868 16.707 36.657 23.038 57.156 15.879 20.499-7.159 34.392-26.301 34.844-48.009C239.673 166.667 251.987 146.249 252 124ZM88 204C75.592 203.998 64.664 195.83 61.15 183.93c1 0 1.89 .07 2.85 .07h8c6.627 0 12-5.373 12-12 0-6.627-5.373-12-12-12h-8C46.457 160.012 31.459 147.377 28.493 130.087 25.527 112.796 35.456 95.885 52 90.05c4.797-1.696 8.003-6.232 8-11.32v-6.73C60 56.536 72.536 44 88 44c15.464 0 28 12.536 28 28v60.18c-2.295-1.471-4.702-2.759-7.2-3.85-6.075-2.651-13.149 .125-15.8 6.2-2.651 6.075 .125 13.149 6.2 15.8 12.162 5.298 18.937 18.404 16.227 31.39C112.717 194.706 101.266 204.008 88 204ZM192 160h-8c-6.627 0-12 5.373-12 12 0 6.627 5.373 12 12 12h8c1 0 1.9 0 2.85-.07-3.674 12.452-15.426 20.746-28.39 20.035-12.964-.711-23.738-10.241-26.027-23.02-2.289-12.78 4.506-25.457 16.417-30.624 6.075-2.651 8.851-9.725 6.2-15.8-2.651-6.075-9.725-8.851-15.8-6.2-2.498 1.091-4.905 2.379-7.2 3.85v-60.17c0-15.464 12.536-28 28-28 15.464 0 28 12.536 28 28v6.73c-.003 5.088 3.203 9.624 8 11.32 16.622 5.784 26.625 22.737 23.651 40.083-2.974 17.346-18.052 30-35.651 29.917ZM208 116c0 6.627-5.373 12-12 12-22.091 0-40-17.909-40-40v-4c0-6.627 5.373-12 12-12 6.627 0 12 5.373 12 12v4c0 8.837 7.163 16 16 16 6.627 0 12 5.373 12 12ZM100 88c0 22.091-17.909 40-40 40-6.627 0-12-5.373-12-12 0-6.627 5.373-12 12-12 8.837 0 16-7.163 16-16v-4C76 77.373 81.373 72 88 72c6.627 0 12 5.373 12 12Z"),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color(0xFF000000)),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
            )
        }
        return _brain!!
    }

private var _brain: ImageVector? = null
