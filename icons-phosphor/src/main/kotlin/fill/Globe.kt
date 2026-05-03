package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Globe: ImageVector
    get() {
        if (_globe != null) return _globe!!
        _globe = phosphorFillIcon(
            name = "Globe",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 128.000 24.000 L 128.000 24.000 C 70.562 24.000 24.000 70.562 24.000 128.000 C 24.000 185.438 70.562 232.000 128.000 232.000 C 185.438 232.000 232.000 185.438 232.000 128.000 C 231.934 70.590 185.410 24.066 128.000 24.000 ZM 206.360 88.000 L 170.710 88.000 C 166.221 71.529 158.654 56.057 148.410 42.400 C 173.457 48.417 194.627 65.073 206.370 88.000 ZM 216.000 128.000 C 216.007 136.116 214.886 144.193 212.670 152.000 L 174.160 152.000 C 176.613 136.094 176.613 119.906 174.160 104.000 L 212.670 104.000 C 214.886 111.807 216.007 119.884 216.000 128.000 ZM 128.000 43.000 C 139.979 55.825 148.872 71.216 154.000 88.000 L 102.000 88.000 C 107.123 71.214 116.016 55.822 128.000 43.000 ZM 102.000 168.000 L 154.000 168.000 C 148.877 184.786 139.984 200.178 128.000 213.000 C 116.021 200.175 107.128 184.784 102.000 168.000 ZM 98.100 152.000 C 95.353 136.118 95.353 119.882 98.100 104.000 L 157.980 104.000 C 160.727 119.882 160.727 136.118 157.980 152.000 ZM 148.450 213.600 C 158.694 199.943 166.261 184.471 170.750 168.000 L 206.410 168.000 C 194.659 190.937 173.472 207.594 148.410 213.600 Z"),
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
        return _globe!!
    }

private var _globe: ImageVector? = null
