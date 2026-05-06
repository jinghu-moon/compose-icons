package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.InnerShadowTop: ImageVector
    get() {
        if (_innerShadowTop != null) return _innerShadowTop!!
        _innerShadowTop = tablerFilledIcon(
            name = "InnerShadowTop",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M4.929 4.929c3.905-3.905 10.237-3.905 14.142 0 3.905 3.905 3.905 10.237 0 14.142-3.905 3.905-10.237 3.905-14.142 0C1.024 15.166 1.024 8.834 4.929 4.929ZM16.949 7.05C14.215 4.317 9.784 4.317 7.05 7.05c-.379 .392-.374 1.016 .012 1.402 .386 .386 1.009 .391 1.402 .012C9.402 7.526 10.674 6.999 12 6.999c1.326 0 2.598 .527 3.536 1.465 .392 .379 1.016 .374 1.402-.012 .386-.386 .391-1.009 .012-1.402Z"),
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
        return _innerShadowTop!!
    }

private var _innerShadowTop: ImageVector? = null
