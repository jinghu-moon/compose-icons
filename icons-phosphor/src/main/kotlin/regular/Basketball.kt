package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.Basketball: ImageVector
    get() {
        if (_basketball != null) return _basketball!!
        _basketball = phosphorRegularIcon(
            name = "Basketball",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 128.000 24.000 C 70.562 24.000 24.000 70.562 24.000 128.000 C 24.000 185.438 70.562 232.000 128.000 232.000 C 185.438 232.000 232.000 185.438 232.000 128.000 C 231.939 70.588 185.412 24.061 128.000 24.000 ZM 60.000 72.170 C 71.228 85.762 78.072 102.439 79.630 120.000 L 40.370 120.000 C 41.949 102.444 48.790 85.773 60.000 72.170 ZM 136.000 120.000 L 136.000 40.370 C 153.935 41.994 170.933 49.107 184.680 60.740 C 170.463 77.401 161.923 98.158 160.300 120.000 ZM 120.000 120.000 L 95.700 120.000 C 94.077 98.158 85.537 77.401 71.320 60.740 C 85.067 49.107 102.065 41.994 120.000 40.370 ZM 79.630 136.000 C 78.072 153.561 71.228 170.238 60.000 183.830 C 48.790 170.227 41.949 153.556 40.370 136.000 ZM 95.700 136.000 L 120.000 136.000 L 120.000 215.630 C 102.065 214.006 85.067 206.893 71.320 195.260 C 85.535 178.598 94.075 157.842 95.700 136.000 ZM 136.000 136.000 L 160.300 136.000 C 161.925 157.842 170.465 178.598 184.680 195.260 C 170.933 206.893 153.935 214.006 136.000 215.630 ZM 176.370 136.000 L 215.630 136.000 C 214.051 153.556 207.210 170.227 196.000 183.830 C 184.772 170.238 177.928 153.561 176.370 136.000 ZM 176.370 120.000 C 177.928 102.439 184.772 85.762 196.000 72.170 C 207.210 85.773 214.051 102.444 215.630 120.000 Z"),
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
        return _basketball!!
    }

private var _basketball: ImageVector? = null
