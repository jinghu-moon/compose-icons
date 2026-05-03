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
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 20.000 19.000 L 20.000 10.000 L 14.414 10.000 L 14.414 4.586 L 8.000 11.000 L 14.414 17.414 L 14.414 12.000 L 18.000 12.000 L 18.000 19.000 L 20.000 19.000 ZM 10.164 6.050 L 8.750 4.636 L 2.386 11.000 L 8.750 17.364 L 10.164 15.950 L 5.214 11.000 L 10.164 6.050 Z"),
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
        return _cornerUpLeftDoubleFill!!
    }

private var _cornerUpLeftDoubleFill: ImageVector? = null
