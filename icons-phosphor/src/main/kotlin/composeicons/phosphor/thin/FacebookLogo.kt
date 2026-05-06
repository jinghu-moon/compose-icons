package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.FacebookLogo: ImageVector
    get() {
        if (_facebookLogo != null) return _facebookLogo!!
        _facebookLogo = phosphorThinIcon(
            name = "FacebookLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M128 28C72.772 28 28 72.772 28 128c0 55.228 44.772 100 100 100 55.228 0 100-44.772 100-100C227.939 72.797 183.203 28.061 128 28ZM132 219.91v-71.91h28c2.209 0 4-1.791 4-4 0-2.209-1.791-4-4-4h-28v-28c0-11.046 8.954-20 20-20h16c2.209 0 4-1.791 4-4 0-2.209-1.791-4-4-4h-16c-15.464 0-28 12.536-28 28v28h-28c-2.209 0-4 1.791-4 4 0 2.209 1.791 4 4 4h28v71.91C74.017 217.735 34.934 176.015 36.022 125.997 37.11 75.978 77.969 35.997 128 35.997c50.031 0 90.89 39.981 91.978 90 1.088 50.019-37.995 91.738-87.978 93.913Z"),
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
        return _facebookLogo!!
    }

private var _facebookLogo: ImageVector? = null
