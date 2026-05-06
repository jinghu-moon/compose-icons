package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Lego: ImageVector
    get() {
        if (_lego != null) return _lego!!
        _lego = phosphorLightIcon(
            name = "Lego",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M242.68 74.63 195.85 51.22C190.69 41.09 176.78 34 160 34c-21.31 0-38 11.42-38 26 .006 2.583 .536 5.138 1.56 7.51l-22 11C94.783 75.468 87.428 73.93 80 74 58.69 74 42 85.42 42 100c.006 2.583 .536 5.138 1.56 7.51L13.32 122.63C11.285 123.646 9.999 125.725 10 128v64c-.001 2.275 1.285 4.354 3.32 5.37l64 32c1.687 .842 3.673 .842 5.36 0l160-80c2.035-1.016 3.321-3.095 3.32-5.37v-64c.001-2.275-1.285-4.354-3.32-5.37ZM80 153.29 29.42 128 51.19 117.12C58.1 122.59 68.36 126 80 126c21.31 0 38-11.42 38-26-.069-5.042-2.004-9.88-5.43-13.58l18.62-9.3C138.1 82.59 148.36 86 160 86c18.63 0 33.74-8.73 37.23-20.67L226.58 80ZM160 46c15.32 0 26 7.38 26 14 0 6.62-10.68 14-26 14C144.68 74 134 66.62 134 60c0-6.62 10.68-14 26-14ZM80 86c15.32 0 26 7.38 26 14 0 6.62-10.68 14-26 14C64.68 114 54 106.62 54 100 54 93.38 64.68 86 80 86ZM22 137.71l52 26v50.58l-52-26ZM86 214.29v-50.58L234 89.71v50.58Z"),
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
        return _lego!!
    }

private var _lego: ImageVector? = null
