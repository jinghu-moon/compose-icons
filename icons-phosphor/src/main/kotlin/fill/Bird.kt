package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Bird: ImageVector
    get() {
        if (_bird != null) return _bird!!
        _bird = phosphorFillIcon(
            name = "Bird",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 236.440 73.340 L 213.210 57.860 C 205.302 32.929 182.155 15.992 156.000 16.000 L 155.710 16.000 C 122.790 16.160 96.000 43.470 96.000 76.890 L 96.000 96.630 L 11.630 197.880 L 11.530 198.000 C 7.687 202.799 6.935 209.376 9.593 214.919 C 12.252 220.463 17.852 223.992 24.000 224.000 L 112.000 224.000 C 169.412 223.939 215.939 177.412 216.000 120.000 L 216.000 100.280 L 236.440 86.660 C 238.669 85.177 240.008 82.677 240.008 80.000 C 240.008 77.323 238.669 74.823 236.440 73.340 ZM 126.150 133.120 L 66.150 205.120 C 64.340 207.380 61.451 208.487 58.594 208.012 C 55.738 207.538 53.361 205.557 52.379 202.834 C 51.397 200.110 51.963 197.068 53.860 194.880 L 113.860 122.880 C 115.670 120.620 118.559 119.513 121.416 119.988 C 124.272 120.462 126.649 122.443 127.631 125.166 C 128.613 127.890 128.047 130.932 126.150 133.120 ZM 164.000 80.000 C 157.373 80.000 152.000 74.627 152.000 68.000 C 152.000 61.373 157.373 56.000 164.000 56.000 C 170.627 56.000 176.000 61.373 176.000 68.000 C 176.000 74.627 170.627 80.000 164.000 80.000 Z"),
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
        return _bird!!
    }

private var _bird: ImageVector? = null
