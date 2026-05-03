package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.ArrowRightDownLongFill: ImageVector
    get() {
        if (_arrowRightDownLongFill != null) return _arrowRightDownLongFill!!
        _arrowRightDownLongFill = remixIcon(
            name = "ArrowRightDownLongFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 5.636 4.222 L 4.222 5.636 L 13.828 15.243 L 10.000 19.071 L 19.071 19.071 L 19.071 10.000 L 15.243 13.828 L 5.636 4.222 Z"),
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
        return _arrowRightDownLongFill!!
    }

private var _arrowRightDownLongFill: ImageVector? = null
