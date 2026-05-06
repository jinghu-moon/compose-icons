package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.FileTsx: ImageVector
    get() {
        if (_fileTsx != null) return _fileTsx!!
        _fileTsx = phosphorLightIcon(
            name = "FileTsx",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M212.88 155.48 195.37 180l17.51 24.51c1.933 2.695 1.315 6.447-1.38 8.38-2.695 1.933-6.447 1.315-8.38-1.38L188 190.31l-15.12 21.16c-1.933 2.695-5.685 3.313-8.38 1.38-2.695-1.933-3.313-5.685-1.38-8.38L180.63 180 163.12 155.49c-1.933-2.695-1.315-6.447 1.38-8.38 2.695-1.933 6.447-1.315 8.38 1.38L188 169.67l15.12-21.17c1.933-2.695 5.685-3.313 8.38-1.38 2.695 1.933 3.313 5.685 1.38 8.38ZM123.05 173.22c-10.86-3.13-13.41-4.69-13-7.91 .116-2.049 1.181-3.928 2.88-5.08 5.6-3.79 17.66-1.83 21.45-.84 3.17 .759 6.366-1.153 7.198-4.305 .831-3.152-1.006-6.391-4.138-7.295-2-.53-20.1-5-31.21 2.48-4.567 3.093-7.526 8.052-8.08 13.54-1.8 14.19 12.26 18.25 21.57 20.94 12.12 3.5 14.78 5.33 14.2 9.76-.104 2.153-1.216 4.131-3 5.34-5.61 3.73-17.48 1.64-21.19 .62-3.103-.681-6.199 1.175-7.061 4.233-.862 3.058 .809 6.257 3.811 7.297 4.791 1.277 9.722 1.948 14.68 2 5.49 0 11.54-.95 16.36-4.14 4.693-3.131 7.741-8.197 8.31-13.81 2.01-15.66-12.91-19.97-22.78-22.83ZM80 146h-40c-3.314 0-6 2.686-6 6 0 3.314 2.686 6 6 6h14v50c0 3.314 2.686 6 6 6 3.314 0 6-2.686 6-6v-50h14c3.314 0 6-2.686 6-6 0-3.314-2.686-6-6-6ZM214 88v24c0 3.314-2.686 6-6 6-3.314 0-6-2.686-6-6v-18h-50c-3.314 0-6-2.686-6-6v-50h-90c-1.105 0-2 .895-2 2v72c0 3.314-2.686 6-6 6-3.314 0-6-2.686-6-6v-72C42 32.268 48.268 26 56 26h96c1.594-.001 3.123 .632 4.25 1.76l56 56c1.122 1.126 1.751 2.651 1.75 4.24ZM193.51 82 158 46.48v35.52Z"),
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
        return _fileTsx!!
    }

private var _fileTsx: ImageVector? = null
