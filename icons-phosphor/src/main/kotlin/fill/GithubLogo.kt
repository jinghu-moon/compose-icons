package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.GithubLogo: ImageVector
    get() {
        if (_githubLogo != null) return _githubLogo!!
        _githubLogo = phosphorFillIcon(
            name = "GithubLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 216.000 104.000 L 216.000 112.000 C 215.965 139.990 195.290 163.665 167.560 167.470 C 173.034 174.475 176.005 183.110 176.000 192.000 L 176.000 232.000 C 176.000 236.418 172.418 240.000 168.000 240.000 L 104.000 240.000 C 99.582 240.000 96.000 236.418 96.000 232.000 L 96.000 216.000 L 72.000 216.000 C 49.909 216.000 32.000 198.091 32.000 176.000 C 32.000 162.745 21.255 152.000 8.000 152.000 C 3.582 152.000 0.000 148.418 0.000 144.000 C 0.000 139.582 3.582 136.000 8.000 136.000 C 30.091 136.000 48.000 153.909 48.000 176.000 C 48.000 189.255 58.745 200.000 72.000 200.000 L 96.000 200.000 L 96.000 192.000 C 95.995 183.110 98.966 174.475 104.440 167.470 C 76.710 163.665 56.035 139.990 56.000 112.000 L 56.000 104.000 C 56.100 94.058 58.747 84.307 63.690 75.680 C 58.746 59.733 60.697 42.445 69.070 28.000 C 70.499 25.524 73.141 23.999 76.000 24.000 C 94.895 23.960 112.695 32.860 124.000 48.000 L 148.000 48.000 C 159.305 32.860 177.105 23.960 196.000 24.000 C 198.859 23.999 201.501 25.524 202.930 28.000 C 211.304 42.445 213.252 59.735 208.300 75.680 C 213.252 84.304 215.904 94.056 216.000 104.000 Z"),
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
