package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Toilet: ImageVector
    get() {
        if (_toilet != null) return _toilet!!
        _toilet = phosphorBoldIcon(
            name = "Toilet",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(128.0f, 68.0f),
                    PathNode.CurveTo(128.0f, 74.62742f, 122.62742f, 80.0f, 116.0f, 80.0f),
                    PathNode.LineTo(100.0f, 80.0f),
                    PathNode.CurveTo(93.37258f, 80.0f, 88.0f, 74.62742f, 88.0f, 68.0f),
                    PathNode.CurveTo(88.0f, 61.37258f, 93.37258f, 56.0f, 100.0f, 56.0f),
                    PathNode.LineTo(116.0f, 56.0f),
                    PathNode.CurveTo(122.62742f, 56.0f, 128.0f, 61.37258f, 128.0f, 68.0f),
                    PathNode.Close,
                    PathNode.MoveTo(176.15f, 195.62f),
                    PathNode.LineTo(179.8f, 221.17f),
                    PathNode.CurveTo(180.62047f, 226.90997f, 178.90945f, 232.72351f, 175.11043f, 237.1039f),
                    PathNode.CurveTo(171.3114f, 241.4843f, 165.79832f, 244.00035f, 160.0f, 244.0f),
                    PathNode.LineTo(96.0f, 244.0f),
                    PathNode.CurveTo(90.20168f, 244.00035f, 84.6886f, 241.4843f, 80.88958f, 237.1039f),
                    PathNode.CurveTo(77.09054f, 232.72351f, 75.37954f, 226.90997f, 76.2f, 221.17f),
                    PathNode.LineTo(79.85f, 195.62f),
                    PathNode.CurveTo(47.891937f, 178.04329f, 28.026217f, 144.4727f, 28.0f, 108.0f),
                    PathNode.CurveTo(28.0f, 101.37258f, 33.37258f, 96.0f, 40.0f, 96.0f),
                    PathNode.LineTo(52.0f, 96.0f),
                    PathNode.LineTo(52.0f, 40.0f),
                    PathNode.CurveTo(52.0f, 28.954306f, 60.954304f, 20.0f, 72.0f, 20.0f),
                    PathNode.LineTo(184.0f, 20.0f),
                    PathNode.CurveTo(195.0457f, 20.0f, 204.0f, 28.954306f, 204.0f, 40.0f),
                    PathNode.LineTo(204.0f, 96.0f),
                    PathNode.LineTo(216.0f, 96.0f),
                    PathNode.CurveTo(222.62741f, 96.0f, 228.0f, 101.37258f, 228.0f, 108.0f),
                    PathNode.CurveTo(227.97379f, 144.4727f, 208.10806f, 178.04329f, 176.15f, 195.62f),
                    PathNode.Close,
                    PathNode.MoveTo(76.0f, 96.0f),
                    PathNode.LineTo(180.0f, 96.0f),
                    PathNode.LineTo(180.0f, 44.0f),
                    PathNode.LineTo(76.0f, 44.0f),
                    PathNode.Close,
                    PathNode.MoveTo(153.21f, 204.78f),
                    PathNode.CurveTo(136.6775f, 209.0732f, 119.322495f, 209.0732f, 102.79f, 204.78f),
                    PathNode.LineTo(100.61f, 220.0f),
                    PathNode.LineTo(155.39f, 220.0f),
                    PathNode.Close,
                    PathNode.MoveTo(203.05f, 120.0f),
                    PathNode.LineTo(53.0f, 120.0f),
                    PathNode.CurveTo(58.886963f, 156.88246f, 90.70067f, 184.02095f, 128.05f, 184.02095f),
                    PathNode.CurveTo(165.39932f, 184.02095f, 197.21304f, 156.88246f, 203.1f, 120.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 24.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _toilet!!
    }

private var _toilet: ImageVector? = null
