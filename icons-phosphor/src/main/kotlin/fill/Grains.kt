package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Grains: ImageVector
    get() {
        if (_grains != null) return _grains!!
        _grains = phosphorFillIcon(
            name = "Grains",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(208.0f, 56.0f),
                    PathNode.CurveTo(197.10574f, 56.00089f, 186.3074f, 58.03575f, 176.16f, 62.0f),
                    PathNode.CurveTo(161.84f, 32.3f, 132.91f, 17.54f, 131.59f, 16.87f),
                    PathNode.CurveTo(129.33653f, 15.742362f, 126.68347f, 15.742362f, 124.43f, 16.87f),
                    PathNode.CurveTo(123.1f, 17.51f, 94.17f, 32.27f, 79.85f, 62.0f),
                    PathNode.CurveTo(69.69947f, 58.034527f, 58.897625f, 55.99964f, 48.0f, 56.0f),
                    PathNode.CurveTo(43.581722f, 56.0f, 40.0f, 59.581722f, 40.0f, 64.0f),
                    PathNode.LineTo(40.0f, 144.0f),
                    PathNode.CurveTo(40.053986f, 187.7434f, 72.18892f, 224.82544f, 115.48f, 231.1f),
                    PathNode.CurveTo(116.62764f, 231.25052f, 117.78422f, 230.89651f, 118.65101f, 230.12944f),
                    PathNode.CurveTo(119.51781f, 229.36237f, 120.00983f, 228.25743f, 120.0f, 227.1f),
                    PathNode.LineTo(120.0f, 176.27f),
                    PathNode.CurveTo(119.947235f, 171.98885f, 123.20465f, 168.3913f, 127.47f, 168.02f),
                    PathNode.CurveTo(129.68198f, 167.87312f, 131.85571f, 168.65068f, 133.47269f, 170.16719f),
                    PathNode.CurveTo(135.08966f, 171.6837f, 136.00487f, 173.80316f, 136.0f, 176.02f),
                    PathNode.LineTo(136.0f, 227.16f),
                    PathNode.CurveTo(135.99017f, 228.31743f, 136.4822f, 229.42236f, 137.34897f, 230.18944f),
                    PathNode.CurveTo(138.21579f, 230.95651f, 139.37238f, 231.31052f, 140.52f, 231.16f),
                    PathNode.CurveTo(183.8336f, 224.88216f, 215.9758f, 187.76619f, 216.0f, 144.0f),
                    PathNode.LineTo(216.0f, 64.0f),
                    PathNode.CurveTo(216.0f, 59.581722f, 212.41827f, 56.0f, 208.0f, 56.0f),
                    PathNode.Close,
                    PathNode.MoveTo(120.0f, 149.46f),
                    PathNode.CurveTo(105.15092f, 128.29546f, 81.74599f, 114.731575f, 56.0f, 112.37f),
                    PathNode.LineTo(56.0f, 72.44f),
                    PathNode.CurveTo(92.42158f, 76.557785f, 119.95752f, 107.34641f, 120.0f, 144.0f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 107.36f),
                    PathNode.CurveTo(120.71832f, 91.56523f, 108.949425f, 78.26262f, 94.16f, 69.11f),
                    PathNode.CurveTo(103.37f, 49.9f, 120.56f, 37.78f, 128.0f, 33.21f),
                    PathNode.CurveTo(135.45f, 37.79f, 152.63f, 49.91f, 161.84f, 69.11f),
                    PathNode.CurveTo(147.05058f, 78.26262f, 135.28168f, 91.56523f, 128.0f, 107.36f),
                    PathNode.Close,
                    PathNode.MoveTo(200.0f, 112.36f),
                    PathNode.CurveTo(174.25401f, 114.72158f, 150.84909f, 128.28546f, 136.0f, 149.45f),
                    PathNode.LineTo(136.0f, 144.0f),
                    PathNode.CurveTo(136.04248f, 107.34641f, 163.57843f, 76.557785f, 200.0f, 72.44f),
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
        return _grains!!
    }

private var _grains: ImageVector? = null
