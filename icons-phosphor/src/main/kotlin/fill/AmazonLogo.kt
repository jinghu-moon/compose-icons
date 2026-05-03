package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.AmazonLogo: ImageVector
    get() {
        if (_amazonLogo != null) return _amazonLogo!!
        _amazonLogo = phosphorFillIcon(
            name = "AmazonLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 152.000 136.000 C 152.000 149.255 141.255 160.000 128.000 160.000 C 114.745 160.000 104.000 149.255 104.000 136.000 C 104.000 122.745 114.745 112.000 128.000 112.000 C 141.255 112.000 152.000 122.745 152.000 136.000 ZM 232.000 128.000 C 232.000 185.438 185.438 232.000 128.000 232.000 C 70.562 232.000 24.000 185.438 24.000 128.000 C 24.000 70.562 70.562 24.000 128.000 24.000 C 185.412 24.061 231.939 70.588 232.000 128.000 ZM 152.000 104.000 L 152.000 104.000 C 135.498 91.623 112.290 93.825 98.410 109.085 C 84.530 124.344 84.530 147.656 98.410 162.915 C 112.290 178.175 135.498 180.377 152.000 168.000 L 152.000 168.000 C 152.000 172.418 155.582 176.000 160.000 176.000 C 164.418 176.000 168.000 172.418 168.000 168.000 L 168.000 104.000 C 168.005 86.171 156.209 70.492 139.077 65.554 C 121.946 60.617 103.615 67.613 94.130 82.710 C 91.871 86.443 93.020 91.299 96.714 93.623 C 100.407 95.947 105.282 94.882 107.670 91.230 C 113.358 82.165 124.360 77.960 134.643 80.923 C 144.927 83.885 152.007 93.298 152.000 104.000 ZM 196.810 169.610 C 193.281 166.955 188.267 167.662 185.610 171.190 C 172.013 189.328 150.668 200.003 128.000 200.003 C 105.332 200.003 83.987 189.328 70.390 171.190 C 68.698 168.834 65.863 167.579 62.981 167.910 C 60.099 168.240 57.622 170.105 56.507 172.783 C 55.392 175.460 55.814 178.532 57.610 180.810 C 74.230 202.961 100.307 215.997 128.000 215.997 C 155.693 215.997 181.770 202.961 198.390 180.810 C 201.045 177.281 200.338 172.267 196.810 169.610 Z"),
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
        return _amazonLogo!!
    }

private var _amazonLogo: ImageVector? = null
