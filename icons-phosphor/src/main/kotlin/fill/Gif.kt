package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Gif: ImageVector
    get() {
        if (_gif != null) return _gif!!
        _gif = phosphorFillIcon(
            name = "Gif",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 216.000 40.000 L 40.000 40.000 C 31.163 40.000 24.000 47.163 24.000 56.000 L 24.000 200.000 C 24.000 208.837 31.163 216.000 40.000 216.000 L 216.000 216.000 C 224.837 216.000 232.000 208.837 232.000 200.000 L 232.000 56.000 C 232.000 47.163 224.837 40.000 216.000 40.000 ZM 112.000 144.000 C 112.000 161.673 97.673 176.000 80.000 176.000 C 62.327 176.000 48.000 161.673 48.000 144.000 L 48.000 112.000 C 48.002 98.734 56.190 86.844 68.583 82.111 C 80.976 77.378 95.005 80.782 103.850 90.670 C 105.868 92.782 106.574 95.826 105.693 98.611 C 104.811 101.396 102.482 103.479 99.616 104.045 C 96.751 104.611 93.804 103.570 91.930 101.330 C 87.508 96.382 80.490 94.677 74.290 97.045 C 68.091 99.414 63.997 105.363 64.000 112.000 L 64.000 144.000 C 64.000 152.837 71.163 160.000 80.000 160.000 C 88.837 160.000 96.000 152.837 96.000 144.000 L 96.000 136.000 L 88.000 136.000 C 83.582 136.000 80.000 132.418 80.000 128.000 C 80.000 123.582 83.582 120.000 88.000 120.000 L 104.000 120.000 C 108.418 120.000 112.000 123.582 112.000 128.000 ZM 144.000 168.000 C 144.000 172.418 140.418 176.000 136.000 176.000 C 131.582 176.000 128.000 172.418 128.000 168.000 L 128.000 88.000 C 128.000 83.582 131.582 80.000 136.000 80.000 C 140.418 80.000 144.000 83.582 144.000 88.000 ZM 204.000 96.000 L 176.000 96.000 L 176.000 120.000 L 196.000 120.000 C 200.418 120.000 204.000 123.582 204.000 128.000 C 204.000 132.418 200.418 136.000 196.000 136.000 L 176.000 136.000 L 176.000 168.000 C 176.000 172.418 172.418 176.000 168.000 176.000 C 163.582 176.000 160.000 172.418 160.000 168.000 L 160.000 88.000 C 160.000 83.582 163.582 80.000 168.000 80.000 L 204.000 80.000 C 208.418 80.000 212.000 83.582 212.000 88.000 C 212.000 92.418 208.418 96.000 204.000 96.000 Z"),
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
        return _gif!!
    }

private var _gif: ImageVector? = null
