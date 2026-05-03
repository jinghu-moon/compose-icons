package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.FramerLogo: ImageVector
    get() {
        if (_framerLogo != null) return _framerLogo!!
        _framerLogo = phosphorRegularIcon(
            name = "FramerLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 208.000 104.000 L 208.000 40.000 C 208.000 35.582 204.418 32.000 200.000 32.000 L 56.000 32.000 C 52.669 31.992 49.683 34.049 48.501 37.163 C 47.320 40.277 48.192 43.797 50.690 46.000 L 107.000 96.000 L 56.000 96.000 C 51.582 96.000 48.000 99.582 48.000 104.000 L 48.000 168.000 C 47.998 170.122 48.840 172.158 50.340 173.660 L 122.340 245.660 C 124.628 247.951 128.071 248.636 131.062 247.397 C 134.053 246.158 136.003 243.238 136.000 240.000 L 136.000 176.000 L 200.000 176.000 C 203.331 176.008 206.317 173.951 207.499 170.837 C 208.680 167.723 207.808 164.203 205.310 162.000 L 149.000 112.000 L 200.000 112.000 C 204.418 112.000 208.000 108.418 208.000 104.000 ZM 179.000 160.000 L 128.000 160.000 C 123.582 160.000 120.000 163.582 120.000 168.000 L 120.000 220.690 L 64.000 164.690 L 64.000 112.000 L 125.000 112.000 ZM 192.000 96.000 L 131.000 96.000 L 77.000 48.000 L 192.000 48.000 Z"),
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
        return _framerLogo!!
    }

private var _framerLogo: ImageVector? = null
