package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.Mosque: ImageVector
    get() {
        if (_mosque != null) return _mosque!!
        _mosque = phosphorDuotoneIcon(
            name = "Mosque",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            group(
                groupAlpha = 0.2f,
            ) {
                addPath(
                    pathData = parseSvgPathData("M 208.000 128.000 L 48.000 128.000 C 48.000 64.000 128.000 56.000 128.000 24.000 C 128.000 56.000 208.000 64.000 208.000 128.000 Z"),
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
            addPath(
                pathData = parseSvgPathData("M 224.000 128.000 C 221.274 127.999 218.568 128.466 216.000 129.380 L 216.000 128.000 C 216.000 86.220 184.930 65.540 162.240 50.440 C 148.160 41.060 136.000 33.000 136.000 24.000 C 136.000 19.582 132.418 16.000 128.000 16.000 C 123.582 16.000 120.000 19.582 120.000 24.000 C 120.000 33.000 107.840 41.060 93.760 50.440 C 71.070 65.540 40.000 86.220 40.000 128.000 L 40.000 129.380 C 32.656 126.783 24.508 127.913 18.147 132.409 C 11.785 136.906 8.002 144.210 8.000 152.000 L 8.000 208.000 C 8.000 212.418 11.582 216.000 16.000 216.000 L 80.000 216.000 C 84.418 216.000 88.000 212.418 88.000 208.000 L 88.000 176.000 C 88.000 171.582 91.582 168.000 96.000 168.000 C 100.418 168.000 104.000 171.582 104.000 176.000 L 104.000 208.000 C 104.000 212.418 107.582 216.000 112.000 216.000 L 144.000 216.000 C 148.418 216.000 152.000 212.418 152.000 208.000 L 152.000 176.000 C 152.000 171.582 155.582 168.000 160.000 168.000 C 164.418 168.000 168.000 171.582 168.000 176.000 L 168.000 208.000 C 168.000 212.418 171.582 216.000 176.000 216.000 L 240.000 216.000 C 244.418 216.000 248.000 212.418 248.000 208.000 L 248.000 152.000 C 248.000 138.745 237.255 128.000 224.000 128.000 ZM 40.000 200.000 L 24.000 200.000 L 24.000 152.000 C 24.000 147.582 27.582 144.000 32.000 144.000 C 36.418 144.000 40.000 147.582 40.000 152.000 ZM 102.630 63.760 C 112.300 57.320 121.630 51.080 128.000 43.760 C 134.340 51.110 143.700 57.350 153.370 63.760 C 173.370 77.080 195.850 92.050 199.480 120.000 L 56.480 120.000 C 60.150 92.050 82.600 77.080 102.630 63.760 ZM 200.000 200.000 L 184.000 200.000 L 184.000 176.000 C 184.000 162.745 173.255 152.000 160.000 152.000 C 146.745 152.000 136.000 162.745 136.000 176.000 L 136.000 200.000 L 120.000 200.000 L 120.000 176.000 C 120.000 162.745 109.255 152.000 96.000 152.000 C 82.745 152.000 72.000 162.745 72.000 176.000 L 72.000 200.000 L 56.000 200.000 L 56.000 136.000 L 200.000 136.000 ZM 232.000 200.000 L 216.000 200.000 L 216.000 152.000 C 216.000 147.582 219.582 144.000 224.000 144.000 C 228.418 144.000 232.000 147.582 232.000 152.000 Z"),
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
        return _mosque!!
    }

private var _mosque: ImageVector? = null
