package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.CupLine: ImageVector
    get() {
        if (_cupLine != null) return _cupLine!!
        _cupLine = remixIcon(
            name = "CupLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M16 13v-8h-10v8c0 1.105 .895 2 2 2h6c1.105 0 2-.895 2-2ZM5 3h15c1.105 0 2 .895 2 2v3c0 1.105-.895 2-2 2h-2v3c0 2.209-1.791 4-4 4h-6C5.791 17 4 15.209 4 13v-9C4 3.448 4.448 3 5 3ZM18 5v3h2v-3h-2ZM2 19h18v2h-18v-2Z"),
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
        return _cupLine!!
    }

private var _cupLine: ImageVector? = null
