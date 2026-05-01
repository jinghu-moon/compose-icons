package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.ShirtFolded: ImageVector
    get() {
        if (_shirtFolded != null) return _shirtFolded!!
        _shirtFolded = phosphorBoldIcon(
            name = "ShirtFolded",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(200.0f, 36.0f),
                    PathNode.LineTo(177.0f, 36.0f),
                    PathNode.LineTo(164.49f, 23.51f),
                    PathNode.LineTo(164.49f, 23.51f),
                    PathNode.CurveTo(162.23764f, 21.260138f, 159.18355f, 19.997498f, 156.0f, 20.0f),
                    PathNode.LineTo(100.0f, 20.0f),
                    PathNode.CurveTo(96.816444f, 19.997498f, 93.76237f, 21.260138f, 91.51f, 23.51f),
                    PathNode.LineTo(91.51f, 23.51f),
                    PathNode.LineTo(79.0f, 36.0f),
                    PathNode.LineTo(56.0f, 36.0f),
                    PathNode.CurveTo(44.954304f, 36.0f, 36.0f, 44.954304f, 36.0f, 56.0f),
                    PathNode.LineTo(36.0f, 208.0f),
                    PathNode.CurveTo(36.0f, 219.0457f, 44.954304f, 228.0f, 56.0f, 228.0f),
                    PathNode.LineTo(200.0f, 228.0f),
                    PathNode.CurveTo(211.0457f, 228.0f, 220.0f, 219.0457f, 220.0f, 208.0f),
                    PathNode.LineTo(220.0f, 56.0f),
                    PathNode.CurveTo(220.0f, 44.954304f, 211.0457f, 36.0f, 200.0f, 36.0f),
                    PathNode.Close,
                    PathNode.MoveTo(96.0f, 53.0f),
                    PathNode.LineTo(103.33f, 45.67f),
                    PathNode.LineTo(118.82f, 72.2f),
                    PathNode.LineTo(96.0f, 94.48f),
                    PathNode.Close,
                    PathNode.MoveTo(137.18f, 72.2f),
                    PathNode.LineTo(152.67f, 45.64f),
                    PathNode.LineTo(160.0f, 53.0f),
                    PathNode.LineTo(160.0f, 94.48f),
                    PathNode.Close,
                    PathNode.MoveTo(60.0f, 60.0f),
                    PathNode.LineTo(72.0f, 60.0f),
                    PathNode.LineTo(72.0f, 104.0f),
                    PathNode.CurveTo(71.997574f, 112.07438f, 76.85058f, 119.35822f, 84.30308f, 122.465614f),
                    PathNode.CurveTo(91.75558f, 125.57301f, 100.34557f, 123.89436f, 106.08f, 118.21f),
                    PathNode.LineTo(116.0f, 108.5f),
                    PathNode.LineTo(116.0f, 204.0f),
                    PathNode.LineTo(60.0f, 204.0f),
                    PathNode.Close,
                    PathNode.MoveTo(196.0f, 204.0f),
                    PathNode.LineTo(140.0f, 204.0f),
                    PathNode.LineTo(140.0f, 108.5f),
                    PathNode.LineTo(149.92f, 118.19f),
                    PathNode.CurveTo(155.65184f, 123.8718f, 164.237f, 125.551735f, 171.6877f, 122.44947f),
                    PathNode.CurveTo(179.1384f, 119.3472f, 183.99435f, 112.07074f, 184.0f, 104.0f),
                    PathNode.LineTo(184.0f, 60.0f),
                    PathNode.LineTo(196.0f, 60.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 24.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _shirtFolded!!
    }

private var _shirtFolded: ImageVector? = null
