package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.Equalizer3Fill: ImageVector
    get() {
        if (_equalizer3Fill != null) return _equalizer3Fill!!
        _equalizer3Fill = remixIcon(
            name = "Equalizer3Fill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M7 3v3h-4v2h4v3h3v-8h-3ZM12 8h9v-2h-9v2ZM17 13v3h4v2h-4v3h-3v-8h3ZM12 18h-9v-2h9v2Z"),
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
        return _equalizer3Fill!!
    }

private var _equalizer3Fill: ImageVector? = null
