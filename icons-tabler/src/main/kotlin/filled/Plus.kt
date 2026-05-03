package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.Plus: ImageVector
    get() {
        if (_plus != null) return _plus!!
        _plus = tablerFilledIcon(
            name = "Plus",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 12.000 4.000 C 12.552 4.000 13.000 4.448 13.000 5.000 L 13.000 11.000 L 19.000 11.000 C 19.552 11.000 20.000 11.448 20.000 12.000 C 20.000 12.552 19.552 13.000 19.000 13.000 L 13.000 13.000 L 13.000 19.000 C 13.000 19.552 12.552 20.000 12.000 20.000 C 11.448 20.000 11.000 19.552 11.000 19.000 L 11.000 13.000 L 5.000 13.000 C 4.448 13.000 4.000 12.552 4.000 12.000 C 4.000 11.448 4.448 11.000 5.000 11.000 L 11.000 11.000 L 11.000 5.000 C 11.000 4.448 11.448 4.000 12.000 4.000"),
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
        return _plus!!
    }

private var _plus: ImageVector? = null
