package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.ArrowElbowDownLeft: ImageVector
    get() {
        if (_arrowElbowDownLeft != null) return _arrowElbowDownLeft!!
        _arrowElbowDownLeft = phosphorBoldIcon(
            name = "ArrowElbowDownLeft",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(204.0f, 32.0f),
                    PathNode.LineTo(204.0f, 176.0f),
                    PathNode.CurveTo(204.0f, 182.62741f, 198.62741f, 188.0f, 192.0f, 188.0f),
                    PathNode.LineTo(77.0f, 188.0f),
                    PathNode.LineTo(104.52f, 215.51f),
                    PathNode.CurveTo(109.21442f, 220.20442f, 109.21442f, 227.81558f, 104.52f, 232.51f),
                    PathNode.CurveTo(99.82558f, 237.20442f, 92.214424f, 237.20442f, 87.52f, 232.51f),
                    PathNode.LineTo(39.52f, 184.51f),
                    PathNode.CurveTo(37.260548f, 182.25838f, 35.990536f, 179.19981f, 35.990536f, 176.01f),
                    PathNode.CurveTo(35.990536f, 172.82018f, 37.260548f, 169.76163f, 39.52f, 167.51f),
                    PathNode.LineTo(87.52f, 119.51f),
                    PathNode.CurveTo(92.214424f, 114.81558f, 99.82558f, 114.81558f, 104.52f, 119.51f),
                    PathNode.CurveTo(109.214424f, 124.20442f, 109.214424f, 131.81558f, 104.52f, 136.51f),
                    PathNode.LineTo(77.0f, 164.0f),
                    PathNode.LineTo(180.0f, 164.0f),
                    PathNode.LineTo(180.0f, 32.0f),
                    PathNode.CurveTo(180.0f, 25.372583f, 185.37259f, 20.0f, 192.0f, 20.0f),
                    PathNode.CurveTo(198.62741f, 20.0f, 204.0f, 25.372583f, 204.0f, 32.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 24.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _arrowElbowDownLeft!!
    }

private var _arrowElbowDownLeft: ImageVector? = null
