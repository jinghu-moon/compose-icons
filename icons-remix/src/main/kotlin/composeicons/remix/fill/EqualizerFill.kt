package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.EqualizerFill: ImageVector
    get() {
        if (_equalizerFill != null) return _equalizerFill!!
        _equalizerFill = remixIcon(
            name = "EqualizerFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M6.171 18C6.583 16.835 7.694 16 9 16c1.306 0 2.417 .835 2.829 2h10.171v2h-10.171C11.417 21.165 10.306 22 9 22 7.694 22 6.583 21.165 6.171 20h-4.171v-2h4.171ZM12.171 11C12.583 9.835 13.694 9 15 9c1.306 0 2.417 .835 2.829 2h4.171v2h-4.171c-.412 1.165-1.523 2-2.829 2-1.306 0-2.417-.835-2.829-2h-10.171v-2h10.171ZM6.171 4C6.583 2.835 7.694 2 9 2c1.306 0 2.417 .835 2.829 2h10.171v2h-10.171C11.417 7.165 10.306 8 9 8 7.694 8 6.583 7.165 6.171 6h-4.171v-2h4.171Z"),
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
        return _equalizerFill!!
    }

private var _equalizerFill: ImageVector? = null
