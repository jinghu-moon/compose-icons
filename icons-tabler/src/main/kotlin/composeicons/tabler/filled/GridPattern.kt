package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.GridPattern: ImageVector
    get() {
        if (_gridPattern != null) return _gridPattern!!
        _gridPattern = tablerFilledIcon(
            name = "GridPattern",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M18 3c1.657 0 3 1.343 3 3v12c0 1.657-1.343 3-3 3h-12C4.343 21 3 19.657 3 18v-12C3 4.343 4.343 3 6 3ZM14 7c-.552 0-1 .448-1 1v1h-2v-1c-0-.507-.38-.934-.883-.993L10 7C9.448 7 9 7.448 9 8v1h-1c-.507 0-.934 .38-.993 .883L7 10c0 .552 .448 1 1 1h1v2h-1c-.507 0-.934 .38-.993 .883L7 14c0 .552 .448 1 1 1h1v1c0 .507 .38 .934 .883 .993L10 17c.552 0 1-.448 1-1v-1h2v1c0 .507 .38 .934 .883 .993L14 17c.552 0 1-.448 1-1v-1h1c.507-0 .934-.38 .993-.883L17 14c0-.552-.448-1-1-1h-1v-2h1c.507-0 .934-.38 .993-.883L17 10C17 9.448 16.552 9 16 9h-1v-1c-0-.507-.38-.934-.883-.993ZM13 11v2h-2v-2Z"),
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
        return _gridPattern!!
    }

private var _gridPattern: ImageVector? = null
