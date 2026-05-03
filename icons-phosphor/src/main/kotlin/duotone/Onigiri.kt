package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.Onigiri: ImageVector
    get() {
        if (_onigiri != null) return _onigiri!!
        _onigiri = phosphorDuotoneIcon(
            name = "Onigiri",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    group(
        groupAlpha = 0.20000000298023224f,
    ) {
        addPath(
            pathData = parseSvgPathData("M 168.000 168.000 L 168.000 224.000 L 88.000 224.000 L 88.000 168.000 C 88.000 163.582 91.582 160.000 96.000 160.000 L 160.000 160.000 C 164.418 160.000 168.000 163.582 168.000 168.000 Z"),
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
    addPath(
        pathData = parseSvgPathData("M 231.530 146.570 L 175.680 50.660 L 175.570 50.470 C 165.353 34.021 147.363 24.018 128.000 24.018 C 108.637 24.018 90.647 34.021 80.430 50.470 L 80.320 50.660 L 24.470 146.570 C 13.801 163.841 13.315 185.534 23.199 203.266 C 33.083 220.997 51.789 231.992 72.090 232.000 L 183.910 232.000 C 204.211 231.992 222.917 220.997 232.801 203.266 C 242.685 185.534 242.199 163.841 231.530 146.570 ZM 160.000 216.000 L 96.000 216.000 L 96.000 168.000 L 160.000 168.000 ZM 218.860 195.450 C 211.884 208.214 198.456 216.110 183.910 216.000 L 176.000 216.000 L 176.000 168.000 C 176.000 159.163 168.837 152.000 160.000 152.000 L 96.000 152.000 C 87.163 152.000 80.000 159.163 80.000 168.000 L 80.000 216.000 L 72.090 216.000 C 57.570 216.004 44.188 208.140 37.127 195.452 C 30.066 182.765 30.434 167.248 38.090 154.910 C 38.130 154.845 38.167 154.779 38.200 154.710 L 94.050 58.810 C 101.360 47.115 114.178 40.010 127.970 40.010 C 141.762 40.010 154.580 47.115 161.890 58.810 L 217.740 154.710 C 217.773 154.779 217.810 154.845 217.850 154.910 C 225.624 167.208 226.008 182.784 218.850 195.450 Z"),
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
        return _onigiri!!
    }

private var _onigiri: ImageVector? = null
