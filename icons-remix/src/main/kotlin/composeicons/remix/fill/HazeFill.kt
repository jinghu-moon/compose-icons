package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.HazeFill: ImageVector
    get() {
        if (_hazeFill != null) return _hazeFill!!
        _hazeFill = remixIcon(
            name = "HazeFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M6.083 13C6.028 12.675 6 12.341 6 12 6 8.686 8.686 6 12 6c3.314 0 6 2.686 6 6 0 .341-.028 .675-.083 1h-11.834ZM2 15h10v2h-10v-2ZM14 15h8v2h-8v-2ZM16 19h4v2h-4v-2ZM4 19h10v2h-10v-2ZM11 1h2v3h-2v-3ZM3.515 4.929 4.929 3.515 7.05 5.636 5.636 7.05 3.515 4.929ZM19.071 3.515l1.414 1.414L18.364 7.05 16.95 5.636 19.071 3.515ZM23 11v2h-3v-2h3ZM4 11v2h-3v-2h3Z"),
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
        return _hazeFill!!
    }

private var _hazeFill: ImageVector? = null
