package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.CallBell: ImageVector
    get() {
        if (_callBell != null) return _callBell!!
        _callBell = phosphorFillIcon(
            name = "CallBell",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 16.000 176.000 C 16.000 171.582 19.582 168.000 24.000 168.000 L 32.000 168.000 L 32.000 152.000 C 32.060 102.107 70.285 60.555 120.000 56.340 L 120.000 40.000 L 104.000 40.000 C 99.582 40.000 96.000 36.418 96.000 32.000 C 96.000 27.582 99.582 24.000 104.000 24.000 L 152.000 24.000 C 156.418 24.000 160.000 27.582 160.000 32.000 C 160.000 36.418 156.418 40.000 152.000 40.000 L 136.000 40.000 L 136.000 56.340 C 185.715 60.555 223.940 102.107 224.000 152.000 L 224.000 168.000 L 232.000 168.000 C 236.418 168.000 240.000 171.582 240.000 176.000 C 240.000 180.418 236.418 184.000 232.000 184.000 L 24.000 184.000 C 19.582 184.000 16.000 180.418 16.000 176.000 ZM 232.000 200.000 L 24.000 200.000 C 19.582 200.000 16.000 203.582 16.000 208.000 C 16.000 212.418 19.582 216.000 24.000 216.000 L 232.000 216.000 C 236.418 216.000 240.000 212.418 240.000 208.000 C 240.000 203.582 236.418 200.000 232.000 200.000 Z"),
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
        return _callBell!!
    }

private var _callBell: ImageVector? = null
