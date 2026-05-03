package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.Flag: ImageVector
    get() {
        if (_flag != null) return _flag!!
        _flag = phosphorRegularIcon(
            name = "Flag",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(42.76f, 50.0f),
                    PathNode.CurveTo(41.018864f, 51.5092f, 40.013f, 53.695854f, 40.0f, 56.0f),
                    PathNode.LineTo(40.0f, 224.0f),
                    PathNode.CurveTo(40.0f, 228.41827f, 43.581722f, 232.0f, 48.0f, 232.0f),
                    PathNode.CurveTo(52.418278f, 232.0f, 56.0f, 228.41827f, 56.0f, 224.0f),
                    PathNode.LineTo(56.0f, 179.77f),
                    PathNode.CurveTo(82.79f, 158.61f, 105.87f, 170.02f, 132.45f, 183.18f),
                    PathNode.CurveTo(148.85f, 191.29f, 166.51f, 200.03f, 185.45f, 200.03f),
                    PathNode.CurveTo(199.38f, 200.03f, 213.99f, 195.28f, 229.27f, 182.03f),
                    PathNode.CurveTo(231.01114f, 180.5208f, 232.017f, 178.33414f, 232.03f, 176.03f),
                    PathNode.LineTo(232.03f, 56.0f),
                    PathNode.CurveTo(232.0226f, 52.863934f, 230.1835f, 50.021408f, 227.32596f, 48.72937f),
                    PathNode.CurveTo(224.4684f, 47.43734f, 221.11946f, 47.9341f, 218.76f, 50.0f),
                    PathNode.CurveTo(190.76f, 74.23f, 167.04f, 62.49f, 139.55f, 48.88f),
                    PathNode.CurveTo(111.07f, 34.76f, 78.78f, 18.79f, 42.76f, 50.0f),
                    PathNode.Close,
                    PathNode.MoveTo(216.0f, 172.25f),
                    PathNode.CurveTo(189.21f, 193.41f, 166.13f, 181.99f, 139.55f, 168.84f),
                    PathNode.CurveTo(114.55f, 156.49f, 86.74f, 142.71f, 56.0f, 160.44f),
                    PathNode.LineTo(56.0f, 59.79f),
                    PathNode.CurveTo(82.79f, 38.63f, 105.87f, 50.04f, 132.45f, 63.19f),
                    PathNode.CurveTo(157.45f, 75.54f, 185.27f, 89.32f, 216.0f, 71.59f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 16.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _flag!!
    }

private var _flag: ImageVector? = null
