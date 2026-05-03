package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.HandPointing: ImageVector
    get() {
        if (_handPointing != null) return _handPointing!!
        _handPointing = phosphorDuotoneIcon(
            name = "HandPointing",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    group(
        groupAlpha = 0.20000000298023224f,
    ) {
        addPath(
            pathData = parseSvgPathData("M 216.000 116.000 L 216.000 152.000 C 216.000 196.183 180.183 232.000 136.000 232.000 C 91.820 232.000 80.190 208.000 42.680 142.000 C 37.246 132.443 40.545 120.292 50.066 114.795 C 59.587 109.297 71.760 112.516 77.320 122.000 L 96.000 152.000 L 96.000 44.000 C 96.000 32.954 104.954 24.000 116.000 24.000 C 127.046 24.000 136.000 32.954 136.000 44.000 L 136.000 100.000 C 136.000 88.954 144.954 80.000 156.000 80.000 C 167.046 80.000 176.000 88.954 176.000 100.000 L 176.000 116.000 C 176.000 104.954 184.954 96.000 196.000 96.000 C 207.046 96.000 216.000 104.954 216.000 116.000 Z"),
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
        pathData = parseSvgPathData("M 196.000 88.000 C 191.336 87.995 186.746 89.160 182.650 91.390 C 180.172 83.718 174.507 77.486 167.106 74.290 C 159.704 71.094 151.284 71.243 144.000 74.700 L 144.000 44.000 C 144.000 28.536 131.464 16.000 116.000 16.000 C 100.536 16.000 88.000 28.536 88.000 44.000 L 88.000 124.000 L 84.180 117.870 C 76.412 104.491 59.269 99.942 45.890 107.710 C 32.511 115.478 27.962 132.621 35.730 146.000 L 40.400 154.230 C 74.810 214.890 89.050 240.000 136.000 240.000 C 184.578 239.945 223.945 200.578 224.000 152.000 L 224.000 116.000 C 224.000 100.536 211.464 88.000 196.000 88.000 ZM 208.000 152.000 C 207.956 191.746 175.746 223.956 136.000 224.000 C 98.370 224.000 88.160 206.000 54.320 146.320 L 49.630 138.050 L 49.630 138.000 C 46.314 132.267 48.270 124.931 54.000 121.610 C 55.823 120.554 57.894 120.002 60.000 120.010 C 64.294 120.004 68.263 122.292 70.410 126.010 C 70.451 126.090 70.498 126.167 70.550 126.240 L 89.220 156.240 C 91.113 159.262 94.778 160.667 98.206 159.683 C 101.634 158.700 103.997 155.566 104.000 152.000 L 104.000 44.000 C 104.000 37.373 109.373 32.000 116.000 32.000 C 122.627 32.000 128.000 37.373 128.000 44.000 L 128.000 112.000 C 128.000 116.418 131.582 120.000 136.000 120.000 C 140.418 120.000 144.000 116.418 144.000 112.000 L 144.000 100.000 C 144.000 93.373 149.373 88.000 156.000 88.000 C 162.627 88.000 168.000 93.373 168.000 100.000 L 168.000 120.000 C 168.000 124.418 171.582 128.000 176.000 128.000 C 180.418 128.000 184.000 124.418 184.000 120.000 L 184.000 116.000 C 184.000 109.373 189.373 104.000 196.000 104.000 C 202.627 104.000 208.000 109.373 208.000 116.000 Z"),
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
        return _handPointing!!
    }

private var _handPointing: ImageVector? = null
