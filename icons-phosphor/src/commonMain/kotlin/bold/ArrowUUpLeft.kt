package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.ArrowUUpLeft: ImageVector
    get() {
        if (_arrowUUpLeft != null) return _arrowUUpLeft!!
        _arrowUUpLeft = phosphorBoldIcon(
            name = "ArrowUUpLeft",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(236.0f, 144.0f),
                    PathNode.CurveTo(235.96141f, 181.53935f, 205.53935f, 211.96141f, 168.0f, 212.0f),
                    PathNode.LineTo(80.0f, 212.0f),
                    PathNode.CurveTo(73.37258f, 212.0f, 68.0f, 206.62741f, 68.0f, 200.0f),
                    PathNode.CurveTo(68.0f, 193.37259f, 73.37258f, 188.0f, 80.0f, 188.0f),
                    PathNode.LineTo(168.0f, 188.0f),
                    PathNode.CurveTo(192.30052f, 188.0f, 212.0f, 168.30052f, 212.0f, 144.0f),
                    PathNode.CurveTo(212.0f, 119.69947f, 192.30052f, 100.0f, 168.0f, 100.0f),
                    PathNode.LineTo(61.0f, 100.0f),
                    PathNode.LineTo(88.52f, 127.51f),
                    PathNode.CurveTo(93.214424f, 132.20442f, 93.214424f, 139.81558f, 88.52f, 144.51f),
                    PathNode.CurveTo(83.82558f, 149.20442f, 76.214424f, 149.20442f, 71.52f, 144.51f),
                    PathNode.LineTo(23.52f, 96.51f),
                    PathNode.CurveTo(21.260546f, 94.25838f, 19.990538f, 91.19982f, 19.990538f, 88.01f),
                    PathNode.CurveTo(19.990538f, 84.82018f, 21.260546f, 81.76162f, 23.52f, 79.51f),
                    PathNode.LineTo(71.52f, 31.51f),
                    PathNode.CurveTo(76.214424f, 26.81558f, 83.82558f, 26.815578f, 88.52f, 31.51f),
                    PathNode.CurveTo(93.214424f, 36.20442f, 93.214424f, 43.81558f, 88.52f, 48.51f),
                    PathNode.LineTo(61.0f, 76.0f),
                    PathNode.LineTo(168.0f, 76.0f),
                    PathNode.CurveTo(205.5371f, 76.04408f, 235.95592f, 106.46291f, 236.0f, 144.0f),
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
        return _arrowUUpLeft!!
    }

private var _arrowUUpLeft: ImageVector? = null
