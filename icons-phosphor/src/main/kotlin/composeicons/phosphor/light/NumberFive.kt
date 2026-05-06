package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.NumberFive: ImageVector
    get() {
        if (_numberFive != null) return _numberFive!!
        _numberFive = phosphorLightIcon(
            name = "NumberFive",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M174 160c0 21.295-12.515 40.602-31.954 49.296C122.606 217.989 99.872 214.447 84 200.25c-1.655-1.414-2.415-3.613-1.985-5.746 .43-2.134 1.981-3.867 4.054-4.531 2.073-.663 4.343-.151 5.931 1.337 16.735 14.967 42.283 14.126 57.997-1.911 15.714-16.036 16.037-41.596 .733-58.024C135.426 114.947 109.908 113.46 92.8 128c-1.944 1.68-4.743 1.936-6.96 .635C83.624 127.335 82.482 124.767 83 122.25L98.12 46.82C98.682 44.018 101.142 42.001 104 42h64c3.314 0 6 2.686 6 6 0 3.314-2.686 6-6 6h-59.08L97.54 110.89c16.717-7.646 36.176-6.262 51.643 3.672 15.467 9.934 24.818 27.055 24.817 45.438Z"),
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
        return _numberFive!!
    }

private var _numberFive: ImageVector? = null
