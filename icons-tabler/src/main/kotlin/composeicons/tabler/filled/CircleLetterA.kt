package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.CircleLetterA: ImageVector
    get() {
        if (_circleLetterA != null) return _circleLetterA!!
        _circleLetterA = tablerFilledIcon(
            name = "CircleLetterA",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M12 2c5.523 0 10 4.477 10 10 0 5.523-4.477 10-10 10C6.477 22 2 17.523 2 12 2 6.477 6.477 2 12 2M12 7C10.343 7 9 8.343 9 10v6c0 .552 .448 1 1 1 .552 0 1-.448 1-1v-2h2v2c0 .507 .38 .934 .883 .993L14 17c.552 0 1-.448 1-1v-6C15 8.343 13.657 7 12 7M12 9c.552 0 1 .448 1 1v2h-2v-2c0-.507 .38-.934 .883-.993Z"),
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
        return _circleLetterA!!
    }

private var _circleLetterA: ImageVector? = null
