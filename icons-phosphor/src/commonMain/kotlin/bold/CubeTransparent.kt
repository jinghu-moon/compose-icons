package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.CubeTransparent: ImageVector
    get() {
        if (_cubeTransparent != null) return _cubeTransparent!!
        _cubeTransparent = phosphorBoldIcon(
            name = "CubeTransparent",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(224.5f, 95.53f),
                    PathNode.LineTo(224.5f, 95.53f),
                    PathNode.LineTo(160.5f, 31.53f),
                    PathNode.CurveTo(158.24846f, 29.27035f, 155.18988f, 28.000143f, 152.0f, 28.0f),
                    PathNode.LineTo(40.0f, 28.0f),
                    PathNode.CurveTo(33.37258f, 28.0f, 28.0f, 33.37258f, 28.0f, 40.0f),
                    PathNode.LineTo(28.0f, 152.0f),
                    PathNode.CurveTo(27.996222f, 154.92133f, 29.063566f, 157.74268f, 31.0f, 159.93f),
                    PathNode.CurveTo(31.15f, 160.11f, 31.31f, 160.29f, 31.5f, 160.49f),
                    PathNode.LineTo(95.5f, 224.49f),
                    PathNode.LineTo(95.5f, 224.49f),
                    PathNode.CurveTo(97.754814f, 226.74231f, 100.81298f, 228.00516f, 104.0f, 228.0f),
                    PathNode.LineTo(216.0f, 228.0f),
                    PathNode.CurveTo(222.62741f, 228.0f, 228.0f, 222.62741f, 228.0f, 216.0f),
                    PathNode.LineTo(228.0f, 104.0f),
                    PathNode.CurveTo(227.99986f, 100.82481f, 226.7413f, 97.7791f, 224.5f, 95.53f),
                    PathNode.Close,
                    PathNode.MoveTo(164.0f, 69.0f),
                    PathNode.LineTo(187.0f, 92.0f),
                    PathNode.LineTo(164.0f, 92.0f),
                    PathNode.Close,
                    PathNode.MoveTo(92.0f, 187.0f),
                    PathNode.LineTo(69.0f, 164.0f),
                    PathNode.LineTo(92.0f, 164.0f),
                    PathNode.Close,
                    PathNode.MoveTo(92.0f, 140.0f),
                    PathNode.LineTo(52.0f, 140.0f),
                    PathNode.LineTo(52.0f, 69.0f),
                    PathNode.LineTo(92.0f, 109.0f),
                    PathNode.Close,
                    PathNode.MoveTo(69.0f, 52.0f),
                    PathNode.LineTo(140.0f, 52.0f),
                    PathNode.LineTo(140.0f, 92.0f),
                    PathNode.LineTo(109.0f, 92.0f),
                    PathNode.Close,
                    PathNode.MoveTo(140.0f, 116.0f),
                    PathNode.LineTo(140.0f, 140.0f),
                    PathNode.LineTo(116.0f, 140.0f),
                    PathNode.LineTo(116.0f, 116.0f),
                    PathNode.Close,
                    PathNode.MoveTo(116.0f, 204.0f),
                    PathNode.LineTo(116.0f, 164.0f),
                    PathNode.LineTo(147.0f, 164.0f),
                    PathNode.LineTo(187.0f, 204.0f),
                    PathNode.Close,
                    PathNode.MoveTo(204.0f, 187.0f),
                    PathNode.LineTo(164.0f, 147.0f),
                    PathNode.LineTo(164.0f, 116.0f),
                    PathNode.LineTo(204.0f, 116.0f),
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
        return _cubeTransparent!!
    }

private var _cubeTransparent: ImageVector? = null
