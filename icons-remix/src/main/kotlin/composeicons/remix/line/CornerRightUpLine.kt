package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.CornerRightUpLine: ImageVector
    get() {
        if (_cornerRightUpLine != null) return _cornerRightUpLine!!
        _cornerRightUpLine = remixIcon(
            name = "CornerRightUpLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M14 19l-9 0L5 17l7-0L12 6.828 8.05 10.778 6.636 9.364 13 3l6.364 6.364-1.414 1.414L14 6.828l-0 12.172Z"),
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
        return _cornerRightUpLine!!
    }

private var _cornerRightUpLine: ImageVector? = null
