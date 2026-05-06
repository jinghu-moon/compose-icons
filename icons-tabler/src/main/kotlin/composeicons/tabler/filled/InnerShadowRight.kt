package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.InnerShadowRight: ImageVector
    get() {
        if (_innerShadowRight != null) return _innerShadowRight!!
        _innerShadowRight = tablerFilledIcon(
            name = "InnerShadowRight",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M4.929 4.929c3.905-3.905 10.237-3.905 14.142 0 3.905 3.905 3.905 10.237 0 14.142-3.905 3.905-10.237 3.905-14.142 0C1.024 15.166 1.024 8.834 4.929 4.929ZM16.949 7.05c-.394-.369-1.01-.359-1.391 .023-.382 .382-.391 .998-.022 1.391 .938 .938 1.465 2.21 1.465 3.536 0 1.326-.527 2.598-1.465 3.536-.379 .392-.374 1.016 .012 1.402 .386 .386 1.009 .391 1.402 .012C18.263 15.637 19.001 13.857 19.001 12c0-1.857-.738-3.637-2.051-4.95Z"),
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
        return _innerShadowRight!!
    }

private var _innerShadowRight: ImageVector? = null
