package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.ArrowsInLineVertical: ImageVector
    get() {
        if (_arrowsInLineVertical != null) return _arrowsInLineVertical!!
        _arrowsInLineVertical = phosphorLightIcon(
            name = "ArrowsInLineVertical",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(222.0f, 128.0f),
                    PathNode.CurveTo(222.0f, 131.3137f, 219.3137f, 134.0f, 216.0f, 134.0f),
                    PathNode.LineTo(40.0f, 134.0f),
                    PathNode.CurveTo(36.68629f, 134.0f, 34.0f, 131.3137f, 34.0f, 128.0f),
                    PathNode.CurveTo(34.0f, 124.686295f, 36.68629f, 122.0f, 40.0f, 122.0f),
                    PathNode.LineTo(216.0f, 122.0f),
                    PathNode.CurveTo(219.3137f, 122.0f, 222.0f, 124.686295f, 222.0f, 128.0f),
                    PathNode.Close,
                    PathNode.MoveTo(123.76f, 100.24f),
                    PathNode.CurveTo(126.10254f, 102.57962f, 129.89746f, 102.57962f, 132.24f, 100.24f),
                    PathNode.LineTo(164.24f, 68.24f),
                    PathNode.CurveTo(166.44287f, 65.87592f, 166.37787f, 62.19192f, 164.09297f, 59.907024f),
                    PathNode.CurveTo(161.80807f, 57.622128f, 158.12408f, 57.55713f, 155.76f, 59.76f),
                    PathNode.LineTo(134.0f, 81.51f),
                    PathNode.LineTo(134.0f, 16.0f),
                    PathNode.CurveTo(134.0f, 12.686292f, 131.3137f, 10.0f, 128.0f, 10.0f),
                    PathNode.CurveTo(124.686295f, 10.0f, 122.0f, 12.686292f, 122.0f, 16.0f),
                    PathNode.LineTo(122.0f, 81.51f),
                    PathNode.LineTo(100.24f, 59.76f),
                    PathNode.CurveTo(97.87592f, 57.55713f, 94.191925f, 57.622128f, 91.90703f, 59.907024f),
                    PathNode.CurveTo(89.62213f, 62.19192f, 89.55713f, 65.87592f, 91.76f, 68.24f),
                    PathNode.Close,
                    PathNode.MoveTo(132.24f, 155.76f),
                    PathNode.CurveTo(129.89746f, 153.42038f, 126.10254f, 153.42038f, 123.76f, 155.76f),
                    PathNode.LineTo(91.76f, 187.76f),
                    PathNode.CurveTo(89.55713f, 190.12408f, 89.62213f, 193.80807f, 91.90703f, 196.09297f),
                    PathNode.CurveTo(94.191925f, 198.37787f, 97.87592f, 198.44287f, 100.24f, 196.24f),
                    PathNode.LineTo(122.0f, 174.49f),
                    PathNode.LineTo(122.0f, 240.0f),
                    PathNode.CurveTo(122.0f, 243.3137f, 124.686295f, 246.0f, 128.0f, 246.0f),
                    PathNode.CurveTo(131.3137f, 246.0f, 134.0f, 243.3137f, 134.0f, 240.0f),
                    PathNode.LineTo(134.0f, 174.49f),
                    PathNode.LineTo(155.76f, 196.24f),
                    PathNode.CurveTo(158.12408f, 198.44287f, 161.80807f, 198.37787f, 164.09297f, 196.09297f),
                    PathNode.CurveTo(166.37787f, 193.80807f, 166.44287f, 190.12408f, 164.24f, 187.76f),
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
        return _arrowsInLineVertical!!
    }

private var _arrowsInLineVertical: ImageVector? = null
