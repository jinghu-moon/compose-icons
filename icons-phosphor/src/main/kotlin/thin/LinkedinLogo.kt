package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.LinkedinLogo: ImageVector
    get() {
        if (_linkedinLogo != null) return _linkedinLogo!!
        _linkedinLogo = phosphorThinIcon(
            name = "LinkedinLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 216.000 28.000 L 40.000 28.000 C 33.373 28.000 28.000 33.373 28.000 40.000 L 28.000 216.000 C 28.000 222.627 33.373 228.000 40.000 228.000 L 216.000 228.000 C 222.627 228.000 228.000 222.627 228.000 216.000 L 228.000 40.000 C 228.000 33.373 222.627 28.000 216.000 28.000 ZM 220.000 216.000 C 220.000 218.209 218.209 220.000 216.000 220.000 L 40.000 220.000 C 37.791 220.000 36.000 218.209 36.000 216.000 L 36.000 40.000 C 36.000 37.791 37.791 36.000 40.000 36.000 L 216.000 36.000 C 218.209 36.000 220.000 37.791 220.000 40.000 ZM 92.000 112.000 L 92.000 176.000 C 92.000 178.209 90.209 180.000 88.000 180.000 C 85.791 180.000 84.000 178.209 84.000 176.000 L 84.000 112.000 C 84.000 109.791 85.791 108.000 88.000 108.000 C 90.209 108.000 92.000 109.791 92.000 112.000 ZM 180.000 140.000 L 180.000 176.000 C 180.000 178.209 178.209 180.000 176.000 180.000 C 173.791 180.000 172.000 178.209 172.000 176.000 L 172.000 140.000 C 172.000 126.745 161.255 116.000 148.000 116.000 C 134.745 116.000 124.000 126.745 124.000 140.000 L 124.000 176.000 C 124.000 178.209 122.209 180.000 120.000 180.000 C 117.791 180.000 116.000 178.209 116.000 176.000 L 116.000 112.000 C 116.000 109.791 117.791 108.000 120.000 108.000 C 122.209 108.000 124.000 109.791 124.000 112.000 L 124.000 118.870 C 132.798 108.893 146.851 105.400 159.297 110.096 C 171.742 114.792 179.985 126.698 180.000 140.000 ZM 96.000 84.000 C 96.000 88.418 92.418 92.000 88.000 92.000 C 83.582 92.000 80.000 88.418 80.000 84.000 C 80.000 79.582 83.582 76.000 88.000 76.000 C 92.418 76.000 96.000 79.582 96.000 84.000 Z"),
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
        return _linkedinLogo!!
    }

private var _linkedinLogo: ImageVector? = null
