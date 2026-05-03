package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.ArrowDownLongLine: ImageVector
    get() {
        if (_arrowDownLongLine != null) return _arrowDownLongLine!!
        _arrowDownLongLine = remixIcon(
            name = "ArrowDownLongLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 13.000 2.000 L 11.000 2.000 L 11.000 18.171 L 7.050 14.222 L 5.636 15.636 L 12.000 22.000 L 18.364 15.636 L 16.950 14.222 L 13.000 18.172 L 13.000 2.000 Z"),
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
        return _arrowDownLongLine!!
    }

private var _arrowDownLongLine: ImageVector? = null
