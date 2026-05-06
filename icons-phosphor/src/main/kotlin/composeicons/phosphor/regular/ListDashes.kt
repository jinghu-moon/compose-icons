package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.ListDashes: ImageVector
    get() {
        if (_listDashes != null) return _listDashes!!
        _listDashes = phosphorRegularIcon(
            name = "ListDashes",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M88 64c0-4.418 3.582-8 8-8h120c4.418 0 8 3.582 8 8 0 4.418-3.582 8-8 8h-120c-4.418 0-8-3.582-8-8ZM216 120h-120c-4.418 0-8 3.582-8 8 0 4.418 3.582 8 8 8h120c4.418 0 8-3.582 8-8 0-4.418-3.582-8-8-8ZM216 184h-120c-4.418 0-8 3.582-8 8 0 4.418 3.582 8 8 8h120c4.418 0 8-3.582 8-8 0-4.418-3.582-8-8-8ZM56 56h-16c-4.418 0-8 3.582-8 8 0 4.418 3.582 8 8 8h16c4.418 0 8-3.582 8-8 0-4.418-3.582-8-8-8ZM56 120h-16c-4.418 0-8 3.582-8 8 0 4.418 3.582 8 8 8h16c4.418 0 8-3.582 8-8 0-4.418-3.582-8-8-8ZM56 184h-16c-4.418 0-8 3.582-8 8 0 4.418 3.582 8 8 8h16c4.418 0 8-3.582 8-8 0-4.418-3.582-8-8-8Z"),
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
        return _listDashes!!
    }

private var _listDashes: ImageVector? = null
