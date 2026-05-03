package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Notches: ImageVector
    get() {
        if (_notches != null) return _notches!!
        _notches = phosphorBoldIcon(
            name = "Notches",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 216.490 136.490 L 136.490 216.490 C 131.796 221.184 124.184 221.184 119.490 216.490 C 114.796 211.796 114.796 204.184 119.490 199.490 L 199.490 119.490 C 204.184 114.796 211.796 114.796 216.490 119.490 C 221.184 124.184 221.184 131.796 216.490 136.490 ZM 200.490 31.490 C 198.238 29.231 195.180 27.961 191.990 27.961 C 188.800 27.961 185.742 29.231 183.490 31.490 L 31.490 183.490 C 26.796 188.184 26.796 195.796 31.490 200.490 C 36.184 205.184 43.796 205.184 48.490 200.490 L 200.490 48.490 C 202.743 46.239 204.009 43.185 204.009 40.000 C 204.009 36.815 202.743 33.761 200.490 31.510 Z"),
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
        return _notches!!
    }

private var _notches: ImageVector? = null
