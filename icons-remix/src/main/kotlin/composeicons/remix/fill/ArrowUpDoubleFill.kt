package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.ArrowUpDoubleFill: ImageVector
    get() {
        if (_arrowUpDoubleFill != null) return _arrowUpDoubleFill!!
        _arrowUpDoubleFill = remixIcon(
            name = "ArrowUpDoubleFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M12 4.836 5.793 11.043l1.414 1.414L12 7.664l4.793 4.793 1.414-1.414L12 4.836ZM12 10.486 5.793 16.693l1.414 1.414L12 13.314l4.793 4.793 1.414-1.414L12 10.486Z"),
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
        return _arrowUpDoubleFill!!
    }

private var _arrowUpDoubleFill: ImageVector? = null
