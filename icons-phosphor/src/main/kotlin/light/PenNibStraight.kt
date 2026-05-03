package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.PenNibStraight: ImageVector
    get() {
        if (_penNibStraight != null) return _penNibStraight!!
        _penNibStraight = phosphorLightIcon(
            name = "PenNibStraight",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 220.540 124.770 C 220.498 124.673 220.448 124.579 220.390 124.490 L 190.000 70.420 L 190.000 32.000 C 190.000 24.268 183.732 18.000 176.000 18.000 L 80.000 18.000 C 72.268 18.000 66.000 24.268 66.000 32.000 L 66.000 70.440 L 35.600 124.490 C 35.542 124.579 35.492 124.673 35.450 124.770 C 33.130 129.461 33.620 135.054 36.720 139.270 C 36.750 139.304 36.777 139.341 36.800 139.380 L 123.240 251.660 C 124.376 253.136 126.133 254.001 127.995 254.001 C 129.857 254.001 131.614 253.136 132.750 251.660 L 219.180 139.380 C 219.203 139.341 219.230 139.304 219.260 139.270 C 222.363 135.056 222.857 129.463 220.540 124.770 ZM 80.000 30.000 L 176.000 30.000 C 177.105 30.000 178.000 30.895 178.000 32.000 L 178.000 66.000 L 78.000 66.000 L 78.000 32.000 C 78.000 30.895 78.895 30.000 80.000 30.000 ZM 128.000 146.000 C 120.268 146.000 114.000 139.732 114.000 132.000 C 114.000 124.268 120.268 118.000 128.000 118.000 C 135.732 118.000 142.000 124.268 142.000 132.000 C 142.000 139.732 135.732 146.000 128.000 146.000 ZM 209.630 132.120 L 134.000 230.380 L 134.000 157.290 C 146.835 154.246 155.356 142.073 153.824 128.971 C 152.292 115.870 141.191 105.992 128.000 105.992 C 114.809 105.992 103.708 115.870 102.176 128.971 C 100.644 142.073 109.165 154.246 122.000 157.290 L 122.000 230.360 L 46.370 132.120 C 45.975 131.554 45.899 130.825 46.170 130.190 L 75.520 78.000 L 180.520 78.000 L 209.860 130.190 C 210.122 130.830 210.035 131.560 209.630 132.120 Z"),
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
        return _penNibStraight!!
    }

private var _penNibStraight: ImageVector? = null
