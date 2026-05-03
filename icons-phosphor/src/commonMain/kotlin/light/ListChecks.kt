package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.ListChecks: ImageVector
    get() {
        if (_listChecks != null) return _listChecks!!
        _listChecks = phosphorLightIcon(
            name = "ListChecks",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(222.0f, 128.0f),
                    PathNode.CurveTo(222.0f, 131.3137f, 219.3137f, 134.0f, 216.0f, 134.0f),
                    PathNode.LineTo(128.0f, 134.0f),
                    PathNode.CurveTo(124.686295f, 134.0f, 122.0f, 131.3137f, 122.0f, 128.0f),
                    PathNode.CurveTo(122.0f, 124.686295f, 124.686295f, 122.0f, 128.0f, 122.0f),
                    PathNode.LineTo(216.0f, 122.0f),
                    PathNode.CurveTo(219.3137f, 122.0f, 222.0f, 124.686295f, 222.0f, 128.0f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 70.0f),
                    PathNode.LineTo(216.0f, 70.0f),
                    PathNode.CurveTo(219.3137f, 70.0f, 222.0f, 67.313705f, 222.0f, 64.0f),
                    PathNode.CurveTo(222.0f, 60.68629f, 219.3137f, 58.0f, 216.0f, 58.0f),
                    PathNode.LineTo(128.0f, 58.0f),
                    PathNode.CurveTo(124.686295f, 58.0f, 122.0f, 60.68629f, 122.0f, 64.0f),
                    PathNode.CurveTo(122.0f, 67.313705f, 124.686295f, 70.0f, 128.0f, 70.0f),
                    PathNode.Close,
                    PathNode.MoveTo(216.0f, 186.0f),
                    PathNode.LineTo(128.0f, 186.0f),
                    PathNode.CurveTo(124.686295f, 186.0f, 122.0f, 188.6863f, 122.0f, 192.0f),
                    PathNode.CurveTo(122.0f, 195.3137f, 124.686295f, 198.0f, 128.0f, 198.0f),
                    PathNode.LineTo(216.0f, 198.0f),
                    PathNode.CurveTo(219.3137f, 198.0f, 222.0f, 195.3137f, 222.0f, 192.0f),
                    PathNode.CurveTo(222.0f, 188.6863f, 219.3137f, 186.0f, 216.0f, 186.0f),
                    PathNode.Close,
                    PathNode.MoveTo(83.76f, 43.76f),
                    PathNode.LineTo(56.0f, 71.51f),
                    PathNode.LineTo(44.24f, 59.76f),
                    PathNode.CurveTo(41.875923f, 57.55713f, 38.19192f, 57.622128f, 35.907024f, 59.907024f),
                    PathNode.CurveTo(33.622128f, 62.19192f, 33.55713f, 65.87592f, 35.76f, 68.24f),
                    PathNode.LineTo(51.76f, 84.24f),
                    PathNode.CurveTo(54.10254f, 86.57962f, 57.89746f, 86.57962f, 60.24f, 84.24f),
                    PathNode.LineTo(92.24f, 52.24f),
                    PathNode.CurveTo(94.44287f, 49.875923f, 94.37787f, 46.19192f, 92.09297f, 43.907024f),
                    PathNode.CurveTo(89.808075f, 41.622128f, 86.12408f, 41.55713f, 83.76f, 43.76f),
                    PathNode.Close,
                    PathNode.MoveTo(83.76f, 107.76f),
                    PathNode.LineTo(56.0f, 135.51f),
                    PathNode.LineTo(44.24f, 123.76f),
                    PathNode.CurveTo(42.744236f, 122.15478f, 40.491554f, 121.494f, 38.36569f, 122.03692f),
                    PathNode.CurveTo(36.239822f, 122.57983f, 34.579826f, 124.23982f, 34.036915f, 126.3657f),
                    PathNode.CurveTo(33.494007f, 128.49156f, 34.154774f, 130.74423f, 35.76f, 132.24f),
                    PathNode.LineTo(51.76f, 148.24f),
                    PathNode.CurveTo(54.10254f, 150.57962f, 57.89746f, 150.57962f, 60.24f, 148.24f),
                    PathNode.LineTo(92.24f, 116.24f),
                    PathNode.CurveTo(94.44287f, 113.87592f, 94.37787f, 110.191925f, 92.09297f, 107.90703f),
                    PathNode.CurveTo(89.808075f, 105.62213f, 86.12408f, 105.55713f, 83.76f, 107.76f),
                    PathNode.Close,
                    PathNode.MoveTo(83.76f, 171.76f),
                    PathNode.LineTo(56.0f, 199.51f),
                    PathNode.LineTo(44.24f, 187.76f),
                    PathNode.CurveTo(41.875923f, 185.55713f, 38.19192f, 185.62213f, 35.907024f, 187.90703f),
                    PathNode.CurveTo(33.622128f, 190.19193f, 33.55713f, 193.87592f, 35.76f, 196.24f),
                    PathNode.LineTo(51.76f, 212.24f),
                    PathNode.CurveTo(54.10254f, 214.57962f, 57.89746f, 214.57962f, 60.24f, 212.24f),
                    PathNode.LineTo(92.24f, 180.24f),
                    PathNode.CurveTo(94.44287f, 177.87592f, 94.37787f, 174.19193f, 92.09297f, 171.90703f),
                    PathNode.CurveTo(89.808075f, 169.62213f, 86.12408f, 169.55713f, 83.76f, 171.76f),
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
        return _listChecks!!
    }

private var _listChecks: ImageVector? = null
