package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.ThreeD: ImageVector
    get() {
        if (_threeD != null) return _threeD!!
        _threeD = phosphorFillIcon(
            name = "ThreeD",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 184.000 128.000 C 184.000 145.673 169.673 160.000 152.000 160.000 L 144.000 160.000 L 144.000 96.000 L 152.000 96.000 C 169.673 96.000 184.000 110.327 184.000 128.000 ZM 232.000 56.000 L 232.000 200.000 C 232.000 208.837 224.837 216.000 216.000 216.000 L 40.000 216.000 C 31.163 216.000 24.000 208.837 24.000 200.000 L 24.000 56.000 C 24.000 47.163 31.163 40.000 40.000 40.000 L 216.000 40.000 C 224.837 40.000 232.000 47.163 232.000 56.000 ZM 112.000 144.000 C 111.999 131.632 104.869 120.371 93.690 115.080 L 110.400 92.800 C 112.218 90.376 112.511 87.133 111.155 84.422 C 109.800 81.712 107.030 80.000 104.000 80.000 L 64.000 80.000 C 59.582 80.000 56.000 83.582 56.000 88.000 C 56.000 92.418 59.582 96.000 64.000 96.000 L 88.000 96.000 L 73.600 115.200 C 71.782 117.624 71.489 120.867 72.845 123.578 C 74.200 126.288 76.970 128.000 80.000 128.000 C 87.131 127.999 93.402 132.717 95.376 139.570 C 97.351 146.422 94.552 153.753 88.515 157.547 C 82.477 161.341 74.657 160.682 69.340 155.930 C 66.048 152.981 60.989 153.258 58.040 156.550 C 55.091 159.842 55.368 164.901 58.660 167.850 C 68.065 176.267 81.540 178.369 93.062 173.217 C 104.584 168.065 112.002 156.622 112.000 144.000 ZM 200.000 128.000 C 199.972 101.502 178.498 80.028 152.000 80.000 L 136.000 80.000 C 131.582 80.000 128.000 83.582 128.000 88.000 L 128.000 168.000 C 128.000 172.418 131.582 176.000 136.000 176.000 L 152.000 176.000 C 178.498 175.972 199.972 154.498 200.000 128.000 Z"),
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
        return _threeD!!
    }

private var _threeD: ImageVector? = null
