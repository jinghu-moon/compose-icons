package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Medal: ImageVector
    get() {
        if (_medal != null) return _medal!!
        _medal = phosphorLightIcon(
            name = "Medal",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M214 96C214.029 55.929 186.381 21.148 147.336 12.139 108.291 3.13 68.198 22.28 50.667 58.312 33.136 94.344 42.813 137.709 74 162.87v77.13c.002 2.079 1.081 4.009 2.85 5.1 .945 .59 2.036 .902 3.15 .9 .93 .001 1.848-.215 2.68-.63L128 222.71l45.33 22.66c1.859 .924 4.064 .821 5.829-.272 1.765-1.093 2.84-3.021 2.841-5.098v-77.13C202.234 146.569 214 121.983 214 96ZM54 96C54 55.131 87.131 22 128 22c40.869 0 74 33.131 74 74 0 40.869-33.131 74-74 74C87.151 169.95 54.05 136.849 54 96ZM170 230.29 130.67 210.63c-1.687-.842-3.673-.842-5.36 0L86 230.29v-59.29c26.083 14.653 57.917 14.653 84 0ZM128 150c29.823 0 54-24.177 54-54C182 66.177 157.823 42 128 42 98.177 42 74 66.177 74 96c.033 29.81 24.19 53.967 54 54ZM128 54c23.196 0 42 18.804 42 42 0 23.196-18.804 42-42 42C104.804 138 86 119.196 86 96 86 72.804 104.804 54 128 54Z"),
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
        return _medal!!
    }

private var _medal: ImageVector? = null
