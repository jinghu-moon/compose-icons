package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Carrot: ImageVector
    get() {
        if (_carrot != null) return _carrot!!
        _carrot = phosphorLightIcon(
            name = "Carrot",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M232 66h-33.52L228.24 36.24c1.605-1.496 2.266-3.748 1.723-5.874-.543-2.126-2.203-3.786-4.329-4.329-2.126-.543-4.379 .118-5.874 1.723L190 57.52v-33.52c0-3.314-2.686-6-6-6-3.314 0-6 2.686-6 6v36.15c-24.557-16.09-57.032-12.75-77.8 8h0 0C60.17 107.4 30.05 201.45 27.38 210c-2.561 5.355-1.466 11.742 2.731 15.939 4.197 4.197 10.585 5.291 15.939 2.731C54.55 226 148.67 195.86 187.84 155.9c20.771-20.775 24.112-53.275 8-77.84h36.16c3.314 0 6-2.686 6-6 0-3.314-2.686-6-6-6ZM179.31 147.41C170 157 157 166 142.69 174.24L116.23 147.77c-2.344-2.344-6.146-2.344-8.49 0-2.344 2.344-2.344 6.146 0 8.49l24 24c-41.69 22-89 36.82-89.73 37-.365 .115-.72 .263-1.06 .44-.775 .406-1.724 .262-2.343-.357-.619-.619-.763-1.568-.357-2.343 .178-.32 .328-.655 .45-1C39 213 67.55 121.72 104.48 81l35.27 35.26c1.496 1.605 3.748 2.266 5.874 1.723 2.126-.543 3.786-2.203 4.329-4.329 .543-2.126-.118-4.379-1.723-5.874L113.13 72.68c20.816-16.366 50.783-13.665 68.337 6.16 17.554 19.825 16.608 49.897-2.157 68.58Z"),
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
        return _carrot!!
    }

private var _carrot: ImageVector? = null
