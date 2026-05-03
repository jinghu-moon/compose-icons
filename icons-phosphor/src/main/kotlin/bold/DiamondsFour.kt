package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.DiamondsFour: ImageVector
    get() {
        if (_diamondsFour != null) return _diamondsFour!!
        _diamondsFour = phosphorBoldIcon(
            name = "DiamondsFour",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 119.510 108.490 C 121.762 110.749 124.820 112.019 128.010 112.019 C 131.200 112.019 134.258 110.749 136.510 108.490 L 174.510 70.490 C 176.769 68.238 178.039 65.180 178.039 61.990 C 178.039 58.800 176.769 55.742 174.510 53.490 L 136.510 15.490 C 134.258 13.231 131.200 11.961 128.010 11.961 C 124.820 11.961 121.762 13.231 119.510 15.490 L 81.510 53.490 C 79.251 55.742 77.981 58.800 77.981 61.990 C 77.981 65.180 79.251 68.238 81.510 70.490 ZM 128.000 41.000 L 149.000 62.000 L 128.000 83.000 L 107.000 62.000 ZM 136.490 147.540 C 134.238 145.281 131.180 144.011 127.990 144.011 C 124.800 144.011 121.742 145.281 119.490 147.540 L 81.490 185.540 C 79.231 187.792 77.961 190.850 77.961 194.040 C 77.961 197.230 79.231 200.288 81.490 202.540 L 119.490 240.540 C 121.742 242.799 124.800 244.069 127.990 244.069 C 131.180 244.069 134.238 242.799 136.490 240.540 L 174.490 202.540 C 176.749 200.288 178.019 197.230 178.019 194.040 C 178.019 190.850 176.749 187.792 174.490 185.540 ZM 128.000 215.000 L 107.000 194.000 L 128.000 173.000 L 149.000 194.000 ZM 108.490 119.480 L 70.490 81.480 C 68.238 79.221 65.180 77.951 61.990 77.951 C 58.800 77.951 55.742 79.221 53.490 81.480 L 15.490 119.480 C 13.231 121.732 11.961 124.790 11.961 127.980 C 11.961 131.170 13.231 134.228 15.490 136.480 L 53.490 174.480 C 55.742 176.739 58.800 178.009 61.990 178.009 C 65.180 178.009 68.238 176.739 70.490 174.480 L 108.490 136.480 C 113.176 131.794 113.176 124.196 108.490 119.510 ZM 62.000 149.000 L 41.000 128.000 L 62.000 107.000 L 83.000 128.000 ZM 240.490 119.480 L 202.490 81.480 C 200.238 79.221 197.180 77.951 193.990 77.951 C 190.800 77.951 187.742 79.221 185.490 81.480 L 147.490 119.480 C 145.231 121.732 143.961 124.790 143.961 127.980 C 143.961 131.170 145.231 134.228 147.490 136.480 L 185.490 174.480 C 187.742 176.739 190.800 178.009 193.990 178.009 C 197.180 178.009 200.238 176.739 202.490 174.480 L 240.490 136.480 C 245.176 131.794 245.176 124.196 240.490 119.510 ZM 194.000 149.000 L 173.000 128.000 L 194.000 107.000 L 215.000 128.000 Z"),
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
        return _diamondsFour!!
    }

private var _diamondsFour: ImageVector? = null
