package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.NumberCircleEight: ImageVector
    get() {
        if (_numberCircleEight != null) return _numberCircleEight!!
        _numberCircleEight = phosphorThinIcon(
            name = "NumberCircleEight",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 128.000 28.000 C 72.772 28.000 28.000 72.772 28.000 128.000 C 28.000 183.228 72.772 228.000 128.000 228.000 C 183.228 228.000 228.000 183.228 228.000 128.000 C 227.939 72.797 183.203 28.061 128.000 28.000 ZM 128.000 220.000 C 77.190 220.000 36.000 178.810 36.000 128.000 C 36.000 77.190 77.190 36.000 128.000 36.000 C 178.810 36.000 220.000 77.190 220.000 128.000 C 219.945 178.787 178.787 219.945 128.000 220.000 ZM 142.900 123.690 C 153.465 117.050 158.360 104.221 154.905 92.231 C 151.450 80.240 140.478 71.984 128.000 71.984 C 115.522 71.984 104.550 80.240 101.095 92.231 C 97.640 104.221 102.535 117.050 113.100 123.690 C 100.075 130.543 93.404 145.396 96.934 159.683 C 100.463 173.971 113.283 184.009 128.000 184.009 C 142.717 184.009 155.537 173.971 159.066 159.683 C 162.596 145.396 155.925 130.543 142.900 123.690 ZM 108.000 100.000 C 108.000 88.954 116.954 80.000 128.000 80.000 C 139.046 80.000 148.000 88.954 148.000 100.000 C 148.000 111.046 139.046 120.000 128.000 120.000 C 116.954 120.000 108.000 111.046 108.000 100.000 ZM 128.000 176.000 C 114.745 176.000 104.000 165.255 104.000 152.000 C 104.000 138.745 114.745 128.000 128.000 128.000 C 141.255 128.000 152.000 138.745 152.000 152.000 C 152.000 165.255 141.255 176.000 128.000 176.000 Z"),
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
        return _numberCircleEight!!
    }

private var _numberCircleEight: ImageVector? = null
