package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Timer: ImageVector
    get() {
        if (_timer != null) return _timer!!
        _timer = phosphorLightIcon(
            name = "Timer",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 128.000 42.000 C 76.085 42.000 34.000 84.085 34.000 136.000 C 34.000 187.915 76.085 230.000 128.000 230.000 C 179.915 230.000 222.000 187.915 222.000 136.000 C 221.939 84.110 179.890 42.061 128.000 42.000 ZM 128.000 218.000 C 82.713 218.000 46.000 181.287 46.000 136.000 C 46.000 90.713 82.713 54.000 128.000 54.000 C 173.287 54.000 210.000 90.713 210.000 136.000 C 209.945 181.265 173.265 217.945 128.000 218.000 ZM 172.240 91.760 C 174.580 94.103 174.580 97.897 172.240 100.240 L 132.240 140.240 C 130.744 141.845 128.492 142.506 126.366 141.963 C 124.240 141.420 122.580 139.760 122.037 137.634 C 121.494 135.508 122.155 133.256 123.760 131.760 L 163.760 91.760 C 166.103 89.420 169.897 89.420 172.240 91.760 ZM 98.000 16.000 C 98.000 12.686 100.686 10.000 104.000 10.000 L 152.000 10.000 C 155.314 10.000 158.000 12.686 158.000 16.000 C 158.000 19.314 155.314 22.000 152.000 22.000 L 104.000 22.000 C 100.686 22.000 98.000 19.314 98.000 16.000 Z"),
        pathFillType = PathFillType.NonZero,
        fill = SolidColor(Color(0xFF000000)),
        fillAlpha = 1.0f,
        stroke = null,
        strokeAlpha = 1.0f,
        strokeLineWidth = 0.0f,
        strokeLineCap = StrokeCap.Butt,
        strokeLineJoin = StrokeJoin.Miter,
    )
        }
        return _timer!!
    }

private var _timer: ImageVector? = null
