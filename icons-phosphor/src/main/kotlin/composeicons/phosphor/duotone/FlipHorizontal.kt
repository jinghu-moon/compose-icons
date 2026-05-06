package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.FlipHorizontal: ImageVector
    get() {
        if (_flipHorizontal != null) return _flipHorizontal!!
        _flipHorizontal = phosphorDuotoneIcon(
            name = "FlipHorizontal",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M112 40v160c0 4.418-3.582 8-8 8h-64c-2.684 .001-5.189-1.343-6.672-3.58-1.483-2.237-1.745-5.068-.698-7.54L96.63 36.88C100 28.86 112 31.29 112 40Z"),
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
                pathData = parseSvgPathData("M107.18 24.33C99.711 22.758 92.181 26.728 89.26 33.78l-.06 .14L25.2 193.85c-2.058 4.943-1.507 10.587 1.467 15.039 2.975 4.452 7.979 7.121 13.333 7.111h64c8.837 0 16-7.163 16-16v-160c.054-7.628-5.333-14.212-12.82-15.67ZM104 200h-64l.06-.15L104 40ZM230.77 193.85l-64-159.93-.06-.14C163.727 26.807 156.257 22.887 148.824 24.392 141.39 25.898 136.035 32.416 136 40v160c0 8.837 7.163 16 16 16h64c5.351 .003 10.348-2.669 13.318-7.119 2.97-4.451 3.518-10.091 1.462-15.031ZM152 200v-160l63.93 159.84 .06 .15Z"),
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
