package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.Copyright: ImageVector
    get() {
        if (_copyright != null) return _copyright!!
        _copyright = phosphorRegularIcon(
            name = "Copyright",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 128.000 24.000 C 70.562 24.000 24.000 70.562 24.000 128.000 C 24.000 185.438 70.562 232.000 128.000 232.000 C 185.438 232.000 232.000 185.438 232.000 128.000 C 231.939 70.588 185.412 24.061 128.000 24.000 ZM 128.000 216.000 C 79.399 216.000 40.000 176.601 40.000 128.000 C 40.000 79.399 79.399 40.000 128.000 40.000 C 176.601 40.000 216.000 79.399 216.000 128.000 C 215.945 176.578 176.578 215.945 128.000 216.000 ZM 96.000 128.000 C 96.000 141.774 104.814 154.002 117.881 158.358 C 130.948 162.714 145.336 158.219 153.600 147.200 C 156.254 143.665 161.270 142.951 164.805 145.605 C 168.340 148.259 169.054 153.275 166.400 156.810 C 154.001 173.333 132.420 180.070 112.823 173.535 C 93.225 167.000 80.007 148.658 80.007 128.000 C 80.007 107.342 93.225 89.000 112.823 82.465 C 132.420 75.930 154.001 82.667 166.400 99.190 C 169.054 102.725 168.340 107.741 164.805 110.395 C 161.270 113.049 156.254 112.335 153.600 108.800 C 145.336 97.781 130.948 93.286 117.881 97.642 C 104.814 101.998 96.000 114.226 96.000 128.000 Z"),
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
        return _copyright!!
    }

private var _copyright: ImageVector? = null
