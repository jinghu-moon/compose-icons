package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.Memory: ImageVector
    get() {
        if (_memory != null) return _memory!!
        _memory = phosphorRegularIcon(
            name = "Memory",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 232.000 56.000 L 24.000 56.000 C 15.163 56.000 8.000 63.163 8.000 72.000 L 8.000 200.000 C 8.000 204.418 11.582 208.000 16.000 208.000 C 20.418 208.000 24.000 204.418 24.000 200.000 L 24.000 184.000 L 40.000 184.000 L 40.000 200.000 C 40.000 204.418 43.582 208.000 48.000 208.000 C 52.418 208.000 56.000 204.418 56.000 200.000 L 56.000 184.000 L 72.000 184.000 L 72.000 200.000 C 72.000 204.418 75.582 208.000 80.000 208.000 C 84.418 208.000 88.000 204.418 88.000 200.000 L 88.000 184.000 L 104.000 184.000 L 104.000 200.000 C 104.000 204.418 107.582 208.000 112.000 208.000 C 116.418 208.000 120.000 204.418 120.000 200.000 L 120.000 184.000 L 136.000 184.000 L 136.000 200.000 C 136.000 204.418 139.582 208.000 144.000 208.000 C 148.418 208.000 152.000 204.418 152.000 200.000 L 152.000 184.000 L 168.000 184.000 L 168.000 200.000 C 168.000 204.418 171.582 208.000 176.000 208.000 C 180.418 208.000 184.000 204.418 184.000 200.000 L 184.000 184.000 L 200.000 184.000 L 200.000 200.000 C 200.000 204.418 203.582 208.000 208.000 208.000 C 212.418 208.000 216.000 204.418 216.000 200.000 L 216.000 184.000 L 232.000 184.000 L 232.000 200.000 C 232.000 204.418 235.582 208.000 240.000 208.000 C 244.418 208.000 248.000 204.418 248.000 200.000 L 248.000 72.000 C 248.000 63.163 240.837 56.000 232.000 56.000 ZM 24.000 72.000 L 232.000 72.000 L 232.000 168.000 L 24.000 168.000 ZM 112.000 152.000 C 116.418 152.000 120.000 148.418 120.000 144.000 L 120.000 96.000 C 120.000 91.582 116.418 88.000 112.000 88.000 L 48.000 88.000 C 43.582 88.000 40.000 91.582 40.000 96.000 L 40.000 144.000 C 40.000 148.418 43.582 152.000 48.000 152.000 ZM 56.000 104.000 L 104.000 104.000 L 104.000 136.000 L 56.000 136.000 ZM 144.000 152.000 L 208.000 152.000 C 212.418 152.000 216.000 148.418 216.000 144.000 L 216.000 96.000 C 216.000 91.582 212.418 88.000 208.000 88.000 L 144.000 88.000 C 139.582 88.000 136.000 91.582 136.000 96.000 L 136.000 144.000 C 136.000 148.418 139.582 152.000 144.000 152.000 ZM 152.000 104.000 L 200.000 104.000 L 200.000 136.000 L 152.000 136.000 Z"),
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
        return _memory!!
    }

private var _memory: ImageVector? = null
