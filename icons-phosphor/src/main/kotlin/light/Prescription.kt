package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Prescription: ImageVector
    get() {
        if (_prescription != null) return _prescription!!
        _prescription = phosphorLightIcon(
            name = "Prescription",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(180.49f, 188.0f),
                    PathNode.LineTo(204.24f, 164.24f),
                    PathNode.CurveTo(206.44287f, 161.87592f, 206.37787f, 158.19193f, 204.09297f, 155.90703f),
                    PathNode.CurveTo(201.80807f, 153.62213f, 198.12408f, 153.55713f, 195.76f, 155.76f),
                    PathNode.LineTo(172.0f, 179.51f),
                    PathNode.LineTo(126.42f, 133.94f),
                    PathNode.CurveTo(153.51903f, 132.61131f, 174.61354f, 109.913246f, 173.95676f, 82.78962f),
                    PathNode.CurveTo(173.29997f, 55.665993f, 151.13158f, 34.015514f, 124.0f, 34.0f),
                    PathNode.LineTo(72.0f, 34.0f),
                    PathNode.CurveTo(68.686295f, 34.0f, 66.0f, 36.68629f, 66.0f, 40.0f),
                    PathNode.LineTo(66.0f, 192.0f),
                    PathNode.CurveTo(66.0f, 195.3137f, 68.686295f, 198.0f, 72.0f, 198.0f),
                    PathNode.CurveTo(75.313705f, 198.0f, 78.0f, 195.3137f, 78.0f, 192.0f),
                    PathNode.LineTo(78.0f, 134.0f),
                    PathNode.LineTo(109.51f, 134.0f),
                    PathNode.LineTo(163.51f, 188.0f),
                    PathNode.LineTo(139.76f, 211.76f),
                    PathNode.CurveTo(138.15477f, 213.25575f, 137.494f, 215.50844f, 138.03691f, 217.63431f),
                    PathNode.CurveTo(138.57982f, 219.76018f, 140.23982f, 221.42018f, 142.36569f, 221.96309f),
                    PathNode.CurveTo(144.49156f, 222.506f, 146.74425f, 221.84523f, 148.24f, 220.24f),
                    PathNode.LineTo(172.0f, 196.49f),
                    PathNode.LineTo(195.76f, 220.24f),
                    PathNode.CurveTo(198.12408f, 222.44287f, 201.80807f, 222.37787f, 204.09297f, 220.09297f),
                    PathNode.CurveTo(206.37787f, 217.80807f, 206.44287f, 214.12408f, 204.24f, 211.76f),
                    PathNode.Close,
                    PathNode.MoveTo(78.0f, 46.0f),
                    PathNode.LineTo(124.0f, 46.0f),
                    PathNode.CurveTo(144.98682f, 46.0f, 162.0f, 63.01318f, 162.0f, 84.0f),
                    PathNode.CurveTo(162.0f, 104.986824f, 144.98682f, 122.0f, 124.0f, 122.0f),
                    PathNode.LineTo(78.0f, 122.0f),
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
        return _prescription!!
    }

private var _prescription: ImageVector? = null
