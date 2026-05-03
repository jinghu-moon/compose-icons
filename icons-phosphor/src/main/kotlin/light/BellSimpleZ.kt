package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.BellSimpleZ: ImageVector
    get() {
        if (_bellSimpleZ != null) return _bellSimpleZ!!
        _bellSimpleZ = phosphorLightIcon(
            name = "BellSimpleZ",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 166.000 224.000 C 166.000 227.314 163.314 230.000 160.000 230.000 L 96.000 230.000 C 92.686 230.000 90.000 227.314 90.000 224.000 C 90.000 220.686 92.686 218.000 96.000 218.000 L 160.000 218.000 C 163.314 218.000 166.000 220.686 166.000 224.000 ZM 144.000 138.000 L 123.210 138.000 L 149.000 99.330 C 150.229 97.488 150.344 95.118 149.297 93.166 C 148.251 91.214 146.215 89.997 144.000 90.000 L 112.000 90.000 C 108.686 90.000 106.000 92.686 106.000 96.000 C 106.000 99.314 108.686 102.000 112.000 102.000 L 132.790 102.000 L 107.000 140.670 C 105.771 142.512 105.656 144.882 106.703 146.834 C 107.749 148.786 109.785 150.003 112.000 150.000 L 144.000 150.000 C 147.314 150.000 150.000 147.314 150.000 144.000 C 150.000 140.686 147.314 138.000 144.000 138.000 ZM 220.110 191.000 C 217.640 195.350 213.013 198.027 208.010 198.000 L 48.000 198.000 C 42.991 197.989 38.370 195.304 35.880 190.957 C 33.391 186.611 33.414 181.265 35.940 176.940 C 41.590 167.200 50.000 139.740 50.000 104.000 C 50.000 60.922 84.922 26.000 128.000 26.000 C 171.078 26.000 206.000 60.922 206.000 104.000 C 206.000 139.730 214.420 167.200 220.080 176.940 C 222.634 181.276 222.646 186.653 220.110 191.000 ZM 209.700 183.000 C 202.130 170.000 194.000 139.680 194.000 104.000 C 194.000 67.549 164.451 38.000 128.000 38.000 C 91.549 38.000 62.000 67.549 62.000 104.000 C 62.000 139.690 53.860 170.000 46.290 183.000 C 45.933 183.619 45.933 184.381 46.290 185.000 C 46.626 185.624 47.281 186.010 47.990 186.000 L 208.000 186.000 C 208.709 186.010 209.364 185.624 209.700 185.000 C 210.057 184.381 210.057 183.619 209.700 183.000 Z"),
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
        return _bellSimpleZ!!
    }

private var _bellSimpleZ: ImageVector? = null
