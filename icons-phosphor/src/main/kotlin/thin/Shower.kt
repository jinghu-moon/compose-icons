package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Shower: ImageVector
    get() {
        if (_shower != null) return _shower!!
        _shower = phosphorThinIcon(
            name = "Shower",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 60.000 236.000 C 60.000 240.418 56.418 244.000 52.000 244.000 C 47.582 244.000 44.000 240.418 44.000 236.000 C 44.000 231.582 47.582 228.000 52.000 228.000 C 56.418 228.000 60.000 231.582 60.000 236.000 ZM 84.000 196.000 C 79.582 196.000 76.000 199.582 76.000 204.000 C 76.000 208.418 79.582 212.000 84.000 212.000 C 88.418 212.000 92.000 208.418 92.000 204.000 C 92.000 199.582 88.418 196.000 84.000 196.000 ZM 20.000 196.000 C 15.582 196.000 12.000 199.582 12.000 204.000 C 12.000 208.418 15.582 212.000 20.000 212.000 C 24.418 212.000 28.000 208.418 28.000 204.000 C 28.000 199.582 24.418 196.000 20.000 196.000 ZM 52.000 164.000 C 47.582 164.000 44.000 167.582 44.000 172.000 C 44.000 176.418 47.582 180.000 52.000 180.000 C 56.418 180.000 60.000 176.418 60.000 172.000 C 60.000 167.582 56.418 164.000 52.000 164.000 ZM 252.000 40.000 C 252.000 42.209 250.209 44.000 248.000 44.000 L 217.660 44.000 L 187.730 73.930 L 165.860 202.000 C 165.117 206.427 161.965 210.069 157.690 211.440 C 156.496 211.817 155.252 212.005 154.000 212.000 C 150.825 211.992 147.783 210.726 145.540 208.480 L 47.540 110.480 C 44.353 107.310 43.204 102.624 44.565 98.339 C 45.926 94.055 49.568 90.890 54.000 90.140 L 182.000 68.270 L 213.100 37.170 C 213.868 36.403 214.915 35.980 216.000 36.000 L 248.000 36.000 C 250.209 36.000 252.000 37.791 252.000 40.000 ZM 179.110 76.890 L 55.370 98.000 C 53.886 98.239 52.662 99.289 52.200 100.720 C 51.738 102.150 52.116 103.718 53.180 104.780 L 151.180 202.780 C 152.239 203.843 153.804 204.224 155.233 203.766 C 156.662 203.309 157.715 202.090 157.960 200.610 Z"),
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
        return _shower!!
    }

private var _shower: ImageVector? = null
