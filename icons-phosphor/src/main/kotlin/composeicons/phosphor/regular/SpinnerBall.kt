package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.SpinnerBall: ImageVector
    get() {
        if (_spinnerBall != null) return _spinnerBall!!
        _spinnerBall = phosphorRegularIcon(
            name = "SpinnerBall",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M128 24C70.562 24 24 70.562 24 128c0 57.438 46.562 104 104 104 57.438 0 104-46.562 104-104C231.939 70.588 185.412 24.061 128 24ZM215.82 122.46c-28.34 20-49.57 14.68-71.87 4.39 20.06-14.19 38.86-32.21 39.53-67.11 19.065 15.473 30.791 38.215 32.34 62.72ZM167.11 49.19C170.24 83.71 155 99.44 135 113.61 132.75 89.13 126.56 63.81 96.63 45.79c22.943-8.767 48.507-7.534 70.5 3.4ZM79.32 54.73c31.45 14.55 37.47 35.58 39.71 60C96.7 104.44 71.68 97.14 41.1 114.05 45.028 89.819 58.879 68.322 79.32 54.73ZM40.18 133.54c28.34-20 49.57-14.68 71.87-4.39C92 143.34 73.19 161.36 72.52 196.26 53.455 180.787 41.729 158.045 40.18 133.54ZM88.89 206.81C85.76 172.29 101 156.56 121 142.39c2.25 24.48 8.44 49.8 38.37 67.82-22.943 8.767-48.507 7.534-70.5-3.4ZM176.68 201.27c-31.45-14.55-37.47-35.58-39.71-60 12.72 5.86 26.31 10.75 41.3 10.75 11.33 0 23.46-2.8 36.63-10.08-3.928 24.234-17.778 45.734-38.22 59.33Z"),
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
