package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.CircleLetterF: ImageVector
    get() {
        if (_circleLetterF != null) return _circleLetterF!!
        _circleLetterF = tablerFilledIcon(
            name = "CircleLetterF",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M12 2c5.523 0 10 4.477 10 10 0 5.523-4.477 10-10 10C6.477 22 2 17.523 2 12 2 6.477 6.477 2 12 2M14 7h-4C9.448 7 9 7.448 9 8v8c0 .552 .448 1 1 1l.117-.007c.503-.059 .883-.486 .883-.993v-3h2c.507-0 .934-.38 .993-.883L14 12c0-.552-.448-1-1-1h-2v-2h3c.552 0 1-.448 1-1C15 7.448 14.552 7 14 7"),
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
        return _circleLetterF!!
    }

private var _circleLetterF: ImageVector? = null
