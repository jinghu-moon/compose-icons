package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.RelationOneToMany: ImageVector
    get() {
        if (_relationOneToMany != null) return _relationOneToMany!!
        _relationOneToMany = tablerFilledIcon(
            name = "RelationOneToMany",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M19 4c1.657 0 3 1.343 3 3v10c0 1.657-1.343 3-3 3h-14C3.343 20 2 18.657 2 17v-10C2 5.343 3.343 4 5 4ZM14.8 9.4C14.223 8.631 13 9.039 13 10v4c0 .552 .448 1 1 1l.117-.007c.503-.059 .883-.486 .883-.993v-1l1.2 1.6C16.777 15.369 18 14.961 18 14v-4C18 9.448 17.552 9 17 9l-.117 .007c-.503 .059-.883 .486-.883 .993v1ZM8 9h-1C6.448 9 6 9.448 6 10c0 .552 .448 1 1 1v3c0 .552 .448 1 1 1 .552 0 1-.448 1-1v-4C9 9.448 8.552 9 8 9M11 12.5c-.552 0-1 .448-1 1v.01c0 .552 .448 1 1 1 .552 0 1-.448 1-1v-.01c0-.552-.448-1-1-1M11 9.5c-.552 0-1 .448-1 1v.01c0 .552 .448 1 1 1 .552 0 1-.448 1-1v-.01c0-.552-.448-1-1-1"),
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
        return _relationOneToMany!!
    }

private var _relationOneToMany: ImageVector? = null
