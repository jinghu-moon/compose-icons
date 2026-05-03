package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.Lighthouse: ImageVector
    get() {
        if (_lighthouse != null) return _lighthouse!!
        _lighthouse = phosphorDuotoneIcon(
            name = "Lighthouse",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    group(
        groupAlpha = 0.20000000298023224f,
    ) {
        addPath(
            pathData = parseSvgPathData("M 181.610 112.000 L 74.390 112.000 L 80.000 56.000 L 176.000 56.000 ZM 192.000 215.240 L 187.230 168.000 L 68.770 168.000 L 64.000 215.240 C 63.785 217.490 64.532 219.726 66.057 221.395 C 67.581 223.064 69.740 224.010 72.000 224.000 L 184.000 224.000 C 186.260 224.010 188.419 223.064 189.943 221.395 C 191.468 219.726 192.215 217.490 192.000 215.240 Z"),
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
        pathData = parseSvgPathData("M 208.000 80.000 C 203.582 80.000 200.000 83.582 200.000 88.000 L 200.000 104.000 L 188.850 104.000 L 184.000 55.200 C 183.795 53.190 182.838 51.333 181.320 50.000 L 138.440 11.880 L 138.240 11.710 C 132.308 6.769 123.692 6.769 117.760 11.710 L 117.560 11.880 L 74.680 50.000 C 73.162 51.333 72.205 53.190 72.000 55.200 L 67.150 104.000 L 56.000 104.000 L 56.000 88.000 C 56.000 83.582 52.418 80.000 48.000 80.000 C 43.582 80.000 40.000 83.582 40.000 88.000 L 40.000 112.000 C 40.000 116.418 43.582 120.000 48.000 120.000 L 65.540 120.000 L 56.070 214.480 C 55.642 218.968 57.127 223.428 60.160 226.764 C 63.192 230.099 67.492 232.001 72.000 232.000 L 184.000 232.000 C 188.514 231.999 192.818 230.091 195.850 226.747 C 198.882 223.402 200.360 218.933 199.920 214.440 L 190.460 120.000 L 208.000 120.000 C 212.418 120.000 216.000 116.418 216.000 112.000 L 216.000 88.000 C 216.000 83.582 212.418 80.000 208.000 80.000 ZM 128.000 24.000 L 155.000 48.000 L 101.000 48.000 ZM 87.240 64.000 L 168.760 64.000 L 172.760 104.000 L 136.000 104.000 L 136.000 88.000 C 136.000 83.582 132.418 80.000 128.000 80.000 C 123.582 80.000 120.000 83.582 120.000 88.000 L 120.000 104.000 L 83.230 104.000 ZM 72.000 216.000 L 76.000 176.000 L 180.000 176.000 L 184.000 216.000 ZM 178.390 160.000 L 77.610 160.000 L 81.610 120.000 L 174.370 120.000 Z"),
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
        return _lighthouse!!
    }

private var _lighthouse: ImageVector? = null
