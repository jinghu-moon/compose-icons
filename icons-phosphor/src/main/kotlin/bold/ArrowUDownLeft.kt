package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.ArrowUDownLeft: ImageVector
    get() {
        if (_arrowUDownLeft != null) return _arrowUDownLeft!!
        _arrowUDownLeft = phosphorBoldIcon(
            name = "ArrowUDownLeft",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(236.0f, 112.0f),
                    PathNode.CurveTo(235.96141f, 149.53935f, 205.53935f, 179.96141f, 168.0f, 180.0f),
                    PathNode.LineTo(61.0f, 180.0f),
                    PathNode.LineTo(88.52f, 207.51f),
                    PathNode.CurveTo(93.21442f, 212.20442f, 93.21442f, 219.81558f, 88.52f, 224.51f),
                    PathNode.CurveTo(83.82558f, 229.20442f, 76.214424f, 229.20442f, 71.52f, 224.51f),
                    PathNode.LineTo(23.52f, 176.51f),
                    PathNode.CurveTo(21.260546f, 174.25838f, 19.990538f, 171.19981f, 19.990538f, 168.01f),
                    PathNode.CurveTo(19.990538f, 164.82018f, 21.260546f, 161.76163f, 23.52f, 159.51f),
                    PathNode.LineTo(71.52f, 111.51f),
                    PathNode.CurveTo(76.214424f, 106.81558f, 83.82558f, 106.81558f, 88.52f, 111.51f),
                    PathNode.CurveTo(93.214424f, 116.20442f, 93.214424f, 123.81558f, 88.52f, 128.51f),
                    PathNode.LineTo(61.0f, 156.0f),
                    PathNode.LineTo(168.0f, 156.0f),
                    PathNode.CurveTo(192.30052f, 156.0f, 212.0f, 136.30052f, 212.0f, 112.0f),
                    PathNode.CurveTo(212.0f, 87.69947f, 192.30052f, 68.0f, 168.0f, 68.0f),
                    PathNode.LineTo(80.0f, 68.0f),
                    PathNode.CurveTo(73.37258f, 68.0f, 68.0f, 62.62742f, 68.0f, 56.0f),
                    PathNode.CurveTo(68.0f, 49.37258f, 73.37258f, 44.0f, 80.0f, 44.0f),
                    PathNode.LineTo(168.0f, 44.0f),
                    PathNode.CurveTo(205.53935f, 44.038586f, 235.96141f, 74.46063f, 236.0f, 112.0f),
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
        return _arrowUDownLeft!!
    }

private var _arrowUDownLeft: ImageVector? = null
