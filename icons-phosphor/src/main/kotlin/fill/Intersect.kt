package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Intersect: ImageVector
    get() {
        if (_intersect != null) return _intersect!!
        _intersect = phosphorFillIcon(
            name = "Intersect",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 174.630 81.370 C 167.254 41.643 131.412 13.653 91.082 16.124 C 50.752 18.595 18.595 50.752 16.124 91.082 C 13.653 131.412 41.643 167.254 81.370 174.630 C 88.746 214.357 124.588 242.347 164.918 239.876 C 205.248 237.405 237.405 205.248 239.876 164.918 C 242.347 124.588 214.357 88.746 174.630 81.370 ZM 32.000 96.000 C 31.936 63.723 55.918 36.450 87.938 32.384 C 119.958 28.318 149.994 48.732 158.000 80.000 C 115.402 81.119 81.142 115.402 80.050 158.000 C 51.784 150.686 32.030 125.197 32.000 96.000 ZM 160.000 224.000 C 130.817 223.976 105.333 204.246 98.000 176.000 C 140.617 174.907 174.907 140.617 176.000 98.000 C 207.268 106.006 227.682 136.042 223.616 168.062 C 219.550 200.082 192.277 224.064 160.000 224.000 Z"),
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
        return _intersect!!
    }

private var _intersect: ImageVector? = null
