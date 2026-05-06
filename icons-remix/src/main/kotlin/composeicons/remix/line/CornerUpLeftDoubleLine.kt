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
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M20 10l0 9-2 0-0-7h-6.172l3.95 3.95-1.414 1.414L8 11 14.364 4.636l1.414 1.414-3.95 3.95L20 10ZM8.75 4.636l1.414 1.414L5.214 11l4.95 4.95L8.75 17.364 2.386 11 8.75 4.636Z"),
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
        return _cornerUpLeftDoubleLine!!
    }

private var _cornerUpLeftDoubleLine: ImageVector? = null
