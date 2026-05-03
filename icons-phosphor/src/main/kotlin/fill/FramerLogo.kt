package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.FramerLogo: ImageVector
    get() {
        if (_framerLogo != null) return _framerLogo!!
        _framerLogo = phosphorFillIcon(
            name = "FramerLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 200.000 112.000 L 149.000 112.000 L 205.270 162.000 C 207.762 164.198 208.636 167.708 207.466 170.818 C 206.295 173.929 203.323 175.991 200.000 176.000 L 136.000 176.000 L 136.000 240.000 C 136.003 243.238 134.053 246.158 131.062 247.397 C 128.071 248.636 124.628 247.951 122.340 245.660 L 50.340 173.660 C 48.840 172.158 47.998 170.122 48.000 168.000 L 48.000 104.000 C 48.000 99.582 51.582 96.000 56.000 96.000 L 107.000 96.000 L 50.690 46.000 C 48.192 43.797 47.320 40.277 48.501 37.163 C 49.683 34.049 52.669 31.992 56.000 32.000 L 200.000 32.000 C 204.418 32.000 208.000 35.582 208.000 40.000 L 208.000 104.000 C 208.000 108.418 204.418 112.000 200.000 112.000 Z"),
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
