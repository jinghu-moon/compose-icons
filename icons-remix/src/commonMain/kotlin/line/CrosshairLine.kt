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
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 13.000 19.938 C 16.619 19.487 19.487 16.619 19.938 13.000 L 17.000 13.000 L 17.000 11.000 L 19.938 11.000 C 19.487 7.381 16.619 4.513 13.000 4.062 L 13.000 7.000 L 11.000 7.000 L 11.000 4.062 C 7.381 4.513 4.513 7.381 4.062 11.000 L 7.000 11.000 L 7.000 13.000 L 4.062 13.000 C 4.513 16.619 7.381 19.487 11.000 19.938 L 11.000 17.000 L 13.000 17.000 L 13.000 19.938 ZM 12.000 22.000 C 6.477 22.000 2.000 17.523 2.000 12.000 C 2.000 6.477 6.477 2.000 12.000 2.000 C 17.523 2.000 22.000 6.477 22.000 12.000 C 22.000 17.523 17.523 22.000 12.000 22.000 ZM 12.000 14.000 C 10.895 14.000 10.000 13.105 10.000 12.000 C 10.000 10.895 10.895 10.000 12.000 10.000 C 13.105 10.000 14.000 10.895 14.000 12.000 C 14.000 13.105 13.105 14.000 12.000 14.000 Z"),
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
        return _crosshairLine!!
    }

private var _crosshairLine: ImageVector? = null
