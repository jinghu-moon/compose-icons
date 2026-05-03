package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.ArrowBendDownLeft: ImageVector
    get() {
        if (_arrowBendDownLeft != null) return _arrowBendDownLeft!!
        _arrowBendDownLeft = phosphorBoldIcon(
            name = "ArrowBendDownLeft",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(236.0f, 56.0f),
                    PathNode.CurveTo(235.93387f, 115.61934f, 187.61934f, 163.93387f, 128.0f, 164.0f),
                    PathNode.LineTo(61.0f, 164.0f),
                    PathNode.LineTo(88.52f, 191.51f),
                    PathNode.CurveTo(93.21442f, 196.20442f, 93.21442f, 203.81558f, 88.52f, 208.51f),
                    PathNode.CurveTo(83.82558f, 213.20442f, 76.214424f, 213.20442f, 71.52f, 208.51f),
                    PathNode.LineTo(23.52f, 160.51f),
                    PathNode.CurveTo(21.260546f, 158.25838f, 19.990538f, 155.19981f, 19.990538f, 152.01f),
                    PathNode.CurveTo(19.990538f, 148.82018f, 21.260546f, 145.76163f, 23.52f, 143.51f),
                    PathNode.LineTo(71.52f, 95.51f),
                    PathNode.CurveTo(76.214424f, 90.81558f, 83.82558f, 90.81558f, 88.52f, 95.51f),
                    PathNode.CurveTo(93.21442f, 100.20442f, 93.21442f, 107.81558f, 88.52f, 112.51f),
                    PathNode.LineTo(61.0f, 140.0f),
                    PathNode.LineTo(128.0f, 140.0f),
                    PathNode.CurveTo(174.37135f, 139.9504f, 211.9504f, 102.37135f, 212.0f, 56.0f),
                    PathNode.CurveTo(212.0f, 49.37258f, 217.37259f, 44.0f, 224.0f, 44.0f),
                    PathNode.CurveTo(230.62741f, 44.0f, 236.0f, 49.37258f, 236.0f, 56.0f),
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
        return _arrowBendDownLeft!!
    }

private var _arrowBendDownLeft: ImageVector? = null
