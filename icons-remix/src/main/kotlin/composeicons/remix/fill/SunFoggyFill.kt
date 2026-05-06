package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.SunFoggyFill: ImageVector
    get() {
        if (_sunFoggyFill != null) return _sunFoggyFill!!
        _sunFoggyFill = remixIcon(
            name = "SunFoggyFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M6.341 14C6.12 13.374 6 12.701 6 12 6 8.686 8.686 6 12 6c3.314 0 6 2.686 6 6 0 3.314-2.686 6-6 6v-4h-5.659ZM6 20h9v2h-9v-2ZM1 11h3v2h-3v-2ZM2 16h8v2h-8v-2ZM11 1h2v3h-2v-3ZM3.515 4.929 4.929 3.515 7.05 5.636 5.636 7.05 3.515 4.929ZM16.95 18.364l1.414-1.414 2.121 2.121-1.414 1.414L16.95 18.364ZM19.071 3.515l1.414 1.414L18.364 7.05 16.95 5.636 19.071 3.515ZM23 11v2h-3v-2h3Z"),
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
        return _sunFoggyFill!!
    }

private var _sunFoggyFill: ImageVector? = null
