package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.GlobeSimple: ImageVector
    get() {
        if (_globeSimple != null) return _globeSimple!!
        _globeSimple = phosphorBoldIcon(
            name = "GlobeSimple",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 128.000 20.000 C 68.353 20.000 20.000 68.353 20.000 128.000 C 20.000 187.647 68.353 236.000 128.000 236.000 C 187.647 236.000 236.000 187.647 236.000 128.000 C 235.934 68.381 187.619 20.066 128.000 20.000 ZM 211.130 116.000 L 179.560 116.000 C 177.974 92.468 170.643 69.683 158.210 49.640 C 186.522 60.604 206.741 85.958 211.130 116.000 ZM 128.000 207.000 C 118.640 196.190 103.540 173.870 100.550 140.000 L 155.490 140.000 C 153.996 158.687 148.136 176.762 138.380 192.770 C 135.311 197.787 131.840 202.546 128.000 207.000 ZM 100.550 116.000 C 102.044 97.313 107.904 79.238 117.660 63.230 C 120.716 58.215 124.174 53.456 128.000 49.000 C 137.360 59.810 152.460 82.130 155.450 116.000 ZM 97.790 49.640 C 85.357 69.683 78.026 92.468 76.440 116.000 L 44.870 116.000 C 49.259 85.958 69.478 60.604 97.790 49.640 ZM 44.870 140.000 L 76.440 140.000 C 78.026 163.532 85.357 186.317 97.790 206.360 C 69.478 195.396 49.259 170.042 44.870 140.000 ZM 158.210 206.360 C 170.643 186.317 177.974 163.532 179.560 140.000 L 211.130 140.000 C 206.741 170.042 186.522 195.396 158.210 206.360 Z"),
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
        return _globeSimple!!
    }

private var _globeSimple: ImageVector? = null
