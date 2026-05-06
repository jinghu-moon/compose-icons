package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.CircleRectangle: ImageVector
    get() {
        if (_circleRectangle != null) return _circleRectangle!!
        _circleRectangle = tablerFilledIcon(
            name = "CircleRectangle",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M17 3.34c4.203 2.426 6.057 7.52 4.397 12.081-1.66 4.56-6.354 7.271-11.134 6.428C5.484 21.006 2 16.853 2 12l.005-.324C2.119 8.163 4.069 4.968 7.141 3.26 10.213 1.552 13.956 1.582 17 3.34M17 9h-10C6.448 9 6 9.448 6 10v4c0 .552 .448 1 1 1h10c.552 0 1-.448 1-1v-4C18 9.448 17.552 9 17 9"),
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
        return _circleRectangle!!
    }

private var _circleRectangle: ImageVector? = null
