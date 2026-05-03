package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.DeviceRotate: ImageVector
    get() {
        if (_deviceRotate != null) return _deviceRotate!!
        _deviceRotate = phosphorLightIcon(
            name = "DeviceRotate",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 204.240 220.240 L 180.240 244.240 C 177.876 246.443 174.192 246.378 171.907 244.093 C 169.622 241.808 169.557 238.124 171.760 235.760 L 185.510 222.000 L 80.000 222.000 C 67.850 222.000 58.000 212.150 58.000 200.000 L 58.000 104.000 C 58.000 100.686 60.686 98.000 64.000 98.000 C 67.314 98.000 70.000 100.686 70.000 104.000 L 70.000 200.000 C 70.000 205.523 74.477 210.000 80.000 210.000 L 185.510 210.000 L 171.760 196.240 C 169.557 193.876 169.622 190.192 171.907 187.907 C 174.192 185.622 177.876 185.557 180.240 187.760 L 204.240 211.760 C 206.580 214.103 206.580 217.897 204.240 220.240 ZM 80.000 70.000 C 82.425 69.998 84.611 68.536 85.538 66.295 C 86.466 64.055 85.954 61.476 84.240 59.760 L 70.490 46.000 L 176.000 46.000 C 181.523 46.000 186.000 50.477 186.000 56.000 L 186.000 152.000 C 186.000 155.314 188.686 158.000 192.000 158.000 C 195.314 158.000 198.000 155.314 198.000 152.000 L 198.000 56.000 C 198.000 43.850 188.150 34.000 176.000 34.000 L 70.490 34.000 L 84.240 20.240 C 86.443 17.876 86.378 14.192 84.093 11.907 C 81.808 9.622 78.124 9.557 75.760 11.760 L 51.760 35.760 C 49.420 38.103 49.420 41.897 51.760 44.240 L 75.760 68.240 C 76.884 69.366 78.409 69.999 80.000 70.000 Z"),
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
        return _deviceRotate!!
    }

private var _deviceRotate: ImageVector? = null
