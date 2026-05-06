package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.ShutDownFill: ImageVector
    get() {
        if (_shutDownFill != null) return _shutDownFill!!
        _shutDownFill = remixIcon(
            name = "ShutDownFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M11 2.049v9.951h2v-9.951c5.053 .502 9 4.765 9 9.951 0 5.523-4.477 10-10 10C6.477 22 2 17.523 2 12 2 6.815 5.947 2.551 11 2.049Z"),
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
        return _shutDownFill!!
    }

private var _shutDownFill: ImageVector? = null
