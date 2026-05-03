package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Martini: ImageVector
    get() {
        if (_martini != null) return _martini!!
        _martini = phosphorLightIcon(
            name = "Martini",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(236.24f, 44.24f),
                    PathNode.CurveTo(237.95377f, 42.524105f, 238.46606f, 39.945263f, 237.5383f, 37.704613f),
                    PathNode.CurveTo(236.61052f, 35.46396f, 234.42514f, 34.002132f, 232.0f, 34.0f),
                    PathNode.LineTo(24.0f, 34.0f),
                    PathNode.CurveTo(21.574867f, 34.002132f, 19.389475f, 35.46396f, 18.461704f, 37.704613f),
                    PathNode.CurveTo(17.533934f, 39.945263f, 18.046238f, 42.524105f, 19.76f, 44.24f),
                    PathNode.LineTo(122.0f, 146.49f),
                    PathNode.LineTo(122.0f, 210.0f),
                    PathNode.LineTo(88.0f, 210.0f),
                    PathNode.CurveTo(84.686295f, 210.0f, 82.0f, 212.6863f, 82.0f, 216.0f),
                    PathNode.CurveTo(82.0f, 219.3137f, 84.686295f, 222.0f, 88.0f, 222.0f),
                    PathNode.LineTo(168.0f, 222.0f),
                    PathNode.CurveTo(171.3137f, 222.0f, 174.0f, 219.3137f, 174.0f, 216.0f),
                    PathNode.CurveTo(174.0f, 212.6863f, 171.3137f, 210.0f, 168.0f, 210.0f),
                    PathNode.LineTo(134.0f, 210.0f),
                    PathNode.LineTo(134.0f, 146.49f),
                    PathNode.Close,
                    PathNode.MoveTo(70.49f, 78.0f),
                    PathNode.LineTo(185.49f, 78.0f),
                    PathNode.LineTo(128.0f, 135.51f),
                    PathNode.Close,
                    PathNode.MoveTo(217.49f, 46.0f),
                    PathNode.LineTo(197.49f, 66.0f),
                    PathNode.LineTo(58.49f, 66.0f),
                    PathNode.LineTo(38.49f, 46.0f),
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
        return _martini!!
    }

private var _martini: ImageVector? = null
