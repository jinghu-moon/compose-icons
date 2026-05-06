package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.Money: ImageVector
    get() {
        if (_money != null) return _money!!
        _money = phosphorRegularIcon(
            name = "Money",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M128 88c-22.091 0-40 17.909-40 40 0 22.091 17.909 40 40 40 22.091 0 40-17.909 40-40C168 105.909 150.091 88 128 88ZM128 152c-13.255 0-24-10.745-24-24 0-13.255 10.745-24 24-24 13.255 0 24 10.745 24 24 0 13.255-10.745 24-24 24ZM240 56h-224c-4.418 0-8 3.582-8 8v128c0 4.418 3.582 8 8 8h224c4.418 0 8-3.582 8-8v-128c0-4.418-3.582-8-8-8ZM193.65 184h-131.3C56.893 165.543 42.457 151.107 24 145.65v-35.3C42.457 104.893 56.893 90.457 62.35 72h131.3c5.457 18.457 19.893 32.893 38.35 38.35v35.3c-18.457 5.457-32.893 19.893-38.35 38.35ZM232 93.37C222.404 89.244 214.756 81.596 210.63 72h21.37ZM45.37 72C41.244 81.596 33.596 89.244 24 93.37v-21.37ZM24 162.63c9.596 4.126 17.244 11.774 21.37 21.37h-21.37ZM210.63 184c4.126-9.596 11.774-17.244 21.37-21.37v21.37Z"),
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
        return _money!!
    }

private var _money: ImageVector? = null
