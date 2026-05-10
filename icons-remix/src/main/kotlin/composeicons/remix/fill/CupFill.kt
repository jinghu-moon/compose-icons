package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.CupFill: ImageVector
    get() {
        if (_cupFill != null) return _cupFill!!
        _cupFill = remixIcon(
            name = "CupFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M5 3h15c1.105 0 2 .895 2 2v3c0 1.105-.895 2-2 2h-2v3c0 2.209-1.791 4-4 4h-6C5.791 17 4 15.209 4 13v-9C4 3.448 4.448 3 5 3ZM18 5v3h2v-3h-2ZM2 19h18v2h-18v-2Z"),
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
        return _cupFill!!
    }

private var _cupFill: ImageVector? = null
