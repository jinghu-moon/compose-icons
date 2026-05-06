package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.Money: ImageVector
    get() {
        if (_money != null) return _money!!
        _money = phosphorDuotoneIcon(
            name = "Money",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M160 128c0 17.673-14.327 32-32 32C110.327 160 96 145.673 96 128c0-17.673 14.327-32 32-32 17.673 0 32 14.327 32 32ZM200 64c3.472 20.482 19.518 36.528 40 40v-40ZM200 192h40v-40c-20.482 3.472-36.528 19.518-40 40ZM16 152v40h40C52.528 171.518 36.482 155.472 16 152ZM16 104C36.482 100.528 52.528 84.482 56 64h-40Z"),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color(0xFF000000)),
                fillAlpha = 0.2f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
            )
            addPath(
                pathData = parseSvgPathData("M128 88c-22.091 0-40 17.909-40 40 0 22.091 17.909 40 40 40 22.091 0 40-17.909 40-40C168 105.909 150.091 88 128 88ZM128 152c-13.255 0-24-10.745-24-24 0-13.255 10.745-24 24-24 13.255 0 24 10.745 24 24 0 13.255-10.745 24-24 24ZM240 56h-224c-4.418 0-8 3.582-8 8v128c0 4.418 3.582 8 8 8h224c4.418 0 8-3.582 8-8v-128c0-4.418-3.582-8-8-8ZM24 72h21.37C41.244 81.596 33.596 89.244 24 93.37ZM24 184v-21.37c9.596 4.126 17.244 11.774 21.37 21.37ZM232 184h-21.37c4.126-9.596 11.774-17.244 21.37-21.37ZM232 145.65c-18.457 5.457-32.893 19.893-38.35 38.35h-131.3C56.893 165.543 42.457 151.107 24 145.65v-35.3C42.457 104.893 56.893 90.457 62.35 72h131.3c5.457 18.457 19.893 32.893 38.35 38.35ZM232 93.37C222.404 89.244 214.756 81.596 210.63 72h21.37Z"),
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
