package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.ThumbDown: ImageVector
    get() {
        if (_thumbDown != null) return _thumbDown!!
        _thumbDown = tablerOutlineIcon(
            name = "ThumbDown",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M7 13v-8C7 4.448 6.552 4 6 4h-2C3.448 4 3 4.448 3 5v7c0 .552 .448 1 1 1h3c2.209 0 4 1.791 4 4v1c0 1.105 .895 2 2 2 1.105 0 2-.895 2-2v-5h3c1.105 0 2-.895 2-2L19 6C18.705 4.74 17.889 3.924 17 4h-7C8.343 4 7 5.343 7 7"),
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
        return _thumbDown!!
    }

private var _thumbDown: ImageVector? = null
