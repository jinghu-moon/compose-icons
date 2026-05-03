package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Command: ImageVector
    get() {
        if (_command != null) return _command!!
        _command = phosphorLightIcon(
            name = "Command",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(180.0f, 146.0f),
                    PathNode.LineTo(158.0f, 146.0f),
                    PathNode.LineTo(158.0f, 110.0f),
                    PathNode.LineTo(180.0f, 110.0f),
                    PathNode.CurveTo(198.77768f, 110.0f, 214.0f, 94.77768f, 214.0f, 76.0f),
                    PathNode.CurveTo(214.0f, 57.222317f, 198.77768f, 42.0f, 180.0f, 42.0f),
                    PathNode.CurveTo(161.22232f, 42.0f, 146.0f, 57.222317f, 146.0f, 76.0f),
                    PathNode.LineTo(146.0f, 98.0f),
                    PathNode.LineTo(110.0f, 98.0f),
                    PathNode.LineTo(110.0f, 76.0f),
                    PathNode.CurveTo(110.0f, 57.222317f, 94.77768f, 42.0f, 76.0f, 42.0f),
                    PathNode.CurveTo(57.222317f, 42.0f, 42.0f, 57.222317f, 42.0f, 76.0f),
                    PathNode.CurveTo(42.0f, 94.77768f, 57.222317f, 110.0f, 76.0f, 110.0f),
                    PathNode.LineTo(98.0f, 110.0f),
                    PathNode.LineTo(98.0f, 146.0f),
                    PathNode.LineTo(76.0f, 146.0f),
                    PathNode.CurveTo(57.222317f, 146.0f, 42.0f, 161.22232f, 42.0f, 180.0f),
                    PathNode.CurveTo(42.0f, 198.77768f, 57.222317f, 214.0f, 76.0f, 214.0f),
                    PathNode.CurveTo(94.77768f, 214.0f, 110.0f, 198.77768f, 110.0f, 180.0f),
                    PathNode.LineTo(110.0f, 158.0f),
                    PathNode.LineTo(146.0f, 158.0f),
                    PathNode.LineTo(146.0f, 180.0f),
                    PathNode.CurveTo(146.0f, 198.77768f, 161.22232f, 214.0f, 180.0f, 214.0f),
                    PathNode.CurveTo(198.77768f, 214.0f, 214.0f, 198.77768f, 214.0f, 180.0f),
                    PathNode.CurveTo(214.0f, 161.22232f, 198.77768f, 146.0f, 180.0f, 146.0f),
                    PathNode.Close,
                    PathNode.MoveTo(158.0f, 76.0f),
                    PathNode.CurveTo(158.0f, 63.849735f, 167.84973f, 54.0f, 180.0f, 54.0f),
                    PathNode.CurveTo(192.15027f, 54.0f, 202.0f, 63.849735f, 202.0f, 76.0f),
                    PathNode.CurveTo(202.0f, 88.15026f, 192.15027f, 98.0f, 180.0f, 98.0f),
                    PathNode.LineTo(158.0f, 98.0f),
                    PathNode.Close,
                    PathNode.MoveTo(54.0f, 76.0f),
                    PathNode.CurveTo(54.0f, 63.849735f, 63.849735f, 54.0f, 76.0f, 54.0f),
                    PathNode.CurveTo(88.15026f, 54.0f, 98.0f, 63.849735f, 98.0f, 76.0f),
                    PathNode.LineTo(98.0f, 98.0f),
                    PathNode.LineTo(76.0f, 98.0f),
                    PathNode.CurveTo(63.849735f, 98.0f, 54.0f, 88.15026f, 54.0f, 76.0f),
                    PathNode.Close,
                    PathNode.MoveTo(98.0f, 180.0f),
                    PathNode.CurveTo(98.0f, 192.15027f, 88.15026f, 202.0f, 76.0f, 202.0f),
                    PathNode.CurveTo(63.849735f, 202.0f, 54.0f, 192.15027f, 54.0f, 180.0f),
                    PathNode.CurveTo(54.0f, 167.84973f, 63.849735f, 158.0f, 76.0f, 158.0f),
                    PathNode.LineTo(98.0f, 158.0f),
                    PathNode.Close,
                    PathNode.MoveTo(110.0f, 110.0f),
                    PathNode.LineTo(146.0f, 110.0f),
                    PathNode.LineTo(146.0f, 146.0f),
                    PathNode.LineTo(110.0f, 146.0f),
                    PathNode.Close,
                    PathNode.MoveTo(180.0f, 202.0f),
                    PathNode.CurveTo(167.84973f, 202.0f, 158.0f, 192.15027f, 158.0f, 180.0f),
                    PathNode.LineTo(158.0f, 158.0f),
                    PathNode.LineTo(180.0f, 158.0f),
                    PathNode.CurveTo(192.15027f, 158.0f, 202.0f, 167.84973f, 202.0f, 180.0f),
                    PathNode.CurveTo(202.0f, 192.15027f, 192.15027f, 202.0f, 180.0f, 202.0f),
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
        return _command!!
    }

private var _command: ImageVector? = null
