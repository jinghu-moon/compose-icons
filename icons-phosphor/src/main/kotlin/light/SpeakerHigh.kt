package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.SpeakerHigh: ImageVector
    get() {
        if (_speakerHigh != null) return _speakerHigh!!
        _speakerHigh = phosphorLightIcon(
            name = "SpeakerHigh",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 154.640 26.610 C 152.582 25.602 150.130 25.854 148.320 27.260 L 77.940 82.000 L 32.000 82.000 C 24.268 82.000 18.000 88.268 18.000 96.000 L 18.000 160.000 C 18.000 167.732 24.268 174.000 32.000 174.000 L 77.940 174.000 L 148.320 228.740 C 150.129 230.145 152.581 230.397 154.639 229.390 C 156.696 228.382 158.000 226.291 158.000 224.000 L 158.000 32.000 C 158.001 29.709 156.697 27.618 154.640 26.610 ZM 30.000 160.000 L 30.000 96.000 C 30.000 94.895 30.895 94.000 32.000 94.000 L 74.000 94.000 L 74.000 162.000 L 32.000 162.000 C 30.895 162.000 30.000 161.105 30.000 160.000 ZM 146.000 211.730 L 86.000 165.070 L 86.000 90.930 L 146.000 44.270 ZM 196.530 102.880 C 209.179 117.238 209.179 138.762 196.530 153.120 C 194.337 155.605 190.545 155.843 188.060 153.650 C 185.575 151.457 185.337 147.665 187.530 145.180 C 196.182 135.357 196.182 120.633 187.530 110.810 C 185.453 108.314 185.739 104.617 188.176 102.470 C 190.612 100.323 194.315 100.505 196.530 102.880 ZM 246.000 128.000 C 246.014 147.188 238.941 165.706 226.140 180.000 C 224.726 181.655 222.527 182.415 220.394 181.985 C 218.260 181.555 216.526 180.004 215.863 177.931 C 215.200 175.858 215.712 173.588 217.200 172.000 C 239.609 146.946 239.609 109.054 217.200 84.000 C 215.712 82.412 215.200 80.142 215.863 78.069 C 216.526 75.996 218.260 74.445 220.394 74.015 C 222.527 73.585 224.726 74.345 226.140 76.000 C 238.941 90.294 246.014 108.812 246.000 128.000 Z"),
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
        return _speakerHigh!!
    }

private var _speakerHigh: ImageVector? = null
