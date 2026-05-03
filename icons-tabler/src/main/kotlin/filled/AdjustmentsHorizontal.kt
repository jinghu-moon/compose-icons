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
                pathData = parseSvgPathData("M 17.000 15.000 C 18.306 15.000 19.418 15.835 19.830 17.000 L 20.000 17.000 C 20.552 17.000 21.000 17.448 21.000 18.000 C 21.000 18.552 20.552 19.000 20.000 19.000 L 19.829 19.000 C 19.405 20.198 18.271 21.000 17.000 21.000 C 15.729 21.000 14.595 20.198 14.171 19.000 L 4.000 19.000 C 3.448 19.000 3.000 18.552 3.000 18.000 C 3.000 17.448 3.448 17.000 4.000 17.000 L 14.173 17.000 C 14.583 15.835 15.693 15.000 17.000 15.000M 8.000 9.000 C 9.306 9.000 10.418 9.835 10.830 11.000 L 20.000 11.000 C 20.552 11.000 21.000 11.448 21.000 12.000 C 21.000 12.552 20.552 13.000 20.000 13.000 L 10.829 13.000 C 10.405 14.198 9.271 15.000 8.000 15.000 C 6.729 15.000 5.595 14.198 5.171 13.000 L 4.000 13.000 C 3.448 13.000 3.000 12.552 3.000 12.000 C 3.000 11.448 3.448 11.000 4.000 11.000 L 5.173 11.000 C 5.583 9.835 6.693 9.000 8.000 9.000M 14.000 3.000 C 15.306 3.000 16.418 3.835 16.830 5.000 L 20.000 5.000 C 20.552 5.000 21.000 5.448 21.000 6.000 C 21.000 6.552 20.552 7.000 20.000 7.000 L 16.829 7.000 C 16.405 8.198 15.271 9.000 14.000 9.000 C 12.729 9.000 11.595 8.198 11.171 7.000 L 4.000 7.000 C 3.448 7.000 3.000 6.552 3.000 6.000 C 3.000 5.448 3.448 5.000 4.000 5.000 L 11.173 5.000 C 11.583 3.835 12.693 3.000 14.000 3.000"),
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
