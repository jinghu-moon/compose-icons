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
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 12.000 4.836 L 5.793 11.043 L 7.207 12.457 L 12.000 7.664 L 16.793 12.457 L 18.207 11.043 L 12.000 4.836 ZM 12.000 10.486 L 5.793 16.693 L 7.207 18.107 L 12.000 13.314 L 16.793 18.107 L 18.207 16.693 L 12.000 10.486 Z"),
        pathFillType = PathFillType.NonZero,
        fill = SolidColor(Color(0xFF000000)),
        fillAlpha = 1.0f,
        stroke = null,
        strokeAlpha = 1.0f,
        strokeLineWidth = 0.0f,
        strokeLineCap = StrokeCap.Butt,
        strokeLineJoin = StrokeJoin.Miter,
    )
        }
        return _arrowUpDoubleFill!!
    }

private var _arrowUpDoubleFill: ImageVector? = null
