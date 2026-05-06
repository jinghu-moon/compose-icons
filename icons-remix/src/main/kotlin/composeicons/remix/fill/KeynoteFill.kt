package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.KeynoteFill: ImageVector
    get() {
        if (_keynoteFill != null) return _keynoteFill!!
        _keynoteFill = remixIcon(
            name = "KeynoteFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M18.999 2c.553 0 1.087 .43 1.196 .977l1.609 8.046c.108 .54-.26 .977-.796 .977h-8.009v8h4v2h-10v-2h4v-8h-8.008c-.548 0-.906-.43-.796-.977L3.805 2.977C3.913 2.437 4.445 2 5.001 2h13.998Z"),
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
        return _keynoteFill!!
    }

private var _keynoteFill: ImageVector? = null
