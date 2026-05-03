package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.Prohibited2Fill: ImageVector
    get() {
        if (_prohibited2Fill != null) return _prohibited2Fill!!
        _prohibited2Fill = remixIcon(
            name = "Prohibited2Fill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 4.257 18.329 C 2.846 16.605 2.000 14.401 2.000 12.000 C 2.000 6.477 6.477 2.000 12.000 2.000 C 14.401 2.000 16.605 2.846 18.329 4.257 L 4.257 18.329 ZM 19.743 5.671 C 21.154 7.395 22.000 9.599 22.000 12.000 C 22.000 17.523 17.523 22.000 12.000 22.000 C 9.599 22.000 7.395 21.154 5.671 19.743 L 19.743 5.671 Z"),
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
        return _prohibited2Fill!!
    }

private var _prohibited2Fill: ImageVector? = null
