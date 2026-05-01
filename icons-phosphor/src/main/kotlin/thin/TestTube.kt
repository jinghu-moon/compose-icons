package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.TestTube: ImageVector
    get() {
        if (_testTube != null) return _testTube!!
        _testTube = phosphorThinIcon(
            name = "TestTube",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(234.83f, 89.18f),
                    PathNode.LineTo(174.83f, 29.18f),
                    PathNode.CurveTo(174.07973f, 28.428892f, 173.06163f, 28.006853f, 172.0f, 28.006853f),
                    PathNode.CurveTo(170.93837f, 28.006853f, 169.92027f, 28.428892f, 169.17f, 29.18f),
                    PathNode.LineTo(39.94f, 158.41f),
                    PathNode.CurveTo(24.424189f, 174.40082f, 24.615175f, 199.88469f, 40.368916f, 215.64116f),
                    PathNode.CurveTo(56.122658f, 231.39763f, 81.60649f, 231.59303f, 97.6f, 216.08f),
                    PathNode.LineTo(210.16f, 103.5f),
                    PathNode.LineTo(233.26f, 95.8f),
                    PathNode.CurveTo(234.57495f, 95.36265f, 235.56985f, 94.27585f, 235.88963f, 92.927475f),
                    PathNode.CurveTo(236.20941f, 91.5791f, 235.8085f, 90.16127f, 234.83f, 89.18f),
                    PathNode.Close,
                    PathNode.MoveTo(91.94f, 210.42f),
                    PathNode.CurveTo(79.1408f, 223.21643f, 58.391438f, 223.2142f, 45.595f, 210.415f),
                    PathNode.CurveTo(32.79856f, 197.6158f, 32.8008f, 176.86642f, 45.6f, 164.07f),
                    PathNode.LineTo(75.0f, 134.63f),
                    PathNode.CurveTo(84.2f, 131.25f, 98.94f, 129.55f, 118.11f, 139.56f),
                    PathNode.CurveTo(130.2f, 145.87f, 140.85f, 148.04f, 149.77f, 148.04f),
                    PathNode.CurveTo(151.41f, 148.04f, 152.97f, 147.95f, 154.5f, 147.82f),
                    PathNode.Close,
                    PathNode.MoveTo(206.74f, 96.21f),
                    PathNode.CurveTo(206.14629f, 96.41724f, 205.60883f, 96.759575f, 205.17f, 97.21f),
                    PathNode.LineTo(165.0f, 137.39f),
                    PathNode.CurveTo(155.8f, 140.77f, 141.06f, 142.47f, 121.89f, 132.46f),
                    PathNode.CurveTo(107.59f, 124.99f, 95.31f, 123.33f, 85.51f, 124.19f),
                    PathNode.LineTo(172.0f, 37.66f),
                    PathNode.LineTo(224.6f, 90.26f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 8.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _testTube!!
    }

private var _testTube: ImageVector? = null
