package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.CornersOut: ImageVector
    get() {
        if (_cornersOut != null) return _cornersOut!!
        _cornersOut = phosphorThinIcon(
            name = "CornersOut",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 212.000 48.000 L 212.000 88.000 C 212.000 90.209 210.209 92.000 208.000 92.000 C 205.791 92.000 204.000 90.209 204.000 88.000 L 204.000 52.000 L 168.000 52.000 C 165.791 52.000 164.000 50.209 164.000 48.000 C 164.000 45.791 165.791 44.000 168.000 44.000 L 208.000 44.000 C 210.209 44.000 212.000 45.791 212.000 48.000 ZM 88.000 204.000 L 52.000 204.000 L 52.000 168.000 C 52.000 165.791 50.209 164.000 48.000 164.000 C 45.791 164.000 44.000 165.791 44.000 168.000 L 44.000 208.000 C 44.000 210.209 45.791 212.000 48.000 212.000 L 88.000 212.000 C 90.209 212.000 92.000 210.209 92.000 208.000 C 92.000 205.791 90.209 204.000 88.000 204.000 ZM 208.000 164.000 C 205.791 164.000 204.000 165.791 204.000 168.000 L 204.000 204.000 L 168.000 204.000 C 165.791 204.000 164.000 205.791 164.000 208.000 C 164.000 210.209 165.791 212.000 168.000 212.000 L 208.000 212.000 C 210.209 212.000 212.000 210.209 212.000 208.000 L 212.000 168.000 C 212.000 165.791 210.209 164.000 208.000 164.000 ZM 88.000 44.000 L 48.000 44.000 C 45.791 44.000 44.000 45.791 44.000 48.000 L 44.000 88.000 C 44.000 90.209 45.791 92.000 48.000 92.000 C 50.209 92.000 52.000 90.209 52.000 88.000 L 52.000 52.000 L 88.000 52.000 C 90.209 52.000 92.000 50.209 92.000 48.000 C 92.000 45.791 90.209 44.000 88.000 44.000 Z"),
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
        return _cornersOut!!
    }

private var _cornersOut: ImageVector? = null
