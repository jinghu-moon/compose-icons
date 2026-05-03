package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.SpeakerSimpleX: ImageVector
    get() {
        if (_speakerSimpleX != null) return _speakerSimpleX!!
        _speakerSimpleX = phosphorRegularIcon(
            name = "SpeakerSimpleX",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 163.510 24.810 C 160.765 23.473 157.499 23.814 155.090 25.690 L 85.250 80.000 L 40.000 80.000 C 31.163 80.000 24.000 87.163 24.000 96.000 L 24.000 160.000 C 24.000 168.837 31.163 176.000 40.000 176.000 L 85.250 176.000 L 155.090 230.310 C 157.501 232.184 160.769 232.523 163.513 231.181 C 166.257 229.840 167.998 227.054 168.000 224.000 L 168.000 32.000 C 168.000 28.942 166.258 26.152 163.510 24.810 ZM 152.000 207.640 L 92.910 161.690 C 91.509 160.592 89.780 159.997 88.000 160.000 L 40.000 160.000 L 40.000 96.000 L 88.000 96.000 C 89.780 96.003 91.509 95.408 92.910 94.310 L 152.000 48.360 ZM 253.660 146.340 C 256.786 149.466 256.786 154.534 253.660 157.660 C 250.534 160.786 245.466 160.786 242.340 157.660 L 224.000 139.310 L 205.660 157.660 C 202.534 160.786 197.466 160.786 194.340 157.660 C 191.214 154.534 191.214 149.466 194.340 146.340 L 212.690 128.000 L 194.340 109.660 C 191.214 106.534 191.214 101.466 194.340 98.340 C 197.466 95.214 202.534 95.214 205.660 98.340 L 224.000 116.690 L 242.340 98.340 C 245.466 95.214 250.534 95.214 253.660 98.340 C 256.786 101.466 256.786 106.534 253.660 109.660 L 235.310 128.000 Z"),
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
        return _speakerSimpleX!!
    }

private var _speakerSimpleX: ImageVector? = null
