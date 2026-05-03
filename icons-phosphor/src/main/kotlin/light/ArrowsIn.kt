package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.ArrowsIn: ImageVector
    get() {
        if (_arrowsIn != null) return _arrowsIn!!
        _arrowsIn = phosphorLightIcon(
            name = "ArrowsIn",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 146.000 104.000 L 146.000 64.000 C 146.000 60.686 148.686 58.000 152.000 58.000 C 155.314 58.000 158.000 60.686 158.000 64.000 L 158.000 89.510 L 203.760 43.760 C 206.124 41.557 209.808 41.622 212.093 43.907 C 214.378 46.192 214.443 49.876 212.240 52.240 L 166.480 98.000 L 192.000 98.000 C 195.314 98.000 198.000 100.686 198.000 104.000 C 198.000 107.314 195.314 110.000 192.000 110.000 L 152.000 110.000 C 148.686 110.000 146.000 107.314 146.000 104.000 ZM 104.000 146.000 L 64.000 146.000 C 60.686 146.000 58.000 148.686 58.000 152.000 C 58.000 155.314 60.686 158.000 64.000 158.000 L 89.520 158.000 L 43.760 203.760 C 42.155 205.256 41.494 207.508 42.037 209.634 C 42.580 211.760 44.240 213.420 46.366 213.963 C 48.492 214.506 50.744 213.845 52.240 212.240 L 98.000 166.480 L 98.000 192.000 C 98.000 195.314 100.686 198.000 104.000 198.000 C 107.314 198.000 110.000 195.314 110.000 192.000 L 110.000 152.000 C 110.000 148.686 107.314 146.000 104.000 146.000 ZM 166.480 158.000 L 192.000 158.000 C 195.314 158.000 198.000 155.314 198.000 152.000 C 198.000 148.686 195.314 146.000 192.000 146.000 L 152.000 146.000 C 148.686 146.000 146.000 148.686 146.000 152.000 L 146.000 192.000 C 146.000 195.314 148.686 198.000 152.000 198.000 C 155.314 198.000 158.000 195.314 158.000 192.000 L 158.000 166.480 L 203.760 212.240 C 206.124 214.443 209.808 214.378 212.093 212.093 C 214.378 209.808 214.443 206.124 212.240 203.760 ZM 104.000 58.000 C 100.686 58.000 98.000 60.686 98.000 64.000 L 98.000 89.510 L 52.240 43.760 C 49.876 41.557 46.192 41.622 43.907 43.907 C 41.622 46.192 41.557 49.876 43.760 52.240 L 89.520 98.000 L 64.000 98.000 C 60.686 98.000 58.000 100.686 58.000 104.000 C 58.000 107.314 60.686 110.000 64.000 110.000 L 104.000 110.000 C 107.314 110.000 110.000 107.314 110.000 104.000 L 110.000 64.000 C 110.000 60.686 107.314 58.000 104.000 58.000 Z"),
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
        return _arrowsIn!!
    }

private var _arrowsIn: ImageVector? = null
