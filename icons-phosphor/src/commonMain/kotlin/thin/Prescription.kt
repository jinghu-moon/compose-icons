package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Prescription: ImageVector
    get() {
        if (_prescription != null) return _prescription!!
        _prescription = phosphorThinIcon(
            name = "Prescription",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(177.66f, 188.0f),
                    PathNode.LineTo(202.83f, 162.83f),
                    PathNode.CurveTo(204.39296f, 161.26703f, 204.39296f, 158.73297f, 202.83f, 157.17f),
                    PathNode.CurveTo(201.26703f, 155.60704f, 198.73297f, 155.60704f, 197.17f, 157.17f),
                    PathNode.LineTo(172.0f, 182.34f),
                    PathNode.LineTo(121.66f, 132.0f),
                    PathNode.LineTo(124.0f, 132.0f),
                    PathNode.CurveTo(150.50967f, 132.0f, 172.0f, 110.50967f, 172.0f, 84.0f),
                    PathNode.CurveTo(172.0f, 57.490334f, 150.50967f, 36.0f, 124.0f, 36.0f),
                    PathNode.LineTo(72.0f, 36.0f),
                    PathNode.CurveTo(69.79086f, 36.0f, 68.0f, 37.79086f, 68.0f, 40.0f),
                    PathNode.LineTo(68.0f, 192.0f),
                    PathNode.CurveTo(68.0f, 194.20914f, 69.79086f, 196.0f, 72.0f, 196.0f),
                    PathNode.CurveTo(74.20914f, 196.0f, 76.0f, 194.20914f, 76.0f, 192.0f),
                    PathNode.LineTo(76.0f, 132.0f),
                    PathNode.LineTo(110.34f, 132.0f),
                    PathNode.LineTo(166.34f, 188.0f),
                    PathNode.LineTo(141.17f, 213.17f),
                    PathNode.CurveTo(139.60704f, 214.73297f, 139.60704f, 217.26703f, 141.17f, 218.83f),
                    PathNode.CurveTo(142.73297f, 220.39296f, 145.26703f, 220.39296f, 146.83f, 218.83f),
                    PathNode.LineTo(172.0f, 193.66f),
                    PathNode.LineTo(197.17f, 218.83f),
                    PathNode.CurveTo(198.73297f, 220.39296f, 201.26703f, 220.39296f, 202.83f, 218.83f),
                    PathNode.CurveTo(204.39296f, 217.26703f, 204.39296f, 214.73297f, 202.83f, 213.17f),
                    PathNode.Close,
                    PathNode.MoveTo(76.0f, 44.0f),
                    PathNode.LineTo(124.0f, 44.0f),
                    PathNode.CurveTo(146.09138f, 44.0f, 164.0f, 61.90861f, 164.0f, 84.0f),
                    PathNode.CurveTo(164.0f, 106.09139f, 146.09138f, 124.0f, 124.0f, 124.0f),
                    PathNode.LineTo(76.0f, 124.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 8.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _prescription!!
    }

private var _prescription: ImageVector? = null
