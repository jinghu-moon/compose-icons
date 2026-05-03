package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.CassetteTape: ImageVector
    get() {
        if (_cassetteTape != null) return _cassetteTape!!
        _cassetteTape = phosphorBoldIcon(
            name = "CassetteTape",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(224.0f, 44.0f),
                    PathNode.LineTo(32.0f, 44.0f),
                    PathNode.CurveTo(20.954306f, 44.0f, 12.0f, 52.954304f, 12.0f, 64.0f),
                    PathNode.LineTo(12.0f, 192.0f),
                    PathNode.CurveTo(12.0f, 203.0457f, 20.954306f, 212.0f, 32.0f, 212.0f),
                    PathNode.LineTo(224.0f, 212.0f),
                    PathNode.CurveTo(235.0457f, 212.0f, 244.0f, 203.0457f, 244.0f, 192.0f),
                    PathNode.LineTo(244.0f, 64.0f),
                    PathNode.CurveTo(244.0f, 52.954304f, 235.0457f, 44.0f, 224.0f, 44.0f),
                    PathNode.Close,
                    PathNode.MoveTo(220.0f, 188.0f),
                    PathNode.LineTo(183.0f, 188.0f),
                    PathNode.LineTo(170.4f, 171.2f),
                    PathNode.CurveTo(168.88918f, 169.18555f, 166.51805f, 168.0f, 164.0f, 168.0f),
                    PathNode.LineTo(92.0f, 168.0f),
                    PathNode.CurveTo(89.48194f, 168.0f, 87.11083f, 169.18555f, 85.6f, 171.2f),
                    PathNode.LineTo(73.0f, 188.0f),
                    PathNode.LineTo(36.0f, 188.0f),
                    PathNode.LineTo(36.0f, 68.0f),
                    PathNode.LineTo(220.0f, 68.0f),
                    PathNode.Close,
                    PathNode.MoveTo(82.0f, 152.0f),
                    PathNode.LineTo(174.0f, 152.0f),
                    PathNode.CurveTo(192.77768f, 152.0f, 208.0f, 136.77768f, 208.0f, 118.0f),
                    PathNode.CurveTo(208.0f, 99.22232f, 192.77768f, 84.0f, 174.0f, 84.0f),
                    PathNode.LineTo(82.0f, 84.0f),
                    PathNode.CurveTo(63.222317f, 84.0f, 48.0f, 99.22232f, 48.0f, 118.0f),
                    PathNode.CurveTo(48.0f, 136.77768f, 63.222317f, 152.0f, 82.0f, 152.0f),
                    PathNode.Close,
                    PathNode.MoveTo(82.0f, 108.0f),
                    PathNode.CurveTo(87.52285f, 108.0f, 92.0f, 112.47715f, 92.0f, 118.0f),
                    PathNode.CurveTo(92.0f, 123.52285f, 87.52285f, 128.0f, 82.0f, 128.0f),
                    PathNode.CurveTo(76.47715f, 128.0f, 72.0f, 123.52285f, 72.0f, 118.0f),
                    PathNode.CurveTo(72.0f, 112.47715f, 76.47715f, 108.0f, 82.0f, 108.0f),
                    PathNode.Close,
                    PathNode.MoveTo(184.0f, 118.0f),
                    PathNode.CurveTo(184.0f, 123.52285f, 179.52284f, 128.0f, 174.0f, 128.0f),
                    PathNode.CurveTo(168.47716f, 128.0f, 164.0f, 123.52285f, 164.0f, 118.0f),
                    PathNode.CurveTo(164.0f, 112.47715f, 168.47716f, 108.0f, 174.0f, 108.0f),
                    PathNode.CurveTo(179.52284f, 108.0f, 184.0f, 112.47715f, 184.0f, 118.0f),
                    PathNode.Close,
                    PathNode.MoveTo(141.5f, 128.0f),
                    PathNode.LineTo(114.5f, 128.0f),
                    PathNode.CurveTo(116.500206f, 121.48336f, 116.500206f, 114.51664f, 114.5f, 108.0f),
                    PathNode.LineTo(141.5f, 108.0f),
                    PathNode.CurveTo(139.4998f, 114.51664f, 139.4998f, 121.48336f, 141.5f, 128.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 24.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _cassetteTape!!
    }

private var _cassetteTape: ImageVector? = null
