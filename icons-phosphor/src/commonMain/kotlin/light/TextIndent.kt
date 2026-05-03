package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.TextIndent: ImageVector
    get() {
        if (_textIndent != null) return _textIndent!!
        _textIndent = phosphorLightIcon(
            name = "TextIndent",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(222.0f, 128.0f),
                    PathNode.CurveTo(222.0f, 131.3137f, 219.3137f, 134.0f, 216.0f, 134.0f),
                    PathNode.LineTo(112.0f, 134.0f),
                    PathNode.CurveTo(108.686295f, 134.0f, 106.0f, 131.3137f, 106.0f, 128.0f),
                    PathNode.CurveTo(106.0f, 124.686295f, 108.686295f, 122.0f, 112.0f, 122.0f),
                    PathNode.LineTo(216.0f, 122.0f),
                    PathNode.CurveTo(219.3137f, 122.0f, 222.0f, 124.686295f, 222.0f, 128.0f),
                    PathNode.Close,
                    PathNode.MoveTo(112.0f, 70.0f),
                    PathNode.LineTo(216.0f, 70.0f),
                    PathNode.CurveTo(219.3137f, 70.0f, 222.0f, 67.313705f, 222.0f, 64.0f),
                    PathNode.CurveTo(222.0f, 60.68629f, 219.3137f, 58.0f, 216.0f, 58.0f),
                    PathNode.LineTo(112.0f, 58.0f),
                    PathNode.CurveTo(108.686295f, 58.0f, 106.0f, 60.68629f, 106.0f, 64.0f),
                    PathNode.CurveTo(106.0f, 67.313705f, 108.686295f, 70.0f, 112.0f, 70.0f),
                    PathNode.Close,
                    PathNode.MoveTo(216.0f, 186.0f),
                    PathNode.LineTo(40.0f, 186.0f),
                    PathNode.CurveTo(36.68629f, 186.0f, 34.0f, 188.6863f, 34.0f, 192.0f),
                    PathNode.CurveTo(34.0f, 195.3137f, 36.68629f, 198.0f, 40.0f, 198.0f),
                    PathNode.LineTo(216.0f, 198.0f),
                    PathNode.CurveTo(219.3137f, 198.0f, 222.0f, 195.3137f, 222.0f, 192.0f),
                    PathNode.CurveTo(222.0f, 188.6863f, 219.3137f, 186.0f, 216.0f, 186.0f),
                    PathNode.Close,
                    PathNode.MoveTo(35.76f, 140.24f),
                    PathNode.CurveTo(38.10254f, 142.57962f, 41.89746f, 142.57962f, 44.24f, 140.24f),
                    PathNode.LineTo(84.24f, 100.24f),
                    PathNode.CurveTo(86.57962f, 97.89746f, 86.57962f, 94.10254f, 84.24f, 91.76f),
                    PathNode.LineTo(44.24f, 51.76f),
                    PathNode.CurveTo(41.875923f, 49.55713f, 38.19192f, 49.622128f, 35.907024f, 51.907024f),
                    PathNode.CurveTo(33.622128f, 54.19192f, 33.55713f, 57.875923f, 35.76f, 60.24f),
                    PathNode.LineTo(71.51f, 96.0f),
                    PathNode.LineTo(35.76f, 131.76f),
                    PathNode.CurveTo(33.420372f, 134.10254f, 33.420372f, 137.89746f, 35.76f, 140.24f),
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
        return _textIndent!!
    }

private var _textIndent: ImageVector? = null
