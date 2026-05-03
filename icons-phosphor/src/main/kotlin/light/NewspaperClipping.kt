package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.NewspaperClipping: ImageVector
    get() {
        if (_newspaperClipping != null) return _newspaperClipping!!
        _newspaperClipping = phosphorLightIcon(
            name = "NewspaperClipping",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 216.000 42.000 L 40.000 42.000 C 32.268 42.000 26.000 48.268 26.000 56.000 L 26.000 216.000 C 25.999 218.079 27.075 220.010 28.843 221.104 C 30.611 222.198 32.820 222.299 34.680 221.370 L 64.000 206.710 L 93.320 221.370 C 95.007 222.212 96.993 222.212 98.680 221.370 L 128.000 206.710 L 157.320 221.370 C 159.007 222.212 160.993 222.212 162.680 221.370 L 192.000 206.710 L 221.320 221.370 C 222.152 221.785 223.070 222.001 224.000 222.000 C 225.114 222.002 226.205 221.690 227.150 221.100 C 228.919 220.009 229.998 218.079 230.000 216.000 L 230.000 56.000 C 230.000 48.268 223.732 42.000 216.000 42.000 ZM 218.000 206.290 L 194.680 194.630 C 192.993 193.788 191.007 193.788 189.320 194.630 L 160.000 209.290 L 130.680 194.630 C 128.993 193.788 127.007 193.788 125.320 194.630 L 96.000 209.290 L 66.680 194.630 C 64.993 193.788 63.007 193.788 61.320 194.630 L 38.000 206.290 L 38.000 56.000 C 38.000 54.895 38.895 54.000 40.000 54.000 L 216.000 54.000 C 217.105 54.000 218.000 54.895 218.000 56.000 ZM 198.000 112.000 C 198.000 115.314 195.314 118.000 192.000 118.000 L 144.000 118.000 C 140.686 118.000 138.000 115.314 138.000 112.000 C 138.000 108.686 140.686 106.000 144.000 106.000 L 192.000 106.000 C 195.314 106.000 198.000 108.686 198.000 112.000 ZM 198.000 144.000 C 198.000 147.314 195.314 150.000 192.000 150.000 L 144.000 150.000 C 140.686 150.000 138.000 147.314 138.000 144.000 C 138.000 140.686 140.686 138.000 144.000 138.000 L 192.000 138.000 C 195.314 138.000 198.000 140.686 198.000 144.000 ZM 112.000 90.000 L 64.000 90.000 C 60.686 90.000 58.000 92.686 58.000 96.000 L 58.000 160.000 C 58.000 163.314 60.686 166.000 64.000 166.000 L 112.000 166.000 C 115.314 166.000 118.000 163.314 118.000 160.000 L 118.000 96.000 C 118.000 92.686 115.314 90.000 112.000 90.000 ZM 106.000 154.000 L 70.000 154.000 L 70.000 102.000 L 106.000 102.000 Z"),
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
        return _newspaperClipping!!
    }

private var _newspaperClipping: ImageVector? = null
