package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.DropHalfBottom: ImageVector
    get() {
        if (_dropHalfBottom != null) return _dropHalfBottom!!
        _dropHalfBottom = phosphorLightIcon(
            name = "DropHalfBottom",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(172.53f, 49.06f),
                    PathNode.CurveTo(160.29025f, 34.903572f, 146.50822f, 22.157957f, 131.44f, 11.06f),
                    PathNode.CurveTo(129.37442f, 9.614577f, 126.62557f, 9.614577f, 124.56f, 11.06f),
                    PathNode.CurveTo(109.49178f, 22.157957f, 95.70975f, 34.903572f, 83.47f, 49.06f),
                    PathNode.CurveTo(56.34f, 80.26f, 42.0f, 113.09f, 42.0f, 144.0f),
                    PathNode.CurveTo(42.0f, 191.49649f, 80.50351f, 230.0f, 128.0f, 230.0f),
                    PathNode.CurveTo(175.49649f, 230.0f, 214.0f, 191.49649f, 214.0f, 144.0f),
                    PathNode.CurveTo(214.0f, 113.09f, 199.66f, 80.26f, 172.53f, 49.06f),
                    PathNode.Close,
                    PathNode.MoveTo(188.88f, 186.0f),
                    PathNode.LineTo(67.12f, 186.0f),
                    PathNode.CurveTo(62.870735f, 179.86429f, 59.57348f, 173.12143f, 57.34f, 166.0f),
                    PathNode.LineTo(198.66f, 166.0f),
                    PathNode.CurveTo(196.42653f, 173.12143f, 193.12927f, 179.86429f, 188.88f, 186.0f),
                    PathNode.Close,
                    PathNode.MoveTo(54.69f, 154.0f),
                    PathNode.CurveTo(54.23726f, 150.68578f, 54.006744f, 147.34499f, 54.0f, 144.0f),
                    PathNode.CurveTo(54.005127f, 140.65898f, 54.192074f, 137.32071f, 54.56f, 134.0f),
                    PathNode.LineTo(201.44f, 134.0f),
                    PathNode.CurveTo(201.80792f, 137.32071f, 201.99487f, 140.65898f, 202.0f, 144.0f),
                    PathNode.CurveTo(201.99326f, 147.34499f, 201.76274f, 150.68578f, 201.31f, 154.0f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 23.49f),
                    PathNode.CurveTo(141.13f, 33.61f, 187.83f, 72.55f, 199.39f, 122.0f),
                    PathNode.LineTo(56.61f, 122.0f),
                    PathNode.CurveTo(68.17f, 72.55f, 114.87f, 33.61f, 128.0f, 23.49f),
                    PathNode.Close,
                    PathNode.MoveTo(77.48f, 198.0f),
                    PathNode.LineTo(178.48f, 198.0f),
                    PathNode.CurveTo(150.08331f, 224.64003f, 105.87668f, 224.64003f, 77.48f, 198.0f),
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
        return _dropHalfBottom!!
    }

private var _dropHalfBottom: ImageVector? = null
