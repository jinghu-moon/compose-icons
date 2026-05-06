package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.CornerUpRightDoubleLine: ImageVector
    get() {
        if (_cornerUpRightDoubleLine != null) return _cornerUpRightDoubleLine!!
        _cornerUpRightDoubleLine = remixIcon(
            name = "CornerUpRightDoubleLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M4 10l-0 9 2 0 0-7h6.172L8.222 15.95l1.414 1.414 6.364-6.364L9.636 4.636 8.222 6.05l3.95 3.95-8.172 0ZM15.25 4.636 13.836 6.05l4.95 4.95-4.95 4.95 1.414 1.414 6.364-6.364L15.25 4.636Z"),
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
        return _cornerUpRightDoubleLine!!
    }

private var _cornerUpRightDoubleLine: ImageVector? = null
