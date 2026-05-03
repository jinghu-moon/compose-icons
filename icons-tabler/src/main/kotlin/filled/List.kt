package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.List: ImageVector
    get() {
        if (_list != null) return _list!!
        _list = tablerFilledIcon(
            name = "List",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 21.000 6.000 C 21.000 6.552 20.552 7.000 20.000 7.000 L 10.000 7.000 C 9.448 7.000 9.000 6.552 9.000 6.000 C 9.000 5.448 9.448 5.000 10.000 5.000 L 20.000 5.000 C 20.552 5.000 21.000 5.448 21.000 6.000"),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color(0xFF000000)),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
            )
            addPath(
                pathData = parseSvgPathData("M 21.000 12.000 C 21.000 12.552 20.552 13.000 20.000 13.000 L 10.000 13.000 C 9.448 13.000 9.000 12.552 9.000 12.000 C 9.000 11.448 9.448 11.000 10.000 11.000 L 20.000 11.000 C 20.552 11.000 21.000 11.448 21.000 12.000"),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color(0xFF000000)),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
            )
            addPath(
                pathData = parseSvgPathData("M 21.000 18.000 C 21.000 18.552 20.552 19.000 20.000 19.000 L 10.000 19.000 C 9.448 19.000 9.000 18.552 9.000 18.000 C 9.000 17.448 9.448 17.000 10.000 17.000 L 20.000 17.000 C 20.552 17.000 21.000 17.448 21.000 18.000"),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color(0xFF000000)),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
            )
            addPath(
                pathData = parseSvgPathData("M 7.000 5.995 L 7.000 6.015 C 7.000 7.114 6.105 8.005 5.000 8.005 C 3.895 8.005 3.000 7.114 3.000 6.015 L 3.000 5.995 C 3.000 4.896 3.895 4.005 5.000 4.005 C 6.105 4.005 7.000 4.896 7.000 5.995"),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color(0xFF000000)),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
            )
            addPath(
                pathData = parseSvgPathData("M 7.000 11.995 L 7.000 12.015 C 7.000 13.114 6.105 14.005 5.000 14.005 C 3.895 14.005 3.000 13.114 3.000 12.015 L 3.000 11.995 C 3.000 10.896 3.895 10.005 5.000 10.005 C 6.105 10.005 7.000 10.896 7.000 11.995"),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color(0xFF000000)),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
            )
            addPath(
                pathData = parseSvgPathData("M 7.000 17.995 L 7.000 18.015 C 7.000 19.114 6.105 20.005 5.000 20.005 C 3.895 20.005 3.000 19.114 3.000 18.015 L 3.000 17.995 C 3.000 16.896 3.895 16.005 5.000 16.005 C 6.105 16.005 7.000 16.896 7.000 17.995"),
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
        return _list!!
    }

private var _list: ImageVector? = null
