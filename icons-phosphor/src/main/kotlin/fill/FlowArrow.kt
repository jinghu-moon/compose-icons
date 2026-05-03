package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.FlowArrow: ImageVector
    get() {
        if (_flowArrow != null) return _flowArrow!!
        _flowArrow = phosphorFillIcon(
            name = "FlowArrow",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 245.660 85.660 L 213.660 117.660 C 210.534 120.786 205.466 120.786 202.340 117.660 C 199.214 114.534 199.214 109.466 202.340 106.340 L 220.690 88.000 L 208.000 88.000 C 169.330 88.000 161.410 107.000 151.380 131.080 C 141.050 155.880 129.330 184.000 80.000 184.000 L 79.000 184.000 C 74.971 199.602 59.970 209.775 43.984 207.745 C 27.998 205.714 16.016 192.114 16.016 176.000 C 16.016 159.886 27.998 146.286 43.984 144.255 C 59.970 142.225 74.971 152.398 79.000 168.000 L 80.000 168.000 C 118.670 168.000 126.590 149.000 136.620 124.920 C 147.000 100.120 158.670 72.000 208.000 72.000 L 220.690 72.000 L 202.340 53.660 C 199.214 50.534 199.214 45.466 202.340 42.340 C 205.466 39.214 210.534 39.214 213.660 42.340 L 245.660 74.340 C 247.162 75.841 248.006 77.877 248.006 80.000 C 248.006 82.123 247.162 84.159 245.660 85.660 Z"),
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
