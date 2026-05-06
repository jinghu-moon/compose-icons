package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.Leaf: ImageVector
    get() {
        if (_leaf != null) return _leaf!!
        _leaf = tablerFilledIcon(
            name = "Leaf",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M3.055 14.328l-.018-.168-.004-.043c-.035-.372-.05-.746-.047-1.12C3.004 6.707 7.276 3 15.986 3h4.014c.552 0 1 .448 1 1l-.002 2.057C20.5 14.758 16.258 19 9 19h-2.631c-.172 .694-.297 1.399-.375 2.11-.061 .549-.555 .945-1.104 .884-.549-.061-.945-.555-.884-1.104q.174-1.568 .58-2.947l-.118-.146-.208-.28-.157-.229-.182-.293-.098-.171-.065-.122c-.159-.302-.292-.617-.397-.941l-.072-.237-.085-.327-.057-.268-.043-.242ZM11.594 10.086C8.749 11.351 6.74 13.216 5.486 15.669q.098 .2 .218 .4l.185 .281 .07 .097q.12 .164 .258 .329L6.414 17h.649c1.037-2.271 2.777-3.946 5.343-5.086 .505-.224 .732-.815 .508-1.32-.224-.505-.815-.732-1.32-.508"),
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
        return _leaf!!
    }

private var _leaf: ImageVector? = null
