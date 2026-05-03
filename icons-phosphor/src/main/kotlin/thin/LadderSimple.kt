package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.LadderSimple: ImageVector
    get() {
        if (_ladderSimple != null) return _ladderSimple!!
        _ladderSimple = phosphorThinIcon(
            name = "LadderSimple",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 192.000 28.000 C 189.791 28.000 188.000 29.791 188.000 32.000 L 188.000 68.000 L 68.000 68.000 L 68.000 32.000 C 68.000 29.791 66.209 28.000 64.000 28.000 C 61.791 28.000 60.000 29.791 60.000 32.000 L 60.000 224.000 C 60.000 226.209 61.791 228.000 64.000 228.000 C 66.209 228.000 68.000 226.209 68.000 224.000 L 68.000 188.000 L 188.000 188.000 L 188.000 224.000 C 188.000 226.209 189.791 228.000 192.000 228.000 C 194.209 228.000 196.000 226.209 196.000 224.000 L 196.000 32.000 C 196.000 29.791 194.209 28.000 192.000 28.000 ZM 188.000 76.000 L 188.000 124.000 L 68.000 124.000 L 68.000 76.000 ZM 68.000 180.000 L 68.000 132.000 L 188.000 132.000 L 188.000 180.000 Z"),
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
        return _ladderSimple!!
    }

private var _ladderSimple: ImageVector? = null
