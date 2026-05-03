package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Alien: ImageVector
    get() {
        if (_alien != null) return _alien!!
        _alien = phosphorLightIcon(
            name = "Alien",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(128.0f, 18.0f),
                    PathNode.CurveTo(76.11036f, 18.060616f, 34.060616f, 60.110363f, 34.0f, 112.0f),
                    PathNode.CurveTo(34.0f, 135.6f, 46.41f, 166.2f, 67.21f, 193.83f),
                    PathNode.CurveTo(83.27f, 215.18f, 107.68f, 238.0f, 128.0f, 238.0f),
                    PathNode.CurveTo(148.32f, 238.0f, 172.73f, 215.18f, 188.79f, 193.83f),
                    PathNode.CurveTo(209.59f, 166.2f, 222.0f, 135.6f, 222.0f, 112.0f),
                    PathNode.CurveTo(221.93938f, 60.110363f, 179.88963f, 18.060616f, 128.0f, 18.0f),
                    PathNode.Close,
                    PathNode.MoveTo(179.21f, 186.62f),
                    PathNode.CurveTo(161.48f, 210.17f, 140.91f, 226.0f, 128.0f, 226.0f),
                    PathNode.CurveTo(115.09f, 226.0f, 94.52f, 210.17f, 76.79f, 186.62f),
                    PathNode.CurveTo(57.8f, 161.37f, 46.0f, 132.78f, 46.0f, 112.0f),
                    PathNode.CurveTo(46.0f, 66.712654f, 82.712654f, 30.0f, 128.0f, 30.0f),
                    PathNode.CurveTo(173.28735f, 30.0f, 210.0f, 66.712654f, 210.0f, 112.0f),
                    PathNode.CurveTo(210.0f, 132.78f, 198.2f, 161.37f, 179.21f, 186.62f),
                    PathNode.Close,
                    PathNode.MoveTo(118.0f, 136.0f),
                    PathNode.CurveTo(118.0f, 115.013176f, 100.986824f, 98.0f, 80.0f, 98.0f),
                    PathNode.CurveTo(72.26801f, 98.0f, 66.0f, 104.26801f, 66.0f, 112.0f),
                    PathNode.CurveTo(66.0f, 132.98682f, 83.013176f, 150.0f, 104.0f, 150.0f),
                    PathNode.CurveTo(111.73199f, 150.0f, 118.0f, 143.73198f, 118.0f, 136.0f),
                    PathNode.Close,
                    PathNode.MoveTo(104.0f, 138.0f),
                    PathNode.CurveTo(89.640594f, 138.0f, 78.0f, 126.359406f, 78.0f, 112.0f),
                    PathNode.CurveTo(78.0f, 110.89543f, 78.89543f, 110.0f, 80.0f, 110.0f),
                    PathNode.CurveTo(94.359406f, 110.0f, 106.0f, 121.640594f, 106.0f, 136.0f),
                    PathNode.CurveTo(106.0f, 137.10457f, 105.10457f, 138.0f, 104.0f, 138.0f),
                    PathNode.Close,
                    PathNode.MoveTo(176.0f, 98.0f),
                    PathNode.CurveTo(155.01318f, 98.0f, 138.0f, 115.013176f, 138.0f, 136.0f),
                    PathNode.CurveTo(138.0f, 143.73198f, 144.26802f, 150.0f, 152.0f, 150.0f),
                    PathNode.CurveTo(172.98682f, 150.0f, 190.0f, 132.98682f, 190.0f, 112.0f),
                    PathNode.CurveTo(190.0f, 104.26801f, 183.73198f, 98.0f, 176.0f, 98.0f),
                    PathNode.Close,
                    PathNode.MoveTo(152.0f, 138.0f),
                    PathNode.CurveTo(150.89543f, 138.0f, 150.0f, 137.10457f, 150.0f, 136.0f),
                    PathNode.CurveTo(150.0f, 121.640594f, 161.6406f, 110.0f, 176.0f, 110.0f),
                    PathNode.CurveTo(177.10457f, 110.0f, 178.0f, 110.89543f, 178.0f, 112.0f),
                    PathNode.CurveTo(178.0f, 126.359406f, 166.3594f, 138.0f, 152.0f, 138.0f),
                    PathNode.Close,
                    PathNode.MoveTo(150.0f, 184.0f),
                    PathNode.CurveTo(150.0f, 187.3137f, 147.3137f, 190.0f, 144.0f, 190.0f),
                    PathNode.LineTo(112.0f, 190.0f),
                    PathNode.CurveTo(108.686295f, 190.0f, 106.0f, 187.3137f, 106.0f, 184.0f),
                    PathNode.CurveTo(106.0f, 180.6863f, 108.686295f, 178.0f, 112.0f, 178.0f),
                    PathNode.LineTo(144.0f, 178.0f),
                    PathNode.CurveTo(147.3137f, 178.0f, 150.0f, 180.6863f, 150.0f, 184.0f),
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
        return _alien!!
    }

private var _alien: ImageVector? = null
