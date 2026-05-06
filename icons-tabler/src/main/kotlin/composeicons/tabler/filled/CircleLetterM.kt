package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.CircleLetterM: ImageVector
    get() {
        if (_circleLetterM != null) return _circleLetterM!!
        _circleLetterM = tablerFilledIcon(
            name = "CircleLetterM",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M12 2c5.523 0 10 4.477 10 10 0 5.523-4.477 10-10 10C6.477 22 2 17.523 2 12 2 6.477 6.477 2 12 2M16 8C16 6.986 14.664 6.616 14.143 7.486L12 11.056 9.857 7.486C9.336 6.616 8 6.986 8 8v8c0 .552 .448 1 1 1l.117-.007c.503-.059 .883-.486 .883-.993v-4.39l1.143 1.904 .074 .108c.204 .257 .521 .397 .848 .375 .327-.022 .623-.202 .792-.483L14 11.61v4.39c0 .552 .448 1 1 1 .552 0 1-.448 1-1Z"),
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
        return _circleLetterM!!
    }

private var _circleLetterM: ImageVector? = null
