package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.MonitorArrowUp: ImageVector
    get() {
        if (_monitorArrowUp != null) return _monitorArrowUp!!
        _monitorArrowUp = phosphorLightIcon(
            name = "MonitorArrowUp",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 208.000 42.000 L 48.000 42.000 C 35.850 42.000 26.000 51.850 26.000 64.000 L 26.000 176.000 C 26.000 188.150 35.850 198.000 48.000 198.000 L 208.000 198.000 C 220.150 198.000 230.000 188.150 230.000 176.000 L 230.000 64.000 C 230.000 51.850 220.150 42.000 208.000 42.000 ZM 218.000 176.000 C 218.000 181.523 213.523 186.000 208.000 186.000 L 48.000 186.000 C 42.477 186.000 38.000 181.523 38.000 176.000 L 38.000 64.000 C 38.000 58.477 42.477 54.000 48.000 54.000 L 208.000 54.000 C 213.523 54.000 218.000 58.477 218.000 64.000 ZM 166.000 224.000 C 166.000 227.314 163.314 230.000 160.000 230.000 L 96.000 230.000 C 92.686 230.000 90.000 227.314 90.000 224.000 C 90.000 220.686 92.686 218.000 96.000 218.000 L 160.000 218.000 C 163.314 218.000 166.000 220.686 166.000 224.000 ZM 156.240 107.760 C 157.845 109.256 158.506 111.508 157.963 113.634 C 157.420 115.760 155.760 117.420 153.634 117.963 C 151.508 118.506 149.256 117.845 147.760 116.240 L 134.000 102.490 L 134.000 152.000 C 134.000 155.314 131.314 158.000 128.000 158.000 C 124.686 158.000 122.000 155.314 122.000 152.000 L 122.000 102.490 L 108.240 116.240 C 105.876 118.443 102.192 118.378 99.907 116.093 C 97.622 113.808 97.557 110.124 99.760 107.760 L 123.760 83.760 C 126.103 81.420 129.897 81.420 132.240 83.760 Z"),
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
        return _monitorArrowUp!!
    }

private var _monitorArrowUp: ImageVector? = null
