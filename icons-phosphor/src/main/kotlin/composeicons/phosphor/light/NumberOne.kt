package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.NumberOne: ImageVector
    get() {
        if (_numberOne != null) return _numberOne!!
        _numberOne = phosphorLightIcon(
            name = "NumberOne",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M142 48v160c0 3.314-2.686 6-6 6-3.314 0-6-2.686-6-6v-149.4L99.09 77.14c-2.841 1.707-6.528 .787-8.235-2.055-1.707-2.842-.787-6.528 2.055-8.235l40-24c1.855-1.114 4.165-1.144 6.048-.077 1.882 1.066 3.045 3.064 3.042 5.227Z"),
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
        return _numberOne!!
    }

private var _numberOne: ImageVector? = null
