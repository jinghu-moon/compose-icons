package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.HeartAdd2Fill: ImageVector
    get() {
        if (_heartAdd2Fill != null) return _heartAdd2Fill!!
        _heartAdd2Fill = remixIcon(
            name = "HeartAdd2Fill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M16.5 3C19.538 3 22 5.5 22 9c0 1.425-.311 2.726-.827 3.907C20.252 12.332 19.165 12 18 12c-3.314 0-6 2.686-6 6 0 1.101 .296 2.132 .813 3.018-.307 .182-.582 .343-.813 .482C9.5 20 2 16 2 9 2 5.5 4.5 3 7.5 3 9.36 3 11 4 12 5 13 4 14.64 3 16.5 3ZM19 17v-3h-2v3h-3v2h2.999L17 22h2l-.001-3h3.001v-2h-3Z"),
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
        return _heartAdd2Fill!!
    }

private var _heartAdd2Fill: ImageVector? = null
