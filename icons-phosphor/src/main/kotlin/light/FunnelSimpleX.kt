package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.FunnelSimpleX: ImageVector
    get() {
        if (_funnelSimpleX != null) return _funnelSimpleX!!
        _funnelSimpleX = phosphorLightIcon(
            name = "FunnelSimpleX",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 192.000 142.000 L 64.000 142.000 C 60.686 142.000 58.000 139.314 58.000 136.000 C 58.000 132.686 60.686 130.000 64.000 130.000 L 192.000 130.000 C 195.314 130.000 198.000 132.686 198.000 136.000 C 198.000 139.314 195.314 142.000 192.000 142.000 ZM 232.000 82.000 L 24.000 82.000 C 20.686 82.000 18.000 84.686 18.000 88.000 C 18.000 91.314 20.686 94.000 24.000 94.000 L 232.000 94.000 C 235.314 94.000 238.000 91.314 238.000 88.000 C 238.000 84.686 235.314 82.000 232.000 82.000 ZM 128.000 178.000 L 104.000 178.000 C 100.686 178.000 98.000 180.686 98.000 184.000 C 98.000 187.314 100.686 190.000 104.000 190.000 L 128.000 190.000 C 131.314 190.000 134.000 187.314 134.000 184.000 C 134.000 180.686 131.314 178.000 128.000 178.000 ZM 220.240 171.760 C 217.897 169.420 214.103 169.420 211.760 171.760 L 192.000 191.510 L 172.240 171.760 C 169.876 169.557 166.192 169.622 163.907 171.907 C 161.622 174.192 161.557 177.876 163.760 180.240 L 183.510 200.000 L 163.760 219.760 C 162.155 221.256 161.494 223.508 162.037 225.634 C 162.580 227.760 164.240 229.420 166.366 229.963 C 168.492 230.506 170.744 229.845 172.240 228.240 L 192.000 208.490 L 211.760 228.240 C 214.124 230.443 217.808 230.378 220.093 228.093 C 222.378 225.808 222.443 222.124 220.240 219.760 L 200.490 200.000 L 220.240 180.240 C 222.580 177.897 222.580 174.103 220.240 171.760 Z"),
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
        return _funnelSimpleX!!
    }

private var _funnelSimpleX: ImageVector? = null
