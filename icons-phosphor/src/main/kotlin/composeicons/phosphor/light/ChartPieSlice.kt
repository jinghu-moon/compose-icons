package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.ChartPieSlice: ImageVector
    get() {
        if (_chartPieSlice != null) return _chartPieSlice!!
        _chartPieSlice = phosphorLightIcon(
            name = "ChartPieSlice",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M102 109.5v-72c.001-1.948-.944-3.776-2.535-4.901C97.875 31.473 95.837 31.191 94 31.84 46.677 48.568 18.557 97.237 27.7 146.59c.353 1.917 1.615 3.543 3.385 4.361 1.77 .817 3.826 .724 5.515-.251L99 114.7c1.858-1.072 3.001-3.055 3-5.2ZM90 106 38.34 135.8Q38 131.91 38 128C38.026 93.018 58.299 61.213 90 46.42ZM128 26c-3.314 0-6 2.686-6 6v93L42.2 171.46c-1.377 .803-2.377 2.122-2.781 3.664-.403 1.542-.176 3.181 .631 4.556 25.029 42.589 76.98 61.122 123.313 43.989 46.333-17.132 73.73-65.005 65.031-113.632C219.695 61.41 177.4 26.006 128 26ZM128 218C98.252 217.921 70.444 203.224 53.62 178.69L131 133.61c1.855-1.071 2.998-3.049 3-5.19v-90.22c48.431 3.234 85.572 44.29 83.953 92.802C216.334 179.513 176.538 218.002 128 218Z"),
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
        return _chartPieSlice!!
    }

private var _chartPieSlice: ImageVector? = null
