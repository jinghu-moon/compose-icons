package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.Diamond: ImageVector
    get() {
        if (_diamond != null) return _diamond!!
        _diamond = tablerFilledIcon(
            name = "Diamond",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 18.000 4.000 C 18.305 4.000 18.593 4.139 18.783 4.378 L 18.857 4.486 L 21.857 9.486 C 22.058 9.821 22.045 10.242 21.825 10.564 L 21.745 10.667 L 13.215 20.200 C 12.895 20.526 12.457 20.710 12.000 20.710 C 11.600 20.710 11.215 20.570 10.890 20.293 L 10.755 20.167 L 2.255 10.667 C 1.994 10.376 1.927 9.959 2.083 9.600 L 2.143 9.485 L 5.156 4.463 L 5.220 4.373 C 5.266 4.316 5.318 4.264 5.375 4.219 L 5.464 4.155 L 5.552 4.105 L 5.602 4.082 L 5.662 4.057 L 5.771 4.025 L 5.883 4.005 L 6.000 4.000 L 18.000 4.000 ZM 9.114 7.943 C 8.641 7.660 8.027 7.813 7.743 8.286 L 7.143 9.286 L 7.083 9.402 C 6.927 9.762 6.996 10.181 7.260 10.472 L 9.260 12.672 L 9.350 12.760 C 9.733 13.088 10.300 13.079 10.673 12.740 L 10.760 12.650 C 11.088 12.267 11.079 11.700 10.740 11.327 L 9.239 9.677 L 9.457 9.314 L 9.512 9.211 C 9.720 8.749 9.549 8.204 9.114 7.943 Z"),
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
        return _diamond!!
    }

private var _diamond: ImageVector? = null
