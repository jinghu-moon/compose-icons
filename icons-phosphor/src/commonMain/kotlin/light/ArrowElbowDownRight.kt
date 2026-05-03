package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.ArrowElbowDownRight: ImageVector
    get() {
        if (_arrowElbowDownRight != null) return _arrowElbowDownRight!!
        _arrowElbowDownRight = phosphorLightIcon(
            name = "ArrowElbowDownRight",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(220.24f, 180.24f),
                    PathNode.LineTo(172.24f, 228.24f),
                    PathNode.CurveTo(169.87592f, 230.44287f, 166.19193f, 230.37787f, 163.90703f, 228.09297f),
                    PathNode.CurveTo(161.62213f, 225.80807f, 161.55713f, 222.12408f, 163.76f, 219.76f),
                    PathNode.LineTo(201.51f, 182.0f),
                    PathNode.LineTo(72.0f, 182.0f),
                    PathNode.CurveTo(68.686295f, 182.0f, 66.0f, 179.3137f, 66.0f, 176.0f),
                    PathNode.LineTo(66.0f, 32.0f),
                    PathNode.CurveTo(66.0f, 28.68629f, 68.686295f, 26.0f, 72.0f, 26.0f),
                    PathNode.CurveTo(75.313705f, 26.0f, 78.0f, 28.68629f, 78.0f, 32.0f),
                    PathNode.LineTo(78.0f, 170.0f),
                    PathNode.LineTo(201.51f, 170.0f),
                    PathNode.LineTo(163.76f, 132.24f),
                    PathNode.CurveTo(162.15477f, 130.74423f, 161.494f, 128.49156f, 162.03691f, 126.3657f),
                    PathNode.CurveTo(162.57982f, 124.23982f, 164.23982f, 122.57983f, 166.36569f, 122.03692f),
                    PathNode.CurveTo(168.49156f, 121.494f, 170.74425f, 122.15478f, 172.24f, 123.76f),
                    PathNode.LineTo(220.24f, 171.76f),
                    PathNode.CurveTo(222.57962f, 174.10254f, 222.57962f, 177.89746f, 220.24f, 180.24f),
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
        return _arrowElbowDownRight!!
    }

private var _arrowElbowDownRight: ImageVector? = null
