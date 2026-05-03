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
                pathData = parseSvgPathData("M 12.001 22.000 C 6.478 22.000 2.001 17.523 2.001 12.000 C 2.001 6.477 6.478 2.000 12.001 2.000 C 17.524 2.000 22.001 6.477 22.001 12.000 C 22.001 17.523 17.524 22.000 12.001 22.000 ZM 12.001 20.000 C 16.419 20.000 20.001 16.418 20.001 12.000 C 20.001 7.582 16.419 4.000 12.001 4.000 C 7.583 4.000 4.001 7.582 4.001 12.000 C 4.001 16.418 7.583 20.000 12.001 20.000 ZM 13.335 12.000 C 14.163 12.000 14.835 11.328 14.835 10.500 C 14.835 9.672 14.163 9.000 13.335 9.000 L 10.501 9.000 L 10.501 12.000 L 13.335 12.000 ZM 13.335 7.000 C 15.267 7.000 16.834 8.567 16.834 10.500 C 16.834 12.433 15.267 14.000 13.335 14.000 L 10.501 14.000 L 10.501 17.000 L 8.501 17.000 L 8.501 7.000 L 13.335 7.000 Z"),
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
