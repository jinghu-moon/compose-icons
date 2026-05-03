package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Receipt: ImageVector
    get() {
        if (_receipt != null) return _receipt!!
        _receipt = phosphorFillIcon(
            name = "Receipt",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 216.000 40.000 L 40.000 40.000 C 31.163 40.000 24.000 47.163 24.000 56.000 L 24.000 208.000 C 24.001 210.772 25.438 213.346 27.797 214.803 C 30.156 216.259 33.101 216.391 35.580 215.150 L 64.000 200.940 L 92.420 215.150 C 94.673 216.278 97.327 216.278 99.580 215.150 L 128.000 200.940 L 156.420 215.150 C 158.673 216.278 161.327 216.278 163.580 215.150 L 192.000 200.940 L 220.420 215.150 C 222.899 216.391 225.844 216.259 228.203 214.803 C 230.562 213.346 231.999 210.772 232.000 208.000 L 232.000 56.000 C 232.000 47.163 224.837 40.000 216.000 40.000 ZM 176.000 144.000 L 80.000 144.000 C 75.582 144.000 72.000 140.418 72.000 136.000 C 72.000 131.582 75.582 128.000 80.000 128.000 L 176.000 128.000 C 180.418 128.000 184.000 131.582 184.000 136.000 C 184.000 140.418 180.418 144.000 176.000 144.000 ZM 176.000 112.000 L 80.000 112.000 C 75.582 112.000 72.000 108.418 72.000 104.000 C 72.000 99.582 75.582 96.000 80.000 96.000 L 176.000 96.000 C 180.418 96.000 184.000 99.582 184.000 104.000 C 184.000 108.418 180.418 112.000 176.000 112.000 Z"),
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
        return _receipt!!
    }

private var _receipt: ImageVector? = null
