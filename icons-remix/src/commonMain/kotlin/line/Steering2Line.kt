package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.Steering2Line: ImageVector
    get() {
        if (_steering2Line != null) return _steering2Line!!
        _steering2Line = remixIcon(
            name = "Steering2Line",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 12.000 2.000 C 17.523 2.000 22.000 6.477 22.000 12.000 C 22.000 17.523 17.523 22.000 12.000 22.000 C 6.477 22.000 2.000 17.523 2.000 12.000 C 2.000 6.477 6.477 2.000 12.000 2.000 ZM 8.000 13.000 L 4.062 13.001 C 4.514 16.619 7.382 19.487 11.000 19.938 L 11.000 16.000 C 9.343 16.000 8.000 14.657 8.000 13.000 ZM 19.938 13.001 L 16.000 13.000 C 16.000 14.657 14.657 16.000 13.000 16.000 L 13.001 19.938 C 16.619 19.486 19.486 16.619 19.938 13.001 ZM 14.000 12.000 L 10.000 12.000 L 10.000 13.000 C 10.000 13.552 10.448 14.000 11.000 14.000 L 13.000 14.000 C 13.552 14.000 14.000 13.552 14.000 13.000 L 14.000 12.000 ZM 12.000 4.000 C 7.920 4.000 4.554 7.054 4.062 11.000 L 8.000 11.000 C 8.000 10.448 8.448 10.000 9.000 10.000 L 15.000 10.000 C 15.552 10.000 16.000 10.448 16.000 11.000 L 19.938 11.000 C 19.446 7.054 16.080 4.000 12.000 4.000 Z"),
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
        return _steering2Line!!
    }

private var _steering2Line: ImageVector? = null
