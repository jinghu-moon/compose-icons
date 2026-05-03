package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.ReceiptX: ImageVector
    get() {
        if (_receiptX != null) return _receiptX!!
        _receiptX = phosphorBoldIcon(
            name = "ReceiptX",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 216.000 36.000 L 40.000 36.000 C 28.954 36.000 20.000 44.954 20.000 56.000 L 20.000 208.000 C 20.000 212.159 22.155 216.022 25.693 218.208 C 29.232 220.394 33.650 220.591 37.370 218.730 L 64.000 205.420 L 90.630 218.730 C 94.010 220.421 97.990 220.421 101.370 218.730 L 128.000 205.420 L 154.630 218.730 C 158.010 220.421 161.990 220.421 165.370 218.730 L 192.000 205.420 L 218.630 218.730 C 222.350 220.591 226.768 220.394 230.307 218.208 C 233.845 216.022 236.000 212.159 236.000 208.000 L 236.000 56.000 C 236.000 44.954 227.046 36.000 216.000 36.000 ZM 212.000 188.580 L 197.370 181.270 C 193.990 179.579 190.010 179.579 186.630 181.270 L 160.000 194.580 L 133.370 181.270 C 129.990 179.579 126.010 179.579 122.630 181.270 L 96.000 194.580 L 69.370 181.270 C 65.990 179.579 62.010 179.579 58.630 181.270 L 44.000 188.580 L 44.000 60.000 L 212.000 60.000 ZM 95.510 135.510 L 111.000 120.000 L 95.510 104.490 C 90.816 99.796 90.816 92.184 95.510 87.490 C 100.204 82.796 107.816 82.796 112.510 87.490 L 128.000 103.000 L 143.510 87.480 C 148.204 82.786 155.816 82.786 160.510 87.480 C 165.204 92.174 165.204 99.786 160.510 104.480 L 145.000 120.000 L 160.520 135.510 C 165.214 140.204 165.214 147.816 160.520 152.510 C 155.826 157.204 148.214 157.204 143.520 152.510 L 128.000 137.000 L 112.490 152.520 C 107.796 157.214 100.184 157.214 95.490 152.520 C 90.796 147.826 90.796 140.214 95.490 135.520 Z"),
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
        return _receiptX!!
    }

private var _receiptX: ImageVector? = null
