package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.User: ImageVector
    get() {
        if (_user != null) return _user!!
        _user = phosphorFillIcon(
            name = "User",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(230.93f, 220.0f),
                    PathNode.CurveTo(229.50061f, 222.47577f, 226.85876f, 224.00064f, 224.0f, 224.0f),
                    PathNode.LineTo(32.0f, 224.0f),
                    PathNode.CurveTo(29.143341f, 223.99707f, 26.505009f, 222.47113f, 25.077948f, 219.99644f),
                    PathNode.CurveTo(23.650887f, 217.52177f, 23.651669f, 214.47394f, 25.08f, 212.0f),
                    PathNode.CurveTo(40.31f, 185.67f, 63.78f, 166.79f, 91.17f, 157.84f),
                    PathNode.CurveTo(63.322132f, 141.26196f, 49.982395f, 108.12139f, 58.579403f, 76.873566f),
                    PathNode.CurveTo(67.17641f, 45.625736f, 95.591125f, 23.972795f, 128.0f, 23.972795f),
                    PathNode.CurveTo(160.40887f, 23.972795f, 188.8236f, 45.625736f, 197.4206f, 76.873566f),
                    PathNode.CurveTo(206.01761f, 108.12139f, 192.67787f, 141.26196f, 164.83f, 157.84f),
                    PathNode.CurveTo(192.22f, 166.79f, 215.69f, 185.67f, 230.92f, 212.0f),
                    PathNode.CurveTo(232.35216f, 214.47342f, 232.35597f, 217.52301f, 230.93f, 220.0f),
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
        return _user!!
    }

private var _user: ImageVector? = null
