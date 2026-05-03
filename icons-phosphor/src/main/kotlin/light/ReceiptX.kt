package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.ReceiptX: ImageVector
    get() {
        if (_receiptX != null) return _receiptX!!
        _receiptX = phosphorLightIcon(
            name = "ReceiptX",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 216.000 42.000 L 40.000 42.000 C 32.268 42.000 26.000 48.268 26.000 56.000 L 26.000 208.000 C 25.999 210.079 27.075 212.010 28.843 213.104 C 30.611 214.198 32.820 214.299 34.680 213.370 L 64.000 198.710 L 93.320 213.370 C 95.007 214.212 96.993 214.212 98.680 213.370 L 128.000 198.710 L 157.320 213.370 C 159.007 214.212 160.993 214.212 162.680 213.370 L 192.000 198.710 L 221.320 213.370 C 222.152 213.785 223.070 214.001 224.000 214.000 C 225.114 214.002 226.205 213.690 227.150 213.100 C 228.919 212.009 229.998 210.079 230.000 208.000 L 230.000 56.000 C 230.000 48.268 223.732 42.000 216.000 42.000 ZM 218.000 198.290 L 194.680 186.630 C 192.993 185.788 191.007 185.788 189.320 186.630 L 160.000 201.290 L 130.680 186.630 C 128.993 185.788 127.007 185.788 125.320 186.630 L 96.000 201.290 L 66.680 186.630 C 64.993 185.788 63.007 185.788 61.320 186.630 L 38.000 198.290 L 38.000 56.000 C 38.000 54.895 38.895 54.000 40.000 54.000 L 216.000 54.000 C 217.105 54.000 218.000 54.895 218.000 56.000 ZM 156.240 100.290 L 136.480 120.000 L 156.240 139.760 C 157.845 141.256 158.506 143.508 157.963 145.634 C 157.420 147.760 155.760 149.420 153.634 149.963 C 151.508 150.506 149.256 149.845 147.760 148.240 L 128.000 128.480 L 108.240 148.240 C 105.876 150.443 102.192 150.378 99.907 148.093 C 97.622 145.808 97.557 142.124 99.760 139.760 L 119.520 120.000 L 99.760 100.240 C 97.557 97.876 97.622 94.192 99.907 91.907 C 102.192 89.622 105.876 89.557 108.240 91.760 L 128.000 111.520 L 147.760 91.760 C 150.124 89.557 153.808 89.622 156.093 91.907 C 158.378 94.192 158.443 97.876 156.240 100.240 Z"),
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
        return _receiptX!!
    }

private var _receiptX: ImageVector? = null
