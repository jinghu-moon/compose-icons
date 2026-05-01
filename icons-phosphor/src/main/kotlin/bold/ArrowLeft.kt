package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.ArrowLeft: ImageVector
    get() {
        if (_arrowLeft != null) return _arrowLeft!!
        _arrowLeft = phosphorBoldIcon(
            name = "ArrowLeft",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(228.0f, 128.0f),
                    PathNode.CurveTo(228.0f, 134.62741f, 222.62741f, 140.0f, 216.0f, 140.0f),
                    PathNode.LineTo(69.0f, 140.0f),
                    PathNode.LineTo(120.52f, 191.51f),
                    PathNode.CurveTo(125.21442f, 196.20442f, 125.21442f, 203.81558f, 120.52f, 208.51f),
                    PathNode.CurveTo(115.82558f, 213.20442f, 108.214424f, 213.20442f, 103.52f, 208.51f),
                    PathNode.LineTo(31.52f, 136.51f),
                    PathNode.CurveTo(29.260546f, 134.25838f, 27.990538f, 131.19981f, 27.990538f, 128.01f),
                    PathNode.CurveTo(27.990538f, 124.82018f, 29.260546f, 121.76162f, 31.52f, 119.51f),
                    PathNode.LineTo(103.52f, 47.51f),
                    PathNode.CurveTo(108.214424f, 42.81558f, 115.82558f, 42.81558f, 120.52f, 47.51f),
                    PathNode.CurveTo(125.21442f, 52.20442f, 125.21442f, 59.81558f, 120.52f, 64.51f),
                    PathNode.LineTo(69.0f, 116.0f),
                    PathNode.LineTo(216.0f, 116.0f),
                    PathNode.CurveTo(222.62741f, 116.0f, 228.0f, 121.37258f, 228.0f, 128.0f),
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
        return _arrowLeft!!
    }

private var _arrowLeft: ImageVector? = null
