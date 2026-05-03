package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.SmileyAngry: ImageVector
    get() {
        if (_smileyAngry != null) return _smileyAngry!!
        _smileyAngry = phosphorRegularIcon(
            name = "SmileyAngry",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 92.000 152.000 C 85.373 152.000 80.000 146.627 80.000 140.000 C 80.000 133.373 85.373 128.000 92.000 128.000 C 98.627 128.000 104.000 133.373 104.000 140.000 C 104.000 146.627 98.627 152.000 92.000 152.000 ZM 164.000 128.000 C 157.373 128.000 152.000 133.373 152.000 140.000 C 152.000 146.627 157.373 152.000 164.000 152.000 C 170.627 152.000 176.000 146.627 176.000 140.000 C 176.000 133.373 170.627 128.000 164.000 128.000 ZM 232.000 128.000 C 232.000 185.438 185.438 232.000 128.000 232.000 C 70.562 232.000 24.000 185.438 24.000 128.000 C 24.000 70.562 70.562 24.000 128.000 24.000 C 185.412 24.061 231.939 70.588 232.000 128.000 ZM 216.000 128.000 C 216.000 79.399 176.601 40.000 128.000 40.000 C 79.399 40.000 40.000 79.399 40.000 128.000 C 40.000 176.601 79.399 216.000 128.000 216.000 C 176.578 215.945 215.945 176.578 216.000 128.000 ZM 171.560 81.340 L 128.000 110.390 L 84.440 81.390 C 80.762 78.938 75.792 79.932 73.340 83.610 C 70.888 87.288 71.882 92.258 75.560 94.710 L 123.560 126.710 C 126.248 128.504 129.752 128.504 132.440 126.710 L 180.440 94.710 C 184.118 92.258 185.112 87.288 182.660 83.610 C 180.208 79.932 175.238 78.938 171.560 81.390 ZM 156.430 177.340 C 148.000 171.730 139.940 168.000 128.000 168.000 C 116.060 168.000 108.000 171.730 99.570 177.340 C 95.979 179.820 95.038 184.720 97.455 188.353 C 99.872 191.987 104.755 193.013 108.430 190.660 C 114.930 186.340 120.000 184.000 128.000 184.000 C 136.000 184.000 141.070 186.340 147.570 190.660 C 149.949 192.303 153.030 192.535 155.628 191.265 C 158.226 189.996 159.937 187.424 160.103 184.537 C 160.269 181.651 158.865 178.899 156.430 177.340 Z"),
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
        return _smileyAngry!!
    }

private var _smileyAngry: ImageVector? = null
