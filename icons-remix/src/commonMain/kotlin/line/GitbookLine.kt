package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.GitbookLine: ImageVector
    get() {
        if (_gitbookLine != null) return _gitbookLine!!
        _gitbookLine = remixIcon(
            name = "GitbookLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 11.979 2.638 C 12.295 2.453 12.686 2.454 12.999 2.642 L 20.512 7.137 C 20.813 7.317 20.998 7.643 20.998 7.995 C 20.998 8.347 20.813 8.672 20.512 8.853 L 12.999 13.348 C 12.683 13.537 12.289 13.537 11.973 13.348 L 7.820 10.863 C 6.625 10.177 5.100 10.587 4.410 11.781 C 4.279 12.008 4.188 12.245 4.134 12.484 C 4.046 12.876 4.107 13.457 4.394 14.101 C 4.465 14.260 4.545 14.416 4.635 14.567 C 4.954 15.100 5.407 15.602 5.975 15.989 C 6.067 16.052 6.161 16.112 6.259 16.168 L 6.267 16.172 L 11.469 19.224 C 12.097 19.592 12.876 19.592 13.504 19.224 L 20.000 15.412 L 20.000 13.509 L 13.001 17.717 C 12.686 17.906 12.291 17.908 11.975 17.720 L 6.227 14.302 C 5.752 14.019 5.596 13.406 5.878 12.932 C 6.160 12.457 6.774 12.301 7.249 12.583 L 12.483 15.694 L 20.484 10.884 C 20.793 10.698 21.178 10.693 21.492 10.870 C 21.806 11.047 22.000 11.380 22.000 11.740 L 22.000 15.985 C 22.000 16.340 21.812 16.669 21.506 16.849 L 14.516 20.949 C 13.263 21.684 11.709 21.684 10.456 20.949 L 5.254 17.897 C 5.126 17.823 5.001 17.745 4.880 17.664 L 4.843 17.639 C 4.758 17.581 4.676 17.521 4.596 17.460 C 3.945 16.972 3.409 16.378 2.995 15.718 C 2.962 15.666 2.931 15.614 2.900 15.561 C 2.871 15.511 2.842 15.461 2.813 15.410 C 2.781 15.351 2.747 15.292 2.717 15.232 C 2.707 15.213 2.699 15.193 2.689 15.174 C 2.652 15.099 2.617 15.022 2.582 14.945 C 2.558 14.892 2.534 14.840 2.512 14.786 C 2.177 13.990 2.000 13.133 2.000 12.266 C 2.000 11.166 2.281 10.052 2.870 9.033 C 3.505 7.925 4.462 7.047 5.531 6.420 L 11.979 2.638 ZM 6.543 8.146 C 6.315 8.279 6.099 8.426 5.896 8.583 C 6.800 8.444 7.753 8.579 8.621 9.023 L 8.825 9.134 L 8.838 9.142 L 12.485 11.324 L 18.051 7.994 L 12.481 4.662 L 6.543 8.146 Z"),
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
        return _gitbookLine!!
    }

private var _gitbookLine: ImageVector? = null
