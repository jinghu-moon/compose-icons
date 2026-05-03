package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.NumberEight: ImageVector
    get() {
        if (_numberEight != null) return _numberEight!!
        _numberEight = phosphorBoldIcon(
            name = "NumberEight",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(162.44f, 118.91f),
                    PathNode.CurveTo(178.63501f, 104.593895f, 184.28484f, 81.751945f, 176.63087f, 61.53694f),
                    PathNode.CurveTo(168.97691f, 41.32194f, 149.6155f, 27.949938f, 128.0f, 27.949938f),
                    PathNode.CurveTo(106.384514f, 27.949938f, 87.02309f, 41.32194f, 79.369125f, 61.53694f),
                    PathNode.CurveTo(71.71517f, 81.751945f, 77.36498f, 104.593895f, 93.56f, 118.91f),
                    PathNode.CurveTo(72.1216f, 133.93787f, 62.90243f, 161.13129f, 70.78165f, 186.09846f),
                    PathNode.CurveTo(78.660866f, 211.06564f, 101.81905f, 228.04132f, 128.0f, 228.04132f),
                    PathNode.CurveTo(154.18094f, 228.04132f, 177.33913f, 211.06564f, 185.21835f, 186.09846f),
                    PathNode.CurveTo(193.09756f, 161.13129f, 183.8784f, 133.93787f, 162.44f, 118.91f),
                    PathNode.Close,
                    PathNode.MoveTo(100.0f, 80.0f),
                    PathNode.CurveTo(100.0f, 64.536026f, 112.536026f, 52.0f, 128.0f, 52.0f),
                    PathNode.CurveTo(143.46397f, 52.0f, 156.0f, 64.536026f, 156.0f, 80.0f),
                    PathNode.CurveTo(156.0f, 95.463974f, 143.46397f, 108.0f, 128.0f, 108.0f),
                    PathNode.CurveTo(112.536026f, 108.0f, 100.0f, 95.463974f, 100.0f, 80.0f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 204.0f),
                    PathNode.CurveTo(108.11775f, 204.0f, 92.0f, 187.88223f, 92.0f, 168.0f),
                    PathNode.CurveTo(92.0f, 148.11777f, 108.11775f, 132.0f, 128.0f, 132.0f),
                    PathNode.CurveTo(147.88223f, 132.0f, 164.0f, 148.11777f, 164.0f, 168.0f),
                    PathNode.CurveTo(164.0f, 187.88223f, 147.88223f, 204.0f, 128.0f, 204.0f),
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
        return _numberEight!!
    }

private var _numberEight: ImageVector? = null
