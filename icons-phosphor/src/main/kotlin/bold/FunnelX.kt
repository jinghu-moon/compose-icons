package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.FunnelX: ImageVector
    get() {
        if (_funnelX != null) return _funnelX!!
        _funnelX = phosphorBoldIcon(
            name = "FunnelX",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 230.780 69.450 C 236.101 63.595 237.469 55.153 234.272 47.917 C 231.074 40.680 223.912 36.009 216.000 36.000 L 40.000 36.000 C 32.085 36.001 24.915 40.669 21.712 47.908 C 18.510 55.146 19.877 63.592 25.200 69.450 L 25.320 69.590 L 92.000 140.750 L 92.000 216.000 C 91.998 223.376 96.056 230.155 102.558 233.637 C 109.060 237.120 116.952 236.740 123.090 232.650 L 155.090 211.310 C 160.651 207.600 163.991 201.356 163.990 194.670 L 163.990 140.750 L 230.660 69.590 ZM 143.230 127.800 C 141.152 130.025 139.998 132.956 140.000 136.000 L 140.000 192.520 L 116.000 208.520 L 116.000 136.000 C 116.000 132.955 114.841 130.023 112.760 127.800 L 49.230 60.000 L 206.750 60.000 ZM 248.490 207.520 C 253.184 212.214 253.184 219.826 248.490 224.520 C 243.796 229.214 236.184 229.214 231.490 224.520 L 216.000 209.000 L 200.480 224.510 C 195.786 229.204 188.174 229.204 183.480 224.510 C 178.786 219.816 178.786 212.204 183.480 207.510 L 199.000 192.000 L 183.480 176.480 C 178.786 171.786 178.786 164.174 183.480 159.480 C 188.174 154.786 195.786 154.786 200.480 159.480 L 216.000 175.000 L 231.510 159.480 C 236.204 154.786 243.816 154.786 248.510 159.480 C 253.204 164.174 253.204 171.786 248.510 176.480 L 233.000 192.000 Z"),
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
        return _funnelX!!
    }

private var _funnelX: ImageVector? = null
