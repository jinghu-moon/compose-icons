package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.CompassTool: ImageVector
    get() {
        if (_compassTool != null) return _compassTool!!
        _compassTool = phosphorLightIcon(
            name = "CompassTool",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(213.34f, 122.73f),
                    PathNode.CurveTo(214.39217f, 120.81396f, 214.31906f, 118.47731f, 213.14915f, 116.63079f),
                    PathNode.CurveTo(211.97926f, 114.78428f, 209.8977f, 113.720116f, 207.71584f, 113.85308f),
                    PathNode.CurveTo(205.53395f, 113.986046f, 203.59703f, 115.29509f, 202.66f, 117.27f),
                    PathNode.CurveTo(194.73631f, 132.52734f, 182.20631f, 144.89989f, 166.85f, 152.63f),
                    PathNode.LineTo(148.71f, 111.83f),
                    PathNode.CurveTo(161.86417f, 103.25497f, 168.38936f, 87.47235f, 165.1312f, 72.11177f),
                    PathNode.CurveTo(161.87303f, 56.751198f, 149.50258f, 44.976578f, 134.0f, 42.48f),
                    PathNode.LineTo(134.0f, 24.0f),
                    PathNode.CurveTo(134.0f, 20.68629f, 131.3137f, 18.0f, 128.0f, 18.0f),
                    PathNode.CurveTo(124.686295f, 18.0f, 122.0f, 20.68629f, 122.0f, 24.0f),
                    PathNode.LineTo(122.0f, 42.48f),
                    PathNode.CurveTo(106.49741f, 44.976578f, 94.12698f, 56.751198f, 90.86881f, 72.11177f),
                    PathNode.CurveTo(87.61064f, 87.47235f, 94.13584f, 103.25497f, 107.29f, 111.83f),
                    PathNode.LineTo(58.52f, 221.56f),
                    PathNode.CurveTo(57.172424f, 224.59756f, 58.542435f, 228.15242f, 61.58f, 229.5f),
                    PathNode.CurveTo(64.61757f, 230.84758f, 68.172424f, 229.47757f, 69.52f, 226.44f),
                    PathNode.LineTo(95.42f, 168.18f),
                    PathNode.CurveTo(105.84679f, 172.04459f, 116.88007f, 174.01555f, 128.0f, 174.0f),
                    PathNode.CurveTo(139.13924f, 173.99385f, 150.19418f, 172.06905f, 160.68f, 168.31f),
                    PathNode.LineTo(186.52f, 226.44f),
                    PathNode.CurveTo(187.86757f, 229.47757f, 191.42244f, 230.84758f, 194.46f, 229.5f),
                    PathNode.CurveTo(197.49756f, 228.15242f, 198.86757f, 224.59756f, 197.52f, 221.56f),
                    PathNode.LineTo(171.75f, 163.56f),
                    PathNode.CurveTo(189.59227f, 154.70464f, 204.15712f, 140.40594f, 213.34f, 122.73f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 54.0f),
                    PathNode.CurveTo(142.3594f, 54.0f, 154.0f, 65.640594f, 154.0f, 80.0f),
                    PathNode.CurveTo(154.0f, 94.359406f, 142.3594f, 106.0f, 128.0f, 106.0f),
                    PathNode.CurveTo(113.640594f, 106.0f, 102.0f, 94.359406f, 102.0f, 80.0f),
                    PathNode.CurveTo(102.0f, 65.640594f, 113.640594f, 54.0f, 128.0f, 54.0f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 162.0f),
                    PathNode.CurveTo(118.54652f, 162.01024f, 109.16331f, 160.37587f, 100.27f, 157.17f),
                    PathNode.LineTo(118.27f, 116.72f),
                    PathNode.CurveTo(124.66476f, 118.42667f, 131.39525f, 118.42667f, 137.79f, 116.72f),
                    PathNode.LineTo(155.79f, 157.32f),
                    PathNode.CurveTo(146.85004f, 160.40927f, 137.45868f, 161.99083f, 128.0f, 162.0f),
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
        return _compassTool!!
    }

private var _compassTool: ImageVector? = null
