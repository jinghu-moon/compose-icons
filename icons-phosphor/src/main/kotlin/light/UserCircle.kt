package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.UserCircle: ImageVector
    get() {
        if (_userCircle != null) return _userCircle!!
        _userCircle = phosphorLightIcon(
            name = "UserCircle",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 128.000 26.000 C 71.667 26.000 26.000 71.667 26.000 128.000 C 26.000 184.333 71.667 230.000 128.000 230.000 C 184.333 230.000 230.000 184.333 230.000 128.000 C 229.934 71.694 184.306 26.066 128.000 26.000 ZM 71.440 198.000 C 83.376 178.153 104.841 166.014 128.000 166.014 C 151.159 166.014 172.624 178.153 184.560 198.000 C 151.592 224.734 104.408 224.734 71.440 198.000 ZM 94.000 120.000 C 94.000 101.222 109.222 86.000 128.000 86.000 C 146.778 86.000 162.000 101.222 162.000 120.000 C 162.000 138.778 146.778 154.000 128.000 154.000 C 109.222 154.000 94.000 138.778 94.000 120.000 ZM 193.510 189.640 C 184.083 174.981 169.991 163.927 153.510 158.260 C 170.384 147.021 177.910 126.060 172.039 106.654 C 166.168 87.249 148.284 73.975 128.010 73.975 C 107.736 73.975 89.852 87.249 83.981 106.654 C 78.110 126.060 85.636 147.021 102.510 158.260 C 86.029 163.927 71.937 174.981 62.510 189.640 C 28.897 153.970 30.005 97.963 65.003 63.651 C 100.001 29.339 156.019 29.339 191.017 63.651 C 226.015 97.963 227.123 153.970 193.510 189.640 Z"),
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
        return _userCircle!!
    }

private var _userCircle: ImageVector? = null
