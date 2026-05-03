package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.CellSignalX: ImageVector
    get() {
        if (_cellSignalX != null) return _cellSignalX!!
        _cellSignalX = phosphorFillIcon(
            name = "CellSignalX",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 213.660 194.340 C 216.786 197.466 216.786 202.534 213.660 205.660 C 210.534 208.786 205.466 208.786 202.340 205.660 L 184.000 187.310 L 165.660 205.660 C 162.534 208.786 157.466 208.786 154.340 205.660 C 151.214 202.534 151.214 197.466 154.340 194.340 L 172.690 176.000 L 154.340 157.660 C 151.214 154.534 151.214 149.466 154.340 146.340 C 157.466 143.214 162.534 143.214 165.660 146.340 L 184.000 164.690 L 202.340 146.340 C 205.466 143.214 210.534 143.214 213.660 146.340 C 216.786 149.466 216.786 154.534 213.660 157.660 L 195.310 176.000 ZM 157.410 120.100 C 166.149 119.393 174.796 122.303 181.330 128.150 C 182.849 129.512 185.151 129.512 186.670 128.150 C 191.613 123.694 197.827 120.896 204.440 120.150 C 206.476 119.925 208.012 118.198 208.000 116.150 L 208.000 40.460 C 208.076 34.129 204.504 28.319 198.820 25.530 C 192.712 22.650 185.454 23.914 180.680 28.690 L 20.680 188.690 C 15.905 193.460 14.637 200.713 17.510 206.820 C 20.300 212.512 26.121 216.087 32.460 216.000 L 126.060 216.000 C 127.352 215.999 128.564 215.374 129.314 214.323 C 130.064 213.271 130.260 211.922 129.840 210.700 C 125.942 199.681 128.361 187.414 136.150 178.700 C 137.512 177.181 137.512 174.879 136.150 173.360 C 128.049 164.304 125.776 151.440 130.283 140.156 C 134.789 128.872 145.299 121.113 157.410 120.130 Z"),
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
        return _cellSignalX!!
    }

private var _cellSignalX: ImageVector? = null
