package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Hamburger: ImageVector
    get() {
        if (_hamburger != null) return _hamburger!!
        _hamburger = phosphorFillIcon(
            name = "Hamburger",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M35.58 98.06C32.524 94.3 31.336 89.358 32.35 84.62 39.78 49.5 80 24 128 24c48 0 88.22 25.5 95.65 60.62 1.025 4.742-.157 9.692-3.213 13.46-3.056 3.767-7.656 5.945-12.507 5.92h-159.86c-4.848 .015-9.442-2.17-12.49-5.94ZM229.26 152.48l-41.13 15L151 152.57c-1.907-.762-4.033-.762-5.94 0l-37 14.81L71 152.57c-1.824-.729-3.853-.761-5.7-.09l-44 16c-3.859 1.699-5.738 6.101-4.293 10.063 1.445 3.961 5.716 6.122 9.763 4.937L40 178.69v5.31c0 22.091 17.909 40 40 40h96c22.091 0 40-17.909 40-40v-9.67l18.73-6.81c2.862-.838 5.021-3.198 5.6-6.123 .58-2.925-.516-5.93-2.843-7.796-2.327-1.866-5.498-2.282-8.228-1.081ZM24 136h208c4.418 0 8-3.582 8-8 0-4.418-3.582-8-8-8h-208c-4.418 0-8 3.582-8 8 0 4.418 3.582 8 8 8Z"),
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
        return _hamburger!!
    }

private var _hamburger: ImageVector? = null
