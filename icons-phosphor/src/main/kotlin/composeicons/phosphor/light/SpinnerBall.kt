package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.SpinnerBall: ImageVector
    get() {
        if (_spinnerBall != null) return _spinnerBall!!
        _spinnerBall = phosphorLightIcon(
            name = "SpinnerBall",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M128 26C71.667 26 26 71.667 26 128c0 56.333 45.667 102 102 102 56.333 0 102-45.667 102-102C229.934 71.694 184.306 26.066 128 26ZM217.89 123.44c-31 22.37-53.66 15.36-77.93 3.75 21.43-14.75 42.27-33.21 41.51-71.54 21.676 16.006 35.04 40.881 36.42 67.79ZM169 47.89c3.84 38-13.53 54.13-35.71 69.34C131.22 91.29 125.67 64 92.06 45.5 116.767 34.718 145.009 35.595 169 47.89ZM79.14 52.45C114 68.15 119.23 91.23 121.32 118 97.82 106.82 71.4 98 38.57 117.83 41.643 91.069 56.525 67.085 79.14 52.45ZM38.14 132.56c31.05-22.37 53.66-15.36 77.93-3.75C94.61 143.56 73.77 162 74.53 200.35 52.854 184.344 39.49 159.469 38.11 132.56ZM87 208.11c-3.84-38 13.53-54.13 35.71-69.34 2.06 25.94 7.61 53.24 41.22 71.73C139.225 221.279 110.988 220.401 87 208.11ZM176.85 203.55C142 187.85 136.77 164.77 134.68 138c13.36 6.36 27.67 12 43.56 12 12.06 0 25-3.23 39.19-11.79-3.088 26.745-17.968 50.711-40.57 65.34Z"),
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
        return _spinnerBall!!
    }

private var _spinnerBall: ImageVector? = null
