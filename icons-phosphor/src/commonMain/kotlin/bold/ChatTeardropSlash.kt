package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.ChatTeardropSlash: ImageVector
    get() {
        if (_chatTeardropSlash != null) return _chatTeardropSlash!!
        _chatTeardropSlash = phosphorBoldIcon(
            name = "ChatTeardropSlash",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(56.88f, 31.93f),
                    PathNode.CurveTo(54.012154f, 28.697262f, 49.6276f, 27.25621f, 45.401115f, 28.157282f),
                    PathNode.CurveTo(41.174625f, 29.058353f, 37.759064f, 32.16236f, 36.459072f, 36.283665f),
                    PathNode.CurveTo(35.15908f, 40.404972f, 36.175465f, 44.906956f, 39.12f, 48.07f),
                    PathNode.LineTo(50.0f, 60.0f),
                    PathNode.CurveTo(35.69318f, 78.26045f, 27.944365f, 100.80246f, 28.0f, 124.0f),
                    PathNode.LineTo(28.0f, 208.0f),
                    PathNode.CurveTo(28.0f, 219.0457f, 36.954304f, 228.0f, 48.0f, 228.0f),
                    PathNode.LineTo(132.0f, 228.0f),
                    PathNode.CurveTo(151.79352f, 227.97379f, 171.17113f, 222.31693f, 187.87f, 211.69f),
                    PathNode.LineTo(199.12f, 224.07f),
                    PathNode.CurveTo(203.5975f, 228.87978f, 211.1107f, 229.19368f, 215.9738f, 224.77417f),
                    PathNode.CurveTo(220.83693f, 220.35464f, 221.24089f, 212.84575f, 216.88f, 207.93f),
                    PathNode.Close,
                    PathNode.MoveTo(132.0f, 204.0f),
                    PathNode.LineTo(52.0f, 204.0f),
                    PathNode.LineTo(52.0f, 124.0f),
                    PathNode.CurveTo(51.97118f, 107.58729f, 57.022236f, 91.567825f, 66.46f, 78.14f),
                    PathNode.LineTo(171.46f, 193.63f),
                    PathNode.CurveTo(159.44014f, 200.47868f, 145.83395f, 204.05435f, 132.0f, 204.0f),
                    PathNode.Close,
                    PathNode.MoveTo(236.0f, 124.0f),
                    PathNode.CurveTo(236.0445f, 139.68904f, 232.50085f, 155.18054f, 225.64f, 169.29f),
                    PathNode.CurveTo(222.75156f, 175.26572f, 215.56572f, 177.76845f, 209.59f, 174.88f),
                    PathNode.CurveTo(203.61427f, 171.99155f, 201.11156f, 164.80573f, 204.0f, 158.83f),
                    PathNode.CurveTo(209.28374f, 147.98051f, 212.01996f, 136.06767f, 212.0f, 124.0f),
                    PathNode.CurveTo(211.96727f, 97.82134f, 199.13933f, 73.31192f, 177.64734f, 58.364777f),
                    PathNode.CurveTo(156.15533f, 43.417637f, 128.71379f, 39.92065f, 104.16f, 49.0f),
                    PathNode.CurveTo(97.96128f, 51.25181f, 91.107056f, 48.079266f, 88.81247f, 41.89625f),
                    PathNode.CurveTo(86.51788f, 35.71323f, 89.64299f, 28.837254f, 95.81f, 26.5f),
                    PathNode.CurveTo(127.72981f, 14.687127f, 163.40894f, 19.229101f, 191.35109f, 38.66244f),
                    PathNode.CurveTo(219.29324f, 58.09578f, 235.96706f, 89.96447f, 236.0f, 124.0f),
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
        return _chatTeardropSlash!!
    }

private var _chatTeardropSlash: ImageVector? = null
