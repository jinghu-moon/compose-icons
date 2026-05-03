package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.Drop: ImageVector
    get() {
        if (_drop != null) return _drop!!
        _drop = phosphorRegularIcon(
            name = "Drop",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 174.000 47.750 C 161.648 33.484 147.745 20.639 132.550 9.450 C 129.794 7.520 126.126 7.520 123.370 9.450 C 108.203 20.643 94.327 33.489 82.000 47.750 C 54.510 79.320 40.000 112.600 40.000 144.000 C 40.000 192.601 79.399 232.000 128.000 232.000 C 176.601 232.000 216.000 192.601 216.000 144.000 C 216.000 112.600 201.490 79.320 174.000 47.750 ZM 128.000 216.000 C 88.254 215.956 56.044 183.746 56.000 144.000 C 56.000 86.770 111.470 39.000 128.000 26.000 C 144.530 39.000 200.000 86.750 200.000 144.000 C 199.956 183.746 167.746 215.956 128.000 216.000 ZM 183.890 153.340 C 179.641 177.072 161.063 195.646 137.330 199.890 C 136.890 199.960 136.445 199.997 136.000 200.000 C 131.839 199.999 128.374 196.809 128.030 192.662 C 127.685 188.516 130.576 184.798 134.680 184.110 C 151.250 181.320 165.310 167.260 168.120 150.660 C 168.860 146.302 172.992 143.370 177.350 144.110 C 181.708 144.850 184.640 148.982 183.900 153.340 Z"),
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
        return _drop!!
    }

private var _drop: ImageVector? = null
