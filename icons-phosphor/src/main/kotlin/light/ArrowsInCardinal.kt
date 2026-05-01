package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.ArrowsInCardinal: ImageVector
    get() {
        if (_arrowsInCardinal != null) return _arrowsInCardinal!!
        _arrowsInCardinal = phosphorLightIcon(
            name = "ArrowsInCardinal",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(91.76f, 68.24f),
                    PathNode.CurveTo(89.55713f, 65.87592f, 89.62213f, 62.19192f, 91.90703f, 59.907024f),
                    PathNode.CurveTo(94.191925f, 57.622128f, 97.87592f, 57.55713f, 100.24f, 59.76f),
                    PathNode.LineTo(122.0f, 81.51f),
                    PathNode.LineTo(122.0f, 24.0f),
                    PathNode.CurveTo(122.0f, 20.68629f, 124.686295f, 18.0f, 128.0f, 18.0f),
                    PathNode.CurveTo(131.3137f, 18.0f, 134.0f, 20.68629f, 134.0f, 24.0f),
                    PathNode.LineTo(134.0f, 81.51f),
                    PathNode.LineTo(155.76f, 59.76f),
                    PathNode.CurveTo(158.12408f, 57.55713f, 161.80807f, 57.622128f, 164.09297f, 59.907024f),
                    PathNode.CurveTo(166.37787f, 62.19192f, 166.44287f, 65.87592f, 164.24f, 68.24f),
                    PathNode.LineTo(132.24f, 100.24f),
                    PathNode.CurveTo(129.89746f, 102.57962f, 126.10254f, 102.57962f, 123.76f, 100.24f),
                    PathNode.Close,
                    PathNode.MoveTo(132.24f, 155.76f),
                    PathNode.CurveTo(129.89746f, 153.42038f, 126.10254f, 153.42038f, 123.76f, 155.76f),
                    PathNode.LineTo(91.76f, 187.76f),
                    PathNode.CurveTo(89.55713f, 190.12408f, 89.62213f, 193.80807f, 91.90703f, 196.09297f),
                    PathNode.CurveTo(94.191925f, 198.37787f, 97.87592f, 198.44287f, 100.24f, 196.24f),
                    PathNode.LineTo(122.0f, 174.49f),
                    PathNode.LineTo(122.0f, 232.0f),
                    PathNode.CurveTo(122.0f, 235.3137f, 124.686295f, 238.0f, 128.0f, 238.0f),
                    PathNode.CurveTo(131.3137f, 238.0f, 134.0f, 235.3137f, 134.0f, 232.0f),
                    PathNode.LineTo(134.0f, 174.49f),
                    PathNode.LineTo(155.76f, 196.24f),
                    PathNode.CurveTo(158.12408f, 198.44287f, 161.80807f, 198.37787f, 164.09297f, 196.09297f),
                    PathNode.CurveTo(166.37787f, 193.80807f, 166.44287f, 190.12408f, 164.24f, 187.76f),
                    PathNode.Close,
                    PathNode.MoveTo(232.0f, 122.0f),
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
                    PathNode.LineTo(232.0f, 134.0f),
                    PathNode.CurveTo(235.3137f, 134.0f, 238.0f, 131.3137f, 238.0f, 128.0f),
                    PathNode.CurveTo(238.0f, 124.686295f, 235.3137f, 122.0f, 232.0f, 122.0f),
                    PathNode.Close,
                    PathNode.MoveTo(100.24f, 123.76f),
                    PathNode.LineTo(68.24f, 91.76f),
                    PathNode.CurveTo(65.87592f, 89.55713f, 62.19192f, 89.62213f, 59.907024f, 91.90703f),
                    PathNode.CurveTo(57.622128f, 94.191925f, 57.55713f, 97.87592f, 59.76f, 100.24f),
                    PathNode.LineTo(81.51f, 122.0f),
                    PathNode.LineTo(24.0f, 122.0f),
                    PathNode.CurveTo(20.68629f, 122.0f, 18.0f, 124.686295f, 18.0f, 128.0f),
                    PathNode.CurveTo(18.0f, 131.3137f, 20.68629f, 134.0f, 24.0f, 134.0f),
                    PathNode.LineTo(81.51f, 134.0f),
                    PathNode.LineTo(59.76f, 155.76f),
                    PathNode.CurveTo(58.154774f, 157.25575f, 57.494007f, 159.50844f, 58.036915f, 161.63431f),
                    PathNode.CurveTo(58.579826f, 163.76018f, 60.239822f, 165.42018f, 62.36569f, 165.96309f),
                    PathNode.CurveTo(64.491554f, 166.506f, 66.74423f, 165.84523f, 68.24f, 164.24f),
                    PathNode.LineTo(100.24f, 132.24f),
                    PathNode.CurveTo(102.57962f, 129.89746f, 102.57962f, 126.10254f, 100.24f, 123.76f),
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
        return _arrowsInCardinal!!
    }

private var _arrowsInCardinal: ImageVector? = null
