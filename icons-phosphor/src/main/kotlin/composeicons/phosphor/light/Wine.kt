package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Wine: ImageVector
    get() {
        if (_wine != null) return _wine!!
        _wine = phosphorLightIcon(
            name = "Wine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M203.41 104.23 181.64 30.3c-.753-2.549-3.093-4.298-5.75-4.3h-95.78c-2.657 .002-4.997 1.751-5.75 4.3L52.59 104.23c-6.751 22.392-.212 46.675 16.87 62.65 14.352 13.458 32.912 21.544 52.54 22.89v44.23h-34c-3.314 0-6 2.686-6 6 0 3.314 2.686 6 6 6h80c3.314 0 6-2.686 6-6 0-3.314-2.686-6-6-6h-34v-44.23c19.628-1.349 38.187-9.435 52.54-22.89 17.082-15.975 23.621-40.258 16.87-62.65ZM84.6 38h86.8l20.51 69.63c.26 .9 .5 1.8 .71 2.7-22.54 9.07-48.17-.73-61.91-7.68C104.1 89.17 83.48 88.34 68.83 91.52ZM178.35 158.11c-28.328 26.522-72.372 26.522-100.7 0C63.897 145.232 58.641 125.666 64.09 107.63l.74-2.51c12.34-4.46 32.26-6.05 60.46 8.23 11 5.55 28.65 12.64 47.52 12.64 7.2 .048 14.36-1.091 21.19-3.37-.139 13.473-5.795 26.301-15.65 35.49Z"),
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
        return _wine!!
    }

private var _wine: ImageVector? = null
