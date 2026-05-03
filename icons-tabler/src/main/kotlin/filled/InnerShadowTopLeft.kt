package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.InnerShadowTopLeft: ImageVector
    get() {
        if (_innerShadowTopLeft != null) return _innerShadowTopLeft!!
        _innerShadowTopLeft = tablerFilledIcon(
            name = "InnerShadowTopLeft",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 12.000 2.000 C 17.523 2.000 22.000 6.477 22.000 12.000 C 22.000 17.523 17.523 22.000 12.000 22.000 C 6.477 22.000 2.000 17.523 2.000 12.000 C 2.000 6.477 6.477 2.000 12.000 2.000 ZM 12.000 5.000 C 8.134 5.000 5.000 8.134 5.000 12.000 C 5.000 12.552 5.448 13.000 6.000 13.000 C 6.552 13.000 7.000 12.552 7.000 12.000 C 7.000 9.239 9.239 7.000 12.000 7.000 C 12.552 7.000 13.000 6.552 13.000 6.000 C 13.000 5.448 12.552 5.000 12.000 5.000 Z"),
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
        return _innerShadowTopLeft!!
    }

private var _innerShadowTopLeft: ImageVector? = null
