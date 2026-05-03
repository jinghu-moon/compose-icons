package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.BellLine: ImageVector
    get() {
        if (_bellLine != null) return _bellLine!!
        _bellLine = remixIcon(
            name = "BellLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 14.121 9.879 C 18.417 14.174 20.950 18.607 19.778 19.778 C 19.303 20.253 18.292 20.119 16.971 19.506 C 13.746 21.645 9.447 21.487 6.382 19.032 L 6.343 19.071 L 4.929 17.657 L 4.967 17.617 C 2.513 14.552 2.355 10.254 4.495 7.030 C 3.881 5.708 3.747 4.697 4.222 4.222 C 5.350 3.094 9.499 5.399 13.639 9.404 L 14.121 9.879 ZM 12.707 11.293 C 10.823 9.409 8.870 7.842 7.236 6.870 L 7.050 7.050 C 4.557 9.544 4.338 13.450 6.393 16.192 L 8.239 14.346 C 8.061 13.679 8.234 12.938 8.757 12.414 C 9.538 11.633 10.805 11.633 11.586 12.414 C 12.367 13.195 12.367 14.462 11.586 15.243 C 11.063 15.766 10.322 15.939 9.655 15.761 L 7.807 17.607 C 10.549 19.662 14.456 19.443 16.950 16.950 L 17.129 16.762 L 17.076 16.673 C 16.100 15.058 14.556 13.142 12.707 11.293 ZM 19.778 4.222 C 20.559 5.003 20.559 6.269 19.778 7.050 C 19.725 7.103 19.670 7.152 19.614 7.198 C 21.206 9.715 21.427 12.852 20.276 15.543 C 19.899 14.806 19.435 14.032 18.890 13.237 C 19.279 11.060 18.633 8.733 16.950 7.050 C 15.267 5.367 12.940 4.720 10.763 5.110 C 9.968 4.565 9.193 4.100 8.457 3.724 C 11.148 2.573 14.285 2.794 16.804 4.387 C 16.848 4.330 16.897 4.275 16.950 4.222 C 17.731 3.441 18.997 3.441 19.778 4.222 Z"),
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
        return _bellLine!!
    }

private var _bellLine: ImageVector? = null
