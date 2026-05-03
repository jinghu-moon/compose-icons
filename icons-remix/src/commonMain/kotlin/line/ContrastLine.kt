package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.ContrastLine: ImageVector
    get() {
        if (_contrastLine != null) return _contrastLine!!
        _contrastLine = remixIcon(
            name = "ContrastLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 12.000 21.997 C 6.477 21.997 2.000 17.520 2.000 11.997 C 2.000 6.474 6.477 1.997 12.000 1.997 C 17.523 1.997 22.000 6.474 22.000 11.997 C 22.000 17.520 17.523 21.997 12.000 21.997 ZM 12.000 19.997 C 16.418 19.997 20.000 16.415 20.000 11.997 C 20.000 7.578 16.418 3.997 12.000 3.997 C 7.582 3.997 4.000 7.578 4.000 11.997 C 4.000 16.415 7.582 19.997 12.000 19.997 ZM 12.000 17.997 L 12.000 5.997 C 15.314 5.997 18.000 8.683 18.000 11.997 C 18.000 15.310 15.314 17.997 12.000 17.997 Z"),
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
        return _contrastLine!!
    }

private var _contrastLine: ImageVector? = null
