package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Grains: ImageVector
    get() {
        if (_grains != null) return _grains!!
        _grains = phosphorThinIcon(
            name = "Grains",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M208 60c-11.67-.007-23.211 2.432-33.88 7.16-13-30.78-43-46.08-44.33-46.74-1.127-.564-2.453-.564-3.58 0-1.32 .66-31.3 16-44.33 46.74C71.211 62.432 59.67 59.993 48 60c-2.209 0-4 1.791-4 4v80c0 46.392 37.608 84 84 84 46.392 0 84-37.608 84-84v-80c0-2.209-1.791-4-4-4ZM124 219.9C83.66 217.718 52.053 184.399 52 144v-19.9c40.34 2.182 71.947 35.501 72 75.9ZM124 164.27C110.748 136.14 83.058 117.615 52 116.1v-48c40.34 2.182 71.947 35.501 72 75.9ZM89.05 70.75c10.07-24.22 32.46-38.47 39-42.19 6.49 3.72 28.88 18 38.95 42.19-18.537 10.41-32.464 27.43-39 47.66C121.476 98.188 107.568 81.17 89.05 70.75ZM204 144c-.053 40.399-31.66 73.718-72 75.9v-19.9c.053-40.399 31.66-73.718 72-75.9ZM204 116.1c-31.058 1.515-58.748 20.04-72 48.17v-20.27c.053-40.399 31.66-73.718 72-75.9Z"),
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
        return _grains!!
    }

private var _grains: ImageVector? = null
