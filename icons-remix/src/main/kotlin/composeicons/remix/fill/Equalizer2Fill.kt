package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.Equalizer2Fill: ImageVector
    get() {
        if (_equalizer2Fill != null) return _equalizer2Fill!!
        _equalizer2Fill = remixIcon(
            name = "Equalizer2Fill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M3 7C3 5.067 4.567 3.5 6.5 3.5 8.433 3.5 10 5.067 10 7c0 1.933-1.567 3.5-3.5 3.5C4.567 10.5 3 8.933 3 7ZM20 8h-8v-2h8v2ZM14 17c0-1.933 1.567-3.5 3.5-3.5C19.433 13.5 21 15.067 21 17c0 1.933-1.567 3.5-3.5 3.5C15.567 20.5 14 18.933 14 17ZM12 16v2h-8v-2h8Z"),
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
        return _equalizer2Fill!!
    }

private var _equalizer2Fill: ImageVector? = null
