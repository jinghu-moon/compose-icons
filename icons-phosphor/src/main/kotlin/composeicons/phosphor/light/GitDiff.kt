package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.GitDiff: ImageVector
    get() {
        if (_gitDiff != null) return _gitDiff!!
        _gitDiff = phosphorLightIcon(
            name = "GitDiff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M112 154c-3.314 0-6 2.686-6 6v33.52L64.93 152.44C63.048 150.569 61.993 148.023 62 145.37v-52C77.09 90.29 87.396 76.284 85.848 60.961 84.3 45.638 71.401 33.976 56 33.976c-15.401 0-28.3 11.662-29.848 26.985C24.604 76.284 34.91 90.29 50 93.37v52c-.015 5.838 2.303 11.44 6.44 15.56L97.52 202h-33.52c-3.314 0-6 2.686-6 6 0 3.314 2.686 6 6 6h48c3.314 0 6-2.686 6-6v-48c0-3.314-2.686-6-6-6ZM38 64C38 54.059 46.059 46 56 46c9.941 0 18 8.059 18 18 0 9.941-8.059 18-18 18C46.059 82 38 73.941 38 64ZM206 162.6v-52c.015-5.838-2.303-11.44-6.44-15.56L158.48 54h33.52c3.314 0 6-2.686 6-6 0-3.314-2.686-6-6-6h-48c-3.314 0-6 2.686-6 6v48c0 3.314 2.686 6 6 6 3.314 0 6-2.686 6-6v-33.52l41.07 41.08c1.882 1.871 2.937 4.417 2.93 7.07v52c-15.09 3.08-25.396 17.086-23.848 32.409 1.548 15.323 14.447 26.985 29.848 26.985 15.401 0 28.3-11.662 29.848-26.985C231.396 179.716 221.09 165.71 206 162.63ZM200 210c-9.941 0-18-8.059-18-18 0-9.941 8.059-18 18-18 9.941 0 18 8.059 18 18 0 9.941-8.059 18-18 18Z"),
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
        return _gitDiff!!
    }

private var _gitDiff: ImageVector? = null
