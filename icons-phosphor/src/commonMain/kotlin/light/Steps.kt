package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Steps: ImageVector
    get() {
        if (_steps != null) return _steps!!
        _steps = phosphorLightIcon(
            name = "Steps",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(246.0f, 56.0f),
                    PathNode.CurveTo(246.0f, 59.31371f, 243.3137f, 62.0f, 240.0f, 62.0f),
                    PathNode.LineTo(190.0f, 62.0f),
                    PathNode.LineTo(190.0f, 104.0f),
                    PathNode.CurveTo(190.0f, 107.313705f, 187.3137f, 110.0f, 184.0f, 110.0f),
                    PathNode.LineTo(134.0f, 110.0f),
                    PathNode.LineTo(134.0f, 152.0f),
                    PathNode.CurveTo(134.0f, 155.3137f, 131.3137f, 158.0f, 128.0f, 158.0f),
                    PathNode.LineTo(78.0f, 158.0f),
                    PathNode.LineTo(78.0f, 200.0f),
                    PathNode.CurveTo(78.0f, 203.3137f, 75.313705f, 206.0f, 72.0f, 206.0f),
                    PathNode.LineTo(16.0f, 206.0f),
                    PathNode.CurveTo(12.686292f, 206.0f, 10.0f, 203.3137f, 10.0f, 200.0f),
                    PathNode.CurveTo(10.0f, 196.6863f, 12.686292f, 194.0f, 16.0f, 194.0f),
                    PathNode.LineTo(66.0f, 194.0f),
                    PathNode.LineTo(66.0f, 152.0f),
                    PathNode.CurveTo(66.0f, 148.6863f, 68.686295f, 146.0f, 72.0f, 146.0f),
                    PathNode.LineTo(122.0f, 146.0f),
                    PathNode.LineTo(122.0f, 104.0f),
                    PathNode.CurveTo(122.0f, 100.686295f, 124.686295f, 98.0f, 128.0f, 98.0f),
                    PathNode.LineTo(178.0f, 98.0f),
                    PathNode.LineTo(178.0f, 56.0f),
                    PathNode.CurveTo(178.0f, 52.68629f, 180.6863f, 50.0f, 184.0f, 50.0f),
                    PathNode.LineTo(240.0f, 50.0f),
                    PathNode.CurveTo(243.3137f, 50.0f, 246.0f, 52.68629f, 246.0f, 56.0f),
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
        return _steps!!
    }

private var _steps: ImageVector? = null
