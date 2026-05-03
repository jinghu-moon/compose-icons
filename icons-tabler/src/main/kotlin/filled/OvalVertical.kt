package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.OvalVertical: ImageVector
    get() {
        if (_ovalVertical != null) return _ovalVertical!!
        _ovalVertical = tablerFilledIcon(
            name = "OvalVertical",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 12.000 5.000 C 6.543 5.000 2.000 8.028 2.000 12.000 C 2.000 15.972 6.543 19.000 12.000 19.000 C 17.457 19.000 22.000 15.972 22.000 12.000 C 22.000 8.028 17.457 5.000 12.000 5.000 Z"),
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
        return _ovalVertical!!
    }

private var _ovalVertical: ImageVector? = null
