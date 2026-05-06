package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.RelationManyToMany: ImageVector
    get() {
        if (_relationManyToMany != null) return _relationManyToMany!!
        _relationManyToMany = tablerFilledIcon(
            name = "RelationManyToMany",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M19 4c1.657 0 3 1.343 3 3v10c0 1.657-1.343 3-3 3h-14C3.343 20 2 18.657 2 17v-10C2 5.343 3.343 4 5 4ZM15.8 9.4C15.223 8.631 14 9.039 14 10v4c0 .552 .448 1 1 1l.117-.007c.503-.059 .883-.486 .883-.993v-1l1.2 1.6C17.777 15.369 19 14.961 19 14v-4C19 9.448 18.552 9 18 9l-.117 .007c-.503 .059-.883 .486-.883 .993v1ZM6.8 9.4C6.223 8.631 5 9.039 5 10v4c0 .552 .448 1 1 1l.117-.007C6.62 14.934 7 14.507 7 14v-1l1.2 1.6C8.777 15.369 10 14.961 10 14v-4C10 9.448 9.552 9 9 9l-.117 .007C8.38 9.066 8 9.493 8 10v1ZM12 12.5c-.552 0-1 .448-1 1v.01c0 .552 .448 1 1 1 .552 0 1-.448 1-1v-.01c0-.552-.448-1-1-1M12 9.5c-.552 0-1 .448-1 1v.01c0 .552 .448 1 1 1 .552 0 1-.448 1-1v-.01c0-.552-.448-1-1-1"),
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
        return _relationManyToMany!!
    }

private var _relationManyToMany: ImageVector? = null
