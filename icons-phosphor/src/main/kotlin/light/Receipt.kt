package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Receipt: ImageVector
    get() {
        if (_receipt != null) return _receipt!!
        _receipt = phosphorLightIcon(
            name = "Receipt",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 182.000 104.000 C 182.000 107.314 179.314 110.000 176.000 110.000 L 80.000 110.000 C 76.686 110.000 74.000 107.314 74.000 104.000 C 74.000 100.686 76.686 98.000 80.000 98.000 L 176.000 98.000 C 179.314 98.000 182.000 100.686 182.000 104.000 ZM 176.000 130.000 L 80.000 130.000 C 76.686 130.000 74.000 132.686 74.000 136.000 C 74.000 139.314 76.686 142.000 80.000 142.000 L 176.000 142.000 C 179.314 142.000 182.000 139.314 182.000 136.000 C 182.000 132.686 179.314 130.000 176.000 130.000 ZM 230.000 56.000 L 230.000 208.000 C 229.998 210.079 228.919 212.009 227.150 213.100 C 226.205 213.690 225.114 214.002 224.000 214.000 C 223.070 214.001 222.152 213.785 221.320 213.370 L 192.000 198.710 L 162.680 213.370 C 160.993 214.212 159.007 214.212 157.320 213.370 L 128.000 198.710 L 98.680 213.370 C 96.993 214.212 95.007 214.212 93.320 213.370 L 64.000 198.710 L 34.680 213.370 C 32.820 214.299 30.611 214.198 28.843 213.104 C 27.075 212.010 25.999 210.079 26.000 208.000 L 26.000 56.000 C 26.000 48.268 32.268 42.000 40.000 42.000 L 216.000 42.000 C 223.732 42.000 230.000 48.268 230.000 56.000 ZM 218.000 56.000 C 218.000 54.895 217.105 54.000 216.000 54.000 L 40.000 54.000 C 38.895 54.000 38.000 54.895 38.000 56.000 L 38.000 198.290 L 61.320 186.630 C 63.007 185.788 64.993 185.788 66.680 186.630 L 96.000 201.290 L 125.320 186.630 C 127.007 185.788 128.993 185.788 130.680 186.630 L 160.000 201.290 L 189.320 186.630 C 191.007 185.788 192.993 185.788 194.680 186.630 L 218.000 198.290 Z"),
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
        return _receipt!!
    }

private var _receipt: ImageVector? = null
