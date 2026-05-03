package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.ChalkboardTeacher: ImageVector
    get() {
        if (_chalkboardTeacher != null) return _chalkboardTeacher!!
        _chalkboardTeacher = phosphorRegularIcon(
            name = "ChalkboardTeacher",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 216.000 40.000 L 40.000 40.000 C 31.163 40.000 24.000 47.163 24.000 56.000 L 24.000 200.000 C 24.000 208.837 31.163 216.000 40.000 216.000 L 53.390 216.000 C 56.480 216.001 59.295 214.222 60.620 211.430 C 68.561 194.665 85.450 183.977 104.000 183.977 C 122.550 183.977 139.439 194.665 147.380 211.430 C 148.705 214.222 151.520 216.001 154.610 216.000 L 216.000 216.000 C 224.837 216.000 232.000 208.837 232.000 200.000 L 232.000 56.000 C 232.000 47.163 224.837 40.000 216.000 40.000 ZM 80.000 144.000 C 80.000 130.745 90.745 120.000 104.000 120.000 C 117.255 120.000 128.000 130.745 128.000 144.000 C 128.000 157.255 117.255 168.000 104.000 168.000 C 90.745 168.000 80.000 157.255 80.000 144.000 ZM 216.000 200.000 L 159.430 200.000 C 152.749 188.514 142.679 179.376 130.600 173.840 C 142.998 162.800 147.289 145.250 141.383 129.735 C 135.477 114.220 120.601 103.966 104.000 103.966 C 87.399 103.966 72.523 114.220 66.617 129.735 C 60.711 145.250 65.002 162.800 77.400 173.840 C 65.321 179.376 55.251 188.514 48.570 200.000 L 40.000 200.000 L 40.000 56.000 L 216.000 56.000 ZM 56.000 96.000 L 56.000 80.000 C 56.000 75.582 59.582 72.000 64.000 72.000 L 192.000 72.000 C 196.418 72.000 200.000 75.582 200.000 80.000 L 200.000 176.000 C 200.000 180.418 196.418 184.000 192.000 184.000 L 176.000 184.000 C 171.582 184.000 168.000 180.418 168.000 176.000 C 168.000 171.582 171.582 168.000 176.000 168.000 L 184.000 168.000 L 184.000 88.000 L 72.000 88.000 L 72.000 96.000 C 72.000 100.418 68.418 104.000 64.000 104.000 C 59.582 104.000 56.000 100.418 56.000 96.000 Z"),
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
        return _chalkboardTeacher!!
    }

private var _chalkboardTeacher: ImageVector? = null
