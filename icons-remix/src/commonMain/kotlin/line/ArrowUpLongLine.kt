package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.ArrowUpLongLine: ImageVector
    get() {
        if (_arrowUpLongLine != null) return _arrowUpLongLine!!
        _arrowUpLongLine = remixIcon(
            name = "ArrowUpLongLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 13.000 22.000 L 11.000 22.000 L 11.000 5.828 L 7.050 9.778 L 5.636 8.364 L 12.000 2.000 L 18.364 8.364 L 16.950 9.778 L 13.000 5.828 L 13.000 22.000 Z"),
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
        return _arrowUpLongLine!!
    }

private var _arrowUpLongLine: ImageVector? = null
