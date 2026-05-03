package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.PushPin: ImageVector
    get() {
        if (_pushPin != null) return _pushPin!!
        _pushPin = phosphorFillIcon(
            name = "PushPin",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 235.330 104.000 L 181.860 157.650 C 186.420 170.320 188.310 191.540 168.670 217.650 C 165.890 221.365 161.629 223.684 157.000 224.000 C 156.620 224.000 156.250 224.000 155.870 224.000 C 151.624 224.001 147.552 222.313 144.550 219.310 L 96.290 171.000 L 53.660 213.660 C 50.534 216.786 45.466 216.786 42.340 213.660 C 39.214 210.534 39.214 205.466 42.340 202.340 L 85.000 159.710 L 36.700 111.410 C 33.489 108.195 31.797 103.767 32.045 99.230 C 32.293 94.693 34.458 90.476 38.000 87.630 C 63.420 67.120 87.750 71.150 98.400 74.490 L 152.000 20.700 C 155.001 17.699 159.071 16.012 163.315 16.012 C 167.559 16.012 171.629 17.699 174.630 20.700 L 235.320 81.380 C 241.566 87.625 241.571 97.750 235.330 104.000 Z"),
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
        return _pushPin!!
    }

private var _pushPin: ImageVector? = null
