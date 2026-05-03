package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.MicrosoftTeamsLogo: ImageVector
    get() {
        if (_microsoftTeamsLogo != null) return _microsoftTeamsLogo!!
        _microsoftTeamsLogo = phosphorFillIcon(
            name = "MicrosoftTeamsLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 219.260 80.000 L 211.690 80.000 C 214.519 75.143 216.007 69.621 216.000 64.000 C 216.006 52.992 210.353 42.754 201.034 36.894 C 191.715 31.034 180.039 30.375 170.120 35.150 C 159.981 18.599 139.424 11.715 121.363 18.823 C 103.302 25.930 92.950 44.978 96.810 64.000 L 40.000 64.000 C 31.163 64.000 24.000 71.163 24.000 80.000 L 24.000 176.000 C 24.000 184.837 31.163 192.000 40.000 192.000 L 76.670 192.000 C 86.467 216.190 109.972 232.009 136.071 231.976 C 162.170 231.943 185.634 216.065 195.370 191.850 C 216.078 190.099 231.996 172.782 232.000 152.000 L 232.000 92.740 C 231.989 85.708 226.292 80.011 219.260 80.000 ZM 136.000 32.000 C 146.175 31.999 155.245 38.415 158.632 48.009 C 162.020 57.604 158.990 68.292 151.070 74.680 C 148.816 68.287 142.779 64.008 136.000 64.000 L 113.380 64.000 C 110.783 56.656 111.913 48.508 116.409 42.147 C 120.906 35.785 128.210 32.002 136.000 32.000 ZM 88.000 160.000 C 83.582 160.000 80.000 156.418 80.000 152.000 L 80.000 112.000 L 72.000 112.000 C 67.582 112.000 64.000 108.418 64.000 104.000 C 64.000 99.582 67.582 96.000 72.000 96.000 L 104.000 96.000 C 108.418 96.000 112.000 99.582 112.000 104.000 C 112.000 108.418 108.418 112.000 104.000 112.000 L 96.000 112.000 L 96.000 152.000 C 96.000 156.418 92.418 160.000 88.000 160.000 ZM 184.000 168.000 C 183.993 189.719 169.403 208.726 148.425 214.348 C 127.446 219.970 105.307 210.805 94.440 192.000 L 136.000 192.000 C 144.837 192.000 152.000 184.837 152.000 176.000 L 152.000 96.000 L 184.000 96.000 ZM 184.000 80.000 L 168.000 80.000 C 174.362 71.533 177.096 60.884 175.600 50.400 C 181.372 46.823 188.774 47.279 194.063 51.538 C 199.353 55.797 201.377 62.931 199.113 69.334 C 196.850 75.736 190.791 80.012 184.000 80.000 ZM 216.000 152.000 C 215.999 162.310 209.414 171.468 199.640 174.750 C 199.881 172.508 200.001 170.255 200.000 168.000 L 200.000 96.000 L 216.000 96.000 Z"),
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
        return _microsoftTeamsLogo!!
    }

private var _microsoftTeamsLogo: ImageVector? = null
