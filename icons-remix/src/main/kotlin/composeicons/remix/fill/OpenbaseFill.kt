package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.OpenbaseFill: ImageVector
    get() {
        if (_openbaseFill != null) return _openbaseFill!!
        _openbaseFill = remixIcon(
            name = "OpenbaseFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M12 2.76l9.999 3.236-.899 9.468-9.1 6.859L2.9 15.46 2.011 6 12 2.76ZM12 3.585 3.189 6.435l8.811 14.358L20.806 6.435 12 3.585Z"),
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
        return _openbaseFill!!
    }

private var _openbaseFill: ImageVector? = null
