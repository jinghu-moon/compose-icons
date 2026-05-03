package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Subtract: ImageVector
    get() {
        if (_subtract != null) return _subtract!!
        _subtract = phosphorBoldIcon(
            name = "Subtract",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(178.0f, 78.0f),
                    PathNode.CurveTo(169.08406f, 37.210495f, 131.56235f, 9.161108f, 89.91714f, 12.153585f),
                    PathNode.CurveTo(48.27194f, 15.146063f, 15.146063f, 48.27194f, 12.153585f, 89.91714f),
                    PathNode.CurveTo(9.161108f, 131.56235f, 37.210495f, 169.08406f, 78.0f, 178.0f),
                    PathNode.CurveTo(86.91595f, 218.7895f, 124.43766f, 246.8389f, 166.08286f, 243.84642f),
                    PathNode.CurveTo(207.72806f, 240.85394f, 240.85394f, 207.72806f, 243.84642f, 166.08286f),
                    PathNode.CurveTo(246.8389f, 124.43766f, 218.7895f, 86.91595f, 178.0f, 78.0f),
                    PathNode.Close,
                    PathNode.MoveTo(220.0f, 160.0f),
                    PathNode.CurveTo(219.99504f, 162.22195f, 219.86818f, 164.44196f, 219.62f, 166.65f),
                    PathNode.LineTo(175.62f, 122.65f),
                    PathNode.CurveTo(177.71648f, 116.367874f, 179.05922f, 109.858925f, 179.62f, 103.26f),
                    PathNode.CurveTo(203.83482f, 111.58397f, 220.06833f, 134.3945f, 220.0f, 160.0f),
                    PathNode.Close,
                    PathNode.MoveTo(36.0f, 96.0f),
                    PathNode.CurveTo(36.0f, 62.862915f, 62.862915f, 36.0f, 96.0f, 36.0f),
                    PathNode.CurveTo(129.13708f, 36.0f, 156.0f, 62.862915f, 156.0f, 96.0f),
                    PathNode.CurveTo(156.0f, 129.13708f, 129.13708f, 156.0f, 96.0f, 156.0f),
                    PathNode.CurveTo(62.878906f, 155.96143f, 36.038574f, 129.1211f, 36.0f, 96.0f),
                    PathNode.Close,
                    PathNode.MoveTo(103.28f, 179.66f),
                    PathNode.CurveTo(109.87893f, 179.09921f, 116.38787f, 177.75647f, 122.67f, 175.66f),
                    PathNode.LineTo(166.67f, 219.66f),
                    PathNode.CurveTo(164.45459f, 219.89555f, 162.22789f, 220.00905f, 160.0f, 220.0f),
                    PathNode.CurveTo(134.41234f, 220.06561f, 111.61529f, 203.85205f, 103.28f, 179.66f),
                    PathNode.Close,
                    PathNode.MoveTo(191.81f, 210.84f),
                    PathNode.LineTo(145.08f, 164.11f),
                    PathNode.CurveTo(152.38065f, 158.8241f, 158.7941f, 152.41064f, 164.08f, 145.11f),
                    PathNode.LineTo(210.81f, 191.84f),
                    PathNode.CurveTo(205.98228f, 199.51854f, 199.48854f, 206.01228f, 191.81f, 210.84f),
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
        return _subtract!!
    }

private var _subtract: ImageVector? = null
