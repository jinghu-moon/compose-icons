package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Cardholder: ImageVector
    get() {
        if (_cardholder != null) return _cardholder!!
        _cardholder = phosphorBoldIcon(
            name = "Cardholder",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 208.000 44.000 L 48.000 44.000 C 32.536 44.000 20.000 56.536 20.000 72.000 L 20.000 184.000 C 20.000 199.464 32.536 212.000 48.000 212.000 L 208.000 212.000 C 223.464 212.000 236.000 199.464 236.000 184.000 L 236.000 72.000 C 236.000 56.536 223.464 44.000 208.000 44.000 ZM 48.000 68.000 L 208.000 68.000 C 210.209 68.000 212.000 69.791 212.000 72.000 L 212.000 88.000 L 160.000 88.000 C 153.373 88.000 148.000 93.373 148.000 100.000 C 148.000 111.046 139.046 120.000 128.000 120.000 C 116.954 120.000 108.000 111.046 108.000 100.000 C 108.000 93.373 102.627 88.000 96.000 88.000 L 44.000 88.000 L 44.000 72.000 C 44.000 69.791 45.791 68.000 48.000 68.000 ZM 208.000 188.000 L 48.000 188.000 C 45.791 188.000 44.000 186.209 44.000 184.000 L 44.000 112.000 L 85.660 112.000 C 91.017 130.947 108.310 144.028 128.000 144.028 C 147.690 144.028 164.983 130.947 170.340 112.000 L 212.000 112.000 L 212.000 184.000 C 212.000 186.209 210.209 188.000 208.000 188.000 Z"),
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
        return _cardholder!!
    }

private var _cardholder: ImageVector? = null
