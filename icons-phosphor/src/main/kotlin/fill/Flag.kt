package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Flag: ImageVector
    get() {
        if (_flag != null) return _flag!!
        _flag = phosphorFillIcon(
            name = "Flag",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(232.0f, 56.0f),
                    PathNode.LineTo(232.0f, 176.0f),
                    PathNode.CurveTo(231.987f, 178.30414f, 230.98114f, 180.4908f, 229.24f, 182.0f),
                    PathNode.CurveTo(213.96f, 195.23f, 199.35f, 200.0f, 185.42f, 200.0f),
                    PathNode.CurveTo(166.51f, 200.0f, 148.85f, 191.26f, 132.42f, 183.15f),
                    PathNode.CurveTo(105.87f, 170.0f, 82.79f, 158.61f, 56.0f, 179.77f),
                    PathNode.LineTo(56.0f, 224.0f),
                    PathNode.CurveTo(56.0f, 228.41827f, 52.418278f, 232.0f, 48.0f, 232.0f),
                    PathNode.CurveTo(43.581722f, 232.0f, 40.0f, 228.41827f, 40.0f, 224.0f),
                    PathNode.LineTo(40.0f, 56.0f),
                    PathNode.CurveTo(40.01552f, 53.694267f, 41.025143f, 51.507355f, 42.77f, 50.0f),
                    PathNode.LineTo(42.77f, 50.0f),
                    PathNode.CurveTo(78.77f, 18.82f, 111.08f, 34.79f, 139.56f, 48.88f),
                    PathNode.CurveTo(167.0f, 62.46f, 190.79f, 74.2f, 218.76f, 50.0f),
                    PathNode.CurveTo(221.12068f, 47.953613f, 224.45663f, 47.46867f, 227.30226f, 48.758224f),
                    PathNode.CurveTo(230.14787f, 50.047783f, 231.98245f, 52.875862f, 232.0f, 56.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 4f,
            )
        }
        return _flag!!
    }

private var _flag: ImageVector? = null
