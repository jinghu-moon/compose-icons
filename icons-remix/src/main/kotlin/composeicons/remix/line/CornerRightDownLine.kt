package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.CornerRightDownLine: ImageVector
    get() {
        if (_cornerRightDownLine != null) return _cornerRightDownLine!!
        _cornerRightDownLine = remixIcon(
            name = "CornerRightDownLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M14 5 5 5l-0 2 7 0 0 10.172L8.05 13.222 6.636 14.636l6.364 6.364 6.364-6.364L17.95 13.222l-3.95 3.95L14 5Z"),
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
        return _cornerRightDownLine!!
    }

private var _cornerRightDownLine: ImageVector? = null
