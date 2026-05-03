package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.ReceiptX: ImageVector
    get() {
        if (_receiptX != null) return _receiptX!!
        _receiptX = phosphorDuotoneIcon(
            name = "ReceiptX",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    group(
        groupAlpha = 0.20000000298023224f,
    ) {
        addPath(
            pathData = parseSvgPathData("M 224.000 56.000 L 224.000 208.000 L 192.000 192.000 L 160.000 208.000 L 128.000 192.000 L 96.000 208.000 L 64.000 192.000 L 32.000 208.000 L 32.000 56.000 C 32.000 51.582 35.582 48.000 40.000 48.000 L 216.000 48.000 C 220.418 48.000 224.000 51.582 224.000 56.000 Z"),
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
    addPath(
        pathData = parseSvgPathData("M 216.000 40.000 L 40.000 40.000 C 31.163 40.000 24.000 47.163 24.000 56.000 L 24.000 208.000 C 24.001 210.772 25.438 213.346 27.797 214.803 C 30.156 216.259 33.101 216.391 35.580 215.150 L 64.000 200.940 L 92.420 215.150 C 94.673 216.278 97.327 216.278 99.580 215.150 L 128.000 200.940 L 156.420 215.150 C 158.673 216.278 161.327 216.278 163.580 215.150 L 192.000 200.940 L 220.420 215.150 C 222.899 216.391 225.844 216.259 228.203 214.803 C 230.562 213.346 231.999 210.772 232.000 208.000 L 232.000 56.000 C 232.000 47.163 224.837 40.000 216.000 40.000 ZM 216.000 195.060 L 195.580 184.840 C 193.327 183.712 190.673 183.712 188.420 184.840 L 160.000 199.060 L 131.580 184.840 C 129.327 183.712 126.673 183.712 124.420 184.840 L 96.000 199.060 L 67.580 184.840 C 65.327 183.712 62.673 183.712 60.420 184.840 L 40.000 195.060 L 40.000 56.000 L 216.000 56.000 ZM 98.340 138.340 L 116.690 120.000 L 98.340 101.660 C 95.214 98.534 95.214 93.466 98.340 90.340 C 101.466 87.214 106.534 87.214 109.660 90.340 L 128.000 108.690 L 146.340 90.340 C 149.466 87.214 154.534 87.214 157.660 90.340 C 160.786 93.466 160.786 98.534 157.660 101.660 L 139.310 120.000 L 157.660 138.340 C 160.786 141.466 160.786 146.534 157.660 149.660 C 154.534 152.786 149.466 152.786 146.340 149.660 L 128.000 131.310 L 109.660 149.660 C 106.534 152.786 101.466 152.786 98.340 149.660 C 95.214 146.534 95.214 141.466 98.340 138.340 Z"),
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
