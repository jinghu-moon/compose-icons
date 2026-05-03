package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.ArrowSquareRight: ImageVector
    get() {
        if (_arrowSquareRight != null) return _arrowSquareRight!!
        _arrowSquareRight = phosphorLightIcon(
            name = "ArrowSquareRight",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(208.0f, 34.0f),
                    PathNode.LineTo(48.0f, 34.0f),
                    PathNode.CurveTo(40.268013f, 34.0f, 34.0f, 40.268013f, 34.0f, 48.0f),
                    PathNode.LineTo(34.0f, 208.0f),
                    PathNode.CurveTo(34.0f, 215.73198f, 40.268013f, 222.0f, 48.0f, 222.0f),
                    PathNode.LineTo(208.0f, 222.0f),
                    PathNode.CurveTo(215.73198f, 222.0f, 222.0f, 215.73198f, 222.0f, 208.0f),
                    PathNode.LineTo(222.0f, 48.0f),
                    PathNode.CurveTo(222.0f, 40.268013f, 215.73198f, 34.0f, 208.0f, 34.0f),
                    PathNode.Close,
                    PathNode.MoveTo(210.0f, 208.0f),
                    PathNode.CurveTo(210.0f, 209.10457f, 209.10457f, 210.0f, 208.0f, 210.0f),
                    PathNode.LineTo(48.0f, 210.0f),
                    PathNode.CurveTo(46.89543f, 210.0f, 46.0f, 209.10457f, 46.0f, 208.0f),
                    PathNode.LineTo(46.0f, 48.0f),
                    PathNode.CurveTo(46.0f, 46.89543f, 46.89543f, 46.0f, 48.0f, 46.0f),
                    PathNode.LineTo(208.0f, 46.0f),
                    PathNode.CurveTo(209.10457f, 46.0f, 210.0f, 46.89543f, 210.0f, 48.0f),
                    PathNode.Close,
                    PathNode.MoveTo(172.24f, 123.76f),
                    PathNode.CurveTo(174.57962f, 126.10254f, 174.57962f, 129.89746f, 172.24f, 132.24f),
                    PathNode.LineTo(140.24f, 164.24f),
                    PathNode.CurveTo(137.87592f, 166.44287f, 134.19193f, 166.37787f, 131.90703f, 164.09297f),
                    PathNode.CurveTo(129.62213f, 161.80807f, 129.55713f, 158.12408f, 131.76f, 155.76f),
                    PathNode.LineTo(153.51f, 134.0f),
                    PathNode.LineTo(88.0f, 134.0f),
                    PathNode.CurveTo(84.686295f, 134.0f, 82.0f, 131.3137f, 82.0f, 128.0f),
                    PathNode.CurveTo(82.0f, 124.686295f, 84.686295f, 122.0f, 88.0f, 122.0f),
                    PathNode.LineTo(153.51f, 122.0f),
                    PathNode.LineTo(131.76f, 100.24f),
                    PathNode.CurveTo(129.55713f, 97.87592f, 129.62213f, 94.191925f, 131.90703f, 91.90703f),
                    PathNode.CurveTo(134.19193f, 89.62213f, 137.87592f, 89.55713f, 140.24f, 91.76f),
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
        return _arrowSquareRight!!
    }

private var _arrowSquareRight: ImageVector? = null
