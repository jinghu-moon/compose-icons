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
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M4.836 12l6.207 6.207 1.414-1.414L7.664 12 12.457 7.207 11.043 5.793 4.836 12ZM10.486 12l6.207 6.207 1.414-1.414L13.314 12 18.107 7.207 16.693 5.793 10.486 12Z"),
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
        return _arrowLeftDoubleFill!!
    }

private var _arrowLeftDoubleFill: ImageVector? = null
