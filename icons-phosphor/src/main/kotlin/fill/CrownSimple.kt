package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.CrownSimple: ImageVector
    get() {
        if (_crownSimple != null) return _crownSimple!!
        _crownSimple = phosphorFillIcon(
            name = "CrownSimple",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(239.75f, 90.81f),
                    PathNode.CurveTo(239.75f, 90.92f, 239.75f, 91.02f, 239.68f, 91.13f),
                    PathNode.LineTo(217.0f, 195.0f),
                    PathNode.CurveTo(215.55977f, 202.54494f, 208.96117f, 208.0018f, 201.28f, 208.0f),
                    PathNode.LineTo(54.71f, 208.0f),
                    PathNode.CurveTo(47.032604f, 207.99701f, 40.43951f, 202.54123f, 39.0f, 195.0f),
                    PathNode.LineTo(16.32f, 91.13f),
                    PathNode.CurveTo(16.32f, 91.02f, 16.27f, 90.92f, 16.25f, 90.81f),
                    PathNode.CurveTo(14.974316f, 83.74236f, 18.564238f, 76.69065f, 25.029715f, 73.56392f),
                    PathNode.CurveTo(31.49519f, 70.437195f, 39.251915f, 72.00163f, 44.0f, 77.39f),
                    PathNode.LineTo(77.67f, 113.68f),
                    PathNode.LineTo(113.47f, 33.39f),
                    PathNode.CurveTo(113.471664f, 33.356686f, 113.471664f, 33.32331f, 113.47f, 33.29f),
                    PathNode.CurveTo(116.083984f, 27.620481f, 121.7569f, 23.989187f, 128.0f, 23.989187f),
                    PathNode.CurveTo(134.2431f, 23.989187f, 139.91602f, 27.620481f, 142.53f, 33.29f),
                    PathNode.CurveTo(142.52834f, 33.32331f, 142.52834f, 33.356686f, 142.53f, 33.39f),
                    PathNode.LineTo(178.33f, 113.68f),
                    PathNode.LineTo(212.0f, 77.39f),
                    PathNode.CurveTo(216.7571f, 72.04258f, 224.48683f, 70.50484f, 230.92831f, 73.62446f),
                    PathNode.CurveTo(237.36981f, 76.74409f, 240.95598f, 83.76214f, 239.71f, 90.81f),
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
        return _crownSimple!!
    }

private var _crownSimple: ImageVector? = null
