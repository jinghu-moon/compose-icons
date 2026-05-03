package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.ZoomOutArea: ImageVector
    get() {
        if (_zoomOutArea != null) return _zoomOutArea!!
        _zoomOutArea = tablerFilledIcon(
            name = "ZoomOutArea",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 15.000 9.000 C 17.245 9.000 19.302 10.253 20.332 12.248 C 21.362 14.243 21.192 16.646 19.891 18.476 L 22.707 21.293 C 23.086 21.685 23.081 22.309 22.695 22.695 C 22.309 23.081 21.685 23.086 21.293 22.707 L 18.476 19.891 C 16.646 21.192 14.243 21.362 12.248 20.332 C 10.253 19.302 9.000 17.245 9.000 15.000 L 9.004 14.775 C 9.125 11.551 11.774 9.000 15.000 9.000M 17.000 14.000 L 13.000 14.000 C 12.448 14.000 12.000 14.448 12.000 15.000 C 12.000 15.552 12.448 16.000 13.000 16.000 L 17.000 16.000 C 17.552 16.000 18.000 15.552 18.000 15.000 C 18.000 14.448 17.552 14.000 17.000 14.000M 3.000 14.000 C 3.552 14.000 4.000 14.448 4.000 15.000 L 4.000 16.000 C 4.000 16.552 4.448 17.000 5.000 17.000 L 6.000 17.000 C 6.552 17.000 7.000 17.448 7.000 18.000 C 7.000 18.552 6.552 19.000 6.000 19.000 L 5.000 19.000 C 3.343 19.000 2.000 17.657 2.000 16.000 L 2.000 15.000 C 2.000 14.448 2.448 14.000 3.000 14.000M 3.000 9.000 C 3.552 9.000 4.000 9.448 4.000 10.000 L 4.000 11.000 C 4.000 11.552 3.552 12.000 3.000 12.000 C 2.448 12.000 2.000 11.552 2.000 11.000 L 2.000 10.000 C 2.000 9.448 2.448 9.000 3.000 9.000M 6.000 2.000 C 6.552 2.000 7.000 2.448 7.000 3.000 C 7.000 3.552 6.552 4.000 6.000 4.000 L 5.000 4.000 C 4.448 4.000 4.000 4.448 4.000 5.000 L 4.000 6.000 C 4.000 6.552 3.552 7.000 3.000 7.000 C 2.448 7.000 2.000 6.552 2.000 6.000 L 2.000 5.000 C 2.000 3.343 3.343 2.000 5.000 2.000 ZM 11.000 2.000 C 11.552 2.000 12.000 2.448 12.000 3.000 C 12.000 3.552 11.552 4.000 11.000 4.000 L 10.000 4.000 C 9.448 4.000 9.000 3.552 9.000 3.000 C 9.000 2.448 9.448 2.000 10.000 2.000 ZM 16.000 2.000 C 17.657 2.000 19.000 3.343 19.000 5.000 L 19.000 6.000 C 19.000 6.552 18.552 7.000 18.000 7.000 C 17.448 7.000 17.000 6.552 17.000 6.000 L 17.000 5.000 C 17.000 4.448 16.552 4.000 16.000 4.000 L 15.000 4.000 C 14.448 4.000 14.000 3.552 14.000 3.000 C 14.000 2.448 14.448 2.000 15.000 2.000 Z"),
        pathFillType = PathFillType.NonZero,
        fill = SolidColor(Color(0xFF000000)),
        fillAlpha = 1.0f,
        stroke = null,
        strokeAlpha = 1.0f,
        strokeLineWidth = 0.0f,
        strokeLineCap = StrokeCap.Butt,
        strokeLineJoin = StrokeJoin.Miter,
    )
        }
        return _zoomOutArea!!
    }

private var _zoomOutArea: ImageVector? = null
