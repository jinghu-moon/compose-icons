package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.MedalMilitary: ImageVector
    get() {
        if (_medalMilitary != null) return _medalMilitary!!
        _medalMilitary = phosphorFillIcon(
            name = "MedalMilitary",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(207.0f, 40.0f),
                    PathNode.LineTo(49.0f, 40.0f),
                    PathNode.CurveTo(39.61116f, 40.0f, 32.0f, 47.61116f, 32.0f, 57.0f),
                    PathNode.LineTo(32.0f, 106.21f),
                    PathNode.CurveTo(32.00861f, 112.88227f, 35.919617f, 118.932594f, 42.0f, 121.68f),
                    PathNode.LineTo(104.6f, 150.13f),
                    PathNode.CurveTo(85.53692f, 160.79758f, 76.081085f, 182.99149f, 81.59325f, 204.12947f),
                    PathNode.CurveTo(87.1054f, 225.26747f, 106.19513f, 240.01755f, 128.04f, 240.01755f),
                    PathNode.CurveTo(149.88487f, 240.01755f, 168.9746f, 225.26747f, 174.48676f, 204.12947f),
                    PathNode.CurveTo(179.99892f, 182.99149f, 170.54309f, 160.79758f, 151.48f, 150.13f),
                    PathNode.LineTo(214.0f, 121.68f),
                    PathNode.CurveTo(220.08038f, 118.932594f, 223.9914f, 112.88227f, 224.0f, 106.21f),
                    PathNode.LineTo(224.0f, 57.0f),
                    PathNode.CurveTo(224.0f, 47.61116f, 216.38882f, 40.0f, 207.0f, 40.0f),
                    PathNode.Close,
                    PathNode.MoveTo(96.0f, 56.0f),
                    PathNode.LineTo(160.0f, 56.0f),
                    PathNode.LineTo(160.0f, 128.67f),
                    PathNode.LineTo(128.0f, 143.21f),
                    PathNode.LineTo(96.0f, 128.67f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 224.0f),
                    PathNode.CurveTo(110.32689f, 224.0f, 96.0f, 209.67311f, 96.0f, 192.0f),
                    PathNode.CurveTo(96.0f, 174.32689f, 110.32689f, 160.0f, 128.0f, 160.0f),
                    PathNode.CurveTo(145.67311f, 160.0f, 160.0f, 174.32689f, 160.0f, 192.0f),
                    PathNode.CurveTo(160.0f, 209.67311f, 145.67311f, 224.0f, 128.0f, 224.0f),
                    PathNode.Close
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
        return _medalMilitary!!
    }

private var _medalMilitary: ImageVector? = null
