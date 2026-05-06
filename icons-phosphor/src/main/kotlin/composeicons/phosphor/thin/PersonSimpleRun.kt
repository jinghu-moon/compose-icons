package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.PersonSimpleRun: ImageVector
    get() {
        if (_personSimpleRun != null) return _personSimpleRun!!
        _personSimpleRun = phosphorThinIcon(
            name = "PersonSimpleRun",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M152 84c15.464 0 28-12.536 28-28C180 40.536 167.464 28 152 28c-15.464 0-28 12.536-28 28 0 15.464 12.536 28 28 28ZM152 36c11.046 0 20 8.954 20 20 0 11.046-8.954 20-20 20C140.954 76 132 67.046 132 56c0-11.046 8.954-20 20-20ZM217.66 137c-.57 .26-6.84 3-18.08 3-13.86 0-35.25-4.15-62.81-22.16-4.566 14.434-11.126 28.16-19.49 40.78 9.47 2.56 23.08 7.5 35.14 16.67 18.3 13.92 27.58 33 27.58 56.68 0 2.209-1.791 4-4 4-2.209 0-4-1.791-4-4 0-15.89-5.88-53.77-59.7-66.37q-1.56 2.06-3.22 4.08C90.23 192.51 66.66 204.4 40.48 204.4q-4.4 0-8.89-.45c-2.209-.221-3.821-2.191-3.6-4.4 .221-2.209 2.191-3.821 4.4-3.6 27.33 2.73 51.06-7.83 70.52-31.41 13.82-16.74 22.89-37.44 26.9-51.32C86.97 86.53 58.81 108.42 58.49 108.65c-1.109 .947-2.647 1.216-4.011 .7-1.365-.516-2.34-1.733-2.546-3.178-.206-1.444 .391-2.886 1.557-3.762 .36-.29 9-7.1 23.84-9.58 13.5-2.27 35-1.26 60.91 16.34 25 17 44.41 21.64 56.29 22.56 12.75 1 19.77-2 19.84-2.05 2.001-.85 4.315 .054 5.21 2.036 .894 1.982 .042 4.315-1.92 5.254Z"),
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
        return _personSimpleRun!!
    }

private var _personSimpleRun: ImageVector? = null
