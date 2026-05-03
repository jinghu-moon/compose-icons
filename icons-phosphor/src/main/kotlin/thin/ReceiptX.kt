package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.ReceiptX: ImageVector
    get() {
        if (_receiptX != null) return _receiptX!!
        _receiptX = phosphorThinIcon(
            name = "ReceiptX",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 216.000 44.000 L 40.000 44.000 C 33.373 44.000 28.000 49.373 28.000 56.000 L 28.000 208.000 C 27.999 209.387 28.717 210.676 29.896 211.405 C 31.076 212.135 32.550 212.201 33.790 211.580 L 64.000 196.470 L 94.210 211.580 C 95.337 212.144 96.663 212.144 97.790 211.580 L 128.000 196.470 L 158.210 211.580 C 159.337 212.144 160.663 212.144 161.790 211.580 L 192.000 196.470 L 222.210 211.580 C 222.767 211.855 223.379 211.999 224.000 212.000 C 226.209 212.000 228.000 210.209 228.000 208.000 L 228.000 56.000 C 228.000 49.373 222.627 44.000 216.000 44.000 ZM 220.000 201.530 L 193.790 188.420 C 192.663 187.856 191.337 187.856 190.210 188.420 L 160.000 203.530 L 129.790 188.420 C 128.663 187.856 127.337 187.856 126.210 188.420 L 96.000 203.530 L 65.790 188.420 C 64.663 187.856 63.337 187.856 62.210 188.420 L 36.000 201.530 L 36.000 56.000 C 36.000 53.791 37.791 52.000 40.000 52.000 L 216.000 52.000 C 218.209 52.000 220.000 53.791 220.000 56.000 ZM 154.830 98.830 L 133.660 120.000 L 154.830 141.170 C 156.393 142.733 156.393 145.267 154.830 146.830 C 153.267 148.393 150.733 148.393 149.170 146.830 L 128.000 125.660 L 106.830 146.830 C 105.267 148.393 102.733 148.393 101.170 146.830 C 99.607 145.267 99.607 142.733 101.170 141.170 L 122.340 120.000 L 101.170 98.830 C 99.607 97.267 99.607 94.733 101.170 93.170 C 102.733 91.607 105.267 91.607 106.830 93.170 L 128.000 114.340 L 149.170 93.170 C 150.733 91.607 153.267 91.607 154.830 93.170 C 156.393 94.733 156.393 97.267 154.830 98.830 Z"),
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
