package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.FlipVerticalFill: ImageVector
    get() {
        if (_flipVerticalFill != null) return _flipVerticalFill!!
        _flipVerticalFill = remixIcon(
            name = "FlipVerticalFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M22 11h-20v2h20v-2ZM18 7h-12v-3h12v3ZM20 4C20 2.895 19.105 2 18 2h-12C4.895 2 4 2.895 4 4v3c0 1.105 .895 2 2 2h12c1.105 0 2-.895 2-2v-3ZM18 15c1.105 0 2 .895 2 2v3c0 1.105-.895 2-2 2h-12C4.895 22 4 21.105 4 20v-3c0-1.105 .895-2 2-2h12Z"),
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
        return _flipVerticalFill!!
    }

private var _flipVerticalFill: ImageVector? = null
