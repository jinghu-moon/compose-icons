package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.ArrowLineDownLeft: ImageVector
    get() {
        if (_arrowLineDownLeft != null) return _arrowLineDownLeft!!
        _arrowLineDownLeft = phosphorLightIcon(
            name = "ArrowLineDownLeft",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(230.0f, 48.0f),
                    PathNode.CurveTo(230.0f, 51.31371f, 227.3137f, 54.0f, 224.0f, 54.0f),
                    PathNode.LineTo(48.0f, 54.0f),
                    PathNode.CurveTo(44.68629f, 54.0f, 42.0f, 51.31371f, 42.0f, 48.0f),
                    PathNode.CurveTo(42.0f, 44.68629f, 44.68629f, 42.0f, 48.0f, 42.0f),
                    PathNode.LineTo(224.0f, 42.0f),
                    PathNode.CurveTo(227.3137f, 42.0f, 230.0f, 44.68629f, 230.0f, 48.0f),
                    PathNode.Close,
                    PathNode.MoveTo(179.76f, 91.76f),
                    PathNode.LineTo(78.0f, 193.52f),
                    PathNode.LineTo(78.0f, 112.0f),
                    PathNode.CurveTo(78.0f, 108.686295f, 75.313705f, 106.0f, 72.0f, 106.0f),
                    PathNode.CurveTo(68.686295f, 106.0f, 66.0f, 108.686295f, 66.0f, 112.0f),
                    PathNode.LineTo(66.0f, 208.0f),
                    PathNode.CurveTo(66.0f, 211.3137f, 68.686295f, 214.0f, 72.0f, 214.0f),
                    PathNode.LineTo(168.0f, 214.0f),
                    PathNode.CurveTo(171.3137f, 214.0f, 174.0f, 211.3137f, 174.0f, 208.0f),
                    PathNode.CurveTo(174.0f, 204.6863f, 171.3137f, 202.0f, 168.0f, 202.0f),
                    PathNode.LineTo(86.48f, 202.0f),
                    PathNode.LineTo(188.24f, 100.24f),
                    PathNode.CurveTo(190.44287f, 97.87592f, 190.37787f, 94.191925f, 188.09297f, 91.90703f),
                    PathNode.CurveTo(185.80807f, 89.62213f, 182.12408f, 89.55713f, 179.76f, 91.76f),
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
        return _arrowLineDownLeft!!
    }

private var _arrowLineDownLeft: ImageVector? = null
