package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.Airplay: ImageVector
    get() {
        if (_airplay != null) return _airplay!!
        _airplay = phosphorRegularIcon(
            name = "Airplay",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M134.08 154.79c-1.52-1.774-3.739-2.795-6.075-2.795-2.336 0-4.555 1.021-6.075 2.795l-48 56c-2.035 2.371-2.503 5.711-1.198 8.55 1.305 2.84 4.143 4.659 7.268 4.66h96c3.125-0 5.964-1.82 7.268-4.66 1.305-2.84 .837-6.179-1.198-8.55ZM97.39 208 128 172.29 158.61 208ZM232 64v112c0 13.255-10.745 24-24 24h-8c-4.418 0-8-3.582-8-8 0-4.418 3.582-8 8-8h8c4.418 0 8-3.582 8-8v-112c0-4.418-3.582-8-8-8h-160c-4.418 0-8 3.582-8 8v112c0 4.418 3.582 8 8 8h8c4.418 0 8 3.582 8 8 0 4.418-3.582 8-8 8h-8C34.745 200 24 189.255 24 176v-112C24 50.745 34.745 40 48 40h160c13.255 0 24 10.745 24 24Z"),
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
        return _airplay!!
    }

private var _airplay: ImageVector? = null
