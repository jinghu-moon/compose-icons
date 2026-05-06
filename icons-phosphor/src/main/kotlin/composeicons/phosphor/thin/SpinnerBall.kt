package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.SpinnerBall: ImageVector
    get() {
        if (_spinnerBall != null) return _spinnerBall!!
        _spinnerBall = phosphorThinIcon(
            name = "SpinnerBall",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M128 28C72.772 28 28 72.772 28 128c0 55.228 44.772 100 100 100 55.228 0 100-44.772 100-100C227.939 72.797 183.203 28.061 128 28ZM219.92 124.44c-33.69 24.71-58.55 15.45-83.94 3 23.54-15.86 45.85-33.95 43.34-75.81 24.384 16.394 39.47 43.449 40.6 72.81ZM170.86 46.61C175.4 88.13 155 105 131.55 120.83c-2-28.32-6.47-56.69-44-75.45 26.367-12.927 57.326-12.47 83.3 1.23ZM79 50.18c38.22 16.83 42.63 43 44.58 71.16C98.08 108.88 71.25 98.59 36.24 121.72 38.266 92.418 54.151 65.841 79 50.18ZM36.1 131.56c33.69-24.71 58.55-15.45 83.94-3.05-23.54 15.86-45.85 34-43.34 75.81C52.323 187.941 37.23 160.907 36.08 131.56ZM85.16 209.39C80.6 167.87 101 151 124.45 135.17c2 28.32 6.47 56.69 44 75.45-26.367 12.927-57.326 12.47-83.3-1.23ZM177 205.82c-38.22-16.83-42.63-43-44.58-71.16 14.43 7.05 29.29 13.41 45.81 13.41 12.67 0 26.33-3.74 41.53-13.78-2.028 29.299-17.913 55.872-42.76 71.53Z"),
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
