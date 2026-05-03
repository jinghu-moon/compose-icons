package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Grains: ImageVector
    get() {
        if (_grains != null) return _grains!!
        _grains = phosphorBoldIcon(
            name = "Grains",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(208.0f, 52.0f),
                    PathNode.CurveTo(197.82492f, 51.9959f, 187.72015f, 53.68566f, 178.1f, 57.0f),
                    PathNode.CurveTo(162.71f, 28.24f, 134.7f, 13.94f, 133.37f, 13.28f),
                    PathNode.CurveTo(129.98979f, 11.588543f, 126.01021f, 11.588543f, 122.63f, 13.28f),
                    PathNode.CurveTo(121.3f, 13.94f, 93.29f, 28.28f, 77.89f, 57.0f),
                    PathNode.CurveTo(68.27353f, 53.684765f, 58.171886f, 51.99496f, 48.0f, 52.0f),
                    PathNode.CurveTo(41.37258f, 52.0f, 36.0f, 57.37258f, 36.0f, 64.0f),
                    PathNode.LineTo(36.0f, 144.0f),
                    PathNode.CurveTo(36.0f, 194.8102f, 77.18981f, 236.0f, 128.0f, 236.0f),
                    PathNode.CurveTo(178.8102f, 236.0f, 220.0f, 194.8102f, 220.0f, 144.0f),
                    PathNode.LineTo(220.0f, 64.0f),
                    PathNode.CurveTo(220.0f, 57.37258f, 214.62741f, 52.0f, 208.0f, 52.0f),
                    PathNode.Close,
                    PathNode.MoveTo(60.0f, 77.06f),
                    PathNode.CurveTo(90.09674f, 82.506294f, 112.87873f, 107.3367f, 115.72f, 137.79f),
                    PathNode.CurveTo(101.12991f, 121.878105f, 81.40327f, 111.61118f, 60.0f, 108.79f),
                    PathNode.Close,
                    PathNode.MoveTo(116.0f, 210.94f),
                    PathNode.CurveTo(83.61359f, 205.08437f, 60.045f, 176.9115f, 60.0f, 144.0f),
                    PathNode.LineTo(60.0f, 133.06f),
                    PathNode.CurveTo(92.38641f, 138.91563f, 115.955f, 167.0885f, 116.0f, 200.0f),
                    PathNode.Close,
                    PathNode.MoveTo(99.37f, 67.71f),
                    PathNode.CurveTo(107.57f, 52.77f, 120.69f, 42.71f, 128.0f, 37.94f),
                    PathNode.CurveTo(135.32f, 42.73f, 148.43f, 52.77f, 156.63f, 67.71f),
                    PathNode.CurveTo(144.84161f, 75.67618f, 135.04532f, 86.2492f, 128.0f, 98.61f),
                    PathNode.CurveTo(120.951485f, 86.25154f, 111.15581f, 75.679184f, 99.37f, 67.71f),
                    PathNode.Close,
                    PathNode.MoveTo(196.0f, 144.0f),
                    PathNode.CurveTo(195.955f, 176.9115f, 172.38641f, 205.08437f, 140.0f, 210.94f),
                    PathNode.LineTo(140.0f, 200.0f),
                    PathNode.CurveTo(140.045f, 167.0885f, 163.61359f, 138.91563f, 196.0f, 133.06f),
                    PathNode.Close,
                    PathNode.MoveTo(196.0f, 108.78f),
                    PathNode.CurveTo(174.59673f, 111.60118f, 154.87009f, 121.8681f, 140.28f, 137.78f),
                    PathNode.CurveTo(143.12552f, 107.33054f, 165.90656f, 82.50526f, 196.0f, 77.06f),
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
        return _grains!!
    }

private var _grains: ImageVector? = null
