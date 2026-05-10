package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.ProductHuntFill: ImageVector
    get() {
        if (_productHuntFill != null) return _productHuntFill!!
        _productHuntFill = remixIcon(
            name = "ProductHuntFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M12.001 22C6.478 22 2.001 17.523 2.001 12 2.001 6.477 6.478 2 12.001 2c5.523 0 10 4.477 10 10 0 5.523-4.477 10-10 10ZM13.335 12h-2.833v-3h2.833c.828 0 1.5 .672 1.5 1.5 0 .828-.672 1.5-1.5 1.5ZM13.335 7h-4.834v10h2v-3h2.833c1.933 0 3.5-1.567 3.5-3.5C16.834 8.567 15.267 7 13.335 7Z"),
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
        return _productHuntFill!!
    }

private var _productHuntFill: ImageVector? = null
