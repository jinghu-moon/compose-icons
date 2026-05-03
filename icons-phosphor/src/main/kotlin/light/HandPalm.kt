package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.HandPalm: ImageVector
    get() {
        if (_handPalm != null) return _handPalm!!
        _handPalm = phosphorLightIcon(
            name = "HandPalm",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 188.000 90.000 C 183.035 89.994 178.174 91.421 174.000 94.110 L 174.000 60.000 C 173.996 50.377 168.677 41.543 160.174 37.037 C 151.672 32.531 141.375 33.090 133.410 38.490 C 130.595 25.504 118.441 16.729 105.229 18.145 C 92.017 19.562 81.999 30.712 82.000 44.000 L 82.000 54.110 C 73.999 48.997 63.848 48.653 55.518 53.211 C 47.189 57.769 42.007 66.505 42.000 76.000 L 42.000 152.000 C 42.000 199.496 80.504 238.000 128.000 238.000 C 175.496 238.000 214.000 199.496 214.000 152.000 L 214.000 116.000 C 214.000 101.641 202.359 90.000 188.000 90.000 ZM 202.000 152.000 C 202.000 192.869 168.869 226.000 128.000 226.000 C 87.131 226.000 54.000 192.869 54.000 152.000 L 54.000 76.000 C 54.000 68.268 60.268 62.000 68.000 62.000 C 75.732 62.000 82.000 68.268 82.000 76.000 L 82.000 120.000 C 82.000 123.314 84.686 126.000 88.000 126.000 C 91.314 126.000 94.000 123.314 94.000 120.000 L 94.000 44.000 C 94.000 36.268 100.268 30.000 108.000 30.000 C 115.732 30.000 122.000 36.268 122.000 44.000 L 122.000 112.000 C 122.000 115.314 124.686 118.000 128.000 118.000 C 131.314 118.000 134.000 115.314 134.000 112.000 L 134.000 60.000 C 134.000 52.268 140.268 46.000 148.000 46.000 C 155.732 46.000 162.000 52.268 162.000 60.000 L 162.000 130.390 C 139.126 133.430 122.029 152.925 122.000 176.000 C 122.000 179.314 124.686 182.000 128.000 182.000 C 131.314 182.000 134.000 179.314 134.000 176.000 C 134.000 157.222 149.222 142.000 168.000 142.000 C 171.314 142.000 174.000 139.314 174.000 136.000 L 174.000 116.000 C 174.000 108.268 180.268 102.000 188.000 102.000 C 195.732 102.000 202.000 108.268 202.000 116.000 Z"),
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
        return _handPalm!!
    }

private var _handPalm: ImageVector? = null
