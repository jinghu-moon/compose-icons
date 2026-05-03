package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.BowlingBall: ImageVector
    get() {
        if (_bowlingBall != null) return _bowlingBall!!
        _bowlingBall = phosphorLightIcon(
            name = "BowlingBall",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(128.0f, 26.0f),
                    PathNode.CurveTo(71.666954f, 26.0f, 26.0f, 71.666954f, 26.0f, 128.0f),
                    PathNode.CurveTo(26.0f, 184.33304f, 71.666954f, 230.0f, 128.0f, 230.0f),
                    PathNode.CurveTo(184.33304f, 230.0f, 230.0f, 184.33304f, 230.0f, 128.0f),
                    PathNode.CurveTo(229.93387f, 71.69437f, 184.30563f, 26.066126f, 128.0f, 26.0f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 218.0f),
                    PathNode.CurveTo(78.29437f, 218.0f, 38.0f, 177.70563f, 38.0f, 128.0f),
                    PathNode.CurveTo(38.0f, 78.29437f, 78.29437f, 38.0f, 128.0f, 38.0f),
                    PathNode.CurveTo(177.70563f, 38.0f, 218.0f, 78.29437f, 218.0f, 128.0f),
                    PathNode.CurveTo(217.94489f, 177.68279f, 177.68279f, 217.94489f, 128.0f, 218.0f),
                    PathNode.Close,
                    PathNode.MoveTo(142.0f, 116.0f),
                    PathNode.CurveTo(142.0f, 121.52285f, 137.52284f, 126.0f, 132.0f, 126.0f),
                    PathNode.CurveTo(126.47715f, 126.0f, 122.0f, 121.52285f, 122.0f, 116.0f),
                    PathNode.CurveTo(122.0f, 110.47715f, 126.47715f, 106.0f, 132.0f, 106.0f),
                    PathNode.CurveTo(137.52284f, 106.0f, 142.0f, 110.47715f, 142.0f, 116.0f),
                    PathNode.Close,
                    PathNode.MoveTo(164.0f, 102.0f),
                    PathNode.CurveTo(158.47716f, 102.0f, 154.0f, 97.52285f, 154.0f, 92.0f),
                    PathNode.CurveTo(154.0f, 86.47715f, 158.47716f, 82.0f, 164.0f, 82.0f),
                    PathNode.CurveTo(169.52284f, 82.0f, 174.0f, 86.47715f, 174.0f, 92.0f),
                    PathNode.CurveTo(174.0f, 97.52285f, 169.52284f, 102.0f, 164.0f, 102.0f),
                    PathNode.Close,
                    PathNode.MoveTo(182.0f, 132.0f),
                    PathNode.CurveTo(182.0f, 137.52284f, 177.52284f, 142.0f, 172.0f, 142.0f),
                    PathNode.CurveTo(166.47716f, 142.0f, 162.0f, 137.52284f, 162.0f, 132.0f),
                    PathNode.CurveTo(162.0f, 126.47715f, 166.47716f, 122.0f, 172.0f, 122.0f),
                    PathNode.CurveTo(177.52284f, 122.0f, 182.0f, 126.47715f, 182.0f, 132.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 12.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _bowlingBall!!
    }

private var _bowlingBall: ImageVector? = null
