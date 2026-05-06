package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.ArrowUpDownLine: ImageVector
    get() {
        if (_arrowUpDownLine != null) return _arrowUpDownLine!!
        _arrowUpDownLine = remixIcon(
            name = "ArrowUpDownLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M11.95 7.95 10.536 9.364 8.001 6.828 8 20h-2L6.001 6.828 3.465 9.364 2.05 7.95 7 3l4.95 4.95ZM21.95 16.05 17 21 12.05 16.05l1.414-1.414 2.536 2.536L16 4h2l.001 13.172 2.535-2.536 1.414 1.414Z"),
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
        return _arrowUpDownLine!!
    }

private var _arrowUpDownLine: ImageVector? = null
