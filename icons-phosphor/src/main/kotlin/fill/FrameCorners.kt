package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.FrameCorners: ImageVector
    get() {
        if (_frameCorners != null) return _frameCorners!!
        _frameCorners = phosphorFillIcon(
            name = "FrameCorners",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 216.000 40.000 L 40.000 40.000 C 31.163 40.000 24.000 47.163 24.000 56.000 L 24.000 200.000 C 24.000 208.837 31.163 216.000 40.000 216.000 L 216.000 216.000 C 224.837 216.000 232.000 208.837 232.000 200.000 L 232.000 56.000 C 232.000 47.163 224.837 40.000 216.000 40.000 ZM 88.000 192.000 L 56.000 192.000 C 51.582 192.000 48.000 188.418 48.000 184.000 L 48.000 152.000 C 48.000 147.582 51.582 144.000 56.000 144.000 C 60.418 144.000 64.000 147.582 64.000 152.000 L 64.000 176.000 L 88.000 176.000 C 92.418 176.000 96.000 179.582 96.000 184.000 C 96.000 188.418 92.418 192.000 88.000 192.000 ZM 208.000 104.000 C 208.000 108.418 204.418 112.000 200.000 112.000 C 195.582 112.000 192.000 108.418 192.000 104.000 L 192.000 80.000 L 168.000 80.000 C 163.582 80.000 160.000 76.418 160.000 72.000 C 160.000 67.582 163.582 64.000 168.000 64.000 L 200.000 64.000 C 204.418 64.000 208.000 67.582 208.000 72.000 Z"),
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
        return _frameCorners!!
    }

private var _frameCorners: ImageVector? = null
