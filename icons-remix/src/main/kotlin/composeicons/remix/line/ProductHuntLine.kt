package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.ProductHuntLine: ImageVector
    get() {
        if (_productHuntLine != null) return _productHuntLine!!
        _productHuntLine = remixIcon(
            name = "ProductHuntLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M12.001 22C6.478 22 2.001 17.523 2.001 12 2.001 6.477 6.478 2 12.001 2c5.523 0 10 4.477 10 10 0 5.523-4.477 10-10 10ZM12.001 20c4.418 0 8-3.582 8-8 0-4.418-3.582-8-8-8C7.583 4 4.001 7.582 4.001 12c0 4.418 3.582 8 8 8ZM13.335 12c.828 0 1.5-.672 1.5-1.5C14.835 9.672 14.163 9 13.335 9h-2.833v3h2.833ZM13.335 7c1.933 0 3.5 1.567 3.5 3.5 0 1.933-1.567 3.5-3.5 3.5h-2.833v3h-2v-10h4.834Z"),
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
        return _productHuntLine!!
    }

private var _productHuntLine: ImageVector? = null
