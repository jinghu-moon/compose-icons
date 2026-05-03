package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Sticker: ImageVector
    get() {
        if (_sticker != null) return _sticker!!
        _sticker = phosphorThinIcon(
            name = "Sticker",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 168.000 36.000 L 88.000 36.000 C 59.295 36.033 36.033 59.295 36.000 88.000 L 36.000 168.000 C 36.033 196.705 59.295 219.967 88.000 220.000 L 136.000 220.000 C 136.429 220.001 136.855 219.930 137.260 219.790 C 162.720 211.310 211.310 162.720 219.790 137.260 C 219.930 136.855 220.001 136.429 220.000 136.000 L 220.000 88.000 C 219.967 59.295 196.705 36.033 168.000 36.000 ZM 44.000 168.000 L 44.000 88.000 C 44.028 63.711 63.711 44.028 88.000 44.000 L 168.000 44.000 C 192.289 44.028 211.972 63.711 212.000 88.000 L 212.000 132.000 L 184.000 132.000 C 155.295 132.033 132.033 155.295 132.000 184.000 L 132.000 212.000 L 88.000 212.000 C 63.711 211.972 44.028 192.289 44.000 168.000 ZM 140.000 210.000 L 140.000 184.000 C 140.028 159.711 159.711 140.028 184.000 140.000 L 210.000 140.000 C 198.900 162.230 162.230 198.900 140.000 210.000 Z"),
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
        return _sticker!!
    }

private var _sticker: ImageVector? = null
