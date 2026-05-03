package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.ArrowRightUpLongLine: ImageVector
    get() {
        if (_arrowRightUpLongLine != null) return _arrowRightUpLongLine!!
        _arrowRightUpLongLine = remixIcon(
            name = "ArrowRightUpLongLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 5.636 19.778 L 4.222 18.364 L 15.657 6.929 L 10.071 6.929 L 10.071 4.929 L 19.071 4.929 L 19.071 13.929 L 17.071 13.929 L 17.071 8.343 L 5.636 19.778 Z"),
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
        return _arrowRightUpLongLine!!
    }

private var _arrowRightUpLongLine: ImageVector? = null
