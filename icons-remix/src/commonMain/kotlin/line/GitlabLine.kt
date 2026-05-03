package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.GitlabLine: ImageVector
    get() {
        if (_gitlabLine != null) return _gitlabLine!!
        _gitlabLine = remixIcon(
            name = "GitlabLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 5.544 2.673 C 5.816 2.500 6.136 2.416 6.458 2.433 C 6.781 2.451 7.091 2.568 7.343 2.770 L 7.344 2.771 C 7.590 2.969 7.770 3.237 7.859 3.540 L 9.305 7.968 L 14.694 7.968 L 16.141 3.540 C 16.230 3.237 16.409 2.969 16.656 2.771 L 16.660 2.767 C 16.913 2.568 17.221 2.451 17.542 2.434 C 17.864 2.417 18.183 2.500 18.455 2.672 L 18.457 2.673 C 18.731 2.847 18.943 3.103 19.062 3.405 L 19.066 3.415 L 21.539 9.866 C 21.962 10.971 22.014 12.184 21.687 13.321 C 21.359 14.457 20.671 15.457 19.726 16.169 L 12.995 21.233 L 12.995 21.234 C 12.707 21.451 12.355 21.569 11.994 21.569 C 11.633 21.569 11.282 21.451 10.994 21.234 L 4.263 16.168 C 3.321 15.456 2.635 14.457 2.310 13.322 C 1.984 12.187 2.036 10.977 2.457 9.874 L 4.937 3.405 C 5.057 3.103 5.270 2.847 5.544 2.673 ZM 6.355 4.736 L 4.160 10.464 C 3.880 11.201 3.823 12.068 4.040 12.826 C 4.257 13.581 4.711 14.246 5.335 14.722 L 11.994 19.733 L 18.648 14.726 C 19.279 14.250 19.738 13.582 19.956 12.823 C 20.175 12.062 20.115 11.185 19.833 10.446 L 17.644 4.736 L 16.000 9.768 L 8.000 9.768 L 6.355 4.736 Z"),
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
        return _gitlabLine!!
    }

private var _gitlabLine: ImageVector? = null
