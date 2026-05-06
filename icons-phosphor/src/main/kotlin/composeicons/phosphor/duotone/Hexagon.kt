package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.Hexagon: ImageVector
    get() {
        if (_hexagon != null) return _hexagon!!
        _hexagon = phosphorDuotoneIcon(
            name = "Hexagon",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M224 80.18v95.64c-.007 2.917-1.601 5.6-4.16 7l-88 48.18c-2.393 1.309-5.287 1.309-7.68 0L36.16 182.82c-2.559-1.4-4.153-4.083-4.16-7v-95.64c.007-2.917 1.601-5.6 4.16-7L124.16 25c2.393-1.309 5.287-1.309 7.68 0l88 48.18c2.559 1.4 4.153 4.083 4.16 7Z"),
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
                pathData = parseSvgPathData("M223.68 66.15 135.68 18c-4.779-2.641-10.581-2.641-15.36 0l-88 48.17c-5.119 2.801-8.307 8.165-8.32 14v95.64c.013 5.835 3.201 11.199 8.32 14l88 48.17c4.779 2.641 10.581 2.641 15.36 0l88-48.17c5.119-2.801 8.307-8.165 8.32-14v-95.63c-.002-5.845-3.192-11.224-8.32-14.03ZM216 175.82 128 224 40 175.82v-95.64L128 32h0l88 48.17Z"),
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
        return _hexagon!!
    }

private var _hexagon: ImageVector? = null
