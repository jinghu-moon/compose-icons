package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Alarm: ImageVector
    get() {
        if (_alarm != null) return _alarm!!
        _alarm = phosphorLightIcon(
            name = "Alarm",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 128.000 42.000 C 76.085 42.000 34.000 84.085 34.000 136.000 C 34.000 187.915 76.085 230.000 128.000 230.000 C 179.915 230.000 222.000 187.915 222.000 136.000 C 221.939 84.110 179.890 42.061 128.000 42.000 ZM 128.000 218.000 C 82.713 218.000 46.000 181.287 46.000 136.000 C 46.000 90.713 82.713 54.000 128.000 54.000 C 173.287 54.000 210.000 90.713 210.000 136.000 C 209.945 181.265 173.265 217.945 128.000 218.000 ZM 60.240 36.240 L 28.240 68.240 C 26.744 69.845 24.492 70.506 22.366 69.963 C 20.240 69.420 18.580 67.760 18.037 65.634 C 17.494 63.508 18.155 61.256 19.760 59.760 L 51.760 27.760 C 53.256 26.155 55.508 25.494 57.634 26.037 C 59.760 26.580 61.420 28.240 61.963 30.366 C 62.506 32.492 61.845 34.744 60.240 36.240 ZM 236.240 68.240 C 233.897 70.580 230.103 70.580 227.760 68.240 L 195.760 36.240 C 193.557 33.876 193.622 30.192 195.907 27.907 C 198.192 25.622 201.876 25.557 204.240 27.760 L 236.240 59.760 C 238.580 62.103 238.580 65.897 236.240 68.240 ZM 184.000 130.000 C 187.314 130.000 190.000 132.686 190.000 136.000 C 190.000 139.314 187.314 142.000 184.000 142.000 L 128.000 142.000 C 124.686 142.000 122.000 139.314 122.000 136.000 L 122.000 80.000 C 122.000 76.686 124.686 74.000 128.000 74.000 C 131.314 74.000 134.000 76.686 134.000 80.000 L 134.000 130.000 Z"),
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
        return _alarm!!
    }

private var _alarm: ImageVector? = null
