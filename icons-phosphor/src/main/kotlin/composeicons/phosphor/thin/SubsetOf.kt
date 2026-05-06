package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.SubsetOf: ImageVector
    get() {
        if (_subsetOf != null) return _subsetOf!!
        _subsetOf = phosphorThinIcon(
            name = "SubsetOf",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M204 208c0 2.209-1.791 4-4 4h-152c-2.209 0-4-1.791-4-4 0-2.209 1.791-4 4-4h152c2.209 0 4 1.791 4 4ZM200 164h-96C75.281 164 52 140.719 52 112 52 83.281 75.281 60 104 60h96c2.209 0 4-1.791 4-4 0-2.209-1.791-4-4-4h-96C70.863 52 44 78.863 44 112c0 33.137 26.863 60 60 60h96c2.209 0 4-1.791 4-4 0-2.209-1.791-4-4-4Z"),
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
        return _subsetOf!!
    }

private var _subsetOf: ImageVector? = null
