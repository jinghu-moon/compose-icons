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
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 208.000 42.000 L 165.520 42.000 C 162.510 23.630 146.635 10.144 128.020 10.144 C 109.405 10.144 93.530 23.630 90.520 42.000 L 48.000 42.000 C 44.686 42.000 42.000 44.686 42.000 48.000 C 42.000 51.314 44.686 54.000 48.000 54.000 L 90.480 54.000 C 92.041 63.722 97.314 72.459 105.190 78.370 C 81.561 87.746 66.034 110.579 66.000 136.000 L 66.000 200.000 C 66.000 207.732 72.268 214.000 80.000 214.000 L 98.000 214.000 L 98.000 216.000 C 98.000 232.569 111.431 246.000 128.000 246.000 C 144.569 246.000 158.000 232.569 158.000 216.000 L 158.000 214.000 L 176.000 214.000 C 183.732 214.000 190.000 207.732 190.000 200.000 L 190.000 136.000 C 189.966 110.579 174.439 87.746 150.810 78.370 C 158.686 72.459 163.959 63.722 165.520 54.000 L 208.000 54.000 C 211.314 54.000 214.000 51.314 214.000 48.000 C 214.000 44.686 211.314 42.000 208.000 42.000 ZM 146.000 216.000 C 146.000 225.941 137.941 234.000 128.000 234.000 C 118.059 234.000 110.000 225.941 110.000 216.000 L 110.000 168.000 C 110.000 158.059 118.059 150.000 128.000 150.000 C 137.941 150.000 146.000 158.059 146.000 168.000 ZM 178.000 136.000 L 178.000 200.000 C 178.000 201.105 177.105 202.000 176.000 202.000 L 158.000 202.000 L 158.000 168.000 C 158.000 151.431 144.569 138.000 128.000 138.000 C 111.431 138.000 98.000 151.431 98.000 168.000 L 98.000 202.000 L 80.000 202.000 C 78.895 202.000 78.000 201.105 78.000 200.000 L 78.000 136.000 C 78.000 108.386 100.386 86.000 128.000 86.000 C 155.614 86.000 178.000 108.386 178.000 136.000 ZM 128.000 74.000 C 113.641 74.000 102.000 62.359 102.000 48.000 C 102.000 33.641 113.641 22.000 128.000 22.000 C 142.359 22.000 154.000 33.641 154.000 48.000 C 154.000 62.359 142.359 74.000 128.000 74.000 Z"),
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
        return _mopedFront!!
    }

private var _mopedFront: ImageVector? = null
