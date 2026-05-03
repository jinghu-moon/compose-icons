package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.ToiletPaper: ImageVector
    get() {
        if (_toiletPaper != null) return _toiletPaper!!
        _toiletPaper = phosphorRegularIcon(
            name = "ToiletPaper",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 76.000 120.000 C 76.000 126.627 70.627 132.000 64.000 132.000 C 57.373 132.000 52.000 126.627 52.000 120.000 C 52.000 113.373 57.373 108.000 64.000 108.000 C 70.627 108.000 76.000 113.373 76.000 120.000 ZM 240.000 120.000 L 240.000 208.000 C 240.000 216.837 232.837 224.000 224.000 224.000 L 112.000 224.000 C 103.163 224.000 96.000 216.837 96.000 208.000 L 96.000 186.350 C 87.370 200.370 76.180 208.000 64.000 208.000 C 50.130 208.000 37.540 198.110 28.560 180.150 C 20.460 164.000 16.000 142.590 16.000 120.000 C 16.000 97.410 20.460 76.050 28.560 59.850 C 37.540 41.890 50.130 32.000 64.000 32.000 L 192.000 32.000 C 205.870 32.000 218.460 41.890 227.440 59.850 C 235.540 76.050 240.000 97.410 240.000 120.000 ZM 96.000 120.000 C 96.000 77.570 79.140 48.000 64.000 48.000 C 48.860 48.000 32.000 77.570 32.000 120.000 C 32.000 162.430 48.860 192.000 64.000 192.000 C 79.140 192.000 96.000 162.430 96.000 120.000 ZM 224.000 208.000 L 224.000 128.000 L 208.000 128.000 C 203.582 128.000 200.000 124.418 200.000 120.000 C 200.000 115.582 203.582 112.000 208.000 112.000 L 223.790 112.000 C 221.840 73.900 206.160 48.000 192.000 48.000 L 92.120 48.000 C 94.929 51.710 97.380 55.677 99.440 59.850 C 106.580 74.130 110.880 92.410 111.810 112.000 L 128.000 112.000 C 132.418 112.000 136.000 115.582 136.000 120.000 C 136.000 124.418 132.418 128.000 128.000 128.000 L 112.000 128.000 L 112.000 208.000 ZM 176.000 112.000 L 160.000 112.000 C 155.582 112.000 152.000 115.582 152.000 120.000 C 152.000 124.418 155.582 128.000 160.000 128.000 L 176.000 128.000 C 180.418 128.000 184.000 124.418 184.000 120.000 C 184.000 115.582 180.418 112.000 176.000 112.000 Z"),
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
        return _toiletPaper!!
    }

private var _toiletPaper: ImageVector? = null
