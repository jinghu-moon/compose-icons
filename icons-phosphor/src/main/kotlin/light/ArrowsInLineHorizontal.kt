package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.ArrowsInLineHorizontal: ImageVector
    get() {
        if (_arrowsInLineHorizontal != null) return _arrowsInLineHorizontal!!
        _arrowsInLineHorizontal = phosphorLightIcon(
            name = "ArrowsInLineHorizontal",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(134.0f, 40.0f),
                    PathNode.LineTo(134.0f, 216.0f),
                    PathNode.CurveTo(134.0f, 219.3137f, 131.3137f, 222.0f, 128.0f, 222.0f),
                    PathNode.CurveTo(124.686295f, 222.0f, 122.0f, 219.3137f, 122.0f, 216.0f),
                    PathNode.LineTo(122.0f, 40.0f),
                    PathNode.CurveTo(122.0f, 36.68629f, 124.686295f, 34.0f, 128.0f, 34.0f),
                    PathNode.CurveTo(131.3137f, 34.0f, 134.0f, 36.68629f, 134.0f, 40.0f),
                    PathNode.Close,
                    PathNode.MoveTo(68.24f, 91.76f),
                    PathNode.CurveTo(65.87592f, 89.55713f, 62.19192f, 89.62213f, 59.907024f, 91.90703f),
                    PathNode.CurveTo(57.622128f, 94.191925f, 57.55713f, 97.87592f, 59.76f, 100.24f),
                    PathNode.LineTo(81.51f, 122.0f),
                    PathNode.LineTo(16.0f, 122.0f),
                    PathNode.CurveTo(12.686292f, 122.0f, 10.0f, 124.686295f, 10.0f, 128.0f),
                    PathNode.CurveTo(10.0f, 131.3137f, 12.686292f, 134.0f, 16.0f, 134.0f),
                    PathNode.LineTo(81.51f, 134.0f),
                    PathNode.LineTo(59.76f, 155.76f),
                    PathNode.CurveTo(58.154774f, 157.25575f, 57.494007f, 159.50844f, 58.036915f, 161.63431f),
                    PathNode.CurveTo(58.579826f, 163.76018f, 60.239822f, 165.42018f, 62.36569f, 165.96309f),
                    PathNode.CurveTo(64.491554f, 166.506f, 66.74423f, 165.84523f, 68.24f, 164.24f),
                    PathNode.LineTo(100.24f, 132.24f),
                    PathNode.CurveTo(102.57962f, 129.89746f, 102.57962f, 126.10254f, 100.24f, 123.76f),
                    PathNode.Close,
                    PathNode.MoveTo(240.0f, 122.0f),
                    PathNode.LineTo(174.49f, 122.0f),
                    PathNode.LineTo(196.24f, 100.24f),
                    PathNode.CurveTo(198.44287f, 97.87592f, 198.37787f, 94.191925f, 196.09297f, 91.90703f),
                    PathNode.CurveTo(193.80807f, 89.62213f, 190.12408f, 89.55713f, 187.76f, 91.76f),
                    PathNode.LineTo(155.76f, 123.76f),
                    PathNode.CurveTo(153.42038f, 126.10254f, 153.42038f, 129.89746f, 155.76f, 132.24f),
                    PathNode.LineTo(187.76f, 164.24f),
                    PathNode.CurveTo(190.12408f, 166.44287f, 193.80807f, 166.37787f, 196.09297f, 164.09297f),
                    PathNode.CurveTo(198.37787f, 161.80807f, 198.44287f, 158.12408f, 196.24f, 155.76f),
                    PathNode.LineTo(174.49f, 134.0f),
                    PathNode.LineTo(240.0f, 134.0f),
                    PathNode.CurveTo(243.3137f, 134.0f, 246.0f, 131.3137f, 246.0f, 128.0f),
                    PathNode.CurveTo(246.0f, 124.686295f, 243.3137f, 122.0f, 240.0f, 122.0f),
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
        return _arrowsInLineHorizontal!!
    }

private var _arrowsInLineHorizontal: ImageVector? = null
