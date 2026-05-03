package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.DevToLogo: ImageVector
    get() {
        if (_devToLogo != null) return _devToLogo!!
        _devToLogo = phosphorLightIcon(
            name = "DevToLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 232.000 58.000 L 24.000 58.000 C 16.268 58.000 10.000 64.268 10.000 72.000 L 10.000 184.000 C 10.000 191.732 16.268 198.000 24.000 198.000 L 232.000 198.000 C 239.732 198.000 246.000 191.732 246.000 184.000 L 246.000 72.000 C 246.000 64.268 239.732 58.000 232.000 58.000 ZM 234.000 184.000 C 234.000 185.105 233.105 186.000 232.000 186.000 L 24.000 186.000 C 22.895 186.000 22.000 185.105 22.000 184.000 L 22.000 72.000 C 22.000 70.895 22.895 70.000 24.000 70.000 L 232.000 70.000 C 233.105 70.000 234.000 70.895 234.000 72.000 ZM 126.000 102.000 L 126.000 122.000 L 136.000 122.000 C 139.314 122.000 142.000 124.686 142.000 128.000 C 142.000 131.314 139.314 134.000 136.000 134.000 L 126.000 134.000 L 126.000 154.000 L 144.000 154.000 C 147.314 154.000 150.000 156.686 150.000 160.000 C 150.000 163.314 147.314 166.000 144.000 166.000 L 120.000 166.000 C 116.686 166.000 114.000 163.314 114.000 160.000 L 114.000 96.000 C 114.000 92.686 116.686 90.000 120.000 90.000 L 144.000 90.000 C 147.314 90.000 150.000 92.686 150.000 96.000 C 150.000 99.314 147.314 102.000 144.000 102.000 ZM 213.780 97.620 L 195.780 161.620 C 195.057 164.215 192.694 166.010 190.000 166.010 C 187.306 166.010 184.943 164.215 184.220 161.620 L 166.220 97.620 C 165.325 94.428 167.188 91.115 170.380 90.220 C 173.572 89.325 176.885 91.188 177.780 94.380 L 190.000 137.840 L 202.220 94.380 C 203.115 91.188 206.428 89.325 209.620 90.220 C 212.812 91.115 214.675 94.428 213.780 97.620 ZM 64.000 90.000 L 56.000 90.000 C 52.686 90.000 50.000 92.686 50.000 96.000 L 50.000 160.000 C 50.000 163.314 52.686 166.000 56.000 166.000 L 64.000 166.000 C 80.569 166.000 94.000 152.569 94.000 136.000 L 94.000 120.000 C 94.000 103.431 80.569 90.000 64.000 90.000 ZM 82.000 136.000 C 82.000 145.941 73.941 154.000 64.000 154.000 L 62.000 154.000 L 62.000 102.000 L 64.000 102.000 C 73.941 102.000 82.000 110.059 82.000 120.000 Z"),
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
        return _devToLogo!!
    }

private var _devToLogo: ImageVector? = null
