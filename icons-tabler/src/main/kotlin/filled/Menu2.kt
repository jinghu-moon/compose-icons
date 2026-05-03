package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.Menu2: ImageVector
    get() {
        if (_menu2 != null) return _menu2!!
        _menu2 = tablerFilledIcon(
            name = "Menu2",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 21.000 6.000 C 21.000 6.552 20.552 7.000 20.000 7.000 L 4.000 7.000 C 3.448 7.000 3.000 6.552 3.000 6.000 C 3.000 5.448 3.448 5.000 4.000 5.000 L 20.000 5.000 C 20.552 5.000 21.000 5.448 21.000 6.000"),
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
        pathData = parseSvgPathData("M 21.000 12.000 C 21.000 12.552 20.552 13.000 20.000 13.000 L 4.000 13.000 C 3.448 13.000 3.000 12.552 3.000 12.000 C 3.000 11.448 3.448 11.000 4.000 11.000 L 20.000 11.000 C 20.552 11.000 21.000 11.448 21.000 12.000"),
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
        pathData = parseSvgPathData("M 21.000 18.000 C 21.000 18.552 20.552 19.000 20.000 19.000 L 4.000 19.000 C 3.448 19.000 3.000 18.552 3.000 18.000 C 3.000 17.448 3.448 17.000 4.000 17.000 L 20.000 17.000 C 20.552 17.000 21.000 17.448 21.000 18.000"),
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
        return _menu2!!
    }

private var _menu2: ImageVector? = null
