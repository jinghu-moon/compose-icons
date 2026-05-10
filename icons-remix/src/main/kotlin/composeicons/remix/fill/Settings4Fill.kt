package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.Settings4Fill: ImageVector
    get() {
        if (_settings4Fill != null) return _settings4Fill!!
        _settings4Fill = remixIcon(
            name = "Settings4Fill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M5.334 4.545C6.349 3.636 7.551 2.932 8.876 2.497c.733 .916 1.86 1.502 3.124 1.502 1.264 0 2.391-.586 3.125-1.502 1.324 .435 2.526 1.139 3.541 2.048-.425 1.092-.369 2.36 .262 3.454 .632 1.095 1.703 1.778 2.862 1.955 .137 .66 .209 1.344 .209 2.045 0 .701-.072 1.385-.209 2.045-1.159 .177-2.23 .86-2.862 1.955-.632 1.094-.688 2.362-.262 3.454-1.015 .909-2.217 1.613-3.541 2.048C14.391 20.586 13.264 19.999 12 19.999c-1.264 0-2.391 .587-3.124 1.502C7.551 21.066 6.349 20.362 5.334 19.454c.425-1.092 .369-2.36-.262-3.454C4.44 14.905 3.369 14.222 2.209 14.045 2.072 13.384 2 12.7 2 11.999c0-.701 .072-1.385 .209-2.045C3.369 9.777 4.44 9.094 5.072 7.999 5.703 6.905 5.76 5.637 5.334 4.545ZM13.5 14.597c1.435-.828 1.927-2.663 1.098-4.098C13.77 9.064 11.935 8.573 10.5 9.401c-1.435 .828-1.927 2.663-1.098 4.098 .828 1.435 2.663 1.927 4.098 1.098Z"),
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
        return _settings4Fill!!
    }

private var _settings4Fill: ImageVector? = null
