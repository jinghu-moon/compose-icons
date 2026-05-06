package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.Bulldozer: ImageVector
    get() {
        if (_bulldozer != null) return _bulldozer!!
        _bulldozer = phosphorRegularIcon(
            name = "Bulldozer",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M248 200h-8c-4.418 0-8-3.582-8-8v-32c0-4.418 3.582-8 8-8h8c4.418 0 8-3.582 8-8 0-4.418-3.582-8-8-8h-8c-13.255 0-24 10.745-24 24v8h-16.8c-3.423-16.605-16.92-29.261-33.71-31.61L129.44 49.85C126.957 43.886 121.13 40 114.67 40h-90.67C15.163 40 8 47.163 8 56v96c-9.091 12.121-10.553 28.337-3.777 41.889C10.999 207.44 24.849 216 40 216h120c19.001-.023 35.373-13.388 39.2-32h16.8v8c0 13.255 10.745 24 24 24h8c4.418 0 8-3.582 8-8 0-4.418-3.582-8-8-8ZM148 136h-84v-80h50.67ZM48 56v80h-8c-5.508-.005-10.957 1.136-16 3.35v-83.35ZM160 200h-120C26.745 200 16 189.255 16 176c0-13.255 10.745-24 24-24h120c13.255 0 24 10.745 24 24 0 13.255-10.745 24-24 24ZM168 176c0 4.418-3.582 8-8 8h-120c-4.418 0-8-3.582-8-8 0-4.418 3.582-8 8-8h120c4.418 0 8 3.582 8 8Z"),
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
        return _bulldozer!!
    }

private var _bulldozer: ImageVector? = null
