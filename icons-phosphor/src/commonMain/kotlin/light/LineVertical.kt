package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.LineVertical: ImageVector
    get() {
        if (_lineVertical != null) return _lineVertical!!
        _lineVertical = phosphorLightIcon(
            name = "LineVertical",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(134.0f, 24.0f),
                    PathNode.LineTo(134.0f, 232.0f),
                    PathNode.CurveTo(134.0f, 235.3137f, 131.3137f, 238.0f, 128.0f, 238.0f),
                    PathNode.CurveTo(124.686295f, 238.0f, 122.0f, 235.3137f, 122.0f, 232.0f),
                    PathNode.LineTo(122.0f, 24.0f),
                    PathNode.CurveTo(122.0f, 20.68629f, 124.686295f, 18.0f, 128.0f, 18.0f),
                    PathNode.CurveTo(131.3137f, 18.0f, 134.0f, 20.68629f, 134.0f, 24.0f),
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
        return _lineVertical!!
    }

private var _lineVertical: ImageVector? = null
