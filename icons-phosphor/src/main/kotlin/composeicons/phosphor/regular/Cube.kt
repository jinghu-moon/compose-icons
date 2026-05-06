package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.Cube: ImageVector
    get() {
        if (_cube != null) return _cube!!
        _cube = phosphorRegularIcon(
            name = "Cube",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M223.68 66.15 135.68 18h0c-4.779-2.641-10.581-2.641-15.36 0l-88 48.17c-5.119 2.801-8.307 8.165-8.32 14v95.64c.013 5.835 3.201 11.199 8.32 14l88 48.17c4.779 2.641 10.581 2.641 15.36 0l88-48.17c5.119-2.801 8.307-8.165 8.32-14v-95.63c-.002-5.845-3.192-11.224-8.32-14.03ZM128 32h0l80.34 44L128 120 47.66 76ZM40 90l80 43.78v85.79L40 175.82ZM136 219.57v-85.75L216 90v85.78Z"),
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
        return _cube!!
    }

private var _cube: ImageVector? = null
