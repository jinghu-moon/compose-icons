package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.SignOut: ImageVector
    get() {
        if (_signOut != null) return _signOut!!
        _signOut = phosphorFillIcon(
            name = "SignOut",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 120.000 216.000 C 120.000 220.418 116.418 224.000 112.000 224.000 L 48.000 224.000 C 43.582 224.000 40.000 220.418 40.000 216.000 L 40.000 40.000 C 40.000 35.582 43.582 32.000 48.000 32.000 L 112.000 32.000 C 116.418 32.000 120.000 35.582 120.000 40.000 C 120.000 44.418 116.418 48.000 112.000 48.000 L 56.000 48.000 L 56.000 208.000 L 112.000 208.000 C 116.418 208.000 120.000 211.582 120.000 216.000 ZM 229.660 122.340 L 189.660 82.340 C 187.372 80.049 183.929 79.364 180.938 80.603 C 177.947 81.842 175.997 84.762 176.000 88.000 L 176.000 120.000 L 112.000 120.000 C 107.582 120.000 104.000 123.582 104.000 128.000 C 104.000 132.418 107.582 136.000 112.000 136.000 L 176.000 136.000 L 176.000 168.000 C 175.997 171.238 177.947 174.158 180.938 175.397 C 183.929 176.636 187.372 175.951 189.660 173.660 L 229.660 133.660 C 231.162 132.159 232.006 130.123 232.006 128.000 C 232.006 125.877 231.162 123.841 229.660 122.340 Z"),
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
        return _signOut!!
    }

private var _signOut: ImageVector? = null
