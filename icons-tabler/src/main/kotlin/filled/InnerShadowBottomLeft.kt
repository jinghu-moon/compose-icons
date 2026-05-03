package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.InnerShadowBottomLeft: ImageVector
    get() {
        if (_innerShadowBottomLeft != null) return _innerShadowBottomLeft!!
        _innerShadowBottomLeft = tablerFilledIcon(
            name = "InnerShadowBottomLeft",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 12.000 2.000 C 17.523 2.000 22.000 6.477 22.000 12.000 C 22.000 17.523 17.523 22.000 12.000 22.000 C 6.477 22.000 2.000 17.523 2.000 12.000 C 2.000 6.477 6.477 2.000 12.000 2.000 ZM 6.000 11.000 C 5.448 11.000 5.000 11.448 5.000 12.000 C 5.000 15.866 8.134 19.000 12.000 19.000 C 12.552 19.000 13.000 18.552 13.000 18.000 C 13.000 17.448 12.552 17.000 12.000 17.000 C 9.239 17.000 7.000 14.761 7.000 12.000 C 7.000 11.448 6.552 11.000 6.000 11.000 Z"),
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
        return _innerShadowBottomLeft!!
    }

private var _innerShadowBottomLeft: ImageVector? = null
