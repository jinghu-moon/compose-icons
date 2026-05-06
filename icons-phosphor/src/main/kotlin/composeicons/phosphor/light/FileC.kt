package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.FileC: ImageVector
    get() {
        if (_fileC != null) return _fileC!!
        _fileC = phosphorLightIcon(
            name = "FileC",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M46 180c0 12.13 8.07 22 18 22 4.449-.086 8.668-1.995 11.67-5.28 2.313-2.281 6.02-2.307 8.365-.06 2.345 2.247 2.476 5.952 .295 8.36C79.078 210.684 71.724 213.932 64 214 47.46 214 34 198.75 34 180c0-18.75 13.46-34 30-34 7.727 .073 15.082 3.329 20.33 9 2.18 2.407 2.049 6.112-.295 8.36-2.345 2.247-6.052 2.221-8.365-.06C72.672 160.007 68.452 158.091 64 158c-9.93 0-18 9.87-18 22ZM214 88v128c0 7.732-6.268 14-14 14h-80c-3.314 0-6-2.686-6-6 0-3.314 2.686-6 6-6h80c1.105 0 2-.895 2-2v-122h-50c-3.314 0-6-2.686-6-6v-50h-90c-1.105 0-2 .895-2 2v72c0 3.314-2.686 6-6 6-3.314 0-6-2.686-6-6v-72C42 32.268 48.268 26 56 26h96c1.594-.001 3.123 .632 4.25 1.76l56 56c1.122 1.126 1.751 2.651 1.75 4.24ZM158 82h35.52L158 46.48Z"),
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
        return _fileC!!
    }

private var _fileC: ImageVector? = null
