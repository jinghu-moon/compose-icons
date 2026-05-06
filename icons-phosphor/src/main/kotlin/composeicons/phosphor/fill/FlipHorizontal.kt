package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.FlipHorizontal: ImageVector
    get() {
        if (_flipHorizontal != null) return _flipHorizontal!!
        _flipHorizontal = phosphorFillIcon(
            name = "FlipHorizontal",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M120 40v160c0 8.837-7.163 16-16 16h-64c-5.351 .003-10.348-2.669-13.318-7.119-2.97-4.451-3.518-10.091-1.462-15.031L89.22 33.92l.06-.14c2.976-6.986 10.453-10.918 17.895-9.411C114.618 25.876 119.976 32.406 120 40ZM229.33 208.84c-2.963 4.47-7.968 7.158-13.33 7.16h-64c-8.837 0-16-7.163-16-16v-160c-.003-7.614 5.36-14.175 12.822-15.688 7.462-1.512 14.956 2.443 17.918 9.458l.06 .14 64 159.93c2.043 4.932 1.492 10.558-1.47 15ZM216 200l-.06-.15L152 40v160Z"),
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
        return _flipHorizontal!!
    }

private var _flipHorizontal: ImageVector? = null
