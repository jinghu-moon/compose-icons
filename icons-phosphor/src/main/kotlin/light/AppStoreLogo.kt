package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.AppStoreLogo: ImageVector
    get() {
        if (_appStoreLogo != null) return _appStoreLogo!!
        _appStoreLogo = phosphorLightIcon(
            name = "AppStoreLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 62.620 195.050 L 53.170 211.050 C 51.409 213.696 47.889 214.509 45.145 212.904 C 42.401 211.299 41.386 207.832 42.830 205.000 L 52.290 189.000 C 53.352 187.099 55.361 185.923 57.539 185.927 C 59.716 185.932 61.721 187.115 62.776 189.020 C 63.831 190.925 63.771 193.252 62.620 195.100 ZM 232.000 154.000 L 183.060 154.000 L 151.750 101.000 C 150.063 98.147 146.383 97.203 143.530 98.890 C 140.677 100.577 139.733 104.257 141.420 107.110 L 202.830 211.040 C 204.514 213.895 208.195 214.844 211.050 213.160 C 213.905 211.476 214.854 207.795 213.170 204.940 L 190.170 165.990 L 232.000 165.990 C 235.314 165.990 238.000 163.304 238.000 159.990 C 238.000 156.676 235.314 153.990 232.000 153.990 ZM 142.470 154.000 L 86.880 154.000 L 157.170 35.050 C 158.614 32.218 157.599 28.751 154.855 27.146 C 152.111 25.541 148.591 26.354 146.830 29.000 L 128.000 60.820 L 109.170 29.000 C 107.486 26.145 103.805 25.196 100.950 26.880 C 98.095 28.564 97.146 32.245 98.830 35.100 L 121.000 72.620 L 72.940 154.000 L 24.000 154.000 C 20.686 154.000 18.000 156.686 18.000 160.000 C 18.000 163.314 20.686 166.000 24.000 166.000 L 142.470 166.000 C 145.784 166.000 148.470 163.314 148.470 160.000 C 148.470 156.686 145.784 154.000 142.470 154.000 Z"),
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
        return _appStoreLogo!!
    }

private var _appStoreLogo: ImageVector? = null
