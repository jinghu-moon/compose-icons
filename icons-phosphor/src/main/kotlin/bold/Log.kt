package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Log: ImageVector
    get() {
        if (_log != null) return _log!!
        _log = phosphorBoldIcon(
            name = "Log",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 216.000 136.000 C 216.000 144.837 208.837 152.000 200.000 152.000 C 191.163 152.000 184.000 144.837 184.000 136.000 C 184.000 127.163 191.163 120.000 200.000 120.000 C 208.837 120.000 216.000 127.163 216.000 136.000 ZM 252.000 136.000 C 252.000 178.620 229.160 212.000 200.000 212.000 L 56.000 212.000 C 26.840 212.000 4.000 178.620 4.000 136.000 C 4.000 93.380 26.840 60.000 56.000 60.000 L 91.000 60.000 L 127.480 23.510 C 129.740 21.253 132.806 19.990 136.000 20.000 L 168.000 20.000 C 174.627 20.000 180.000 25.373 180.000 32.000 C 180.000 38.627 174.627 44.000 168.000 44.000 L 141.000 44.000 L 125.000 60.000 L 200.000 60.000 C 229.160 60.000 252.000 93.380 252.000 136.000 ZM 56.000 188.000 L 161.770 188.000 C 157.870 181.764 154.814 175.039 152.680 168.000 L 80.000 168.000 C 73.373 168.000 68.000 162.627 68.000 156.000 C 68.000 149.373 73.373 144.000 80.000 144.000 L 148.270 144.000 C 148.090 141.370 148.000 138.710 148.000 136.000 C 148.000 115.700 153.190 97.500 161.770 84.000 L 56.000 84.000 C 48.150 84.000 39.770 91.510 34.240 104.000 L 104.000 104.000 C 110.627 104.000 116.000 109.373 116.000 116.000 C 116.000 122.627 110.627 128.000 104.000 128.000 L 28.350 128.000 C 28.120 130.590 28.000 133.250 28.000 136.000 C 28.000 166.640 42.760 188.000 56.000 188.000 ZM 228.000 136.000 C 228.000 105.360 213.240 84.000 200.000 84.000 C 186.760 84.000 172.000 105.360 172.000 136.000 C 172.000 166.640 186.760 188.000 200.000 188.000 C 213.240 188.000 228.000 166.640 228.000 136.000 Z"),
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
        return _log!!
    }

private var _log: ImageVector? = null
