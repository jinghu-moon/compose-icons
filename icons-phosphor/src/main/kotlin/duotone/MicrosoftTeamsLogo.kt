package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.MicrosoftTeamsLogo: ImageVector
    get() {
        if (_microsoftTeamsLogo != null) return _microsoftTeamsLogo!!
        _microsoftTeamsLogo = phosphorDuotoneIcon(
            name = "MicrosoftTeamsLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            group(
                groupAlpha = 0.2f,
            ) {
                addPath(
                    pathData = parseSvgPathData("M 144.000 80.000 L 144.000 176.000 C 144.000 180.418 140.418 184.000 136.000 184.000 L 40.000 184.000 C 35.582 184.000 32.000 180.418 32.000 176.000 L 32.000 80.000 C 32.000 75.582 35.582 72.000 40.000 72.000 L 136.000 72.000 C 140.418 72.000 144.000 75.582 144.000 80.000 Z"),
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
            addPath(
                pathData = parseSvgPathData("M 80.000 152.000 L 80.000 112.000 L 72.000 112.000 C 67.582 112.000 64.000 108.418 64.000 104.000 C 64.000 99.582 67.582 96.000 72.000 96.000 L 104.000 96.000 C 108.418 96.000 112.000 99.582 112.000 104.000 C 112.000 108.418 108.418 112.000 104.000 112.000 L 96.000 112.000 L 96.000 152.000 C 96.000 156.418 92.418 160.000 88.000 160.000 C 83.582 160.000 80.000 156.418 80.000 152.000 ZM 232.000 92.740 L 232.000 152.000 C 231.996 172.782 216.078 190.099 195.370 191.850 C 185.634 216.065 162.170 231.943 136.071 231.976 C 109.972 232.009 86.467 216.190 76.670 192.000 L 40.000 192.000 C 31.163 192.000 24.000 184.837 24.000 176.000 L 24.000 80.000 C 24.000 71.163 31.163 64.000 40.000 64.000 L 96.810 64.000 C 92.950 44.978 103.302 25.930 121.363 18.823 C 139.424 11.715 159.981 18.599 170.120 35.150 C 182.772 29.069 197.909 31.944 207.451 42.239 C 216.993 52.534 218.712 67.846 211.690 80.000 L 219.260 80.000 C 226.292 80.011 231.989 85.708 232.000 92.740 ZM 175.600 50.400 C 177.096 60.884 174.362 71.533 168.000 80.000 L 184.000 80.000 C 190.791 80.012 196.850 75.736 199.113 69.334 C 201.377 62.931 199.353 55.797 194.063 51.538 C 188.774 47.279 181.372 46.823 175.600 50.400 ZM 113.380 64.000 L 136.000 64.000 C 142.779 64.008 148.816 68.287 151.070 74.680 C 160.575 67.017 162.811 53.439 156.267 43.132 C 149.723 32.825 136.484 29.074 125.505 34.415 C 114.527 39.757 109.308 52.490 113.380 64.000 ZM 40.000 176.000 L 136.000 176.000 L 136.000 80.000 L 40.000 80.000 ZM 184.000 168.000 L 184.000 96.000 L 152.000 96.000 L 152.000 176.000 C 152.000 184.837 144.837 192.000 136.000 192.000 L 94.440 192.000 C 105.307 210.805 127.446 219.970 148.425 214.348 C 169.403 208.726 183.993 189.719 184.000 168.000 ZM 216.000 96.000 L 200.000 96.000 L 200.000 168.000 C 200.001 170.255 199.881 172.508 199.640 174.750 C 209.414 171.468 215.999 162.310 216.000 152.000 Z"),
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
