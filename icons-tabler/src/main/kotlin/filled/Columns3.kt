package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.Columns3: ImageVector
    get() {
        if (_columns3 != null) return _columns3!!
        _columns3 = tablerFilledIcon(
            name = "Columns3",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 4.000 2.000 L 6.000 2.000 C 6.552 2.000 7.000 2.448 7.000 3.000 L 7.000 21.000 C 7.000 21.552 6.552 22.000 6.000 22.000 L 4.000 22.000 C 2.895 22.000 2.000 21.105 2.000 20.000 L 2.000 4.000 C 2.000 2.895 2.895 2.000 4.000 2.000"),
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
        pathData = parseSvgPathData("M 9.000 3.000 C 9.000 2.448 9.448 2.000 10.000 2.000 L 14.000 2.000 C 14.552 2.000 15.000 2.448 15.000 3.000 L 15.000 21.000 C 15.000 21.552 14.552 22.000 14.000 22.000 L 10.000 22.000 C 9.448 22.000 9.000 21.552 9.000 21.000 Z"),
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
        pathData = parseSvgPathData("M 18.000 2.000 L 20.000 2.000 C 21.105 2.000 22.000 2.895 22.000 4.000 L 22.000 20.000 C 22.000 21.105 21.105 22.000 20.000 22.000 L 18.000 22.000 C 17.448 22.000 17.000 21.552 17.000 21.000 L 17.000 3.000 C 17.000 2.448 17.448 2.000 18.000 2.000"),
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
        return _columns3!!
    }

private var _columns3: ImageVector? = null
