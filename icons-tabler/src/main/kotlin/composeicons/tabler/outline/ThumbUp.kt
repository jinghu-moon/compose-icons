package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.ThumbUp: ImageVector
    get() {
        if (_thumbUp != null) return _thumbUp!!
        _thumbUp = tablerOutlineIcon(
            name = "ThumbUp",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M7 11v8c0 .552-.448 1-1 1h-2C3.448 20 3 19.552 3 19v-7c0-.552 .448-1 1-1h3c2.209 0 4-1.791 4-4v-1c0-1.105 .895-2 2-2 1.105 0 2 .895 2 2v5h3c1.105 0 2 .895 2 2l-1 5c-.295 1.26-1.111 2.076-2 2h-7C8.343 20 7 18.657 7 17"),
                pathFillType = PathFillType.NonZero,
                fill = null,
                fillAlpha = 1f,
                stroke = SolidColor(Color(0xFF000000)),
                strokeAlpha = 1f,
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
            )
        }
        return _thumbUp!!
    }

private var _thumbUp: ImageVector? = null
