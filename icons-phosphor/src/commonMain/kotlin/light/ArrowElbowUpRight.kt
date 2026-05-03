package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.ArrowElbowUpRight: ImageVector
    get() {
        if (_arrowElbowUpRight != null) return _arrowElbowUpRight!!
        _arrowElbowUpRight = phosphorLightIcon(
            name = "ArrowElbowUpRight",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(220.24f, 84.24f),
                    PathNode.LineTo(172.24f, 132.24f),
                    PathNode.CurveTo(169.87592f, 134.44287f, 166.19193f, 134.37787f, 163.90703f, 132.09297f),
                    PathNode.CurveTo(161.62213f, 129.80807f, 161.55713f, 126.12408f, 163.76f, 123.76f),
                    PathNode.LineTo(201.51f, 86.0f),
                    PathNode.LineTo(78.0f, 86.0f),
                    PathNode.LineTo(78.0f, 224.0f),
                    PathNode.CurveTo(78.0f, 227.3137f, 75.313705f, 230.0f, 72.0f, 230.0f),
                    PathNode.CurveTo(68.686295f, 230.0f, 66.0f, 227.3137f, 66.0f, 224.0f),
                    PathNode.LineTo(66.0f, 80.0f),
                    PathNode.CurveTo(66.0f, 76.686295f, 68.686295f, 74.0f, 72.0f, 74.0f),
                    PathNode.LineTo(201.51f, 74.0f),
                    PathNode.LineTo(163.76f, 36.24f),
                    PathNode.CurveTo(161.55713f, 33.875923f, 161.62213f, 30.191923f, 163.90703f, 27.907026f),
                    PathNode.CurveTo(166.19193f, 25.62213f, 169.87592f, 25.557129f, 172.24f, 27.76f),
                    PathNode.LineTo(220.24f, 75.76f),
                    PathNode.CurveTo(222.57962f, 78.10254f, 222.57962f, 81.89746f, 220.24f, 84.24f),
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
        return _arrowElbowUpRight!!
    }

private var _arrowElbowUpRight: ImageVector? = null
