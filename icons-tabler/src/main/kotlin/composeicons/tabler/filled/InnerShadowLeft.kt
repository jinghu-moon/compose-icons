package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.InnerShadowLeft: ImageVector
    get() {
        if (_innerShadowLeft != null) return _innerShadowLeft!!
        _innerShadowLeft = tablerFilledIcon(
            name = "InnerShadowLeft",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M4.929 4.929c3.905-3.905 10.237-3.905 14.142 0 3.905 3.905 3.905 10.237 0 14.142-3.905 3.905-10.237 3.905-14.142 0C1.024 15.166 1.024 8.834 4.929 4.929ZM8.464 7.05c-.391-.39-1.023-.39-1.414 0C5.737 8.363 4.999 10.143 4.999 12c0 1.857 .738 3.637 2.051 4.95 .251 .26 .623 .364 .973 .273 .35-.092 .623-.365 .714-.714 .092-.35-.013-.721-.273-.973C7.526 14.598 6.999 13.326 6.999 12c0-1.326 .527-2.598 1.465-3.536 .39-.391 .39-1.023 0-1.414Z"),
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
        return _innerShadowLeft!!
    }

private var _innerShadowLeft: ImageVector? = null
