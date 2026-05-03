package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.ArrowDownLeft: ImageVector
    get() {
        if (_arrowDownLeft != null) return _arrowDownLeft!!
        _arrowDownLeft = phosphorLightIcon(
            name = "ArrowDownLeft",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(196.24f, 68.24f),
                    PathNode.LineTo(78.48f, 186.0f),
                    PathNode.LineTo(168.0f, 186.0f),
                    PathNode.CurveTo(171.3137f, 186.0f, 174.0f, 188.6863f, 174.0f, 192.0f),
                    PathNode.CurveTo(174.0f, 195.3137f, 171.3137f, 198.0f, 168.0f, 198.0f),
                    PathNode.LineTo(64.0f, 198.0f),
                    PathNode.CurveTo(60.68629f, 198.0f, 58.0f, 195.3137f, 58.0f, 192.0f),
                    PathNode.LineTo(58.0f, 88.0f),
                    PathNode.CurveTo(58.0f, 84.686295f, 60.68629f, 82.0f, 64.0f, 82.0f),
                    PathNode.CurveTo(67.313705f, 82.0f, 70.0f, 84.686295f, 70.0f, 88.0f),
                    PathNode.LineTo(70.0f, 177.52f),
                    PathNode.LineTo(187.76f, 59.76f),
                    PathNode.CurveTo(190.12408f, 57.55713f, 193.80807f, 57.622128f, 196.09297f, 59.907024f),
                    PathNode.CurveTo(198.37787f, 62.19192f, 198.44287f, 65.87592f, 196.24f, 68.24f),
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
        return _arrowDownLeft!!
    }

private var _arrowDownLeft: ImageVector? = null
