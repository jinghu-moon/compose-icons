package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Command: ImageVector
    get() {
        if (_command != null) return _command!!
        _command = phosphorThinIcon(
            name = "Command",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 180.000 148.000 L 156.000 148.000 L 156.000 108.000 L 180.000 108.000 C 197.673 108.000 212.000 93.673 212.000 76.000 C 212.000 58.327 197.673 44.000 180.000 44.000 C 162.327 44.000 148.000 58.327 148.000 76.000 L 148.000 100.000 L 108.000 100.000 L 108.000 76.000 C 108.000 58.327 93.673 44.000 76.000 44.000 C 58.327 44.000 44.000 58.327 44.000 76.000 C 44.000 93.673 58.327 108.000 76.000 108.000 L 100.000 108.000 L 100.000 148.000 L 76.000 148.000 C 58.327 148.000 44.000 162.327 44.000 180.000 C 44.000 197.673 58.327 212.000 76.000 212.000 C 93.673 212.000 108.000 197.673 108.000 180.000 L 108.000 156.000 L 148.000 156.000 L 148.000 180.000 C 148.000 197.673 162.327 212.000 180.000 212.000 C 197.673 212.000 212.000 197.673 212.000 180.000 C 212.000 162.327 197.673 148.000 180.000 148.000 ZM 156.000 76.000 C 156.000 62.745 166.745 52.000 180.000 52.000 C 193.255 52.000 204.000 62.745 204.000 76.000 C 204.000 89.255 193.255 100.000 180.000 100.000 L 156.000 100.000 ZM 52.000 76.000 C 52.000 62.745 62.745 52.000 76.000 52.000 C 89.255 52.000 100.000 62.745 100.000 76.000 L 100.000 100.000 L 76.000 100.000 C 62.745 100.000 52.000 89.255 52.000 76.000 ZM 100.000 180.000 C 100.000 193.255 89.255 204.000 76.000 204.000 C 62.745 204.000 52.000 193.255 52.000 180.000 C 52.000 166.745 62.745 156.000 76.000 156.000 L 100.000 156.000 ZM 108.000 108.000 L 148.000 108.000 L 148.000 148.000 L 108.000 148.000 ZM 180.000 204.000 C 166.745 204.000 156.000 193.255 156.000 180.000 L 156.000 156.000 L 180.000 156.000 C 193.255 156.000 204.000 166.745 204.000 180.000 C 204.000 193.255 193.255 204.000 180.000 204.000 Z"),
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
        return _command!!
    }

private var _command: ImageVector? = null
