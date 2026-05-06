package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.Files: ImageVector
    get() {
        if (_files != null) return _files!!
        _files = tablerFilledIcon(
            name = "Files",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M11 2l3 .001v5.999c0 .507 .38 .934 .883 .993L15 9h6v6c0 1.657-1.343 3-3 3h-1v1c0 1.657-1.343 3-3 3h-7C5.343 22 4 20.657 4 19v-10C4 7.343 5.343 6 7 6h1v-1C8 3.343 9.343 2 11 2M8 8h-1C6.448 8 6 8.448 6 9v10c0 .552 .448 1 1 1h7c.552 0 1-.448 1-1v-1h-4C9.343 18 8 16.657 8 15ZM20.415 7h-4.415v-4.415Z"),
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
        return _files!!
    }

private var _files: ImageVector? = null
