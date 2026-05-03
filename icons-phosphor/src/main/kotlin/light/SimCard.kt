package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.SimCard: ImageVector
    get() {
        if (_simCard != null) return _simCard!!
        _simCard = phosphorLightIcon(
            name = "SimCard",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 212.240 83.760 L 156.240 27.760 C 155.116 26.634 153.591 26.001 152.000 26.000 L 56.000 26.000 C 48.268 26.000 42.000 32.268 42.000 40.000 L 42.000 216.000 C 42.000 223.732 48.268 230.000 56.000 230.000 L 200.000 230.000 C 207.732 230.000 214.000 223.732 214.000 216.000 L 214.000 88.000 C 213.999 86.409 213.366 84.884 212.240 83.760 ZM 202.000 216.000 C 202.000 217.105 201.105 218.000 200.000 218.000 L 56.000 218.000 C 54.895 218.000 54.000 217.105 54.000 216.000 L 54.000 40.000 C 54.000 38.895 54.895 38.000 56.000 38.000 L 149.520 38.000 L 202.000 90.490 ZM 74.000 120.000 L 74.000 192.000 C 74.000 195.314 76.686 198.000 80.000 198.000 L 176.000 198.000 C 179.314 198.000 182.000 195.314 182.000 192.000 L 182.000 120.000 C 182.000 116.686 179.314 114.000 176.000 114.000 L 80.000 114.000 C 76.686 114.000 74.000 116.686 74.000 120.000 ZM 86.000 126.000 L 170.000 126.000 L 170.000 186.000 L 150.000 186.000 L 150.000 152.000 C 150.000 148.686 147.314 146.000 144.000 146.000 C 140.686 146.000 138.000 148.686 138.000 152.000 L 138.000 186.000 L 118.000 186.000 L 118.000 152.000 C 118.000 148.686 115.314 146.000 112.000 146.000 C 108.686 146.000 106.000 148.686 106.000 152.000 L 106.000 186.000 L 86.000 186.000 Z"),
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
        return _simCard!!
    }

private var _simCard: ImageVector? = null
