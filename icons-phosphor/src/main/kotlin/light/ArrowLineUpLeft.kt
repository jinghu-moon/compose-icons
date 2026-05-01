package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.ArrowLineUpLeft: ImageVector
    get() {
        if (_arrowLineUpLeft != null) return _arrowLineUpLeft!!
        _arrowLineUpLeft = phosphorLightIcon(
            name = "ArrowLineUpLeft",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(230.0f, 208.0f),
                    PathNode.CurveTo(230.0f, 211.3137f, 227.3137f, 214.0f, 224.0f, 214.0f),
                    PathNode.LineTo(48.0f, 214.0f),
                    PathNode.CurveTo(44.68629f, 214.0f, 42.0f, 211.3137f, 42.0f, 208.0f),
                    PathNode.CurveTo(42.0f, 204.6863f, 44.68629f, 202.0f, 48.0f, 202.0f),
                    PathNode.LineTo(224.0f, 202.0f),
                    PathNode.CurveTo(227.3137f, 202.0f, 230.0f, 204.6863f, 230.0f, 208.0f),
                    PathNode.Close,
                    PathNode.MoveTo(72.0f, 150.0f),
                    PathNode.CurveTo(75.313705f, 150.0f, 78.0f, 147.3137f, 78.0f, 144.0f),
                    PathNode.LineTo(78.0f, 62.49f),
                    PathNode.LineTo(179.76f, 164.24f),
                    PathNode.CurveTo(182.12408f, 166.44287f, 185.80807f, 166.37787f, 188.09297f, 164.09297f),
                    PathNode.CurveTo(190.37787f, 161.80807f, 190.44287f, 158.12408f, 188.24f, 155.76f),
                    PathNode.LineTo(86.49f, 54.0f),
                    PathNode.LineTo(168.0f, 54.0f),
                    PathNode.CurveTo(171.3137f, 54.0f, 174.0f, 51.31371f, 174.0f, 48.0f),
                    PathNode.CurveTo(174.0f, 44.68629f, 171.3137f, 42.0f, 168.0f, 42.0f),
                    PathNode.LineTo(72.0f, 42.0f),
                    PathNode.CurveTo(68.686295f, 42.0f, 66.0f, 44.68629f, 66.0f, 48.0f),
                    PathNode.LineTo(66.0f, 144.0f),
                    PathNode.CurveTo(66.0f, 147.3137f, 68.686295f, 150.0f, 72.0f, 150.0f),
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
        return _arrowLineUpLeft!!
    }

private var _arrowLineUpLeft: ImageVector? = null
