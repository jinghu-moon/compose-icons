package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.IroningSteam: ImageVector
    get() {
        if (_ironingSteam != null) return _ironingSteam!!
        _ironingSteam = tablerFilledIcon(
            name = "IroningSteam",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 12.000 18.000 C 12.552 18.000 13.000 18.448 13.000 19.000 L 13.000 21.000 C 13.000 21.552 12.552 22.000 12.000 22.000 C 11.448 22.000 11.000 21.552 11.000 21.000 L 11.000 19.000 C 11.000 18.448 11.448 18.000 12.000 18.000"),
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
        pathData = parseSvgPathData("M 16.459 3.000 C 18.414 3.000 20.083 4.414 20.404 6.343 L 20.981 9.807 L 21.791 14.672 C 21.887 15.251 21.724 15.844 21.344 16.292 C 20.965 16.741 20.407 16.999 19.820 17.000 L 3.000 17.000 C 2.448 17.000 2.000 16.552 2.000 16.000 C 2.000 11.582 5.582 8.000 10.000 8.000 L 18.652 8.000 L 18.432 6.671 C 18.281 5.766 17.535 5.080 16.621 5.006 L 16.459 5.000 L 9.000 5.000 C 8.448 5.000 8.000 4.552 8.000 4.000 C 8.000 3.448 8.448 3.000 9.000 3.000 Z"),
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
        pathData = parseSvgPathData("M 7.106 18.553 C 7.362 18.077 7.950 17.892 8.433 18.133 C 8.917 18.375 9.121 18.957 8.894 19.447 L 7.894 21.447 C 7.638 21.923 7.050 22.108 6.567 21.867 C 6.083 21.625 5.879 21.043 6.106 20.553 Z"),
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
        pathData = parseSvgPathData("M 15.553 18.106 C 16.047 17.859 16.647 18.059 16.894 18.553 L 17.894 20.553 C 18.121 21.043 17.917 21.625 17.433 21.867 C 16.950 22.108 16.362 21.923 16.106 21.447 L 15.106 19.447 C 14.859 18.953 15.059 18.353 15.553 18.106"),
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
        return _ironingSteam!!
    }

private var _ironingSteam: ImageVector? = null
