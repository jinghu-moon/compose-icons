package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.CornerUpLeftDoubleFill: ImageVector
    get() {
        if (_cornerUpLeftDoubleFill != null) return _cornerUpLeftDoubleFill!!
        _cornerUpLeftDoubleFill = remixIcon(
            name = "CornerUpLeftDoubleFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M20 19l-0-9h-5.586v-5.414L8 11l6.414 6.414v-5.414h3.586l0 7h2ZM10.164 6.05 8.75 4.636 2.386 11l6.364 6.364 1.414-1.414L5.214 11 10.164 6.05Z"),
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
        return _cornerUpLeftDoubleFill!!
    }

private var _cornerUpLeftDoubleFill: ImageVector? = null
