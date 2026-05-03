package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Compass: ImageVector
    get() {
        if (_compass != null) return _compass!!
        _compass = phosphorLightIcon(
            name = "Compass",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 128.000 26.000 C 71.667 26.000 26.000 71.667 26.000 128.000 C 26.000 184.333 71.667 230.000 128.000 230.000 C 184.333 230.000 230.000 184.333 230.000 128.000 C 229.934 71.694 184.306 26.066 128.000 26.000 ZM 128.000 218.000 C 78.294 218.000 38.000 177.706 38.000 128.000 C 38.000 78.294 78.294 38.000 128.000 38.000 C 177.706 38.000 218.000 78.294 218.000 128.000 C 217.945 177.683 177.683 217.945 128.000 218.000 ZM 173.320 74.630 L 109.320 106.630 C 108.155 107.211 107.211 108.155 106.630 109.320 L 74.630 173.320 C 73.701 175.180 73.802 177.389 74.896 179.157 C 75.990 180.925 77.921 182.001 80.000 182.000 C 80.930 181.998 81.847 181.783 82.680 181.370 L 146.680 149.370 C 147.845 148.789 148.789 147.845 149.370 146.680 L 181.370 82.680 C 182.525 80.370 182.072 77.580 180.246 75.754 C 178.420 73.928 175.630 73.475 173.320 74.630 ZM 139.530 139.530 L 93.420 162.580 L 116.420 116.470 L 162.530 93.470 Z"),
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
        return _compass!!
    }

private var _compass: ImageVector? = null
