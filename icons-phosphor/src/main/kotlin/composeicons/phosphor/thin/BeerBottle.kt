package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.BeerBottle: ImageVector
    get() {
        if (_beerBottle != null) return _beerBottle!!
        _beerBottle = phosphorThinIcon(
            name = "BeerBottle",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M242.83 45.17l-32-32c-1.563-1.563-4.097-1.563-5.66 0-1.563 1.563-1.563 4.097 0 5.66l4.74 4.74L150.33 68.26l-39.11 7.82c-.758 .162-1.453 .541-2 1.09L25.86 160.49c-7.808 7.81-7.808 20.47 0 28.28l41.37 41.37c7.81 7.808 20.47 7.808 28.28 0l83.32-83.31c.558-.561 .937-1.274 1.09-2.05l7.82-39.11L232.43 46.09l4.74 4.74c1.563 1.563 4.097 1.563 5.66 0 1.563-1.563 1.563-4.097 0-5.66ZM89.83 224.48c-2.252 2.259-5.31 3.529-8.5 3.529-3.19 0-6.248-1.27-8.5-3.529L31.51 183.11c-2.259-2.252-3.529-5.31-3.529-8.5 0-3.19 1.27-6.248 3.529-8.5L40 157.66 98.34 216ZM104 210.34 45.66 152 96 101.66 154.34 160ZM180.8 101.6c-.361 .477-.608 1.032-.72 1.62L172.32 142 160 154.34 101.66 96 114 83.68l38.81-7.76c.588-.112 1.143-.359 1.62-.72L215.65 29.28l11.1 11.1Z"),
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
