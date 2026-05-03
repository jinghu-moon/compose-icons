package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.Oval: ImageVector
    get() {
        if (_oval != null) return _oval!!
        _oval = tablerFilledIcon(
            name = "Oval",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 12.000 2.000 C 15.972 2.000 19.000 6.542 19.000 12.000 C 19.000 17.458 15.972 22.000 12.000 22.000 C 8.100 22.000 5.110 17.621 5.003 12.297 L 5.000 12.000 L 5.003 11.703 C 5.110 6.380 8.100 2.000 12.000 2.000 Z"),
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
        return _oval!!
    }

private var _oval: ImageVector? = null
