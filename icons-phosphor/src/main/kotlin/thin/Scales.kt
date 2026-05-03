package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Scales: ImageVector
    get() {
        if (_scales != null) return _scales!!
        _scales = phosphorThinIcon(
            name = "Scales",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 235.710 134.510 L 203.710 54.510 L 203.710 54.510 C 202.979 52.699 201.047 51.680 199.140 52.100 L 132.000 67.000 L 132.000 40.000 C 132.000 37.791 130.209 36.000 128.000 36.000 C 125.791 36.000 124.000 37.791 124.000 40.000 L 124.000 68.790 L 55.130 84.100 C 53.844 84.387 52.782 85.288 52.290 86.510 L 52.290 86.510 L 52.290 86.510 L 52.290 86.510 L 20.290 166.510 C 20.099 166.984 20.001 167.489 20.000 168.000 C 20.000 188.400 42.080 196.000 56.000 196.000 C 69.920 196.000 92.000 188.400 92.000 168.000 C 91.999 167.489 91.901 166.984 91.710 166.510 L 61.460 90.880 L 124.000 77.000 L 124.000 212.000 L 104.000 212.000 C 101.791 212.000 100.000 213.791 100.000 216.000 C 100.000 218.209 101.791 220.000 104.000 220.000 L 152.000 220.000 C 154.209 220.000 156.000 218.209 156.000 216.000 C 156.000 213.791 154.209 212.000 152.000 212.000 L 132.000 212.000 L 132.000 75.210 L 193.470 61.550 L 164.290 134.550 C 164.104 135.011 164.006 135.503 164.000 136.000 C 164.000 156.400 186.080 164.000 200.000 164.000 C 213.920 164.000 236.000 156.400 236.000 136.000 C 235.999 135.489 235.901 134.984 235.710 134.510 ZM 56.000 188.000 C 48.850 188.000 28.630 184.440 28.000 168.730 L 56.000 98.730 L 84.000 168.730 C 83.370 184.440 63.150 188.000 56.000 188.000 ZM 200.000 156.000 C 192.850 156.000 172.630 152.440 172.000 136.730 L 200.000 66.730 L 228.000 136.730 C 227.370 152.440 207.150 156.000 200.000 156.000 Z"),
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
        return _scales!!
    }

private var _scales: ImageVector? = null
