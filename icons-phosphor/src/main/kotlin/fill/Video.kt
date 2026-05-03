package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Video: ImageVector
    get() {
        if (_video != null) return _video!!
        _video = phosphorFillIcon(
            name = "Video",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 232.000 208.000 C 232.000 212.418 228.418 216.000 224.000 216.000 L 32.000 216.000 C 27.582 216.000 24.000 212.418 24.000 208.000 C 24.000 203.582 27.582 200.000 32.000 200.000 L 224.000 200.000 C 228.418 200.000 232.000 203.582 232.000 208.000 ZM 232.000 56.000 L 232.000 168.000 C 232.000 176.837 224.837 184.000 216.000 184.000 L 40.000 184.000 C 31.163 184.000 24.000 176.837 24.000 168.000 L 24.000 56.000 C 24.000 47.163 31.163 40.000 40.000 40.000 L 216.000 40.000 C 224.837 40.000 232.000 47.163 232.000 56.000 ZM 164.000 112.000 C 163.999 109.391 162.727 106.947 160.590 105.450 L 120.590 77.450 C 118.147 75.738 114.954 75.528 112.308 76.905 C 109.661 78.282 108.001 81.017 108.000 84.000 L 108.000 140.000 C 108.001 142.983 109.661 145.718 112.308 147.095 C 114.954 148.472 118.147 148.262 120.590 146.550 L 160.590 118.550 C 162.727 117.053 163.999 114.609 164.000 112.000 Z"),
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
        return _video!!
    }

private var _video: ImageVector? = null
