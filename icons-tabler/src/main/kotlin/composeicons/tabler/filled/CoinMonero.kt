package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.CoinMonero: ImageVector
    get() {
        if (_coinMonero != null) return _coinMonero!!
        _coinMonero = tablerFilledIcon(
            name = "CoinMonero",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M15 11.414v4.586c0 .552 .448 1 1 1l4.66 .001C18.874 20.095 15.572 22.001 12 22.001c-3.572 0-6.874-1.906-8.66-5L8 17l.117-.007C8.62 16.934 9 16.507 9 16v-4.585l2.293 2.292 .094 .083c.398 .309 .964 .273 1.32-.083L15 11.414ZM17 3.34c4.058 2.343 5.946 7.19 4.54 11.66h-4.54v-6C17 8.11 15.923 7.663 15.293 8.293L12 11.585 8.707 8.293 8.623 8.217C7.986 7.703 7 8.147 7 9v6h-4.54C2.155 14.029 2 13.018 2 12l.005-.324C2.119 8.163 4.069 4.968 7.141 3.26 10.213 1.552 13.956 1.582 17 3.34Z"),
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
        return _coinMonero!!
    }

private var _coinMonero: ImageVector? = null
