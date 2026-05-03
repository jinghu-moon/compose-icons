package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Tipi: ImageVector
    get() {
        if (_tipi != null) return _tipi!!
        _tipi = phosphorBoldIcon(
            name = "Tipi",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(242.11f, 209.53f),
                    PathNode.LineTo(142.25f, 53.53f),
                    PathNode.LineTo(162.11f, 22.53f),
                    PathNode.CurveTo(165.69984f, 16.946402f, 164.0836f, 9.509851f, 158.5f, 5.92f),
                    PathNode.CurveTo(152.9164f, 2.330149f, 145.47986f, 3.946401f, 141.89f, 9.53f),
                    PathNode.LineTo(128.0f, 31.24f),
                    PathNode.LineTo(114.11f, 9.53f),
                    PathNode.CurveTo(110.53672f, 3.946401f, 103.1136f, 2.316718f, 97.53f, 5.890001f),
                    PathNode.CurveTo(91.9464f, 9.463283f, 90.31672f, 16.886402f, 93.89f, 22.47f),
                    PathNode.LineTo(113.75f, 53.47f),
                    PathNode.LineTo(13.89f, 209.47f),
                    PathNode.CurveTo(11.492365f, 213.16653f, 11.313313f, 217.87971f, 13.423582f, 221.7475f),
                    PathNode.CurveTo(15.533852f, 225.61528f, 19.594011f, 228.01553f, 24.0f, 228.0f),
                    PathNode.LineTo(232.0f, 228.0f),
                    PathNode.CurveTo(236.38626f, 228.00133f, 240.42378f, 225.60938f, 242.52985f, 221.7618f),
                    PathNode.CurveTo(244.63591f, 217.91422f, 244.47493f, 213.2241f, 242.11f, 209.53f),
                    PathNode.Close,
                    PathNode.MoveTo(96.17f, 204.0f),
                    PathNode.LineTo(128.0f, 154.26f),
                    PathNode.LineTo(159.83f, 204.0f),
                    PathNode.Close,
                    PathNode.MoveTo(188.33f, 204.0f),
                    PathNode.LineTo(138.11f, 125.53f),
                    PathNode.CurveTo(135.9048f, 122.08115f, 132.0936f, 119.994354f, 128.0f, 119.994354f),
                    PathNode.CurveTo(123.9064f, 119.994354f, 120.09521f, 122.08115f, 117.89f, 125.53f),
                    PathNode.LineTo(67.67f, 204.0f),
                    PathNode.LineTo(45.93f, 204.0f),
                    PathNode.LineTo(128.0f, 75.76f),
                    PathNode.LineTo(210.07f, 204.0f),
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
        return _tipi!!
    }

private var _tipi: ImageVector? = null
