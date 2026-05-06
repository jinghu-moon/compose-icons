package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.Exposure: ImageVector
    get() {
        if (_exposure != null) return _exposure!!
        _exposure = tablerFilledIcon(
            name = "Exposure",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M19 2c1.657 0 3 1.343 3 3v14c0 1.657-1.343 3-3 3h-14C3.343 22 2 20.657 2 19v-14C2 3.343 3.343 2 5 2ZM19 4h-14C4.448 4 4 4.448 4 5v14c0 .29 .123 .55 .321 .732L5.931 18.148c2.241-2.214 4.471-4.439 6.69-6.675L19.715 4.3C19.527 4.108 19.269 4 19 4M18 15h-4c-.552 0-1 .448-1 1 0 .552 .448 1 1 1h4c.552 0 1-.448 1-1 0-.552-.448-1-1-1M8 5c.552 0 1 .448 1 1v1h1c.507 0 .934 .38 .993 .883L11 8c0 .552-.448 1-1 1h-1v1c-0 .507-.38 .934-.883 .993L8 11C7.448 11 7 10.552 7 10v-1h-1C5.493 9 5.066 8.62 5.007 8.117L5 8C5 7.448 5.448 7 6 7h1v-1c0-.507 .38-.934 .883-.993Z"),
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
        return _exposure!!
    }

private var _exposure: ImageVector? = null
