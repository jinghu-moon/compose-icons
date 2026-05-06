package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.ChefHat: ImageVector
    get() {
        if (_chefHat != null) return _chefHat!!
        _chefHat = phosphorThinIcon(
            name = "ChefHat",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M236 112C235.967 83.295 212.705 60.033 184 60c-2.601 .006-5.198 .203-7.77 .59C168.3 40.915 149.213 28.029 128 28.029c-21.213 0-40.3 12.886-48.23 32.561C77.198 60.203 74.601 60.006 72 60 47.213 60 25.871 77.496 21.01 101.802 16.149 126.108 29.119 150.466 52 160v48c0 6.627 5.373 12 12 12h128c6.627 0 12-5.373 12-12v-48c19.365-8.089 31.981-27.013 32-48ZM196 208c0 2.209-1.791 4-4 4h-128c-2.209 0-4-1.791-4-4v-45.41c3.932 .934 7.959 1.407 12 1.41h112c4.041-.003 8.068-.476 12-1.41ZM184 156h-18.88l6.76-27c.493-2.126-.809-4.255-2.926-4.784-2.117-.529-4.268 .736-4.834 2.844l-7.24 29h-24.88v-28.06c0-2.209-1.791-4-4-4-2.209 0-4 1.791-4 4v28h-24.88L91.88 127c-.552-2.143-2.737-3.432-4.88-2.88-2.143 .552-3.432 2.737-2.88 4.88l6.76 27h-18.88C47.699 156 28 136.301 28 112 28 87.699 47.699 68 72 68c1.785 .005 3.568 .115 5.34 .33C76.451 72.156 76.002 76.072 76 80c0 2.209 1.791 4 4 4 2.209 0 4-1.791 4-4C84 55.699 103.699 36 128 36c24.301 0 44 19.699 44 44 0 2.209 1.791 4 4 4 2.209 0 4-1.791 4-4-.002-3.928-.451-7.844-1.34-11.67 1.772-.215 3.555-.325 5.34-.33 24.301 0 44 19.699 44 44 0 24.301-19.699 44-44 44Z"),
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
        return _chefHat!!
    }

private var _chefHat: ImageVector? = null
