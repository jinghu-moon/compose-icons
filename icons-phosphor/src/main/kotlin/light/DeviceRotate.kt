package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.DeviceRotate: ImageVector
    get() {
        if (_deviceRotate != null) return _deviceRotate!!
        _deviceRotate = phosphorLightIcon(
            name = "DeviceRotate",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(204.24f, 220.24f),
                    PathNode.LineTo(180.24f, 244.24f),
                    PathNode.CurveTo(177.87592f, 246.44287f, 174.19193f, 246.37787f, 171.90703f, 244.09297f),
                    PathNode.CurveTo(169.62213f, 241.80807f, 169.55713f, 238.12408f, 171.76f, 235.76f),
                    PathNode.LineTo(185.51f, 222.0f),
                    PathNode.LineTo(80.0f, 222.0f),
                    PathNode.CurveTo(67.84974f, 222.0f, 58.0f, 212.15027f, 58.0f, 200.0f),
                    PathNode.LineTo(58.0f, 104.0f),
                    PathNode.CurveTo(58.0f, 100.686295f, 60.68629f, 98.0f, 64.0f, 98.0f),
                    PathNode.CurveTo(67.313705f, 98.0f, 70.0f, 100.686295f, 70.0f, 104.0f),
                    PathNode.LineTo(70.0f, 200.0f),
                    PathNode.CurveTo(70.0f, 205.52284f, 74.47715f, 210.0f, 80.0f, 210.0f),
                    PathNode.LineTo(185.51f, 210.0f),
                    PathNode.LineTo(171.76f, 196.24f),
                    PathNode.CurveTo(169.55713f, 193.87592f, 169.62213f, 190.19193f, 171.90703f, 187.90703f),
                    PathNode.CurveTo(174.19193f, 185.62213f, 177.87592f, 185.55713f, 180.24f, 187.76f),
                    PathNode.LineTo(204.24f, 211.76f),
                    PathNode.CurveTo(206.57962f, 214.10254f, 206.57962f, 217.89746f, 204.24f, 220.24f),
                    PathNode.Close,
                    PathNode.MoveTo(80.0f, 70.0f),
                    PathNode.CurveTo(82.42513f, 69.99786f, 84.61053f, 68.53604f, 85.5383f, 66.29539f),
                    PathNode.CurveTo(86.466064f, 64.05473f, 85.953766f, 61.475895f, 84.24f, 59.76f),
                    PathNode.LineTo(70.49f, 46.0f),
                    PathNode.LineTo(176.0f, 46.0f),
                    PathNode.CurveTo(181.52284f, 46.0f, 186.0f, 50.477154f, 186.0f, 56.0f),
                    PathNode.LineTo(186.0f, 152.0f),
                    PathNode.CurveTo(186.0f, 155.3137f, 188.6863f, 158.0f, 192.0f, 158.0f),
                    PathNode.CurveTo(195.3137f, 158.0f, 198.0f, 155.3137f, 198.0f, 152.0f),
                    PathNode.LineTo(198.0f, 56.0f),
                    PathNode.CurveTo(198.0f, 43.849735f, 188.15027f, 34.0f, 176.0f, 34.0f),
                    PathNode.LineTo(70.49f, 34.0f),
                    PathNode.LineTo(84.24f, 20.24f),
                    PathNode.CurveTo(86.44287f, 17.875921f, 86.37787f, 14.191922f, 84.09297f, 11.907025f),
                    PathNode.CurveTo(81.808075f, 9.622129f, 78.12408f, 9.557129f, 75.76f, 11.76f),
                    PathNode.LineTo(51.76f, 35.76f),
                    PathNode.CurveTo(49.420372f, 38.10254f, 49.420372f, 41.89746f, 51.76f, 44.24f),
                    PathNode.LineTo(75.76f, 68.24f),
                    PathNode.CurveTo(76.88415f, 69.36554f, 78.40924f, 69.9986f, 80.0f, 70.0f),
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
        return _deviceRotate!!
    }

private var _deviceRotate: ImageVector? = null
