package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.CornerUpLeftLine: ImageVector
    get() {
        if (_cornerUpLeftLine != null) return _cornerUpLeftLine!!
        _cornerUpLeftLine = remixIcon(
            name = "CornerUpLeftLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M19 10 19 19h-2l-0-7L6.828 12l3.95 3.95L9.364 17.364 3 11 9.364 4.636l1.414 1.414L6.828 10l12.172 0Z"),
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
        return _cornerUpLeftLine!!
    }

private var _cornerUpLeftLine: ImageVector? = null
