package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Broadcast: ImageVector
    get() {
        if (_broadcast != null) return _broadcast!!
        _broadcast = phosphorLightIcon(
            name = "Broadcast",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 128.000 90.000 C 107.013 90.000 90.000 107.013 90.000 128.000 C 90.000 148.987 107.013 166.000 128.000 166.000 C 148.987 166.000 166.000 148.987 166.000 128.000 C 166.000 107.013 148.987 90.000 128.000 90.000 ZM 128.000 154.000 C 113.641 154.000 102.000 142.359 102.000 128.000 C 102.000 113.641 113.641 102.000 128.000 102.000 C 142.359 102.000 154.000 113.641 154.000 128.000 C 154.000 142.359 142.359 154.000 128.000 154.000 ZM 206.000 128.000 C 206.025 147.190 198.951 165.712 186.140 180.000 C 183.911 182.379 180.190 182.542 177.761 180.368 C 175.332 178.194 175.083 174.479 177.200 172.000 C 199.641 146.959 199.641 109.041 177.200 84.000 C 175.712 82.412 175.200 80.142 175.863 78.069 C 176.526 75.996 178.260 74.445 180.394 74.015 C 182.527 73.585 184.726 74.345 186.140 76.000 C 198.951 90.288 206.025 108.810 206.000 128.000 ZM 67.180 102.310 C 57.229 125.830 61.756 152.981 78.800 172.000 C 81.008 174.469 80.798 178.260 78.330 180.470 C 75.861 182.678 72.070 182.468 69.860 180.000 C 43.345 150.403 43.345 105.597 69.860 76.000 C 71.274 74.345 73.473 73.585 75.606 74.015 C 77.740 74.445 79.474 75.996 80.137 78.069 C 80.800 80.142 80.288 82.412 78.800 84.000 C 73.947 89.423 70.021 95.610 67.180 102.310 ZM 246.000 128.000 C 246.031 158.883 233.925 188.541 212.290 210.580 C 209.970 212.949 206.169 212.990 203.800 210.670 C 201.431 208.350 201.390 204.549 203.710 202.180 C 244.149 160.994 244.149 95.006 203.710 53.820 C 201.390 51.451 201.431 47.650 203.800 45.330 C 206.169 43.010 209.970 43.051 212.290 45.420 C 233.925 67.459 246.031 97.117 246.000 128.000 ZM 52.290 202.180 C 54.610 204.549 54.569 208.350 52.200 210.670 C 49.831 212.990 46.030 212.949 43.710 210.580 C -1.281 164.719 -1.281 91.281 43.710 45.420 C 46.030 43.051 49.831 43.010 52.200 45.330 C 54.569 47.650 54.610 51.451 52.290 53.820 C 11.851 95.006 11.851 160.994 52.290 202.180 Z"),
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
        return _broadcast!!
    }

private var _broadcast: ImageVector? = null
