package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Baby: ImageVector
    get() {
        if (_baby != null) return _baby!!
        _baby = phosphorLightIcon(
            name = "Baby",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(92.0f, 138.0f),
                    PathNode.CurveTo(86.47715f, 138.0f, 82.0f, 133.52284f, 82.0f, 128.0f),
                    PathNode.CurveTo(82.0f, 122.47715f, 86.47715f, 118.0f, 92.0f, 118.0f),
                    PathNode.CurveTo(97.52285f, 118.0f, 102.0f, 122.47715f, 102.0f, 128.0f),
                    PathNode.CurveTo(102.0f, 133.52284f, 97.52285f, 138.0f, 92.0f, 138.0f),
                    PathNode.Close,
                    PathNode.MoveTo(164.0f, 118.0f),
                    PathNode.CurveTo(158.47716f, 118.0f, 154.0f, 122.47715f, 154.0f, 128.0f),
                    PathNode.CurveTo(154.0f, 133.52284f, 158.47716f, 138.0f, 164.0f, 138.0f),
                    PathNode.CurveTo(169.52284f, 138.0f, 174.0f, 133.52284f, 174.0f, 128.0f),
                    PathNode.CurveTo(174.0f, 122.47715f, 169.52284f, 118.0f, 164.0f, 118.0f),
                    PathNode.Close,
                    PathNode.MoveTo(152.8f, 162.92f),
                    PathNode.CurveTo(137.61247f, 172.3541f, 118.387535f, 172.3541f, 103.2f, 162.92f),
                    PathNode.CurveTo(100.394394f, 161.1527f, 96.68731f, 161.9944f, 94.92f, 164.8f),
                    PathNode.CurveTo(93.15269f, 167.6056f, 93.99439f, 171.31268f, 96.8f, 173.08f),
                    PathNode.CurveTo(115.89816f, 184.97928f, 140.10184f, 184.97928f, 159.2f, 173.08f),
                    PathNode.CurveTo(162.0056f, 171.31268f, 162.8473f, 167.6056f, 161.08f, 164.8f),
                    PathNode.CurveTo(159.31268f, 161.9944f, 155.6056f, 161.1527f, 152.8f, 162.92f),
                    PathNode.Close,
                    PathNode.MoveTo(230.0f, 128.0f),
                    PathNode.CurveTo(230.0f, 184.33304f, 184.33304f, 230.0f, 128.0f, 230.0f),
                    PathNode.CurveTo(71.666954f, 230.0f, 26.0f, 184.33304f, 26.0f, 128.0f),
                    PathNode.CurveTo(26.0f, 71.666954f, 71.666954f, 26.0f, 128.0f, 26.0f),
                    PathNode.CurveTo(184.30563f, 26.066126f, 229.93387f, 71.69437f, 230.0f, 128.0f),
                    PathNode.Close,
                    PathNode.MoveTo(218.0f, 128.0f),
                    PathNode.CurveTo(217.94144f, 79.4591f, 179.4433f, 39.68757f, 130.93f, 38.05f),
                    PathNode.CurveTo(118.3f, 55.23f, 118.0f, 71.85f, 118.0f, 72.0f),
                    PathNode.CurveTo(118.0f, 77.52285f, 122.47715f, 82.0f, 128.0f, 82.0f),
                    PathNode.CurveTo(133.52284f, 82.0f, 138.0f, 77.52285f, 138.0f, 72.0f),
                    PathNode.CurveTo(138.0f, 68.686295f, 140.6863f, 66.0f, 144.0f, 66.0f),
                    PathNode.CurveTo(147.3137f, 66.0f, 150.0f, 68.686295f, 150.0f, 72.0f),
                    PathNode.CurveTo(150.0f, 84.15026f, 140.15027f, 94.0f, 128.0f, 94.0f),
                    PathNode.CurveTo(115.84974f, 94.0f, 106.0f, 84.15026f, 106.0f, 72.0f),
                    PathNode.CurveTo(106.0f, 71.25f, 106.15f, 56.18f, 116.14f, 38.78f),
                    PathNode.CurveTo(68.39643f, 45.126892f, 34.111717f, 87.93615f, 38.34897f, 135.913f),
                    PathNode.CurveTo(42.58622f, 183.88983f, 83.84341f, 220.02734f, 131.96034f, 217.90796f),
                    PathNode.CurveTo(180.07729f, 215.78857f, 217.99739f, 176.16359f, 218.0f, 128.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 12.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _baby!!
    }

private var _baby: ImageVector? = null
