package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.ArrowRightDownLongLine: ImageVector
    get() {
        if (_arrowRightDownLongLine != null) return _arrowRightDownLongLine!!
        _arrowRightDownLongLine = remixIcon(
            name = "ArrowRightDownLongLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 4.222 5.636 L 5.636 4.222 L 17.071 15.657 L 17.071 10.071 L 19.071 10.071 L 19.071 19.071 L 10.071 19.071 L 10.071 17.071 L 15.657 17.071 L 4.222 5.636 Z"),
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
        return _arrowRightDownLongLine!!
    }

private var _arrowRightDownLongLine: ImageVector? = null
