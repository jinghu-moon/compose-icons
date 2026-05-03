package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.FlowArrow: ImageVector
    get() {
        if (_flowArrow != null) return _flowArrow!!
        _flowArrow = phosphorRegularIcon(
            name = "FlowArrow",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 245.660 74.340 L 213.660 42.340 C 210.534 39.214 205.466 39.214 202.340 42.340 C 199.214 45.466 199.214 50.534 202.340 53.660 L 220.690 72.000 L 208.000 72.000 C 158.670 72.000 146.950 100.120 136.620 124.920 C 127.240 147.430 119.700 165.510 87.140 167.760 C 82.907 147.666 64.147 134.042 43.730 136.233 C 23.313 138.425 7.871 155.721 8.000 176.255 C 8.128 196.789 23.784 213.891 44.227 215.827 C 64.670 217.763 83.259 203.905 87.240 183.760 C 130.500 181.110 141.580 154.610 151.380 131.070 C 161.410 107.000 169.330 88.000 208.000 88.000 L 220.690 88.000 L 202.340 106.340 C 199.214 109.466 199.214 114.534 202.340 117.660 C 205.466 120.786 210.534 120.786 213.660 117.660 L 245.660 85.660 C 247.162 84.159 248.006 82.123 248.006 80.000 C 248.006 77.877 247.162 75.841 245.660 74.340 ZM 48.000 200.000 C 34.745 200.000 24.000 189.255 24.000 176.000 C 24.000 162.745 34.745 152.000 48.000 152.000 C 61.255 152.000 72.000 162.745 72.000 176.000 C 72.000 189.255 61.255 200.000 48.000 200.000 Z"),
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
        return _flowArrow!!
    }

private var _flowArrow: ImageVector? = null
