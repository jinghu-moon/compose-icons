package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.Hurricane: ImageVector
    get() {
        if (_hurricane != null) return _hurricane!!
        _hurricane = phosphorRegularIcon(
            name = "Hurricane",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(128.0f, 96.0f),
                    PathNode.CurveTo(110.32689f, 96.0f, 96.0f, 110.32689f, 96.0f, 128.0f),
                    PathNode.CurveTo(96.0f, 145.67311f, 110.32689f, 160.0f, 128.0f, 160.0f),
                    PathNode.CurveTo(145.67311f, 160.0f, 160.0f, 145.67311f, 160.0f, 128.0f),
                    PathNode.CurveTo(160.0f, 110.32689f, 145.67311f, 96.0f, 128.0f, 96.0f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 144.0f),
                    PathNode.CurveTo(119.163445f, 144.0f, 112.0f, 136.83656f, 112.0f, 128.0f),
                    PathNode.CurveTo(112.0f, 119.163445f, 119.163445f, 112.0f, 128.0f, 112.0f),
                    PathNode.CurveTo(136.83656f, 112.0f, 144.0f, 119.163445f, 144.0f, 128.0f),
                    PathNode.CurveTo(144.0f, 136.83656f, 136.83656f, 144.0f, 128.0f, 144.0f),
                    PathNode.Close,
                    PathNode.MoveTo(158.32f, 45.36f),
                    PathNode.LineTo(167.73f, 10.06f),
                    PathNode.CurveTo(168.44629f, 7.369646f, 167.71237f, 4.500379f, 165.79227f, 2.484373f),
                    PathNode.CurveTo(163.87216f, 0.468367f, 161.04205f, -0.404414f, 158.32f, 0.18f),
                    PathNode.CurveTo(137.5303f, 5.282214f, 117.717606f, 13.757928f, 99.67f, 25.27f),
                    PathNode.CurveTo(60.63f, 50.37f, 40.0f, 85.89f, 40.0f, 128.0f),
                    PathNode.CurveTo(40.020317f, 164.90858f, 63.042416f, 197.89313f, 97.68f, 210.64f),
                    PathNode.LineTo(88.27f, 245.94f),
                    PathNode.CurveTo(87.55371f, 248.63036f, 88.287636f, 251.49962f, 90.20773f, 253.51562f),
                    PathNode.CurveTo(92.12783f, 255.53163f, 94.957954f, 256.40442f, 97.68f, 255.82f),
                    PathNode.CurveTo(118.469696f, 250.71779f, 138.2824f, 242.24207f, 156.33f, 230.73f),
                    PathNode.CurveTo(195.37f, 205.63f, 216.0f, 170.11f, 216.0f, 128.0f),
                    PathNode.CurveTo(215.9826f, 91.09048f, 192.95946f, 58.104465f, 158.32f, 45.36f),
                    PathNode.Close,
                    PathNode.MoveTo(148.06f, 217.0f),
                    PathNode.CurveTo(135.34402f, 225.09753f, 121.68178f, 231.60289f, 107.38f, 236.37f),
                    PathNode.LineTo(115.11f, 207.37f),
                    PathNode.CurveTo(116.247574f, 203.10086f, 113.70908f, 198.7178f, 109.44f, 197.58f),
                    PathNode.CurveTo(77.93329f, 189.1526f, 56.01484f, 160.61432f, 56.0f, 128.0f),
                    PathNode.CurveTo(56.0f, 91.23f, 73.48f, 61.28f, 107.94f, 39.0f),
                    PathNode.CurveTo(120.655975f, 30.902462f, 134.31822f, 24.39711f, 148.62f, 19.63f),
                    PathNode.LineTo(140.89f, 48.63f),
                    PathNode.CurveTo(139.75243f, 52.899143f, 142.29092f, 57.28219f, 146.56f, 58.42f),
                    PathNode.CurveTo(178.06671f, 66.8474f, 199.98517f, 95.38568f, 200.0f, 128.0f),
                    PathNode.CurveTo(200.0f, 164.77f, 182.52f, 194.72f, 148.06f, 217.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 16.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _hurricane!!
    }

private var _hurricane: ImageVector? = null
