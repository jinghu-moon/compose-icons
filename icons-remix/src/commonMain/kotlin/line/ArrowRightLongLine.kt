package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.ArrowRightLongLine: ImageVector
    get() {
        if (_arrowRightLongLine != null) return _arrowRightLongLine!!
        _arrowRightLongLine = remixIcon(
            name = "ArrowRightLongLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 2.000 13.000 L 2.000 11.000 L 18.171 11.000 L 14.222 7.050 L 15.636 5.636 L 22.000 12.000 L 15.636 18.364 L 14.222 16.950 L 18.172 13.000 L 2.000 13.000 Z"),
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
        return _arrowRightLongLine!!
    }

private var _arrowRightLongLine: ImageVector? = null
