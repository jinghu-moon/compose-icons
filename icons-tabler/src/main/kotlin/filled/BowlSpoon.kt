package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.BowlSpoon: ImageVector
    get() {
        if (_bowlSpoon != null) return _bowlSpoon!!
        _bowlSpoon = tablerFilledIcon(
            name = "BowlSpoon",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 20.000 10.000 C 21.105 10.000 22.000 10.895 22.000 12.000 L 22.000 12.500 C 22.000 14.194 19.753 17.990 18.017 19.483 L 18.000 19.496 L 18.000 20.000 C 18.000 21.047 17.194 21.917 16.150 21.995 L 16.000 22.000 L 8.000 22.000 C 6.895 22.000 6.000 21.105 6.000 20.000 L 6.000 19.504 L 5.935 19.451 C 4.175 17.955 2.141 14.486 2.007 12.681 L 2.000 12.500 L 2.000 12.000 C 2.000 10.895 2.895 10.000 4.000 10.000 Z"),
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
        pathData = parseSvgPathData("M 8.000 2.000 C 9.710 2.000 11.237 2.787 11.785 4.000 L 20.000 4.000 C 20.552 4.000 21.000 4.448 21.000 5.000 C 21.000 5.552 20.552 6.000 20.000 6.000 L 11.784 6.001 C 11.236 7.214 9.710 8.000 8.000 8.000 C 5.856 8.000 4.000 6.763 4.000 5.000 C 4.000 3.237 5.856 2.000 8.000 2.000"),
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
        return _bowlSpoon!!
    }

private var _bowlSpoon: ImageVector? = null
