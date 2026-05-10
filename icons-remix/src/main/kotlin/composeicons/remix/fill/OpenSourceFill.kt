package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.OpenSourceFill: ImageVector
    get() {
        if (_openSourceFill != null) return _openSourceFill!!
        _openSourceFill = remixIcon(
            name = "OpenSourceFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M12.001 2c5.523 0 10 4.477 10 10 0 4.13-2.504 7.676-6.077 9.201L13.406 14.651c.949-.504 1.595-1.502 1.595-2.651 0-1.657-1.343-3-3-3C10.344 9 9.001 10.343 9.001 12c0 1.15 .647 2.148 1.596 2.652L8.079 21.201C4.505 19.676 2.001 16.131 2.001 12 2.001 6.477 6.478 2 12.001 2Z"),
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
        return _openSourceFill!!
    }

private var _openSourceFill: ImageVector? = null
