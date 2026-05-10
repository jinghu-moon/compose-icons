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
                pathData = parseSvgPathData("M19.743 18.329C21.154 16.605 22 14.401 22 12 22 6.477 17.523 2 12 2 9.599 2 7.395 2.846 5.671 4.257L19.743 18.329ZM4.257 5.671C2.846 7.395 2 9.599 2 12c0 5.523 4.477 10 10 10 2.401 0 4.605-.846 6.329-2.257L4.257 5.671Z"),
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
