package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.SlidersHorizontal: ImageVector
    get() {
        if (_slidersHorizontal != null) return _slidersHorizontal!!
        _slidersHorizontal = phosphorFillIcon(
            name = "SlidersHorizontal",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M32 80c0-4.418 3.582-8 8-8h37.17C80.711 60.138 91.621 52.009 104 52.009c12.379 0 23.289 8.129 26.83 19.991h85.17c4.418 0 8 3.582 8 8 0 4.418-3.582 8-8 8h-85.17C127.289 99.862 116.379 107.991 104 107.991 91.621 107.991 80.711 99.862 77.17 88h-37.17c-4.418 0-8-3.582-8-8ZM216 168h-21.17C191.289 156.138 180.379 148.009 168 148.009c-12.379 0-23.289 8.129-26.83 19.991h-101.17c-4.418 0-8 3.582-8 8 0 4.418 3.582 8 8 8h101.17c3.541 11.862 14.451 19.991 26.83 19.991 12.379 0 23.289-8.129 26.83-19.991h21.17c4.418 0 8-3.582 8-8 0-4.418-3.582-8-8-8Z"),
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
        return _slidersHorizontal!!
    }

private var _slidersHorizontal: ImageVector? = null
