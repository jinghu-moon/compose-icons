package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Waves: ImageVector
    get() {
        if (_waves != null) return _waves!!
        _waves = phosphorBoldIcon(
            name = "Waves",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M225.24 174.74c4.225 5.101 3.518 12.661-1.58 16.89C205.49 206.71 189.06 212 174.15 212c-19.76 0-36.86-9.29-51.88-17.44C97.21 180.94 77.41 170.19 47.66 194.86c-5.103 4.23-12.669 3.523-16.9-1.58-4.231-5.103-3.523-12.669 1.58-16.9 42.25-35 75-17.23 101.39-2.92 25.06 13.61 44.86 24.37 74.61-.3 2.45-2.032 5.608-3.007 8.777-2.711 3.17 .296 6.091 1.84 8.123 4.291ZM208.34 117.15c-29.75 24.67-49.55 13.91-74.61 .3C107.38 103.15 74.59 85.34 32.34 120.37c-5.103 4.23-5.811 11.797-1.58 16.9 4.231 5.103 11.797 5.811 16.9 1.58 29.75-24.67 49.55-13.92 74.61-.3 15 8.15 32.12 17.44 51.88 17.44 14.91 0 31.34-5.29 49.51-20.36 5.103-4.23 5.811-11.797 1.58-16.9-4.23-5.103-11.797-5.811-16.9-1.58ZM47.66 82.84C77.41 58.17 97.21 68.92 122.27 82.54c15 8.15 32.12 17.44 51.88 17.44 14.91 0 31.34-5.29 49.51-20.36 5.103-4.231 5.811-11.797 1.58-16.9-4.23-5.103-11.797-5.811-16.9-1.58-29.75 24.67-49.55 13.92-74.61 .3C107.38 47.14 74.59 29.33 32.34 64.37c-3.381 2.712-5.037 7.036-4.333 11.313 .705 4.277 3.661 7.841 7.734 9.324 4.073 1.483 8.629 .655 11.919-2.167Z"),
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
        return _waves!!
    }

private var _waves: ImageVector? = null
