package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.TextSubscript: ImageVector
    get() {
        if (_textSubscript != null) return _textSubscript!!
        _textSubscript = phosphorDuotoneIcon(
            name = "TextSubscript",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    group(
        groupAlpha = 0.20000000298023224f,
    ) {
        addPath(
            pathData = parseSvgPathData("M 240.000 72.000 L 240.000 208.000 L 56.000 208.000 C 47.163 208.000 40.000 200.837 40.000 192.000 L 40.000 56.000 L 224.000 56.000 C 232.837 56.000 240.000 63.163 240.000 72.000 Z"),
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
        pathData = parseSvgPathData("M 248.000 208.000 C 248.000 212.418 244.418 216.000 240.000 216.000 L 192.000 216.000 C 188.970 216.000 186.200 214.288 184.845 211.578 C 183.489 208.867 183.782 205.624 185.600 203.200 L 228.770 145.640 C 232.546 140.608 233.023 133.830 229.988 128.319 C 226.953 122.808 220.971 119.587 214.699 120.088 C 208.428 120.588 203.032 124.717 200.910 130.640 C 199.435 134.807 194.862 136.990 190.695 135.515 C 186.528 134.040 184.345 129.467 185.820 125.300 C 186.918 122.218 188.479 119.321 190.450 116.710 C 201.087 102.596 221.151 99.778 235.265 110.415 C 249.379 121.052 252.197 141.116 241.560 155.230 L 208.000 200.000 L 240.000 200.000 C 244.418 200.000 248.000 203.582 248.000 208.000 ZM 149.240 50.000 C 147.636 48.609 145.545 47.913 143.427 48.065 C 141.310 48.217 139.339 49.205 137.950 50.810 L 92.000 103.780 L 46.050 50.780 C 43.078 47.827 38.331 47.667 35.167 50.413 C 32.003 53.160 31.494 57.882 34.000 61.240 L 81.410 116.000 L 34.000 170.760 C 31.106 174.101 31.469 179.156 34.810 182.050 C 38.151 184.944 43.206 184.581 46.100 181.240 L 92.100 128.240 L 138.050 181.240 C 140.944 184.581 145.999 184.944 149.340 182.050 C 152.681 179.156 153.044 174.101 150.150 170.760 L 102.590 116.000 L 150.050 61.240 C 152.912 57.907 152.551 52.889 149.240 50.000 Z"),
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
        return _textSubscript!!
    }

private var _textSubscript: ImageVector? = null
