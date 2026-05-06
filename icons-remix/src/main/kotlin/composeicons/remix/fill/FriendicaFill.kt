package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.FriendicaFill: ImageVector
    get() {
        if (_friendicaFill != null) return _friendicaFill!!
        _friendicaFill = remixIcon(
            name = "FriendicaFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M15 3v4.5h-6v4h6v5h-6v4.5h9c1.657 0 3-1.343 3-3v-12C21 4.343 19.657 3 18 3h-3ZM2 6C2 3.791 3.791 2 6 2h12c2.209 0 4 1.791 4 4v12c0 2.209-1.791 4-4 4h-12C3.791 22 2 20.209 2 18v-12Z"),
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
        return _friendicaFill!!
    }

private var _friendicaFill: ImageVector? = null
