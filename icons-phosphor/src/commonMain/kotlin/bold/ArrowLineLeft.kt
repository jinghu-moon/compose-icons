package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.ArrowLineLeft: ImageVector
    get() {
        if (_arrowLineLeft != null) return _arrowLineLeft!!
        _arrowLineLeft = phosphorBoldIcon(
            name = "ArrowLineLeft",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(236.0f, 128.0f),
                    PathNode.CurveTo(236.0f, 134.62741f, 230.62741f, 140.0f, 224.0f, 140.0f),
                    PathNode.LineTo(109.0f, 140.0f),
                    PathNode.LineTo(160.52f, 191.51f),
                    PathNode.CurveTo(165.21442f, 196.20442f, 165.21442f, 203.81558f, 160.52f, 208.51f),
                    PathNode.CurveTo(155.82558f, 213.20442f, 148.21442f, 213.20442f, 143.52f, 208.51f),
                    PathNode.LineTo(71.52f, 136.51f),
                    PathNode.CurveTo(69.260544f, 134.25838f, 67.99054f, 131.19981f, 67.99054f, 128.01f),
                    PathNode.CurveTo(67.99054f, 124.82018f, 69.260544f, 121.76162f, 71.52f, 119.51f),
                    PathNode.LineTo(143.52f, 47.51f),
                    PathNode.CurveTo(148.21442f, 42.81558f, 155.82558f, 42.81558f, 160.52f, 47.51f),
                    PathNode.CurveTo(165.21442f, 52.20442f, 165.21442f, 59.81558f, 160.52f, 64.51f),
                    PathNode.LineTo(109.0f, 116.0f),
                    PathNode.LineTo(224.0f, 116.0f),
                    PathNode.CurveTo(230.62741f, 116.0f, 236.0f, 121.37258f, 236.0f, 128.0f),
                    PathNode.Close,
                    PathNode.MoveTo(40.0f, 28.0f),
                    PathNode.CurveTo(33.37258f, 28.0f, 28.0f, 33.37258f, 28.0f, 40.0f),
                    PathNode.LineTo(28.0f, 216.0f),
                    PathNode.CurveTo(28.0f, 222.62741f, 33.37258f, 228.0f, 40.0f, 228.0f),
                    PathNode.CurveTo(46.62742f, 228.0f, 52.0f, 222.62741f, 52.0f, 216.0f),
                    PathNode.LineTo(52.0f, 40.0f),
                    PathNode.CurveTo(52.0f, 33.37258f, 46.62742f, 28.0f, 40.0f, 28.0f),
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
        return _arrowLineLeft!!
    }

private var _arrowLineLeft: ImageVector? = null
