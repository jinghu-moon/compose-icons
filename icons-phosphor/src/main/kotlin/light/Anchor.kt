package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Anchor: ImageVector
    get() {
        if (_anchor != null) return _anchor!!
        _anchor = phosphorLightIcon(
            name = "Anchor",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 216.000 138.000 C 212.686 138.000 210.000 140.686 210.000 144.000 C 210.000 170.090 195.000 175.520 170.420 182.210 C 158.000 185.600 143.790 189.470 134.000 199.160 L 134.000 126.000 L 168.000 126.000 C 171.314 126.000 174.000 123.314 174.000 120.000 C 174.000 116.686 171.314 114.000 168.000 114.000 L 134.000 114.000 L 134.000 85.400 C 149.090 82.320 159.396 68.314 157.848 52.991 C 156.300 37.668 143.401 26.006 128.000 26.006 C 112.599 26.006 99.700 37.668 98.152 52.991 C 96.604 68.314 106.910 82.320 122.000 85.400 L 122.000 114.000 L 88.000 114.000 C 84.686 114.000 82.000 116.686 82.000 120.000 C 82.000 123.314 84.686 126.000 88.000 126.000 L 122.000 126.000 L 122.000 199.160 C 112.210 189.470 98.000 185.600 85.580 182.210 C 61.000 175.520 46.000 170.090 46.000 144.000 C 46.000 140.686 43.314 138.000 40.000 138.000 C 36.686 138.000 34.000 140.686 34.000 144.000 C 34.000 180.580 60.850 187.910 82.420 193.790 C 107.000 200.480 122.000 205.910 122.000 232.000 C 122.000 235.314 124.686 238.000 128.000 238.000 C 131.314 238.000 134.000 235.314 134.000 232.000 C 134.000 205.910 149.000 200.480 173.580 193.790 C 195.150 187.910 222.000 180.580 222.000 144.000 C 222.000 140.686 219.314 138.000 216.000 138.000 ZM 110.000 56.000 C 110.000 46.059 118.059 38.000 128.000 38.000 C 137.941 38.000 146.000 46.059 146.000 56.000 C 146.000 65.941 137.941 74.000 128.000 74.000 C 118.059 74.000 110.000 65.941 110.000 56.000 Z"),
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
        return _anchor!!
    }

private var _anchor: ImageVector? = null
