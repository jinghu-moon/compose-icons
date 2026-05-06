package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.FriendicaLine: ImageVector
    get() {
        if (_friendicaLine != null) return _friendicaLine!!
        _friendicaLine = remixIcon(
            name = "FriendicaLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M16 4v5h-6v2h6v6h-6v3h8c1.105 0 2-.895 2-2v-12C20 4.895 19.105 4 18 4h-2ZM14 4h-8C4.895 4 4 4.895 4 6v12c0 1.105 .895 2 2 2h2v-5h6v-2h-6v-6h6v-3ZM2 6C2 3.791 3.791 2 6 2h12c2.209 0 4 1.791 4 4v12c0 2.209-1.791 4-4 4h-12C3.791 22 2 20.209 2 18v-12Z"),
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
        return _friendicaLine!!
    }

private var _friendicaLine: ImageVector? = null
