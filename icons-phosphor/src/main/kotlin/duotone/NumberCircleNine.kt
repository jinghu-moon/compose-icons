package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.NumberCircleNine: ImageVector
    get() {
        if (_numberCircleNine != null) return _numberCircleNine!!
        _numberCircleNine = phosphorDuotoneIcon(
            name = "NumberCircleNine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            group(
                groupAlpha = 0.2f,
            ) {
                addPath(
                    pathData = parseSvgPathData("M 224.000 128.000 C 224.000 181.019 181.019 224.000 128.000 224.000 C 74.981 224.000 32.000 181.019 32.000 128.000 C 32.000 74.981 74.981 32.000 128.000 32.000 C 181.019 32.000 224.000 74.981 224.000 128.000 Z"),
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
            addPath(
                pathData = parseSvgPathData("M 128.000 24.000 C 70.562 24.000 24.000 70.562 24.000 128.000 C 24.000 185.438 70.562 232.000 128.000 232.000 C 185.438 232.000 232.000 185.438 232.000 128.000 C 231.939 70.588 185.412 24.061 128.000 24.000 ZM 128.000 216.000 C 79.399 216.000 40.000 176.601 40.000 128.000 C 40.000 79.399 79.399 40.000 128.000 40.000 C 176.601 40.000 216.000 79.399 216.000 128.000 C 215.945 176.578 176.578 215.945 128.000 216.000 ZM 146.000 76.820 C 132.900 69.259 116.470 70.694 104.879 80.411 C 93.287 90.128 89.005 106.054 94.162 120.274 C 99.319 134.493 112.814 143.973 127.940 144.000 Q 128.880 144.000 129.830 143.940 L 113.130 171.940 C 112.033 173.765 111.708 175.951 112.228 178.016 C 112.748 180.080 114.070 181.853 115.900 182.940 C 117.725 184.037 119.911 184.362 121.976 183.842 C 124.040 183.322 125.813 182.000 126.900 180.170 L 159.180 126.000 C 169.093 108.776 163.198 86.778 146.000 76.820 ZM 145.330 118.000 L 145.330 118.000 C 139.810 127.567 127.579 130.848 118.012 125.328 C 108.445 119.808 105.164 107.578 110.683 98.011 C 116.202 88.443 128.432 85.161 138.000 90.680 C 147.562 96.206 150.834 108.437 145.310 118.000 Z"),
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
        return _numberCircleNine!!
    }

private var _numberCircleNine: ImageVector? = null
