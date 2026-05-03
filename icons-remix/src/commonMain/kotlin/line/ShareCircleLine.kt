package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.ShareCircleLine: ImageVector
    get() {
        if (_shareCircleLine != null) return _shareCircleLine!!
        _shareCircleLine = remixIcon(
            name = "ShareCircleLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 11.000 2.049 L 11.000 4.062 C 7.054 4.554 4.000 7.920 4.000 12.000 C 4.000 16.418 7.582 20.000 12.000 20.000 C 16.080 20.000 19.446 16.946 19.938 13.000 L 21.951 13.000 C 21.449 18.053 17.185 22.000 12.000 22.000 C 6.477 22.000 2.000 17.523 2.000 12.000 C 2.000 6.815 5.947 2.551 11.000 2.049 ZM 20.000 5.414 L 12.000 13.414 L 10.586 12.000 L 18.586 4.000 L 14.000 4.000 L 14.000 2.000 L 22.000 2.000 L 22.000 10.000 L 20.000 10.000 L 20.000 5.414 Z"),
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
        return _shareCircleLine!!
    }

private var _shareCircleLine: ImageVector? = null
