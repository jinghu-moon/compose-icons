package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Package: ImageVector
    get() {
        if (_package != null) return _package!!
        _package = phosphorFillIcon(
            name = "Package",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M223.68 66.15 135.68 18c-4.779-2.641-10.581-2.641-15.36 0l-88 48.17c-5.119 2.801-8.307 8.165-8.32 14v95.64c.013 5.835 3.201 11.199 8.32 14l88 48.17c4.779 2.641 10.581 2.641 15.36 0l88-48.17c5.119-2.801 8.307-8.165 8.32-14v-95.63c-.002-5.845-3.192-11.224-8.32-14.03ZM128 32l80.35 44L178.57 92.29l-80.35-44ZM128 120 47.65 76 81.56 57.43l80.35 44ZM216 175.85h0l-80 43.79v-85.81l32-17.51v35.68c0 4.418 3.582 8 8 8 4.418 0 8-3.582 8-8v-44.44L216 90.05v85.76Z"),
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
        return _package!!
    }

private var _package: ImageVector? = null
