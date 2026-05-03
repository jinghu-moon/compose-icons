package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.Unite: ImageVector
    get() {
        if (_unite != null) return _unite!!
        _unite = phosphorDuotoneIcon(
            name = "Unite",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            group(
                groupAlpha = 0.2f,
            ) {
                addPath(
                    pathData = parseSvgPathData("M 232.000 160.000 C 232.011 198.294 202.046 229.897 163.805 231.920 C 125.565 233.944 92.431 205.681 88.400 167.600 C 50.816 163.609 22.715 131.236 24.047 93.464 C 25.380 55.692 55.692 25.380 93.464 24.047 C 131.236 22.715 163.609 50.816 167.600 88.400 C 204.218 92.287 232.001 123.177 232.000 160.000 Z"),
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
                pathData = parseSvgPathData("M 174.630 81.370 C 167.254 41.643 131.412 13.653 91.082 16.124 C 50.752 18.595 18.595 50.752 16.124 91.082 C 13.653 131.412 41.643 167.254 81.370 174.630 C 88.746 214.357 124.588 242.347 164.918 239.876 C 205.248 237.405 237.405 205.248 239.876 164.918 C 242.347 124.588 214.357 88.746 174.630 81.370 ZM 32.000 96.000 C 31.936 63.723 55.918 36.450 87.938 32.384 C 119.958 28.318 149.994 48.732 158.000 80.000 C 115.402 81.119 81.142 115.402 80.050 158.000 C 51.784 150.686 32.030 125.197 32.000 96.000 ZM 160.000 96.000 C 159.961 131.330 131.330 159.961 96.000 160.000 C 96.039 124.670 124.670 96.039 160.000 96.000 ZM 160.000 224.000 C 130.817 223.976 105.333 204.246 98.000 176.000 C 140.617 174.907 174.907 140.617 176.000 98.000 C 207.268 106.006 227.682 136.042 223.616 168.062 C 219.550 200.082 192.277 224.064 160.000 224.000 Z"),
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
        return _unite!!
    }

private var _unite: ImageVector? = null
