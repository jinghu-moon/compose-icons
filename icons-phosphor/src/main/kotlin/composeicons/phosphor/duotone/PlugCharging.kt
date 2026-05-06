package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.PlugCharging: ImageVector
    get() {
        if (_plugCharging != null) return _plugCharging!!
        _plugCharging = phosphorDuotoneIcon(
            name = "PlugCharging",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M200 64v96c0 17.673-14.327 32-32 32h-80C70.327 192 56 177.673 56 160v-96Z"),
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
                pathData = parseSvgPathData("M224 56h-48v-40c0-4.418-3.582-8-8-8-4.418 0-8 3.582-8 8v40h-64v-40C96 11.582 92.418 8 88 8c-4.418 0-8 3.582-8 8v40h-47.45C26.28 56 24 60.78 24 64c0 4.418 3.582 8 8 8h16v88c0 22.091 17.909 40 40 40h32v40c0 4.418 3.582 8 8 8 4.418 0 8-3.582 8-8v-40h32c22.091 0 40-17.909 40-40v-88h16c4.418 0 8-3.582 8-8 0-4.418-3.582-8-8-8ZM192 160c0 13.255-10.745 24-24 24h-80C74.745 184 64 173.255 64 160v-88h128ZM105.42 132.56c-1.494-2.159-1.834-4.913-.91-7.37l12-32c1.552-4.142 6.168-6.242 10.31-4.69 4.142 1.552 6.242 6.168 4.69 10.31L123.51 120h20.49c2.624 0 5.081 1.287 6.576 3.444 1.494 2.157 1.836 4.909 .914 7.366l-12 32c-1.552 4.142-6.168 6.242-10.31 4.69-4.142-1.552-6.242-6.168-4.69-10.31L132.49 136h-20.49c-2.625 .002-5.084-1.283-6.58-3.44Z"),
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
        return _plugCharging!!
    }

private var _plugCharging: ImageVector? = null
