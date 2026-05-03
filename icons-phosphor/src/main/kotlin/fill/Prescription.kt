package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Prescription: ImageVector
    get() {
        if (_prescription != null) return _prescription!!
        _prescription = phosphorFillIcon(
            name = "Prescription",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 128.000 120.000 L 96.000 120.000 L 96.000 72.000 L 128.000 72.000 C 141.255 72.000 152.000 82.745 152.000 96.000 C 152.000 109.255 141.255 120.000 128.000 120.000 ZM 224.000 48.000 L 224.000 208.000 C 224.000 216.837 216.837 224.000 208.000 224.000 L 48.000 224.000 C 39.163 224.000 32.000 216.837 32.000 208.000 L 32.000 48.000 C 32.000 39.163 39.163 32.000 48.000 32.000 L 208.000 32.000 C 216.837 32.000 224.000 39.163 224.000 48.000 ZM 189.660 186.340 L 175.310 172.000 L 189.660 157.660 C 192.786 154.534 192.786 149.466 189.660 146.340 C 186.534 143.214 181.466 143.214 178.340 146.340 L 164.000 160.690 L 138.000 134.690 C 157.426 129.593 170.061 110.881 167.529 90.957 C 164.997 71.033 148.084 56.076 128.000 56.000 L 88.000 56.000 C 83.582 56.000 80.000 59.582 80.000 64.000 L 80.000 176.000 C 80.000 180.418 83.582 184.000 88.000 184.000 C 92.418 184.000 96.000 180.418 96.000 176.000 L 96.000 136.000 L 116.690 136.000 L 152.690 172.000 L 138.340 186.340 C 135.214 189.466 135.214 194.534 138.340 197.660 C 141.466 200.786 146.534 200.786 149.660 197.660 L 164.000 183.310 L 178.340 197.660 C 181.466 200.786 186.534 200.786 189.660 197.660 C 192.786 194.534 192.786 189.466 189.660 186.340 Z"),
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
        return _prescription!!
    }

private var _prescription: ImageVector? = null
