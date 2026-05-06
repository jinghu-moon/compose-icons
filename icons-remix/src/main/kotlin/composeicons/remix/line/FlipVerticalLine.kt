package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.FlipVerticalLine: ImageVector
    get() {
        if (_flipVerticalLine != null) return _flipVerticalLine!!
        _flipVerticalLine = remixIcon(
            name = "FlipVerticalLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M22 11h-20v2h20v-2ZM18 2c1.105 0 2 .895 2 2v3c0 1.105-.895 2-2 2h-12C4.895 9 4 8.105 4 7v-3C4 2.895 4.895 2 6 2h12ZM18 20h-12v-3h12v3ZM20 17c0-1.105-.895-2-2-2h-12c-1.105 0-2 .895-2 2v3c0 1.105 .895 2 2 2h12c1.105 0 2-.895 2-2v-3Z"),
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
        return _flipVerticalLine!!
    }

private var _flipVerticalLine: ImageVector? = null
