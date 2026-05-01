package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.ArrowElbowLeftDown: ImageVector
    get() {
        if (_arrowElbowLeftDown != null) return _arrowElbowLeftDown!!
        _arrowElbowLeftDown = phosphorLightIcon(
            name = "ArrowElbowLeftDown",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(238.0f, 72.0f),
                    PathNode.CurveTo(238.0f, 75.313705f, 235.3137f, 78.0f, 232.0f, 78.0f),
                    PathNode.LineTo(94.0f, 78.0f),
                    PathNode.LineTo(94.0f, 201.51f),
                    PathNode.LineTo(131.76f, 163.76f),
                    PathNode.CurveTo(134.12408f, 161.55713f, 137.80807f, 161.62213f, 140.09297f, 163.90703f),
                    PathNode.CurveTo(142.37787f, 166.19193f, 142.44287f, 169.87592f, 140.24f, 172.24f),
                    PathNode.LineTo(92.24f, 220.24f),
                    PathNode.CurveTo(89.89746f, 222.57962f, 86.10254f, 222.57962f, 83.76f, 220.24f),
                    PathNode.LineTo(35.76f, 172.24f),
                    PathNode.CurveTo(33.55713f, 169.87592f, 33.622128f, 166.19193f, 35.907024f, 163.90703f),
                    PathNode.CurveTo(38.19192f, 161.62213f, 41.875923f, 161.55713f, 44.24f, 163.76f),
                    PathNode.LineTo(82.0f, 201.51f),
                    PathNode.LineTo(82.0f, 72.0f),
                    PathNode.CurveTo(82.0f, 68.686295f, 84.686295f, 66.0f, 88.0f, 66.0f),
                    PathNode.LineTo(232.0f, 66.0f),
                    PathNode.CurveTo(235.3137f, 66.0f, 238.0f, 68.686295f, 238.0f, 72.0f),
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
        return _arrowElbowLeftDown!!
    }

private var _arrowElbowLeftDown: ImageVector? = null
