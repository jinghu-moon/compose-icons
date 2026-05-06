package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.AirplaneTakeoff: ImageVector
    get() {
        if (_airplaneTakeoff != null) return _airplaneTakeoff!!
        _airplaneTakeoff = phosphorBoldIcon(
            name = "AirplaneTakeoff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M180 216c0 6.627-5.373 12-12 12h-144c-6.627 0-12-5.373-12-12 0-6.627 5.373-12 12-12h144c6.627 0 12 5.373 12 12ZM251.79 89.88c-.631 3.384-2.685 6.334-5.64 8.1L98.75 186l-.13 .07c-16.784 9.854-38.059 7.433-52.2-5.94l-.19-.18-36-35.25C5.415 140.112 3.196 133.431 4.309 126.874 5.422 120.317 9.721 114.742 15.78 112l2.94-1.44c2.843-1.392 6.121-1.604 9.12-.59l26.5 8.94 14.15-8.56L50.42 92.78C45.454 88.18 43.151 81.379 44.302 74.708 45.453 68.037 49.9 62.401 56.12 59.73l.48-.2 7.15-2.7c2.709-1.012 5.691-1.012 8.4 0L124.29 76 174.22 46.2c18.683-11.142 42.713-6.884 56.43 10 .062 .069 .119 .142 .17 .22l18.64 23.88c2.12 2.709 2.97 6.2 2.33 9.58ZM222.18 84.34 212 71.29c-6.236-7.6-17.089-9.504-25.54-4.48L131.69 99.51c-3.106 1.873-6.892 2.24-10.3 1l-46-16.94 21 20.4c2.665 2.591 3.979 6.27 3.558 9.963-.421 3.693-2.529 6.982-5.708 8.907L62 142.29c-3.011 1.814-6.666 2.216-10 1.1L38.65 138.89l24.31 23.8c6.418 5.998 16.011 7.075 23.6 2.65Z"),
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
        return _airplaneTakeoff!!
    }

private var _airplaneTakeoff: ImageVector? = null
