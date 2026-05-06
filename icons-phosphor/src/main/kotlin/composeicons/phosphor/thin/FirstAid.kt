package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.FirstAid: ImageVector
    get() {
        if (_firstAid != null) return _firstAid!!
        _firstAid = phosphorThinIcon(
            name = "FirstAid",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M216 92h-52v-52c0-6.627-5.373-12-12-12h-48C97.373 28 92 33.373 92 40v52h-52c-6.627 0-12 5.373-12 12v48c0 6.627 5.373 12 12 12h52v52c0 6.627 5.373 12 12 12h48c6.627 0 12-5.373 12-12v-52h52c6.627 0 12-5.373 12-12v-48c0-6.627-5.373-12-12-12ZM220 152c0 2.209-1.791 4-4 4h-56c-2.209 0-4 1.791-4 4v56c0 2.209-1.791 4-4 4h-48c-2.209 0-4-1.791-4-4v-56c0-2.209-1.791-4-4-4h-56c-2.209 0-4-1.791-4-4v-48c0-2.209 1.791-4 4-4h56c2.209 0 4-1.791 4-4v-56c0-2.209 1.791-4 4-4h48c2.209 0 4 1.791 4 4v56c0 2.209 1.791 4 4 4h56c2.209 0 4 1.791 4 4Z"),
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
        return _firstAid!!
    }

private var _firstAid: ImageVector? = null
