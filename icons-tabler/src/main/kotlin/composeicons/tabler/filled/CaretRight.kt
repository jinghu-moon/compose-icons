package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.CaretRight: ImageVector
    get() {
        if (_caretRight != null) return _caretRight!!
        _caretRight = tablerFilledIcon(
            name = "CaretRight",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M9 6c0-.852 .986-1.297 1.623-.783l.084 .076 6 6c.356 .356 .392 .922 .083 1.32l-.083 .094-6 6-.094 .083-.077 .054-.096 .054-.036 .017-.067 .027-.108 .032-.053 .01-.06 .01-.057 .004L10 19l-.059-.002-.058-.005-.06-.009-.052-.01-.108-.032-.067-.027-.132-.07-.09-.065-.081-.073-.083-.094-.054-.077-.054-.096-.017-.036-.027-.067-.032-.108-.01-.053-.01-.06-.004-.057L9 6Z"),
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
        return _caretRight!!
    }

private var _caretRight: ImageVector? = null
