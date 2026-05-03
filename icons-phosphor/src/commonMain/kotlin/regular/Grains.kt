package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.Grains: ImageVector
    get() {
        if (_grains != null) return _grains!!
        _grains = phosphorRegularIcon(
            name = "Grains",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(208.0f, 56.0f),
                    PathNode.CurveTo(197.1024f, 55.999874f, 186.3006f, 58.034756f, 176.15f, 62.0f),
                    PathNode.CurveTo(161.83f, 32.3f, 132.9f, 17.54f, 131.58f, 16.88f),
                    PathNode.CurveTo(129.32652f, 15.752362f, 126.67347f, 15.752362f, 124.42f, 16.88f),
                    PathNode.CurveTo(123.09f, 17.54f, 94.17f, 32.3f, 79.85f, 62.0f),
                    PathNode.CurveTo(69.6994f, 58.034756f, 58.897606f, 55.999874f, 48.0f, 56.0f),
                    PathNode.CurveTo(43.581722f, 56.0f, 40.0f, 59.581722f, 40.0f, 64.0f),
                    PathNode.LineTo(40.0f, 144.0f),
                    PathNode.CurveTo(40.0f, 192.60106f, 79.39894f, 232.0f, 128.0f, 232.0f),
                    PathNode.CurveTo(176.60106f, 232.0f, 216.0f, 192.60106f, 216.0f, 144.0f),
                    PathNode.LineTo(216.0f, 64.0f),
                    PathNode.CurveTo(216.0f, 59.581722f, 212.41827f, 56.0f, 208.0f, 56.0f),
                    PathNode.Close,
                    PathNode.MoveTo(120.0f, 215.56f),
                    PathNode.CurveTo(83.57842f, 211.44221f, 56.042484f, 180.6536f, 56.0f, 144.0f),
                    PathNode.LineTo(56.0f, 128.44f),
                    PathNode.CurveTo(92.42158f, 132.55779f, 119.95752f, 163.3464f, 120.0f, 200.0f),
                    PathNode.Close,
                    PathNode.MoveTo(120.0f, 149.46f),
                    PathNode.CurveTo(105.15092f, 128.29546f, 81.74599f, 114.731575f, 56.0f, 112.37f),
                    PathNode.LineTo(56.0f, 72.44f),
                    PathNode.CurveTo(92.42158f, 76.557785f, 119.95752f, 107.34641f, 120.0f, 144.0f),
                    PathNode.Close,
                    PathNode.MoveTo(94.15f, 69.11f),
                    PathNode.CurveTo(103.37f, 49.9f, 120.56f, 37.78f, 128.0f, 33.21f),
                    PathNode.CurveTo(135.44f, 37.79f, 152.63f, 49.91f, 161.84f, 69.11f),
                    PathNode.CurveTo(147.05058f, 78.26262f, 135.28168f, 91.56523f, 128.0f, 107.36f),
                    PathNode.CurveTo(120.71764f, 91.56257f, 108.94467f, 78.259285f, 94.15f, 69.11f),
                    PathNode.Close,
                    PathNode.MoveTo(200.0f, 144.0f),
                    PathNode.CurveTo(199.95752f, 180.6536f, 172.42157f, 211.44221f, 136.0f, 215.56f),
                    PathNode.LineTo(136.0f, 200.0f),
                    PathNode.CurveTo(136.04248f, 163.3464f, 163.57843f, 132.55779f, 200.0f, 128.44f),
                    PathNode.Close,
                    PathNode.MoveTo(200.0f, 112.37f),
                    PathNode.CurveTo(174.25401f, 114.731575f, 150.84909f, 128.29546f, 136.0f, 149.46f),
                    PathNode.LineTo(136.0f, 144.0f),
                    PathNode.CurveTo(136.04248f, 107.34641f, 163.57843f, 76.557785f, 200.0f, 72.44f),
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
        return _grains!!
    }

private var _grains: ImageVector? = null
