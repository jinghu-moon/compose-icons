package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.Receipt: ImageVector
    get() {
        if (_receipt != null) return _receipt!!
        _receipt = phosphorRegularIcon(
            name = "Receipt",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 72.000 104.000 C 72.000 99.582 75.582 96.000 80.000 96.000 L 176.000 96.000 C 180.418 96.000 184.000 99.582 184.000 104.000 C 184.000 108.418 180.418 112.000 176.000 112.000 L 80.000 112.000 C 75.582 112.000 72.000 108.418 72.000 104.000 ZM 80.000 144.000 L 176.000 144.000 C 180.418 144.000 184.000 140.418 184.000 136.000 C 184.000 131.582 180.418 128.000 176.000 128.000 L 80.000 128.000 C 75.582 128.000 72.000 131.582 72.000 136.000 C 72.000 140.418 75.582 144.000 80.000 144.000 ZM 232.000 56.000 L 232.000 208.000 C 231.999 210.772 230.562 213.346 228.203 214.803 C 225.844 216.259 222.899 216.391 220.420 215.150 L 192.000 200.940 L 163.580 215.150 C 161.327 216.278 158.673 216.278 156.420 215.150 L 128.000 200.940 L 99.580 215.150 C 97.327 216.278 94.673 216.278 92.420 215.150 L 64.000 200.940 L 35.580 215.150 C 33.101 216.391 30.156 216.259 27.797 214.803 C 25.438 213.346 24.001 210.772 24.000 208.000 L 24.000 56.000 C 24.000 47.163 31.163 40.000 40.000 40.000 L 216.000 40.000 C 224.837 40.000 232.000 47.163 232.000 56.000 ZM 216.000 56.000 L 40.000 56.000 L 40.000 195.060 L 60.420 184.840 C 62.673 183.712 65.327 183.712 67.580 184.840 L 96.000 199.060 L 124.420 184.840 C 126.673 183.712 129.327 183.712 131.580 184.840 L 160.000 199.060 L 188.420 184.840 C 190.673 183.712 193.327 183.712 195.580 184.840 L 216.000 195.060 Z"),
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
        return _receipt!!
    }

private var _receipt: ImageVector? = null
