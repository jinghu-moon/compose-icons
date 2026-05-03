package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.ContrastFill: ImageVector
    get() {
        if (_contrastFill != null) return _contrastFill!!
        _contrastFill = remixIcon(
            name = "ContrastFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 12.000 21.997 C 6.477 21.997 2.000 17.520 2.000 11.997 C 2.000 6.474 6.477 1.997 12.000 1.997 C 17.523 1.997 22.000 6.474 22.000 11.997 C 22.000 17.520 17.523 21.997 12.000 21.997 ZM 12.000 19.997 L 12.000 3.997 C 7.582 3.997 4.000 7.578 4.000 11.997 C 4.000 16.415 7.582 19.997 12.000 19.997 Z"),
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
        return _contrastFill!!
    }

private var _contrastFill: ImageVector? = null
