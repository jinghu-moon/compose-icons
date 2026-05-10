package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.TiktokFill: ImageVector
    get() {
        if (_tiktokFill != null) return _tiktokFill!!
        _tiktokFill = remixIcon(
            name = "TiktokFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M16 8.245v7.255C16 19.09 13.09 22 9.5 22 5.91 22 3 19.09 3 15.5 3 11.91 5.91 9 9.5 9c.516 0 1.019 .06 1.5 .174v3.163C10.545 12.121 10.037 12 9.5 12 7.567 12 6 13.567 6 15.5 6 17.433 7.567 19 9.5 19 11.433 19 13 17.433 13 15.5v-13.5h3c0 2.761 2.239 5 5 5v3C19.108 10 17.37 9.343 16 8.245Z"),
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
        return _tiktokFill!!
    }

private var _tiktokFill: ImageVector? = null
