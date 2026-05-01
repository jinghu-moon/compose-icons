package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.FlagCheckered: ImageVector
    get() {
        if (_flagCheckered != null) return _flagCheckered!!
        _flagCheckered = phosphorFillIcon(
            name = "FlagCheckered",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(227.32f, 48.75f),
                    PathNode.CurveTo(224.468f, 47.454987f, 221.12259f, 47.943512f, 218.76f, 50.0f),
                    PathNode.CurveTo(190.76f, 74.22f, 167.04f, 62.48f, 139.55f, 48.87f),
                    PathNode.CurveTo(111.07f, 34.76f, 78.78f, 18.79f, 42.76f, 50.0f),
                    PathNode.LineTo(42.76f, 50.0f),
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
                    PathNode.CurveTo(232.01347f, 52.870026f, 230.17308f, 50.03718f, 227.32f, 48.75f),
                    PathNode.Close,
                    PathNode.MoveTo(56.0f, 160.44f),
                    PathNode.LineTo(56.0f, 109.88f),
                    PathNode.CurveTo(72.85f, 98.6f, 88.64f, 98.29f, 104.0f, 102.54f),
                    PathNode.LineTo(104.0f, 154.28f),
                    PathNode.CurveTo(88.87f, 150.47f, 72.87f, 150.71f, 56.0f, 160.44f),
                    PathNode.Close,
                    PathNode.MoveTo(104.0f, 50.87f),
                    PathNode.CurveTo(113.25f, 53.7f, 122.61f, 58.32f, 132.45f, 63.19f),
                    PathNode.CurveTo(143.71f, 68.76f, 155.56f, 74.62f, 168.0f, 77.75f),
                    PathNode.LineTo(168.0f, 129.49f),
                    PathNode.CurveTo(183.35f, 133.74f, 199.14f, 133.43f, 216.0f, 122.14f),
                    PathNode.LineTo(216.0f, 172.25f),
                    PathNode.CurveTo(199.13f, 185.57f, 183.73f, 185.97f, 168.0f, 181.16f),
                    PathNode.LineTo(168.0f, 129.49f),
                    PathNode.CurveTo(146.38f, 123.49f, 125.62f, 108.49f, 104.0f, 102.54f),
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
        return _flagCheckered!!
    }

private var _flagCheckered: ImageVector? = null
