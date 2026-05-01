package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.ChatCircleDots: ImageVector
    get() {
        if (_chatCircleDots != null) return _chatCircleDots!!
        _chatCircleDots = phosphorLightIcon(
            name = "ChatCircleDots",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(138.0f, 128.0f),
                    PathNode.CurveTo(138.0f, 133.52284f, 133.52284f, 138.0f, 128.0f, 138.0f),
                    PathNode.CurveTo(122.47715f, 138.0f, 118.0f, 133.52284f, 118.0f, 128.0f),
                    PathNode.CurveTo(118.0f, 122.47715f, 122.47715f, 118.0f, 128.0f, 118.0f),
                    PathNode.CurveTo(133.52284f, 118.0f, 138.0f, 122.47715f, 138.0f, 128.0f),
                    PathNode.Close,
                    PathNode.MoveTo(84.0f, 118.0f),
                    PathNode.CurveTo(78.47715f, 118.0f, 74.0f, 122.47715f, 74.0f, 128.0f),
                    PathNode.CurveTo(74.0f, 133.52284f, 78.47715f, 138.0f, 84.0f, 138.0f),
                    PathNode.CurveTo(89.52285f, 138.0f, 94.0f, 133.52284f, 94.0f, 128.0f),
                    PathNode.CurveTo(94.0f, 122.47715f, 89.52285f, 118.0f, 84.0f, 118.0f),
                    PathNode.Close,
                    PathNode.MoveTo(172.0f, 118.0f),
                    PathNode.CurveTo(166.47716f, 118.0f, 162.0f, 122.47715f, 162.0f, 128.0f),
                    PathNode.CurveTo(162.0f, 133.52284f, 166.47716f, 138.0f, 172.0f, 138.0f),
                    PathNode.CurveTo(177.52284f, 138.0f, 182.0f, 133.52284f, 182.0f, 128.0f),
                    PathNode.CurveTo(182.0f, 122.47715f, 177.52284f, 118.0f, 172.0f, 118.0f),
                    PathNode.Close,
                    PathNode.MoveTo(230.0f, 128.0f),
                    PathNode.CurveTo(230.00755f, 163.97234f, 211.06636f, 197.28893f, 180.15141f, 215.68115f),
                    PathNode.CurveTo(149.23645f, 234.0734f, 110.919304f, 234.8215f, 79.31f, 217.65f),
                    PathNode.LineTo(44.44f, 229.27f),
                    PathNode.CurveTo(39.40888f, 230.94783f, 33.861603f, 229.6387f, 30.111448f, 225.88855f),
                    PathNode.CurveTo(26.361296f, 222.1384f, 25.052174f, 216.59113f, 26.73f, 211.56f),
                    PathNode.LineTo(38.35f, 176.69f),
                    PathNode.CurveTo(18.056463f, 139.29442f, 23.106808f, 93.23035f, 51.02078f, 61.120106f),
                    PathNode.CurveTo(78.93475f, 29.009869f, 123.84805f, 17.599337f, 163.7035f, 32.492287f),
                    PathNode.CurveTo(203.55896f, 47.385235f, 229.98355f, 85.45289f, 230.0f, 128.0f),
                    PathNode.Close,
                    PathNode.MoveTo(218.0f, 128.0f),
                    PathNode.CurveTo(217.991f, 90.16132f, 194.31535f, 56.36921f, 158.75446f, 43.43913f),
                    PathNode.CurveTo(123.19352f, 30.50905f, 83.3427f, 41.2027f, 59.032326f, 70.19877f),
                    PathNode.CurveTo(34.72196f, 99.19483f, 31.144442f, 140.30011f, 50.08f, 173.06f),
                    PathNode.CurveTo(50.943245f, 174.54918f, 51.125343f, 176.33739f, 50.58f, 177.97f),
                    PathNode.LineTo(38.12f, 215.35f),
                    PathNode.CurveTo(37.880314f, 216.06873f, 38.06733f, 216.8612f, 38.603065f, 217.39694f),
                    PathNode.CurveTo(39.1388f, 217.93268f, 39.931267f, 218.11969f, 40.65f, 217.88f),
                    PathNode.LineTo(78.0f, 205.42f),
                    PathNode.CurveTo(78.61333f, 205.21837f, 79.25439f, 205.11377f, 79.9f, 205.11f),
                    PathNode.CurveTo(80.95322f, 205.11604f, 81.98687f, 205.39513f, 82.9f, 205.92f),
                    PathNode.CurveTo(110.748795f, 222.0462f, 145.08876f, 222.07587f, 172.96536f, 205.99782f),
                    PathNode.CurveTo(200.84198f, 189.91975f, 218.01271f, 160.1809f, 218.0f, 128.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 12.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _chatCircleDots!!
    }

private var _chatCircleDots: ImageVector? = null
