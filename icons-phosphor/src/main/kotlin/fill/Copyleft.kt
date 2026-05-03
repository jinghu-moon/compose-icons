package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Copyleft: ImageVector
    get() {
        if (_copyleft != null) return _copyleft!!
        _copyleft = phosphorFillIcon(
            name = "Copyleft",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 128.000 56.000 C 88.235 56.000 56.000 88.235 56.000 128.000 C 56.000 167.764 88.235 200.000 128.000 200.000 C 167.764 200.000 200.000 167.764 200.000 128.000 C 199.956 88.254 167.746 56.044 128.000 56.000 ZM 128.000 176.000 C 112.881 176.056 98.632 168.935 89.600 156.810 C 86.946 153.275 87.660 148.259 91.195 145.605 C 94.730 142.951 99.746 143.665 102.400 147.200 C 110.664 158.219 125.052 162.714 138.119 158.358 C 151.186 154.002 160.000 141.774 160.000 128.000 C 160.000 114.226 151.186 101.998 138.119 97.642 C 125.052 93.286 110.664 97.781 102.400 108.800 C 99.746 112.335 94.730 113.049 91.195 110.395 C 87.660 107.741 86.946 102.725 89.600 99.190 C 103.147 81.138 127.440 74.961 147.964 84.352 C 168.488 93.743 179.697 116.164 174.893 138.216 C 170.089 160.269 150.570 175.996 128.000 176.000 ZM 128.000 24.000 C 70.562 24.000 24.000 70.562 24.000 128.000 C 24.000 185.438 70.562 232.000 128.000 232.000 C 185.438 232.000 232.000 185.438 232.000 128.000 C 232.000 70.562 185.438 24.000 128.000 24.000 ZM 128.000 216.000 C 79.399 216.000 40.000 176.601 40.000 128.000 C 40.000 79.399 79.399 40.000 128.000 40.000 C 176.601 40.000 216.000 79.399 216.000 128.000 C 215.945 176.578 176.578 215.945 128.000 216.000 Z"),
        pathFillType = PathFillType.NonZero,
        fill = SolidColor(Color(0xFF000000)),
        fillAlpha = 1.0f,
        stroke = null,
        strokeAlpha = 1.0f,
        strokeLineWidth = 0.0f,
        strokeLineCap = StrokeCap.Butt,
        strokeLineJoin = StrokeJoin.Miter,
    )
        }
        return _copyleft!!
    }

private var _copyleft: ImageVector? = null
