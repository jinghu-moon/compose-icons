package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.Category: ImageVector
    get() {
        if (_category != null) return _category!!
        _category = tablerFilledIcon(
            name = "Category",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 10.000 3.000 L 4.000 3.000 C 3.448 3.000 3.000 3.448 3.000 4.000 L 3.000 10.000 C 3.000 10.552 3.448 11.000 4.000 11.000 L 10.000 11.000 C 10.552 11.000 11.000 10.552 11.000 10.000 L 11.000 4.000 C 11.000 3.448 10.552 3.000 10.000 3.000 Z"),
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
                pathData = parseSvgPathData("M 20.000 3.000 L 14.000 3.000 C 13.448 3.000 13.000 3.448 13.000 4.000 L 13.000 10.000 C 13.000 10.552 13.448 11.000 14.000 11.000 L 20.000 11.000 C 20.552 11.000 21.000 10.552 21.000 10.000 L 21.000 4.000 C 21.000 3.448 20.552 3.000 20.000 3.000 Z"),
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
                pathData = parseSvgPathData("M 10.000 13.000 L 4.000 13.000 C 3.448 13.000 3.000 13.448 3.000 14.000 L 3.000 20.000 C 3.000 20.552 3.448 21.000 4.000 21.000 L 10.000 21.000 C 10.552 21.000 11.000 20.552 11.000 20.000 L 11.000 14.000 C 11.000 13.448 10.552 13.000 10.000 13.000 Z"),
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
                pathData = parseSvgPathData("M 17.000 13.000 C 19.183 13.000 20.963 14.750 20.999 16.933 C 21.036 19.116 19.315 20.925 17.133 20.998 C 14.951 21.071 13.114 19.380 13.005 17.200 L 13.000 17.000 L 13.005 16.800 C 13.112 14.671 14.869 13.000 17.000 13.000 Z"),
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
        return _category!!
    }

private var _category: ImageVector? = null
