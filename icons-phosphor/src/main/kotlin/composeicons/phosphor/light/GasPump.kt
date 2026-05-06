package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.GasPump: ImageVector
    get() {
        if (_gasPump != null) return _gasPump!!
        _gasPump = phosphorLightIcon(
            name = "GasPump",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M239.56 71.07 220.24 51.76c-2.364-2.203-6.048-2.138-8.333 .147-2.285 2.285-2.35 5.969-.147 8.333l19.31 19.32c1.882 1.871 2.937 4.417 2.93 7.07v81.37c0 5.523-4.477 10-10 10-5.523 0-10-4.477-10-10v-40c0-12.15-9.85-22-22-22h-18v-50C174 43.85 164.15 34 152 34h-80C59.85 34 50 43.85 50 56v154h-18c-3.314 0-6 2.686-6 6 0 3.314 2.686 6 6 6h160c3.314 0 6-2.686 6-6 0-3.314-2.686-6-6-6h-18v-92h18c5.523 0 10 4.477 10 10v40c0 12.15 9.85 22 22 22 12.15 0 22-9.85 22-22v-81.37c.015-5.838-2.303-11.44-6.44-15.56ZM62 210v-154C62 50.477 66.477 46 72 46h80c5.523 0 10 4.477 10 10v154ZM142 112c0 3.314-2.686 6-6 6h-48c-3.314 0-6-2.686-6-6 0-3.314 2.686-6 6-6h48c3.314 0 6 2.686 6 6Z"),
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
        return _gasPump!!
    }

private var _gasPump: ImageVector? = null
