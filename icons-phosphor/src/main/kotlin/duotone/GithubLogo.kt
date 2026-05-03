package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.GithubLogo: ImageVector
    get() {
        if (_githubLogo != null) return _githubLogo!!
        _githubLogo = phosphorDuotoneIcon(
            name = "GithubLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            group(
                groupAlpha = 0.2f,
            ) {
                addPath(
                    pathData = parseSvgPathData("M 208.000 104.000 L 208.000 112.000 C 208.000 138.510 186.510 160.000 160.000 160.000 L 136.000 160.000 C 153.673 160.000 168.000 174.327 168.000 192.000 L 168.000 232.000 L 104.000 232.000 L 104.000 192.000 C 104.000 174.327 118.327 160.000 136.000 160.000 L 112.000 160.000 C 85.490 160.000 64.000 138.510 64.000 112.000 L 64.000 104.000 C 64.076 94.259 67.037 84.759 72.510 76.700 C 66.848 62.040 68.132 45.604 76.000 32.000 C 93.748 31.996 110.273 41.044 119.830 56.000 L 152.170 56.000 C 161.727 41.044 178.252 31.996 196.000 32.000 C 203.868 45.604 205.152 62.040 199.490 76.700 C 204.963 84.759 207.924 94.259 208.000 104.000 Z"),
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
                pathData = parseSvgPathData("M 208.300 75.680 C 213.252 59.735 211.304 42.445 202.930 28.000 C 201.501 25.524 198.859 23.999 196.000 24.000 C 177.105 23.960 159.305 32.860 148.000 48.000 L 124.000 48.000 C 112.695 32.860 94.895 23.960 76.000 24.000 C 73.141 23.999 70.499 25.524 69.070 28.000 C 60.697 42.445 58.746 59.733 63.690 75.680 C 58.747 84.307 56.100 94.058 56.000 104.000 L 56.000 112.000 C 56.035 139.990 76.710 163.665 104.440 167.470 C 98.966 174.475 95.995 183.110 96.000 192.000 L 96.000 200.000 L 72.000 200.000 C 58.745 200.000 48.000 189.255 48.000 176.000 C 48.000 153.909 30.091 136.000 8.000 136.000 C 3.582 136.000 0.000 139.582 0.000 144.000 C 0.000 148.418 3.582 152.000 8.000 152.000 C 21.255 152.000 32.000 162.745 32.000 176.000 C 32.000 198.091 49.909 216.000 72.000 216.000 L 96.000 216.000 L 96.000 232.000 C 96.000 236.418 99.582 240.000 104.000 240.000 C 108.418 240.000 112.000 236.418 112.000 232.000 L 112.000 192.000 C 112.000 178.745 122.745 168.000 136.000 168.000 C 149.255 168.000 160.000 178.745 160.000 192.000 L 160.000 232.000 C 160.000 236.418 163.582 240.000 168.000 240.000 C 172.418 240.000 176.000 236.418 176.000 232.000 L 176.000 192.000 C 176.005 183.110 173.034 174.475 167.560 167.470 C 195.290 163.665 215.965 139.990 216.000 112.000 L 216.000 104.000 C 215.904 94.056 213.252 84.304 208.300 75.680 ZM 200.000 112.000 C 200.000 134.091 182.091 152.000 160.000 152.000 L 112.000 152.000 C 89.909 152.000 72.000 134.091 72.000 112.000 L 72.000 104.000 C 72.098 96.000 74.493 88.197 78.900 81.520 C 80.570 79.319 80.986 76.411 80.000 73.830 C 75.791 62.976 76.076 50.894 80.790 40.250 C 94.052 41.677 105.946 49.059 113.110 60.310 C 114.574 62.600 117.102 63.990 119.820 64.000 L 152.170 64.000 C 154.899 64.000 157.440 62.609 158.910 60.310 C 166.073 49.057 177.967 41.675 191.230 40.250 C 195.938 50.896 196.215 62.979 192.000 73.830 C 191.018 76.385 191.394 79.263 193.000 81.480 C 197.448 88.158 199.879 95.977 200.000 104.000 Z"),
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
        return _githubLogo!!
    }

private var _githubLogo: ImageVector? = null
