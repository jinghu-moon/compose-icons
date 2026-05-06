package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.FileCsv: ImageVector
    get() {
        if (_fileCsv != null) return _fileCsv!!
        _fileCsv = phosphorLightIcon(
            name = "FileCsv",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M46 180c0 12.13 8.07 22 18 22 4.449-.087 8.668-1.995 11.67-5.28 2.313-2.281 6.02-2.307 8.365-.06 2.345 2.247 2.476 5.952 .295 8.36C79.078 210.684 71.724 213.932 64 214 47.46 214 34 198.75 34 180c0-18.75 13.46-34 30-34 7.727 .073 15.082 3.329 20.33 9 2.18 2.407 2.049 6.112-.295 8.36-2.345 2.247-6.052 2.221-8.365-.06C72.672 160.007 68.452 158.091 64 158c-9.93 0-18 9.86-18 22ZM127.05 173.23c-10.86-3.13-13.41-4.69-13-7.91 .116-2.049 1.181-3.928 2.88-5.08 5.6-3.79 17.66-1.82 21.45-.84 3.17 .759 6.366-1.153 7.198-4.305 .831-3.152-1.006-6.391-4.138-7.295-2-.53-20.1-5-31.21 2.48-4.567 3.093-7.526 8.052-8.08 13.54-1.8 14.19 12.26 18.25 21.57 20.94 12.12 3.5 14.78 5.33 14.2 9.76-.104 2.153-1.216 4.131-3 5.34-5.61 3.73-17.48 1.64-21.19 .62-3.083-.637-6.134 1.217-6.989 4.247-.855 3.03 .778 6.205 3.739 7.273 4.791 1.277 9.722 1.948 14.68 2 5.49 0 11.54-.95 16.36-4.14 4.693-3.131 7.741-8.197 8.31-13.81 2.01-15.66-12.91-19.97-22.78-22.83ZM210.05 146.35c-1.498-.536-3.148-.454-4.587 .226-1.438 .681-2.547 1.905-3.083 3.404L188 190.15 173.65 150c-.64-2.115-2.391-3.708-4.558-4.144-2.167-.437-4.398 .353-5.807 2.056-1.409 1.702-1.769 4.042-.935 6.089l20 56c.853 2.387 3.115 3.981 5.65 3.981 2.535 0 4.797-1.593 5.65-3.981l20-56c1.107-3.123-.527-6.553-3.65-7.66ZM214 88v24c0 3.314-2.686 6-6 6-3.314 0-6-2.686-6-6v-18h-50c-3.314 0-6-2.686-6-6v-50h-90c-1.105 0-2 .895-2 2v72c0 3.314-2.686 6-6 6-3.314 0-6-2.686-6-6v-72C42 32.268 48.268 26 56 26h96c1.591 .001 3.116 .634 4.24 1.76l56 56c1.126 1.124 1.759 2.649 1.76 4.24ZM193.51 82 158 46.48v35.52Z"),
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
        return _fileCsv!!
    }

private var _fileCsv: ImageVector? = null
