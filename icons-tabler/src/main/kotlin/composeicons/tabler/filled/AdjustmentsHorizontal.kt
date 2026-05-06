package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.AdjustmentsHorizontal: ImageVector
    get() {
        if (_adjustmentsHorizontal != null) return _adjustmentsHorizontal!!
        _adjustmentsHorizontal = tablerFilledIcon(
            name = "AdjustmentsHorizontal",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M17 15c1.306 0 2.418 .835 2.83 2h.17c.552 0 1 .448 1 1 0 .552-.448 1-1 1h-.171c-.424 1.198-1.558 2-2.829 2-1.271 0-2.405-.801-2.829-2h-10.171C3.448 19 3 18.552 3 18c0-.552 .448-1 1-1h10.173c.41-1.165 1.52-2 2.827-2M8 9c1.306 0 2.418 .835 2.83 2h9.17c.552 0 1 .448 1 1 0 .552-.448 1-1 1h-9.171C10.405 14.198 9.271 15 8 15 6.729 15 5.595 14.198 5.171 13h-1.171C3.448 13 3 12.552 3 12c0-.552 .448-1 1-1h1.173C5.583 9.835 6.693 9 8 9M14 3c1.306 0 2.418 .835 2.83 2h3.17c.552 0 1 .448 1 1 0 .552-.448 1-1 1h-3.171C16.405 8.198 15.271 9 14 9 12.729 9 11.595 8.198 11.171 7h-7.171C3.448 7 3 6.552 3 6 3 5.448 3.448 5 4 5h7.173C11.583 3.835 12.693 3 14 3"),
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
        return _adjustmentsHorizontal!!
    }

private var _adjustmentsHorizontal: ImageVector? = null
