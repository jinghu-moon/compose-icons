package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.NumberCircleThree: ImageVector
    get() {
        if (_numberCircleThree != null) return _numberCircleThree!!
        _numberCircleThree = phosphorDuotoneIcon(
            name = "NumberCircleThree",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    group(
        groupAlpha = 0.20000000298023224f,
    ) {
        addPath(
            pathData = parseSvgPathData("M 224.000 128.000 C 224.000 181.019 181.019 224.000 128.000 224.000 C 74.981 224.000 32.000 181.019 32.000 128.000 C 32.000 74.981 74.981 32.000 128.000 32.000 C 181.019 32.000 224.000 74.981 224.000 128.000 Z"),
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
    addPath(
        pathData = parseSvgPathData("M 160.000 152.000 C 159.996 166.625 151.145 179.794 137.605 185.321 C 124.065 190.848 108.527 187.635 98.290 177.190 C 96.161 175.176 95.304 172.159 96.055 169.327 C 96.807 166.495 99.047 164.300 101.894 163.606 C 104.741 162.912 107.740 163.831 109.710 166.000 C 116.063 172.482 125.984 173.873 133.875 169.388 C 141.766 164.903 145.647 155.668 143.330 146.893 C 141.012 138.118 133.076 132.003 124.000 132.000 C 121.017 131.999 118.282 130.339 116.905 127.692 C 115.528 125.046 115.738 121.853 117.450 119.410 L 136.630 92.000 L 104.000 92.000 C 99.582 92.000 96.000 88.418 96.000 84.000 C 96.000 79.582 99.582 76.000 104.000 76.000 L 152.000 76.000 C 154.983 76.001 157.718 77.661 159.095 80.308 C 160.472 82.954 160.262 86.147 158.550 88.590 L 137.550 118.590 C 151.129 124.127 160.004 137.335 160.000 152.000 ZM 232.000 128.000 C 232.000 185.438 185.438 232.000 128.000 232.000 C 70.562 232.000 24.000 185.438 24.000 128.000 C 24.000 70.562 70.562 24.000 128.000 24.000 C 185.412 24.061 231.939 70.588 232.000 128.000 ZM 216.000 128.000 C 216.000 79.399 176.601 40.000 128.000 40.000 C 79.399 40.000 40.000 79.399 40.000 128.000 C 40.000 176.601 79.399 216.000 128.000 216.000 C 176.578 215.945 215.945 176.578 216.000 128.000 Z"),
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
        return _numberCircleThree!!
    }

private var _numberCircleThree: ImageVector? = null
