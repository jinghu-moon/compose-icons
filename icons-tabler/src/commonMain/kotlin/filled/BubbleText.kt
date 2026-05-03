package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.BubbleText: ImageVector
    get() {
        if (_bubbleText != null) return _bubbleText!!
        _bubbleText = tablerFilledIcon(
            name = "BubbleText",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(12.4f, 2.0f),
                    PathNode.LineTo(12.653f, 2.005f),
                    PathNode.CurveTo(14.82543f, 2.092889f, 16.801302f, 3.287848f, 17.888f, 5.171f),
                    PathNode.LineTo(17.977f, 5.334f),
                    PathNode.LineTo(18.155f, 5.373f),
                    PathNode.CurveTo(20.014141f, 5.808596f, 21.577303f, 7.060156f, 22.409f, 8.779f),
                    PathNode.LineTo(22.514f, 9.007f),
                    PathNode.CurveTo(23.363005f, 10.954374f, 23.179226f, 13.197683f, 22.0246f, 14.980916f),
                    PathNode.CurveTo(20.869976f, 16.764149f, 18.898285f, 17.8498f, 16.774f, 17.872f),
                    PathNode.LineTo(16.63f, 17.87f),
                    PathNode.LineTo(16.593f, 17.922f),
                    PathNode.CurveTo(15.322168f, 19.59722f, 13.175757f, 20.354637f, 11.135f, 19.848f),
                    PathNode.LineTo(10.949f, 19.797f),
                    PathNode.LineTo(7.514f, 21.857f),
                    PathNode.CurveTo(7.222594f, 22.031878f, 6.862316f, 22.046787f, 6.557458f, 21.896582f),
                    PathNode.CurveTo(6.2526f, 21.746376f, 6.044896f, 21.45162f, 6.006f, 21.114f),
                    PathNode.LineTo(6.0f, 21.0f),
                    PathNode.LineTo(6.0f, 18.565f),
                    PathNode.LineTo(5.945f, 18.539f),
                    PathNode.CurveTo(5.288554f, 18.206726f, 4.747133f, 17.684814f, 4.391f, 17.041f),
                    PathNode.LineTo(4.289f, 16.842f),
                    PathNode.CurveTo(3.972417f, 16.176197f, 3.863696f, 15.430479f, 3.977f, 14.702f),
                    PathNode.LineTo(4.015f, 14.492f),
                    PathNode.LineTo(3.899f, 14.4f),
                    PathNode.CurveTo(2.13626f, 12.939941f, 1.397056f, 10.579738f, 2.012f, 8.375f),
                    PathNode.LineTo(2.083f, 8.137f),
                    PathNode.CurveTo(2.849544f, 5.782064f, 5.02678f, 4.17364f, 7.503f, 4.133f),
                    PathNode.LineTo(7.66f, 4.133f),
                    PathNode.LineTo(7.81f, 3.968f),
                    PathNode.CurveTo(8.943455f, 2.775921f, 10.496437f, 2.071879f, 12.14f, 2.005f),
                    PathNode.Close,
                    PathNode.MoveTo(14.0f, 13.0f),
                    PathNode.LineTo(9.0f, 13.0f),
                    PathNode.CurveTo(8.447715f, 13.0f, 8.0f, 13.447715f, 8.0f, 14.0f),
                    PathNode.CurveTo(8.0f, 14.552285f, 8.447715f, 15.0f, 9.0f, 15.0f),
                    PathNode.LineTo(14.0f, 15.0f),
                    PathNode.CurveTo(14.552285f, 15.0f, 15.0f, 14.552285f, 15.0f, 14.0f),
                    PathNode.CurveTo(15.0f, 13.447715f, 14.552285f, 13.0f, 14.0f, 13.0f),
                    PathNode.MoveTo(17.0f, 9.0f),
                    PathNode.LineTo(7.0f, 9.0f),
                    PathNode.CurveTo(6.447716f, 9.0f, 6.0f, 9.447715f, 6.0f, 10.0f),
                    PathNode.CurveTo(6.0f, 10.552285f, 6.447716f, 11.0f, 7.0f, 11.0f),
                    PathNode.LineTo(17.0f, 11.0f),
                    PathNode.CurveTo(17.552284f, 11.0f, 18.0f, 10.552285f, 18.0f, 10.0f),
                    PathNode.CurveTo(18.0f, 9.447715f, 17.552284f, 9.0f, 17.0f, 9.0f)
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 4f,
            )
        }
        return _bubbleText!!
    }

private var _bubbleText: ImageVector? = null
