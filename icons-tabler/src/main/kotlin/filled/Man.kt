package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.Man: ImageVector
    get() {
        if (_man != null) return _man!!
        _man = tablerFilledIcon(
            name = "Man",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 15.000 8.000 C 16.628 8.000 18.200 8.787 19.707 10.293 C 20.086 10.685 20.081 11.309 19.695 11.695 C 19.309 12.081 18.685 12.086 18.293 11.707 C 17.445 10.859 16.631 10.338 15.849 10.120 L 15.000 16.064 L 15.000 21.000 C 15.000 21.552 14.552 22.000 14.000 22.000 C 13.448 22.000 13.000 21.552 13.000 21.000 L 13.000 17.000 L 11.000 17.000 L 11.000 21.000 C 11.000 21.552 10.552 22.000 10.000 22.000 C 9.448 22.000 9.000 21.552 9.000 21.000 L 9.000 16.071 L 8.150 10.120 C 7.369 10.338 6.555 10.859 5.707 11.707 C 5.456 11.967 5.084 12.071 4.734 11.980 C 4.385 11.888 4.112 11.615 4.020 11.266 C 3.929 10.916 4.033 10.544 4.293 10.293 C 5.799 8.787 7.373 8.000 9.000 8.000 Z"),
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
                pathData = parseSvgPathData("M 12.000 1.000 C 13.657 1.000 15.000 2.343 15.000 4.000 C 15.000 5.657 13.657 7.000 12.000 7.000 C 10.343 7.000 9.000 5.657 9.000 4.000 L 9.005 3.824 C 9.098 2.238 10.411 1.000 12.000 1.000"),
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
        return _man!!
    }

private var _man: ImageVector? = null
