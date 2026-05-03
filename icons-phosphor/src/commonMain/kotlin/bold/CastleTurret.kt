package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.CastleTurret: ImageVector
    get() {
        if (_castleTurret != null) return _castleTurret!!
        _castleTurret = phosphorBoldIcon(
            name = "CastleTurret",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(216.0f, 212.0f),
                    PathNode.LineTo(204.0f, 212.0f),
                    PathNode.LineTo(204.0f, 117.0f),
                    PathNode.LineTo(214.14f, 106.86f),
                    PathNode.CurveTo(217.91154f, 103.111626f, 220.0224f, 98.00736f, 220.0f, 92.69f),
                    PathNode.LineTo(220.0f, 48.0f),
                    PathNode.CurveTo(220.0f, 36.954304f, 211.0457f, 28.0f, 200.0f, 28.0f),
                    PathNode.LineTo(56.0f, 28.0f),
                    PathNode.CurveTo(44.954304f, 28.0f, 36.0f, 36.954304f, 36.0f, 48.0f),
                    PathNode.LineTo(36.0f, 92.69f),
                    PathNode.CurveTo(35.985634f, 97.99697f, 38.09588f, 103.088936f, 41.86f, 106.83f),
                    PathNode.LineTo(52.0f, 117.0f),
                    PathNode.LineTo(52.0f, 212.0f),
                    PathNode.LineTo(40.0f, 212.0f),
                    PathNode.CurveTo(33.37258f, 212.0f, 28.0f, 217.37259f, 28.0f, 224.0f),
                    PathNode.CurveTo(28.0f, 230.62741f, 33.37258f, 236.0f, 40.0f, 236.0f),
                    PathNode.LineTo(216.0f, 236.0f),
                    PathNode.CurveTo(222.62741f, 236.0f, 228.0f, 230.62741f, 228.0f, 224.0f),
                    PathNode.CurveTo(228.0f, 217.37259f, 222.62741f, 212.0f, 216.0f, 212.0f),
                    PathNode.Close,
                    PathNode.MoveTo(72.49f, 103.51f),
                    PathNode.LineTo(60.0f, 91.0f),
                    PathNode.LineTo(60.0f, 52.0f),
                    PathNode.LineTo(88.0f, 52.0f),
                    PathNode.LineTo(88.0f, 76.0f),
                    PathNode.CurveTo(88.0f, 82.62742f, 93.37258f, 88.0f, 100.0f, 88.0f),
                    PathNode.CurveTo(106.62742f, 88.0f, 112.0f, 82.62742f, 112.0f, 76.0f),
                    PathNode.LineTo(112.0f, 52.0f),
                    PathNode.LineTo(144.0f, 52.0f),
                    PathNode.LineTo(144.0f, 76.0f),
                    PathNode.CurveTo(144.0f, 82.62742f, 149.37259f, 88.0f, 156.0f, 88.0f),
                    PathNode.CurveTo(162.62741f, 88.0f, 168.0f, 82.62742f, 168.0f, 76.0f),
                    PathNode.LineTo(168.0f, 52.0f),
                    PathNode.LineTo(196.0f, 52.0f),
                    PathNode.LineTo(196.0f, 91.0f),
                    PathNode.LineTo(183.51f, 103.48f),
                    PathNode.CurveTo(181.25276f, 105.7397f, 179.98952f, 108.80605f, 180.0f, 112.0f),
                    PathNode.LineTo(180.0f, 212.0f),
                    PathNode.LineTo(164.0f, 212.0f),
                    PathNode.LineTo(164.0f, 168.0f),
                    PathNode.CurveTo(164.0f, 148.11777f, 147.88223f, 132.0f, 128.0f, 132.0f),
                    PathNode.CurveTo(108.11775f, 132.0f, 92.0f, 148.11777f, 92.0f, 168.0f),
                    PathNode.LineTo(92.0f, 212.0f),
                    PathNode.LineTo(76.0f, 212.0f),
                    PathNode.LineTo(76.0f, 112.0f),
                    PathNode.CurveTo(76.0025f, 108.816444f, 74.73986f, 105.76237f, 72.49f, 103.51f),
                    PathNode.Close,
                    PathNode.MoveTo(140.0f, 212.0f),
                    PathNode.LineTo(116.0f, 212.0f),
                    PathNode.LineTo(116.0f, 168.0f),
                    PathNode.CurveTo(116.0f, 161.37259f, 121.37258f, 156.0f, 128.0f, 156.0f),
                    PathNode.CurveTo(134.62741f, 156.0f, 140.0f, 161.37259f, 140.0f, 168.0f),
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
        return _castleTurret!!
    }

private var _castleTurret: ImageVector? = null
