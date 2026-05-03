package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.Bike: ImageVector
    get() {
        if (_bike != null) return _bike!!
        _bike = tablerFilledIcon(
            name = "Bike",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 5.000 14.000 C 7.209 14.000 9.000 15.791 9.000 18.000 C 9.000 20.209 7.209 22.000 5.000 22.000 C 2.791 22.000 1.000 20.209 1.000 18.000 L 1.005 17.800 C 1.112 15.671 2.869 14.000 5.000 14.000"),
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
        pathData = parseSvgPathData("M 19.000 14.000 C 21.209 14.000 23.000 15.791 23.000 18.000 C 23.000 20.209 21.209 22.000 19.000 22.000 C 16.791 22.000 15.000 20.209 15.000 18.000 L 15.005 17.800 C 15.112 15.671 16.869 14.000 19.000 14.000"),
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
        pathData = parseSvgPathData("M 14.832 7.445 L 16.535 10.000 L 19.000 10.000 C 19.507 10.000 19.934 10.380 19.993 10.883 L 20.000 11.000 C 20.000 11.552 19.552 12.000 19.000 12.000 L 16.000 12.000 C 15.666 12.000 15.354 11.833 15.168 11.555 L 13.772 9.462 L 10.497 12.082 L 12.707 14.292 C 12.863 14.448 12.962 14.651 12.991 14.869 L 13.000 15.000 L 13.000 19.000 C 13.000 19.552 12.552 20.000 12.000 20.000 C 11.448 20.000 11.000 19.552 11.000 19.000 L 11.000 15.415 L 8.293 12.707 C 7.907 12.321 7.903 11.696 8.283 11.304 L 8.375 11.219 L 13.375 7.219 C 13.594 7.044 13.876 6.969 14.153 7.011 C 14.430 7.054 14.677 7.212 14.832 7.445"),
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
        pathData = parseSvgPathData("M 17.000 3.000 C 18.105 3.000 19.000 3.895 19.000 5.000 C 19.000 6.105 18.105 7.000 17.000 7.000 C 15.895 7.000 15.000 6.105 15.000 5.000 L 15.005 4.850 C 15.083 3.806 15.953 3.000 17.000 3.000"),
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
        return _bike!!
    }

private var _bike: ImageVector? = null
