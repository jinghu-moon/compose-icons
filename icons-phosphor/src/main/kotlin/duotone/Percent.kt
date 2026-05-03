package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.Percent: ImageVector
    get() {
        if (_percent != null) return _percent!!
        _percent = phosphorDuotoneIcon(
            name = "Percent",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    group(
        groupAlpha = 0.20000000298023224f,
    ) {
        addPath(
            pathData = parseSvgPathData("M 95.800 56.200 C 106.734 67.135 106.733 84.863 95.799 95.797 C 84.864 106.732 67.136 106.732 56.201 95.797 C 45.267 84.863 45.266 67.135 56.200 56.200 C 61.451 50.948 68.573 47.998 76.000 47.998 C 83.427 47.998 90.549 50.948 95.800 56.200 ZM 199.800 160.200 C 188.865 149.266 171.137 149.267 160.203 160.201 C 149.268 171.136 149.268 188.864 160.203 199.799 C 171.137 210.733 188.865 210.734 199.800 199.800 C 205.052 194.549 208.002 187.427 208.002 180.000 C 208.002 172.573 205.052 165.451 199.800 160.200 Z"),
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
        pathData = parseSvgPathData("M 205.660 61.640 L 61.660 205.640 C 58.534 208.766 53.466 208.766 50.340 205.640 C 47.214 202.514 47.214 197.446 50.340 194.320 L 194.340 50.320 C 197.463 47.194 202.529 47.192 205.655 50.315 C 208.781 53.438 208.783 58.504 205.660 61.630 ZM 50.540 101.440 C 36.482 87.379 36.484 64.583 50.545 50.525 C 64.606 36.467 87.402 36.469 101.460 50.530 L 101.460 50.530 C 115.518 64.591 115.516 87.387 101.455 101.445 C 87.394 115.503 64.598 115.501 50.540 101.440 ZM 56.000 76.000 C 56.007 85.051 62.091 92.968 70.835 95.306 C 79.578 97.643 88.802 93.818 93.324 85.978 C 97.847 78.138 96.541 68.239 90.140 61.840 L 90.140 61.840 C 84.418 56.119 75.812 54.410 68.338 57.510 C 60.863 60.610 55.994 67.908 56.000 76.000 ZM 216.000 180.000 C 215.996 197.174 203.861 211.954 187.016 215.301 C 170.171 218.648 153.307 209.630 146.738 193.762 C 140.168 177.893 145.723 159.594 160.005 150.055 C 174.287 140.516 193.318 142.394 205.460 154.540 L 205.460 154.540 C 212.233 161.278 216.029 170.446 216.000 180.000 ZM 200.000 180.000 C 200.002 170.458 193.264 162.244 183.906 160.381 C 174.548 158.517 165.177 163.524 161.524 172.339 C 157.871 181.153 160.953 191.321 168.886 196.623 C 176.818 201.926 187.392 200.886 194.140 194.140 C 197.903 190.398 200.013 185.307 200.000 180.000 Z"),
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
        return _percent!!
    }

private var _percent: ImageVector? = null
