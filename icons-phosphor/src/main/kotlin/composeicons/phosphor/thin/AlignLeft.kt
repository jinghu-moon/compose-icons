package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.AlignLeft: ImageVector
    get() {
        if (_alignLeft != null) return _alignLeft!!
        _alignLeft = phosphorThinIcon(
            name = "AlignLeft",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M44 40v176c0 2.209-1.791 4-4 4-2.209 0-4-1.791-4-4v-176c0-2.209 1.791-4 4-4 2.209 0 4 1.791 4 4ZM68 104v-40C68 57.373 73.373 52 80 52h96c6.627 0 12 5.373 12 12v40c0 6.627-5.373 12-12 12h-96c-6.627 0-12-5.373-12-12ZM76 104c0 2.209 1.791 4 4 4h96c2.209 0 4-1.791 4-4v-40c0-2.209-1.791-4-4-4h-96c-2.209 0-4 1.791-4 4ZM228 152v40c0 6.627-5.373 12-12 12h-136c-6.627 0-12-5.373-12-12v-40c0-6.627 5.373-12 12-12h136c6.627 0 12 5.373 12 12ZM220 152c0-2.209-1.791-4-4-4h-136c-2.209 0-4 1.791-4 4v40c0 2.209 1.791 4 4 4h136c2.209 0 4-1.791 4-4Z"),
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
        return _alignLeft!!
    }

private var _alignLeft: ImageVector? = null
