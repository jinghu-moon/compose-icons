package composeicons.radix.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.radix.RadixIcons
import composeicons.radix.radixIcon

val RadixIcons.Regular.GithubLogo: ImageVector
    get() {
        if (_githubLogo != null) return _githubLogo!!
        _githubLogo = radixIcon(
            name = "GithubLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 15.0f, height = 15.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 7.499 0.250 C 11.503 0.250 14.750 3.496 14.750 7.500 C 14.750 10.702 12.675 13.418 9.796 14.379 C 9.429 14.450 9.298 14.224 9.298 14.030 C 9.298 13.793 9.307 13.010 9.307 12.041 C 9.307 11.365 9.074 10.922 8.814 10.698 C 10.429 10.519 12.125 9.906 12.125 7.121 C 12.125 6.329 11.844 5.683 11.380 5.176 C 11.454 4.992 11.702 4.255 11.307 3.257 C 11.292 3.252 10.682 3.074 9.315 4.000 C 8.736 3.839 8.116 3.759 7.500 3.756 C 6.884 3.759 6.264 3.839 5.686 4.000 C 4.300 3.062 3.691 3.257 3.691 3.257 C 3.297 4.255 3.545 4.992 3.620 5.176 C 3.157 5.683 2.874 6.329 2.874 7.121 C 2.874 9.899 4.567 10.521 6.177 10.704 C 5.970 10.885 5.783 11.205 5.717 11.673 C 5.304 11.858 4.253 12.179 3.606 11.071 C 3.606 11.071 3.224 10.376 2.496 10.324 C 2.496 10.324 1.788 10.315 2.446 10.765 C 2.461 10.771 2.926 11.001 3.251 11.825 C 3.256 11.840 3.688 13.232 5.693 12.797 C 5.697 13.402 5.703 13.858 5.703 14.030 C 5.703 14.222 5.571 14.446 5.208 14.380 C 2.327 13.421 0.250 10.703 0.250 7.500 C 0.250 3.496 3.496 0.250 7.499 0.250 Z"),
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
        return _githubLogo!!
    }

private var _githubLogo: ImageVector? = null
