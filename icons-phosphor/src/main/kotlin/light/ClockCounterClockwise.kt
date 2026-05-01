package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.ClockCounterClockwise: ImageVector
    get() {
        if (_clockCounterClockwise != null) return _clockCounterClockwise!!
        _clockCounterClockwise = phosphorLightIcon(
            name = "ClockCounterClockwise",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(134.0f, 80.0f),
                    PathNode.LineTo(134.0f, 124.6f),
                    PathNode.LineTo(171.09f, 146.85f),
                    PathNode.CurveTo(173.93427f, 148.55656f, 174.85657f, 152.24573f, 173.15f, 155.09f),
                    PathNode.CurveTo(171.44344f, 157.93427f, 167.75427f, 158.85657f, 164.91f, 157.15f),
                    PathNode.LineTo(124.91f, 133.15f),
                    PathNode.CurveTo(123.10239f, 132.06398f, 121.99759f, 130.10876f, 122.0f, 128.0f),
                    PathNode.LineTo(122.0f, 80.0f),
                    PathNode.CurveTo(122.0f, 76.686295f, 124.686295f, 74.0f, 128.0f, 74.0f),
                    PathNode.CurveTo(131.3137f, 74.0f, 134.0f, 76.686295f, 134.0f, 80.0f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 34.0f),
                    PathNode.CurveTo(103.04483f, 33.935135f, 79.1015f, 43.859608f, 61.51f, 61.56f),
                    PathNode.CurveTo(52.93f, 70.24f, 45.51f, 78.56f, 38.0f, 87.36f),
                    PathNode.LineTo(38.0f, 64.0f),
                    PathNode.CurveTo(38.0f, 60.68629f, 35.31371f, 58.0f, 32.0f, 58.0f),
                    PathNode.CurveTo(28.68629f, 58.0f, 26.0f, 60.68629f, 26.0f, 64.0f),
                    PathNode.LineTo(26.0f, 104.0f),
                    PathNode.CurveTo(26.0f, 107.313705f, 28.68629f, 110.0f, 32.0f, 110.0f),
                    PathNode.LineTo(72.0f, 110.0f),
                    PathNode.CurveTo(75.313705f, 110.0f, 78.0f, 107.313705f, 78.0f, 104.0f),
                    PathNode.CurveTo(78.0f, 100.686295f, 75.313705f, 98.0f, 72.0f, 98.0f),
                    PathNode.LineTo(44.73f, 98.0f),
                    PathNode.CurveTo(52.86f, 88.29f, 60.79f, 79.35f, 70.0f, 70.0f),
                    PathNode.CurveTo(101.80547f, 38.19618f, 153.29384f, 37.949028f, 185.40317f, 69.446045f),
                    PathNode.CurveTo(217.5125f, 100.94307f, 218.2566f, 152.42665f, 187.07097f, 184.8385f),
                    PathNode.CurveTo(155.88535f, 217.25034f, 104.41134f, 218.49133f, 71.7f, 187.62f),
                    PathNode.CurveTo(70.15188f, 186.09406f, 67.8995f, 185.52477f, 65.812256f, 186.1319f),
                    PathNode.CurveTo(63.725014f, 186.73903f, 62.12939f, 188.42761f, 61.64128f, 190.54585f),
                    PathNode.CurveTo(61.153175f, 192.6641f, 61.848934f, 194.88066f, 63.46f, 196.34f),
                    PathNode.CurveTo(94.149445f, 225.32379f, 140.39618f, 230.29507f, 176.54451f, 208.496f),
                    PathNode.CurveTo(212.69284f, 186.69691f, 229.87648f, 143.47427f, 218.56265f, 102.806114f),
                    PathNode.CurveTo(207.24886f, 62.13795f, 170.21259f, 33.99919f, 128.0f, 34.0f),
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
        return _clockCounterClockwise!!
    }

private var _clockCounterClockwise: ImageVector? = null
