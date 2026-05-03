package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.PresentationAnalytics: ImageVector
    get() {
        if (_presentationAnalytics != null) return _presentationAnalytics!!
        _presentationAnalytics = tablerFilledIcon(
            name = "PresentationAnalytics",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 21.000 3.000 C 21.552 3.000 22.000 3.448 22.000 4.000 C 22.000 4.552 21.552 5.000 21.000 5.000 L 21.000 14.000 C 21.000 15.657 19.657 17.000 18.000 17.000 L 13.000 17.000 L 13.000 19.000 L 15.000 19.000 C 15.552 19.000 16.000 19.448 16.000 20.000 C 16.000 20.552 15.552 21.000 15.000 21.000 L 9.000 21.000 C 8.448 21.000 8.000 20.552 8.000 20.000 C 8.000 19.448 8.448 19.000 9.000 19.000 L 11.000 19.000 L 11.000 17.000 L 6.000 17.000 C 4.343 17.000 3.000 15.657 3.000 14.000 L 3.000 5.000 C 2.448 5.000 2.000 4.552 2.000 4.000 C 2.000 3.448 2.448 3.000 3.000 3.000 ZM 9.000 7.000 C 8.448 7.000 8.000 7.448 8.000 8.000 L 8.000 12.000 C 8.000 12.552 8.448 13.000 9.000 13.000 C 9.552 13.000 10.000 12.552 10.000 12.000 L 10.000 8.000 C 10.000 7.448 9.552 7.000 9.000 7.000M 15.000 9.000 C 14.448 9.000 14.000 9.448 14.000 10.000 L 14.000 12.000 C 14.000 12.552 14.448 13.000 15.000 13.000 C 15.552 13.000 16.000 12.552 16.000 12.000 L 16.000 10.000 C 16.000 9.448 15.552 9.000 15.000 9.000M 12.000 10.000 C 11.448 10.000 11.000 10.448 11.000 11.000 L 11.000 12.000 C 11.000 12.552 11.448 13.000 12.000 13.000 C 12.552 13.000 13.000 12.552 13.000 12.000 L 13.000 11.000 C 13.000 10.448 12.552 10.000 12.000 10.000"),
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
        return _presentationAnalytics!!
    }

private var _presentationAnalytics: ImageVector? = null
