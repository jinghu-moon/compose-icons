package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Cardholder: ImageVector
    get() {
        if (_cardholder != null) return _cardholder!!
        _cardholder = phosphorThinIcon(
            name = "Cardholder",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 208.000 52.000 L 48.000 52.000 C 36.954 52.000 28.000 60.954 28.000 72.000 L 28.000 184.000 C 28.000 195.046 36.954 204.000 48.000 204.000 L 208.000 204.000 C 219.046 204.000 228.000 195.046 228.000 184.000 L 228.000 72.000 C 228.000 60.954 219.046 52.000 208.000 52.000 ZM 36.000 92.000 L 220.000 92.000 L 220.000 116.000 L 160.000 116.000 C 157.791 116.000 156.000 117.791 156.000 120.000 C 156.000 135.464 143.464 148.000 128.000 148.000 C 112.536 148.000 100.000 135.464 100.000 120.000 C 100.000 117.791 98.209 116.000 96.000 116.000 L 36.000 116.000 ZM 48.000 60.000 L 208.000 60.000 C 214.627 60.000 220.000 65.373 220.000 72.000 L 220.000 84.000 L 36.000 84.000 L 36.000 72.000 C 36.000 65.373 41.373 60.000 48.000 60.000 ZM 208.000 196.000 L 48.000 196.000 C 41.373 196.000 36.000 190.627 36.000 184.000 L 36.000 124.000 L 92.220 124.000 C 94.245 142.232 109.656 156.026 128.000 156.026 C 146.344 156.026 161.755 142.232 163.780 124.000 L 220.000 124.000 L 220.000 184.000 C 220.000 190.627 214.627 196.000 208.000 196.000 Z"),
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
