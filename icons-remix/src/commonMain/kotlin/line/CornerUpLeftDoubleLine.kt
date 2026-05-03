package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.CornerUpLeftDoubleLine: ImageVector
    get() {
        if (_cornerUpLeftDoubleLine != null) return _cornerUpLeftDoubleLine!!
        _cornerUpLeftDoubleLine = remixIcon(
            name = "CornerUpLeftDoubleLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 20.000 10.000 L 20.000 19.000 L 18.000 19.000 L 18.000 12.000 L 11.828 12.000 L 15.778 15.950 L 14.364 17.364 L 8.000 11.000 L 14.364 4.636 L 15.778 6.050 L 11.828 10.000 L 20.000 10.000 ZM 8.750 4.636 L 10.164 6.050 L 5.214 11.000 L 10.164 15.950 L 8.750 17.364 L 2.386 11.000 L 8.750 4.636 Z"),
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
        return _cornerUpLeftDoubleLine!!
    }

private var _cornerUpLeftDoubleLine: ImageVector? = null
