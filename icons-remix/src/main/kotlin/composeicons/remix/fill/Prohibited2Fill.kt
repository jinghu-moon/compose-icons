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
                pathData = parseSvgPathData("M4.257 18.329C2.846 16.605 2 14.401 2 12 2 6.477 6.477 2 12 2c2.401 0 4.605 .846 6.329 2.257L4.257 18.329ZM19.743 5.671C21.154 7.395 22 9.599 22 12c0 5.523-4.477 10-10 10C9.599 22 7.395 21.154 5.671 19.743L19.743 5.671Z"),
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
