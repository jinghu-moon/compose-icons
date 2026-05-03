package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.ToggleRight: ImageVector
    get() {
        if (_toggleRight != null) return _toggleRight!!
        _toggleRight = phosphorThinIcon(
            name = "ToggleRight",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 176.000 60.000 L 80.000 60.000 C 42.445 60.000 12.000 90.445 12.000 128.000 C 12.000 165.555 42.445 196.000 80.000 196.000 L 176.000 196.000 C 213.555 196.000 244.000 165.555 244.000 128.000 C 244.000 90.445 213.555 60.000 176.000 60.000 ZM 176.000 188.000 L 80.000 188.000 C 46.863 188.000 20.000 161.137 20.000 128.000 C 20.000 94.863 46.863 68.000 80.000 68.000 L 176.000 68.000 C 209.137 68.000 236.000 94.863 236.000 128.000 C 236.000 161.137 209.137 188.000 176.000 188.000 ZM 176.000 92.000 C 156.118 92.000 140.000 108.118 140.000 128.000 C 140.000 147.882 156.118 164.000 176.000 164.000 C 195.882 164.000 212.000 147.882 212.000 128.000 C 212.000 108.118 195.882 92.000 176.000 92.000 ZM 176.000 156.000 C 160.536 156.000 148.000 143.464 148.000 128.000 C 148.000 112.536 160.536 100.000 176.000 100.000 C 191.464 100.000 204.000 112.536 204.000 128.000 C 204.000 143.464 191.464 156.000 176.000 156.000 Z"),
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
        return _toggleRight!!
    }

private var _toggleRight: ImageVector? = null
