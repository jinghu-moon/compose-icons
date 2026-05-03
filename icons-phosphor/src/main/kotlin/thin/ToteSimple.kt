package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.ToteSimple: ImageVector
    get() {
        if (_toteSimple != null) return _toteSimple!!
        _toteSimple = phosphorThinIcon(
            name = "ToteSimple",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 233.000 72.060 C 230.694 69.469 227.388 67.991 223.920 68.000 L 172.000 68.000 L 172.000 64.000 C 172.000 39.699 152.301 20.000 128.000 20.000 C 103.699 20.000 84.000 39.699 84.000 64.000 L 84.000 68.000 L 32.080 68.000 C 28.612 67.991 25.306 69.469 23.000 72.060 C 20.734 74.616 19.664 78.017 20.060 81.410 L 34.320 201.410 C 35.038 207.481 40.206 212.042 46.320 212.000 L 209.670 212.000 C 215.784 212.042 220.952 207.481 221.670 201.410 L 235.930 81.410 C 236.328 78.018 235.263 74.618 233.000 72.060 ZM 92.000 64.000 C 92.000 44.118 108.118 28.000 128.000 28.000 C 147.882 28.000 164.000 44.118 164.000 64.000 L 164.000 68.000 L 92.000 68.000 ZM 228.000 80.460 L 213.750 200.460 C 213.513 202.507 211.760 204.039 209.700 204.000 L 46.330 204.000 C 44.289 204.014 42.565 202.488 42.330 200.460 L 28.000 80.460 C 27.868 79.334 28.233 78.206 29.000 77.370 C 29.781 76.491 30.904 75.991 32.080 76.000 L 223.920 76.000 C 225.096 75.991 226.219 76.491 227.000 77.370 C 227.767 78.206 228.132 79.334 228.000 80.460 Z"),
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
        return _toteSimple!!
    }

private var _toteSimple: ImageVector? = null
