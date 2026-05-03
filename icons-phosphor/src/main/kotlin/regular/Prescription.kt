package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.Prescription: ImageVector
    get() {
        if (_prescription != null) return _prescription!!
        _prescription = phosphorRegularIcon(
            name = "Prescription",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 183.310 188.000 L 205.660 165.660 C 208.786 162.534 208.786 157.466 205.660 154.340 C 202.534 151.214 197.466 151.214 194.340 154.340 L 172.000 176.690 L 130.850 135.530 C 157.941 131.863 177.567 107.845 175.762 80.567 C 173.957 53.288 151.338 32.065 124.000 32.000 L 72.000 32.000 C 67.582 32.000 64.000 35.582 64.000 40.000 L 64.000 192.000 C 64.000 196.418 67.582 200.000 72.000 200.000 C 76.418 200.000 80.000 196.418 80.000 192.000 L 80.000 136.000 L 108.690 136.000 L 160.690 188.000 L 138.340 210.340 C 135.214 213.466 135.214 218.534 138.340 221.660 C 141.466 224.786 146.534 224.786 149.660 221.660 L 172.000 199.310 L 194.340 221.660 C 197.466 224.786 202.534 224.786 205.660 221.660 C 208.786 218.534 208.786 213.466 205.660 210.340 ZM 80.000 48.000 L 124.000 48.000 C 143.882 48.000 160.000 64.118 160.000 84.000 C 160.000 103.882 143.882 120.000 124.000 120.000 L 80.000 120.000 Z"),
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
        return _prescription!!
    }

private var _prescription: ImageVector? = null
