package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.ArrowLeftDoubleFill: ImageVector
    get() {
        if (_arrowLeftDoubleFill != null) return _arrowLeftDoubleFill!!
        _arrowLeftDoubleFill = remixIcon(
            name = "ArrowLeftDoubleFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 4.836 12.000 L 11.043 18.207 L 12.457 16.793 L 7.664 12.000 L 12.457 7.207 L 11.043 5.793 L 4.836 12.000 ZM 10.486 12.000 L 16.693 18.207 L 18.107 16.793 L 13.314 12.000 L 18.107 7.207 L 16.693 5.793 L 10.486 12.000 Z"),
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
        return _arrowLeftDoubleFill!!
    }

private var _arrowLeftDoubleFill: ImageVector? = null
