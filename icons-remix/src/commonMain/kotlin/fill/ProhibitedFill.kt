package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.ProhibitedFill: ImageVector
    get() {
        if (_prohibitedFill != null) return _prohibitedFill!!
        _prohibitedFill = remixIcon(
            name = "ProhibitedFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 19.743 18.329 C 21.154 16.605 22.000 14.401 22.000 12.000 C 22.000 6.477 17.523 2.000 12.000 2.000 C 9.599 2.000 7.395 2.846 5.671 4.257 L 19.743 18.329 ZM 4.257 5.671 C 2.846 7.395 2.000 9.599 2.000 12.000 C 2.000 17.523 6.477 22.000 12.000 22.000 C 14.401 22.000 16.605 21.154 18.329 19.743 L 4.257 5.671 Z"),
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
        return _prohibitedFill!!
    }

private var _prohibitedFill: ImageVector? = null
