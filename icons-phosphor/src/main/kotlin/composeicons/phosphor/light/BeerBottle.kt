package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.BeerBottle: ImageVector
    get() {
        if (_beerBottle != null) return _beerBottle!!
        _beerBottle = phosphorLightIcon(
            name = "BeerBottle",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M244.24 43.76l-32-32c-2.364-2.203-6.048-2.138-8.333 .147-2.285 2.285-2.35 5.969-.147 8.333l3.11 3.11L149.49 66.35l-38.67 7.74c-1.161 .229-2.227 .8-3.06 1.64L24.44 159.07c-8.59 8.591-8.59 22.519 0 31.11l41.38 41.38c8.591 8.59 22.519 8.59 31.11 0l83.31-83.32c.84-.833 1.411-1.899 1.64-3.06l7.74-38.67 43-57.38 3.11 3.11c2.364 2.203 6.048 2.138 8.333-.147 2.285-2.285 2.35-5.969 .147-8.333ZM88.44 223.07c-3.905 3.904-10.235 3.904-14.14 0L32.93 181.7c-3.904-3.905-3.904-10.235 0-14.14L40 160.49 95.51 216ZM104 207.51 48.49 152 96 104.49 151.51 160ZM179.2 100.4c-.539 .714-.909 1.542-1.08 2.42L170.47 141 160 151.51 104.49 96 115 85.53l38.22-7.65c.878-.171 1.706-.541 2.42-1.08L215.48 31.92l8.64 8.64Z"),
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
        return _beerBottle!!
    }

private var _beerBottle: ImageVector? = null
