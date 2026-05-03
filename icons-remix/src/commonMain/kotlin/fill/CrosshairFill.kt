package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.CrosshairFill: ImageVector
    get() {
        if (_crosshairFill != null) return _crosshairFill!!
        _crosshairFill = remixIcon(
            name = "CrosshairFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 19.938 13.000 C 19.487 16.619 16.619 19.487 13.000 19.938 L 13.000 17.000 L 11.000 17.000 L 11.000 19.938 C 7.381 19.487 4.513 16.619 4.062 13.000 L 7.000 13.000 L 7.000 11.000 L 4.062 11.000 C 4.513 7.381 7.381 4.513 11.000 4.062 L 11.000 7.000 L 13.000 7.000 L 13.000 4.062 C 16.619 4.513 19.487 7.381 19.938 11.000 L 17.000 11.000 L 17.000 13.000 L 19.938 13.000 ZM 2.000 12.000 C 2.000 17.523 6.477 22.000 12.000 22.000 C 17.523 22.000 22.000 17.523 22.000 12.000 C 22.000 6.477 17.523 2.000 12.000 2.000 C 6.477 2.000 2.000 6.477 2.000 12.000 ZM 12.000 15.000 C 13.657 15.000 15.000 13.657 15.000 12.000 C 15.000 10.343 13.657 9.000 12.000 9.000 C 10.343 9.000 9.000 10.343 9.000 12.000 C 9.000 13.657 10.343 15.000 12.000 15.000 Z"),
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
        return _crosshairFill!!
    }

private var _crosshairFill: ImageVector? = null
