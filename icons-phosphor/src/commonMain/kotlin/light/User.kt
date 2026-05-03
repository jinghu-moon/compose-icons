package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.User: ImageVector
    get() {
        if (_user != null) return _user!!
        _user = phosphorLightIcon(
            name = "User",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(229.19f, 213.0f),
                    PathNode.CurveTo(213.38f, 185.68f, 188.56f, 166.51f, 159.72f, 158.38f),
                    PathNode.CurveTo(188.58263f, 143.70831f, 203.61708f, 111.15714f, 196.07365f, 79.67053f),
                    PathNode.CurveTo(188.53023f, 48.183937f, 160.37761f, 25.979345f, 128.0f, 25.979345f),
                    PathNode.CurveTo(95.62239f, 25.979345f, 67.46977f, 48.183937f, 59.926346f, 79.67053f),
                    PathNode.CurveTo(52.38291f, 111.15714f, 67.41737f, 143.70831f, 96.28f, 158.38f),
                    PathNode.CurveTo(67.44f, 166.5f, 42.62f, 185.67f, 26.81f, 213.0f),
                    PathNode.CurveTo(25.627644f, 214.85994f, 25.560154f, 217.21837f, 26.634212f, 219.14288f),
                    PathNode.CurveTo(27.708273f, 221.06738f, 29.750969f, 222.24814f, 31.9547f, 222.2183f),
                    PathNode.CurveTo(34.158432f, 222.18848f, 36.168423f, 220.95287f, 37.19f, 219.0f),
                    PathNode.CurveTo(56.4f, 185.81f, 90.34f, 166.0f, 128.0f, 166.0f),
                    PathNode.CurveTo(165.66f, 166.0f, 199.6f, 185.81f, 218.81f, 219.0f),
                    PathNode.CurveTo(219.83157f, 220.95287f, 221.84157f, 222.18848f, 224.0453f, 222.2183f),
                    PathNode.CurveTo(226.24904f, 222.24814f, 228.29173f, 221.06738f, 229.36577f, 219.14288f),
                    PathNode.CurveTo(230.43985f, 217.21837f, 230.37238f, 214.85994f, 229.19f, 213.0f),
                    PathNode.Close,
                    PathNode.MoveTo(70.0f, 96.0f),
                    PathNode.CurveTo(70.0f, 63.967484f, 95.96748f, 38.0f, 128.0f, 38.0f),
                    PathNode.CurveTo(160.03252f, 38.0f, 186.0f, 63.967484f, 186.0f, 96.0f),
                    PathNode.CurveTo(186.0f, 128.03252f, 160.03252f, 154.0f, 128.0f, 154.0f),
                    PathNode.CurveTo(95.983475f, 153.96143f, 70.038574f, 128.01653f, 70.0f, 96.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 12.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _user!!
    }

private var _user: ImageVector? = null
