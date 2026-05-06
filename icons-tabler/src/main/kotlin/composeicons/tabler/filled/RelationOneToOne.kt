package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.RelationOneToOne: ImageVector
    get() {
        if (_relationOneToOne != null) return _relationOneToOne!!
        _relationOneToOne = tablerFilledIcon(
            name = "RelationOneToOne",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M19 4c1.657 0 3 1.343 3 3v10c0 1.657-1.343 3-3 3h-14C3.343 20 2 18.657 2 17v-10C2 5.343 3.343 4 5 4ZM9 9h-1C7.448 9 7 9.448 7 10c0 .552 .448 1 1 1v3c0 .552 .448 1 1 1 .552 0 1-.448 1-1v-4C10 9.448 9.552 9 9 9M16 9h-1c-.552 0-1 .448-1 1 0 .552 .448 1 1 1v3c0 .552 .448 1 1 1 .552 0 1-.448 1-1v-4C17 9.448 16.552 9 16 9M12 12.5c-.552 0-1 .448-1 1v.01c0 .552 .448 1 1 1 .552 0 1-.448 1-1v-.01c0-.552-.448-1-1-1M12 9.5c-.552 0-1 .448-1 1v.01c0 .552 .448 1 1 1 .552 0 1-.448 1-1v-.01c0-.552-.448-1-1-1"),
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
        return _relationOneToOne!!
    }

private var _relationOneToOne: ImageVector? = null
