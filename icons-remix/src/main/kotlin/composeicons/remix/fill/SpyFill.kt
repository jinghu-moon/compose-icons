package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.SpyFill: ImageVector
    get() {
        if (_spyFill != null) return _spyFill!!
        _spyFill = remixIcon(
            name = "SpyFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M17 13c2.209 0 4 1.791 4 4 0 2.209-1.791 4-4 4-2.142 0-4-1.79-4-4h-2c0 2.209-1.791 4-4 4C4.791 21 3 19.209 3 17 3 14.791 4.791 13 7 13c1.481 0 2.773 .804 3.465 2h3.07C14.227 13.804 15.519 13 17 13ZM2 12v-2h2v-3C4 4.791 5.791 3 8 3h8c2.209 0 4 1.791 4 4v3h2v2h-20Z"),
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
        return _spyFill!!
    }

private var _spyFill: ImageVector? = null
