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
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 128.000 28.000 C 72.772 28.000 28.000 72.772 28.000 128.000 C 28.000 183.228 72.772 228.000 128.000 228.000 C 183.228 228.000 228.000 183.228 228.000 128.000 C 227.939 72.797 183.203 28.061 128.000 28.000 ZM 132.000 219.910 L 132.000 148.000 L 160.000 148.000 C 162.209 148.000 164.000 146.209 164.000 144.000 C 164.000 141.791 162.209 140.000 160.000 140.000 L 132.000 140.000 L 132.000 112.000 C 132.000 100.954 140.954 92.000 152.000 92.000 L 168.000 92.000 C 170.209 92.000 172.000 90.209 172.000 88.000 C 172.000 85.791 170.209 84.000 168.000 84.000 L 152.000 84.000 C 136.536 84.000 124.000 96.536 124.000 112.000 L 124.000 140.000 L 96.000 140.000 C 93.791 140.000 92.000 141.791 92.000 144.000 C 92.000 146.209 93.791 148.000 96.000 148.000 L 124.000 148.000 L 124.000 219.910 C 74.017 217.735 34.934 176.015 36.022 125.997 C 37.110 75.978 77.969 35.997 128.000 35.997 C 178.031 35.997 218.890 75.978 219.978 125.997 C 221.066 176.015 181.983 217.735 132.000 219.910 Z"),
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
        return _facebookLogo!!
    }

private var _facebookLogo: ImageVector? = null
