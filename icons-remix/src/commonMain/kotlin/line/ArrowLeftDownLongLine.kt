package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.ArrowLeftDownLongLine: ImageVector
    get() {
        if (_arrowLeftDownLongLine != null) return _arrowLeftDownLongLine!!
        _arrowLeftDownLongLine = remixIcon(
            name = "ArrowLeftDownLongLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 19.778 5.636 L 18.364 4.222 L 6.929 15.657 L 6.929 10.071 L 4.929 10.071 L 4.929 19.071 L 13.929 19.071 L 13.929 17.071 L 8.343 17.071 L 19.778 5.636 Z"),
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
        return _arrowLeftDownLongLine!!
    }

private var _arrowLeftDownLongLine: ImageVector? = null
