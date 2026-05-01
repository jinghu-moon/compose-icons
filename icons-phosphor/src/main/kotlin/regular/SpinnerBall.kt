package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.SpinnerBall: ImageVector
    get() {
        if (_spinnerBall != null) return _spinnerBall!!
        _spinnerBall = phosphorRegularIcon(
            name = "SpinnerBall",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(128.0f, 24.0f),
                    PathNode.CurveTo(70.562386f, 24.0f, 24.0f, 70.562386f, 24.0f, 128.0f),
                    PathNode.CurveTo(24.0f, 185.4376f, 70.562386f, 232.0f, 128.0f, 232.0f),
                    PathNode.CurveTo(185.4376f, 232.0f, 232.0f, 185.4376f, 232.0f, 128.0f),
                    PathNode.CurveTo(231.93938f, 70.58752f, 185.41248f, 24.060629f, 128.0f, 24.0f),
                    PathNode.Close,
                    PathNode.MoveTo(215.82f, 122.46f),
                    PathNode.CurveTo(187.48f, 142.46f, 166.25f, 137.14f, 143.95f, 126.85f),
                    PathNode.CurveTo(164.01f, 112.66f, 182.81f, 94.64f, 183.48f, 59.74f),
                    PathNode.CurveTo(202.54526f, 75.21347f, 214.27116f, 97.95462f, 215.82f, 122.46f),
                    PathNode.Close,
                    PathNode.MoveTo(167.11f, 49.19f),
                    PathNode.CurveTo(170.24f, 83.71f, 155.0f, 99.44f, 135.0f, 113.61f),
                    PathNode.CurveTo(132.75f, 89.13f, 126.56f, 63.81f, 96.63f, 45.79f),
                    PathNode.CurveTo(119.572784f, 37.022964f, 145.13734f, 38.255867f, 167.13f, 49.19f),
                    PathNode.Close,
                    PathNode.MoveTo(79.32f, 54.73f),
                    PathNode.CurveTo(110.77f, 69.28f, 116.79f, 90.31f, 119.03f, 114.73f),
                    PathNode.CurveTo(96.7f, 104.44f, 71.68f, 97.14f, 41.1f, 114.05f),
                    PathNode.CurveTo(45.02791f, 89.81877f, 58.87861f, 68.32156f, 79.32f, 54.73f),
                    PathNode.Close,
                    PathNode.MoveTo(40.18f, 133.54f),
                    PathNode.CurveTo(68.52f, 113.54f, 89.75f, 118.86f, 112.05f, 129.15f),
                    PathNode.CurveTo(92.0f, 143.34f, 73.19f, 161.36f, 72.52f, 196.26f),
                    PathNode.CurveTo(53.454742f, 180.78653f, 41.728832f, 158.04538f, 40.18f, 133.54f),
                    PathNode.Close,
                    PathNode.MoveTo(88.89f, 206.81f),
                    PathNode.CurveTo(85.76f, 172.29f, 101.0f, 156.56f, 121.0f, 142.39f),
                    PathNode.CurveTo(123.25f, 166.87f, 129.44f, 192.19f, 159.37f, 210.21f),
                    PathNode.CurveTo(136.42722f, 218.97704f, 110.86266f, 217.74414f, 88.87f, 206.81f),
                    PathNode.Close,
                    PathNode.MoveTo(176.68f, 201.27f),
                    PathNode.CurveTo(145.23f, 186.72f, 139.21f, 165.69f, 136.97f, 141.27f),
                    PathNode.CurveTo(149.69f, 147.13f, 163.28f, 152.02f, 178.27f, 152.02f),
                    PathNode.CurveTo(189.6f, 152.02f, 201.73f, 149.22f, 214.9f, 141.94f),
                    PathNode.CurveTo(210.97238f, 166.174f, 197.12195f, 187.67442f, 176.68f, 201.27f),
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
        return _spinnerBall!!
    }

private var _spinnerBall: ImageVector? = null
