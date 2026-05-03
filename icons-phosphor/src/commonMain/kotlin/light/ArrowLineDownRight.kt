package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.ArrowLineDownRight: ImageVector
    get() {
        if (_arrowLineDownRight != null) return _arrowLineDownRight!!
        _arrowLineDownRight = phosphorLightIcon(
            name = "ArrowLineDownRight",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(222.0f, 40.0f),
                    PathNode.CurveTo(222.0f, 43.31371f, 219.3137f, 46.0f, 216.0f, 46.0f),
                    PathNode.LineTo(40.0f, 46.0f),
                    PathNode.CurveTo(36.68629f, 46.0f, 34.0f, 43.31371f, 34.0f, 40.0f),
                    PathNode.CurveTo(34.0f, 36.68629f, 36.68629f, 34.0f, 40.0f, 34.0f),
                    PathNode.LineTo(216.0f, 34.0f),
                    PathNode.CurveTo(219.3137f, 34.0f, 222.0f, 36.68629f, 222.0f, 40.0f),
                    PathNode.Close,
                    PathNode.MoveTo(192.0f, 98.0f),
                    PathNode.CurveTo(188.6863f, 98.0f, 186.0f, 100.686295f, 186.0f, 104.0f),
                    PathNode.LineTo(186.0f, 185.52f),
                    PathNode.LineTo(84.24f, 83.76f),
                    PathNode.CurveTo(81.87592f, 81.55713f, 78.191925f, 81.62213f, 75.90703f, 83.90703f),
                    PathNode.CurveTo(73.62213f, 86.191925f, 73.55713f, 89.87592f, 75.76f, 92.24f),
                    PathNode.LineTo(177.52f, 194.0f),
                    PathNode.LineTo(96.0f, 194.0f),
                    PathNode.CurveTo(92.686295f, 194.0f, 90.0f, 196.6863f, 90.0f, 200.0f),
                    PathNode.CurveTo(90.0f, 203.3137f, 92.686295f, 206.0f, 96.0f, 206.0f),
                    PathNode.LineTo(192.0f, 206.0f),
                    PathNode.CurveTo(195.3137f, 206.0f, 198.0f, 203.3137f, 198.0f, 200.0f),
                    PathNode.LineTo(198.0f, 104.0f),
                    PathNode.CurveTo(198.0f, 100.686295f, 195.3137f, 98.0f, 192.0f, 98.0f),
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
        return _arrowLineDownRight!!
    }

private var _arrowLineDownRight: ImageVector? = null
