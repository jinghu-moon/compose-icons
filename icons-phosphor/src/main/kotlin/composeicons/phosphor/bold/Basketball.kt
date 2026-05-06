package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Basketball: ImageVector
    get() {
        if (_basketball != null) return _basketball!!
        _basketball = phosphorBoldIcon(
            name = "Basketball",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M128 20C68.353 20 20 68.353 20 128c0 59.647 48.353 108 108 108 59.647 0 108-48.353 108-108C235.934 68.381 187.619 20.066 128 20ZM60 177.28C51.997 166.27 46.803 153.473 44.87 140h30.27C73.223 153.479 68.024 166.281 60 177.28ZM44.87 116C46.803 102.527 51.997 89.73 60 78.72 68.024 89.719 73.223 102.521 75.14 116ZM116 211.13C101.804 209.079 88.373 203.41 77 194.67 89.431 178.905 97.173 159.959 99.34 140h16.66ZM116 116h-16.66C97.173 96.041 89.431 77.095 77 61.33 88.373 52.59 101.804 46.921 116 44.87ZM196 78.72c8.003 11.01 13.197 23.807 15.13 37.28h-30.27C182.777 102.521 187.976 89.719 196 78.72ZM140 211.13v-71.13h16.66c2.167 19.959 9.909 38.905 22.34 54.67-11.373 8.74-24.804 14.409-39 16.46ZM156.66 116h-16.66v-71.13c14.196 2.051 27.627 7.72 39 16.46C166.569 77.095 158.827 96.041 156.66 116ZM196 177.28C187.976 166.281 182.777 153.479 180.86 140h30.27c-1.933 13.473-7.127 26.27-15.13 37.28Z"),
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
        return _basketball!!
    }

private var _basketball: ImageVector? = null
