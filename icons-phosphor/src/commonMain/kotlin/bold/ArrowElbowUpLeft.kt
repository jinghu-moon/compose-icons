package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.ArrowElbowUpLeft: ImageVector
    get() {
        if (_arrowElbowUpLeft != null) return _arrowElbowUpLeft!!
        _arrowElbowUpLeft = phosphorBoldIcon(
            name = "ArrowElbowUpLeft",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(204.0f, 80.0f),
                    PathNode.LineTo(204.0f, 224.0f),
                    PathNode.CurveTo(204.0f, 230.62741f, 198.62741f, 236.0f, 192.0f, 236.0f),
                    PathNode.CurveTo(185.37259f, 236.0f, 180.0f, 230.62741f, 180.0f, 224.0f),
                    PathNode.LineTo(180.0f, 92.0f),
                    PathNode.LineTo(77.0f, 92.0f),
                    PathNode.LineTo(104.52f, 119.51f),
                    PathNode.CurveTo(109.214424f, 124.20442f, 109.214424f, 131.81558f, 104.52f, 136.51f),
                    PathNode.CurveTo(99.82558f, 141.20442f, 92.214424f, 141.20442f, 87.52f, 136.51f),
                    PathNode.LineTo(39.52f, 88.51f),
                    PathNode.CurveTo(37.260548f, 86.25838f, 35.990536f, 83.19982f, 35.990536f, 80.01f),
                    PathNode.CurveTo(35.990536f, 76.82018f, 37.260548f, 73.76162f, 39.52f, 71.51f),
                    PathNode.LineTo(87.52f, 23.51f),
                    PathNode.CurveTo(92.214424f, 18.81558f, 99.82558f, 18.815578f, 104.52f, 23.51f),
                    PathNode.CurveTo(109.214424f, 28.20442f, 109.214424f, 35.81558f, 104.52f, 40.51f),
                    PathNode.LineTo(77.0f, 68.0f),
                    PathNode.LineTo(192.0f, 68.0f),
                    PathNode.CurveTo(198.62741f, 68.0f, 204.0f, 73.37258f, 204.0f, 80.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 24.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _arrowElbowUpLeft!!
    }

private var _arrowElbowUpLeft: ImageVector? = null
