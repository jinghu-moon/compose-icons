package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.CheckSquareOffset: ImageVector
    get() {
        if (_checkSquareOffset != null) return _checkSquareOffset!!
        _checkSquareOffset = phosphorLightIcon(
            name = "CheckSquareOffset",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(222.0f, 48.0f),
                    PathNode.LineTo(222.0f, 208.0f),
                    PathNode.CurveTo(222.0f, 215.73198f, 215.73198f, 222.0f, 208.0f, 222.0f),
                    PathNode.LineTo(136.0f, 222.0f),
                    PathNode.CurveTo(132.6863f, 222.0f, 130.0f, 219.3137f, 130.0f, 216.0f),
                    PathNode.CurveTo(130.0f, 212.6863f, 132.6863f, 210.0f, 136.0f, 210.0f),
                    PathNode.LineTo(208.0f, 210.0f),
                    PathNode.CurveTo(209.10457f, 210.0f, 210.0f, 209.10457f, 210.0f, 208.0f),
                    PathNode.LineTo(210.0f, 48.0f),
                    PathNode.CurveTo(210.0f, 46.89543f, 209.10457f, 46.0f, 208.0f, 46.0f),
                    PathNode.LineTo(48.0f, 46.0f),
                    PathNode.CurveTo(46.89543f, 46.0f, 46.0f, 46.89543f, 46.0f, 48.0f),
                    PathNode.LineTo(46.0f, 144.0f),
                    PathNode.CurveTo(46.0f, 147.3137f, 43.31371f, 150.0f, 40.0f, 150.0f),
                    PathNode.CurveTo(36.68629f, 150.0f, 34.0f, 147.3137f, 34.0f, 144.0f),
                    PathNode.LineTo(34.0f, 48.0f),
                    PathNode.CurveTo(34.0f, 40.268013f, 40.268013f, 34.0f, 48.0f, 34.0f),
                    PathNode.LineTo(208.0f, 34.0f),
                    PathNode.CurveTo(215.73198f, 34.0f, 222.0f, 40.268013f, 222.0f, 48.0f),
                    PathNode.Close,
                    PathNode.MoveTo(115.76f, 155.76f),
                    PathNode.LineTo(64.0f, 207.51f),
                    PathNode.LineTo(44.24f, 187.76f),
                    PathNode.CurveTo(41.875923f, 185.55713f, 38.19192f, 185.62213f, 35.907024f, 187.90703f),
                    PathNode.CurveTo(33.622128f, 190.19193f, 33.55713f, 193.87592f, 35.76f, 196.24f),
                    PathNode.LineTo(59.76f, 220.24f),
                    PathNode.CurveTo(62.10254f, 222.57962f, 65.89746f, 222.57962f, 68.24f, 220.24f),
                    PathNode.LineTo(124.24f, 164.24f),
                    PathNode.CurveTo(126.44287f, 161.87592f, 126.37787f, 158.19193f, 124.09297f, 155.90703f),
                    PathNode.CurveTo(121.808075f, 153.62213f, 118.12408f, 153.55713f, 115.76f, 155.76f),
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
        return _checkSquareOffset!!
    }

private var _checkSquareOffset: ImageVector? = null
