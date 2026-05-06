package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.MopedFront: ImageVector
    get() {
        if (_mopedFront != null) return _mopedFront!!
        _mopedFront = phosphorLightIcon(
            name = "MopedFront",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M208 42h-42.48C162.51 23.63 146.635 10.144 128.02 10.144 109.405 10.144 93.53 23.63 90.52 42h-42.52c-3.314 0-6 2.686-6 6 0 3.314 2.686 6 6 6h42.48c1.561 9.722 6.834 18.459 14.71 24.37C81.561 87.746 66.034 110.579 66 136v64c0 7.732 6.268 14 14 14h18v2c0 16.569 13.431 30 30 30 16.569 0 30-13.431 30-30v-2h18c7.732 0 14-6.268 14-14v-64C189.966 110.579 174.439 87.746 150.81 78.37 158.686 72.459 163.959 63.722 165.52 54h42.48c3.314 0 6-2.686 6-6 0-3.314-2.686-6-6-6ZM146 216c0 9.941-8.059 18-18 18-9.941 0-18-8.059-18-18v-48c0-9.941 8.059-18 18-18 9.941 0 18 8.059 18 18ZM178 136v64c0 1.105-.895 2-2 2h-18v-34c0-16.569-13.431-30-30-30-16.569 0-30 13.431-30 30v34h-18c-1.105 0-2-.895-2-2v-64c0-27.614 22.386-50 50-50 27.614 0 50 22.386 50 50ZM128 74C113.641 74 102 62.359 102 48c0-14.359 11.641-26 26-26 14.359 0 26 11.641 26 26 0 14.359-11.641 26-26 26Z"),
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
        return _mopedFront!!
    }

private var _mopedFront: ImageVector? = null
