package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.DropHalf: ImageVector
    get() {
        if (_dropHalf != null) return _dropHalf!!
        _dropHalf = phosphorLightIcon(
            name = "DropHalf",
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
                    PathNode.MoveTo(202.0f, 144.0f),
                    PathNode.CurveTo(201.99326f, 147.34499f, 201.76274f, 150.68578f, 201.31f, 154.0f),
                    PathNode.LineTo(134.0f, 154.0f),
                    PathNode.LineTo(134.0f, 134.0f),
                    PathNode.LineTo(201.44f, 134.0f),
                    PathNode.CurveTo(201.80792f, 137.32071f, 201.99487f, 140.65898f, 202.0f, 144.0f),
                    PathNode.Close,
                    PathNode.MoveTo(186.8f, 90.0f),
                    PathNode.LineTo(134.0f, 90.0f),
                    PathNode.LineTo(134.0f, 70.0f),
                    PathNode.LineTo(173.89f, 70.0f),
                    PathNode.CurveTo(178.63977f, 76.367676f, 182.95296f, 83.049614f, 186.8f, 90.0f),
                    PathNode.Close,
                    PathNode.MoveTo(134.0f, 198.0f),
                    PathNode.LineTo(178.52f, 198.0f),
                    PathNode.CurveTo(166.34285f, 209.43059f, 150.64688f, 216.3901f, 134.0f, 217.74f),
                    PathNode.Close,
                    PathNode.MoveTo(134.0f, 186.0f),
                    PathNode.LineTo(134.0f, 166.0f),
                    PathNode.LineTo(198.66f, 166.0f),
                    PathNode.CurveTo(196.42653f, 173.12143f, 193.12927f, 179.86429f, 188.88f, 186.0f),
                    PathNode.Close,
                    PathNode.MoveTo(134.0f, 122.0f),
                    PathNode.LineTo(134.0f, 102.0f),
                    PathNode.LineTo(192.7f, 102.0f),
                    PathNode.CurveTo(195.52533f, 108.45252f, 197.76436f, 115.14618f, 199.39f, 122.0f),
                    PathNode.Close,
                    PathNode.MoveTo(164.29f, 58.0f),
                    PathNode.LineTo(134.0f, 58.0f),
                    PathNode.LineTo(134.0f, 28.3f),
                    PathNode.CurveTo(144.8976f, 37.348667f, 155.02875f, 47.28248f, 164.29f, 58.0f),
                    PathNode.Close,
                    PathNode.MoveTo(54.0f, 144.0f),
                    PathNode.CurveTo(54.0f, 90.58f, 101.35f, 45.44f, 122.0f, 28.3f),
                    PathNode.LineTo(122.0f, 217.74f),
                    PathNode.CurveTo(83.61087f, 214.57384f, 54.05162f, 182.51944f, 54.0f, 144.0f),
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
        return _dropHalf!!
    }

private var _dropHalf: ImageVector? = null
