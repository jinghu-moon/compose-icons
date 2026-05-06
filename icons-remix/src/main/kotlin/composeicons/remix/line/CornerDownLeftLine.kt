package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.CornerDownLeftLine: ImageVector
    get() {
        if (_cornerDownLeftLine != null) return _cornerDownLeftLine!!
        _cornerDownLeftLine = remixIcon(
            name = "CornerDownLeftLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M19 14 19 5l-2-0-0 7L6.828 12 10.778 8.05 9.364 6.636 3 13l6.364 6.364 1.414-1.414L6.828 14l12.172-0Z"),
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
        return _cornerDownLeftLine!!
    }

private var _cornerDownLeftLine: ImageVector? = null
