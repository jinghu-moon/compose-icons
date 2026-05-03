package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.MicrosoftTeamsLogo: ImageVector
    get() {
        if (_microsoftTeamsLogo != null) return _microsoftTeamsLogo!!
        _microsoftTeamsLogo = phosphorRegularIcon(
            name = "MicrosoftTeamsLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 112.000 104.000 C 112.000 108.418 108.418 112.000 104.000 112.000 L 96.000 112.000 L 96.000 152.000 C 96.000 156.418 92.418 160.000 88.000 160.000 C 83.582 160.000 80.000 156.418 80.000 152.000 L 80.000 112.000 L 72.000 112.000 C 67.582 112.000 64.000 108.418 64.000 104.000 C 64.000 99.582 67.582 96.000 72.000 96.000 L 104.000 96.000 C 108.418 96.000 112.000 99.582 112.000 104.000 ZM 232.000 92.740 L 232.000 152.000 C 231.996 172.782 216.078 190.099 195.370 191.850 C 185.634 216.065 162.170 231.943 136.071 231.976 C 109.972 232.009 86.467 216.190 76.670 192.000 L 40.000 192.000 C 31.163 192.000 24.000 184.837 24.000 176.000 L 24.000 80.000 C 24.000 71.163 31.163 64.000 40.000 64.000 L 96.810 64.000 C 92.950 44.978 103.302 25.930 121.363 18.823 C 139.424 11.715 159.981 18.599 170.120 35.150 C 182.772 29.069 197.909 31.944 207.451 42.239 C 216.993 52.534 218.712 67.846 211.690 80.000 L 219.260 80.000 C 226.292 80.011 231.989 85.708 232.000 92.740 ZM 112.000 56.000 C 111.999 58.726 112.466 61.432 113.380 64.000 L 136.000 64.000 C 142.779 64.008 148.816 68.287 151.070 74.680 C 159.771 67.660 162.473 55.561 157.584 45.507 C 152.695 35.452 141.511 30.105 130.616 32.613 C 119.721 35.121 112.001 44.820 112.000 56.000 ZM 136.000 176.000 L 136.000 176.000 L 136.000 80.000 L 40.000 80.000 L 40.000 176.000 L 136.000 176.000 ZM 184.000 96.000 L 152.000 96.000 L 152.000 176.000 C 152.000 184.837 144.837 192.000 136.000 192.000 L 94.440 192.000 C 105.307 210.805 127.446 219.970 148.425 214.348 C 169.403 208.726 183.993 189.719 184.000 168.000 ZM 200.000 64.000 C 199.994 58.204 196.853 52.864 191.790 50.042 C 186.727 47.220 180.533 47.357 175.600 50.400 C 177.096 60.884 174.362 71.533 168.000 80.000 L 184.000 80.000 C 192.837 80.000 200.000 72.837 200.000 64.000 ZM 216.000 96.000 L 200.000 96.000 L 200.000 168.000 C 200.001 170.255 199.881 172.508 199.640 174.750 C 209.414 171.468 215.999 162.310 216.000 152.000 Z"),
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
        return _microsoftTeamsLogo!!
    }

private var _microsoftTeamsLogo: ImageVector? = null
