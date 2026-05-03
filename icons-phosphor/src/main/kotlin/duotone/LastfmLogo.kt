package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.LastfmLogo: ImageVector
    get() {
        if (_lastfmLogo != null) return _lastfmLogo!!
        _lastfmLogo = phosphorDuotoneIcon(
            name = "LastfmLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            group(
                groupAlpha = 0.2f,
            ) {
                addPath(
                    pathData = parseSvgPathData("M 240.000 160.000 C 240.000 177.673 225.673 192.000 208.000 192.000 L 64.000 192.000 C 37.490 192.000 16.000 170.510 16.000 144.000 L 16.000 120.000 C 16.000 93.490 37.490 72.000 64.000 72.000 L 208.000 72.000 C 221.255 72.000 232.000 82.745 232.000 96.000 Z"),
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
                pathData = parseSvgPathData("M 248.000 160.000 C 248.000 182.091 230.091 200.000 208.000 200.000 L 190.570 200.000 C 168.827 199.947 149.063 187.361 139.820 167.680 L 109.680 103.080 C 103.077 89.023 88.960 80.035 73.430 80.000 L 64.000 80.000 C 41.909 80.000 24.000 97.909 24.000 120.000 L 24.000 144.000 C 24.000 166.091 41.909 184.000 64.000 184.000 L 72.000 184.000 C 84.728 184.005 96.249 176.465 101.340 164.800 C 102.441 162.117 104.909 160.241 107.788 159.895 C 110.668 159.550 113.509 160.790 115.213 163.137 C 116.918 165.483 117.219 168.568 116.000 171.200 C 108.365 188.695 91.089 200.003 72.000 200.000 L 64.000 200.000 C 33.086 199.967 8.033 174.914 8.000 144.000 L 8.000 120.000 C 8.033 89.086 33.086 64.033 64.000 64.000 L 73.430 64.000 C 95.173 64.053 114.937 76.639 124.180 96.320 L 154.320 160.920 C 160.923 174.977 175.040 183.965 190.570 184.000 L 208.000 184.000 C 221.255 184.000 232.000 173.255 232.000 160.000 C 232.000 146.745 221.255 136.000 208.000 136.000 L 188.000 136.000 C 168.118 136.000 152.000 119.882 152.000 100.000 C 152.000 80.118 168.118 64.000 188.000 64.000 L 208.000 64.000 C 225.673 64.000 240.000 78.327 240.000 96.000 C 240.000 100.418 236.418 104.000 232.000 104.000 C 227.582 104.000 224.000 100.418 224.000 96.000 C 224.000 87.163 216.837 80.000 208.000 80.000 L 188.000 80.000 C 176.954 80.000 168.000 88.954 168.000 100.000 C 168.000 111.046 176.954 120.000 188.000 120.000 L 208.000 120.000 C 230.091 120.000 248.000 137.909 248.000 160.000 Z"),
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
        return _lastfmLogo!!
    }

private var _lastfmLogo: ImageVector? = null
