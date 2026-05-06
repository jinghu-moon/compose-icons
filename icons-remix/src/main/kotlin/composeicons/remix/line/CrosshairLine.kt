package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.CrosshairLine: ImageVector
    get() {
        if (_crosshairLine != null) return _crosshairLine!!
        _crosshairLine = remixIcon(
            name = "CrosshairLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M13 19.938c3.619-.451 6.487-3.319 6.938-6.938h-2.938v-2h2.938C19.487 7.381 16.619 4.513 13 4.062v2.938h-2v-2.938C7.381 4.513 4.513 7.381 4.062 11h2.938v2h-2.938c.451 3.619 3.319 6.487 6.938 6.938v-2.938h2v2.938ZM12 22C6.477 22 2 17.523 2 12 2 6.477 6.477 2 12 2c5.523 0 10 4.477 10 10 0 5.523-4.477 10-10 10ZM12 14c-1.105 0-2-.895-2-2 0-1.105 .895-2 2-2 1.105 0 2 .895 2 2 0 1.105-.895 2-2 2Z"),
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
        return _crosshairLine!!
    }

private var _crosshairLine: ImageVector? = null
