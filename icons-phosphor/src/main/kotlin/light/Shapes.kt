package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Shapes: ImageVector
    get() {
        if (_shapes != null) return _shapes!!
        _shapes = phosphorLightIcon(
            name = "Shapes",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 69.690 62.100 C 68.871 59.653 66.580 58.004 64.000 58.004 C 61.420 58.004 59.129 59.653 58.310 62.100 L 18.310 182.100 C 17.699 183.930 18.005 185.941 19.133 187.507 C 20.260 189.072 22.071 190.000 24.000 190.000 L 104.000 190.000 C 105.929 190.000 107.740 189.072 108.867 187.507 C 109.995 185.941 110.301 183.930 109.690 182.100 ZM 32.320 178.000 L 64.000 83.000 L 95.680 178.000 ZM 206.000 76.000 C 206.000 48.386 183.614 26.000 156.000 26.000 C 128.386 26.000 106.000 48.386 106.000 76.000 C 106.000 103.614 128.386 126.000 156.000 126.000 C 183.601 125.967 205.967 103.601 206.000 76.000 ZM 118.000 76.000 C 118.000 55.013 135.013 38.000 156.000 38.000 C 176.987 38.000 194.000 55.013 194.000 76.000 C 194.000 96.987 176.987 114.000 156.000 114.000 C 135.013 114.000 118.000 96.987 118.000 76.000 ZM 224.000 146.000 L 136.000 146.000 C 132.686 146.000 130.000 148.686 130.000 152.000 L 130.000 208.000 C 130.000 211.314 132.686 214.000 136.000 214.000 L 224.000 214.000 C 227.314 214.000 230.000 211.314 230.000 208.000 L 230.000 152.000 C 230.000 148.686 227.314 146.000 224.000 146.000 ZM 218.000 202.000 L 142.000 202.000 L 142.000 158.000 L 218.000 158.000 Z"),
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
        return _shapes!!
    }

private var _shapes: ImageVector? = null
