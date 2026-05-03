package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.GooglePhotosLogo: ImageVector
    get() {
        if (_googlePhotosLogo != null) return _googlePhotosLogo!!
        _googlePhotosLogo = phosphorThinIcon(
            name = "GooglePhotosLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 232.000 124.000 L 185.680 124.000 C 198.762 103.037 199.442 76.628 187.458 55.019 C 175.473 33.410 152.710 20.003 128.000 20.000 C 125.791 20.000 124.000 21.791 124.000 24.000 L 124.000 70.320 C 103.037 57.238 76.628 56.558 55.019 68.542 C 33.410 80.527 20.003 103.290 20.000 128.000 C 20.000 130.209 21.791 132.000 24.000 132.000 L 70.320 132.000 C 57.238 152.963 56.558 179.372 68.542 200.981 C 80.527 222.590 103.290 235.997 128.000 236.000 C 130.209 236.000 132.000 234.209 132.000 232.000 L 132.000 185.680 C 152.963 198.762 179.372 199.442 200.981 187.458 C 222.590 175.473 235.997 152.710 236.000 128.000 C 236.000 125.791 234.209 124.000 232.000 124.000 ZM 188.000 88.000 C 188.053 100.991 183.837 113.639 176.000 124.000 L 132.000 124.000 L 132.000 28.130 C 163.497 30.274 187.963 56.430 188.000 88.000 ZM 88.000 68.000 C 100.991 67.947 113.639 72.163 124.000 80.000 L 124.000 124.000 L 28.130 124.000 C 30.274 92.503 56.430 68.037 88.000 68.000 ZM 68.000 168.000 C 67.947 155.009 72.163 142.361 80.000 132.000 L 124.000 132.000 L 124.000 227.870 C 92.503 225.726 68.037 199.570 68.000 168.000 ZM 168.000 188.000 C 155.009 188.053 142.361 183.837 132.000 176.000 L 132.000 132.000 L 227.870 132.000 C 225.726 163.497 199.570 187.963 168.000 188.000 Z"),
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
        return _googlePhotosLogo!!
    }

private var _googlePhotosLogo: ImageVector? = null
