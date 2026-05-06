package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.ShareForwardFill: ImageVector
    get() {
        if (_shareForwardFill != null) return _shareForwardFill!!
        _shareForwardFill = remixIcon(
            name = "ShareForwardFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M13 14h-2C7.542 14 4.54 15.95 3.032 18.811 3.011 18.543 3 18.273 3 18 3 12.477 7.477 8 13 8v-5l10 8L13 19v-5Z"),
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
        return _shareForwardFill!!
    }

private var _shareForwardFill: ImageVector? = null
