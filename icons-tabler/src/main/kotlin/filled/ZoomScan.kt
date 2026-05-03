package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.ZoomScan: ImageVector
    get() {
        if (_zoomScan != null) return _zoomScan!!
        _zoomScan = tablerFilledIcon(
            name = "ZoomScan",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 4.000 15.000 C 4.552 15.000 5.000 15.448 5.000 16.000 L 5.000 18.000 C 5.000 18.552 5.448 19.000 6.000 19.000 L 8.000 19.000 C 8.552 19.000 9.000 19.448 9.000 20.000 C 9.000 20.552 8.552 21.000 8.000 21.000 L 6.000 21.000 C 4.343 21.000 3.000 19.657 3.000 18.000 L 3.000 16.000 C 3.000 15.448 3.448 15.000 4.000 15.000"),
        pathFillType = PathFillType.NonZero,
        fill = SolidColor(Color(0xFF000000)),
        fillAlpha = 1.0f,
        stroke = null,
        strokeAlpha = 1.0f,
        strokeLineWidth = 0.0f,
        strokeLineCap = StrokeCap.Butt,
        strokeLineJoin = StrokeJoin.Miter,
    )
    addPath(
        pathData = parseSvgPathData("M 20.000 15.000 C 20.552 15.000 21.000 15.448 21.000 16.000 L 21.000 18.000 C 21.000 19.657 19.657 21.000 18.000 21.000 L 16.000 21.000 C 15.448 21.000 15.000 20.552 15.000 20.000 C 15.000 19.448 15.448 19.000 16.000 19.000 L 18.000 19.000 C 18.552 19.000 19.000 18.552 19.000 18.000 L 19.000 16.000 C 19.000 15.448 19.448 15.000 20.000 15.000"),
        pathFillType = PathFillType.NonZero,
        fill = SolidColor(Color(0xFF000000)),
        fillAlpha = 1.0f,
        stroke = null,
        strokeAlpha = 1.0f,
        strokeLineWidth = 0.0f,
        strokeLineCap = StrokeCap.Butt,
        strokeLineJoin = StrokeJoin.Miter,
    )
    addPath(
        pathData = parseSvgPathData("M 11.000 7.000 C 12.435 7.000 13.761 7.769 14.473 9.016 C 15.185 10.262 15.175 11.794 14.446 13.031 L 16.707 15.293 C 17.086 15.685 17.081 16.309 16.695 16.695 C 16.309 17.081 15.685 17.086 15.293 16.707 L 13.031 14.447 L 13.000 14.464 C 11.762 15.179 10.238 15.179 9.000 14.464 C 7.762 13.750 7.000 12.429 7.000 11.000 L 7.005 10.800 C 7.112 8.671 8.869 7.000 11.000 7.000"),
        pathFillType = PathFillType.NonZero,
        fill = SolidColor(Color(0xFF000000)),
        fillAlpha = 1.0f,
        stroke = null,
        strokeAlpha = 1.0f,
        strokeLineWidth = 0.0f,
        strokeLineCap = StrokeCap.Butt,
        strokeLineJoin = StrokeJoin.Miter,
    )
    addPath(
        pathData = parseSvgPathData("M 8.000 3.000 C 8.552 3.000 9.000 3.448 9.000 4.000 C 9.000 4.552 8.552 5.000 8.000 5.000 L 6.000 5.000 C 5.448 5.000 5.000 5.448 5.000 6.000 L 5.000 8.000 C 5.000 8.552 4.552 9.000 4.000 9.000 C 3.448 9.000 3.000 8.552 3.000 8.000 L 3.000 6.000 C 3.000 4.343 4.343 3.000 6.000 3.000 Z"),
        pathFillType = PathFillType.NonZero,
        fill = SolidColor(Color(0xFF000000)),
        fillAlpha = 1.0f,
        stroke = null,
        strokeAlpha = 1.0f,
        strokeLineWidth = 0.0f,
        strokeLineCap = StrokeCap.Butt,
        strokeLineJoin = StrokeJoin.Miter,
    )
    addPath(
        pathData = parseSvgPathData("M 18.000 3.000 C 19.657 3.000 21.000 4.343 21.000 6.000 L 21.000 8.000 C 21.000 8.552 20.552 9.000 20.000 9.000 C 19.448 9.000 19.000 8.552 19.000 8.000 L 19.000 6.000 C 19.000 5.448 18.552 5.000 18.000 5.000 L 16.000 5.000 C 15.448 5.000 15.000 4.552 15.000 4.000 C 15.000 3.448 15.448 3.000 16.000 3.000 Z"),
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
        return _zoomScan!!
    }

private var _zoomScan: ImageVector? = null
