package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.Columns2: ImageVector
    get() {
        if (_columns2 != null) return _columns2!!
        _columns2 = tablerFilledIcon(
            name = "Columns2",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 4.000 2.000 L 10.000 2.000 C 10.552 2.000 11.000 2.448 11.000 3.000 L 11.000 21.000 C 11.000 21.552 10.552 22.000 10.000 22.000 L 4.000 22.000 C 2.895 22.000 2.000 21.105 2.000 20.000 L 2.000 4.000 C 2.000 2.895 2.895 2.000 4.000 2.000"),
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
                pathData = parseSvgPathData("M 14.000 2.000 L 20.000 2.000 C 21.105 2.000 22.000 2.895 22.000 4.000 L 22.000 20.000 C 22.000 21.105 21.105 22.000 20.000 22.000 L 14.000 22.000 C 13.448 22.000 13.000 21.552 13.000 21.000 L 13.000 3.000 C 13.000 2.448 13.448 2.000 14.000 2.000"),
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
        return _columns2!!
    }

private var _columns2: ImageVector? = null
