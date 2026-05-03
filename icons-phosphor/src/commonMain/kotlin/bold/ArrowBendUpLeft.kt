package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.ArrowBendUpLeft: ImageVector
    get() {
        if (_arrowBendUpLeft != null) return _arrowBendUpLeft!!
        _arrowBendUpLeft = phosphorBoldIcon(
            name = "ArrowBendUpLeft",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(236.0f, 200.0f),
                    PathNode.CurveTo(236.0f, 206.62741f, 230.62741f, 212.0f, 224.0f, 212.0f),
                    PathNode.CurveTo(217.37259f, 212.0f, 212.0f, 206.62741f, 212.0f, 200.0f),
                    PathNode.CurveTo(211.9504f, 153.62865f, 174.37135f, 116.04961f, 128.0f, 116.0f),
                    PathNode.LineTo(61.0f, 116.0f),
                    PathNode.LineTo(88.52f, 143.51f),
                    PathNode.CurveTo(93.21442f, 148.20442f, 93.21442f, 155.81558f, 88.52f, 160.51f),
                    PathNode.CurveTo(83.82558f, 165.20442f, 76.214424f, 165.20442f, 71.52f, 160.51f),
                    PathNode.LineTo(23.52f, 112.51f),
                    PathNode.CurveTo(21.260546f, 110.25838f, 19.990538f, 107.19982f, 19.990538f, 104.01f),
                    PathNode.CurveTo(19.990538f, 100.82018f, 21.260546f, 97.76162f, 23.52f, 95.51f),
                    PathNode.LineTo(71.52f, 47.51f),
                    PathNode.CurveTo(76.214424f, 42.81558f, 83.82558f, 42.81558f, 88.52f, 47.51f),
                    PathNode.CurveTo(93.21442f, 52.20442f, 93.21442f, 59.81558f, 88.52f, 64.51f),
                    PathNode.LineTo(61.0f, 92.0f),
                    PathNode.LineTo(128.0f, 92.0f),
                    PathNode.CurveTo(187.61934f, 92.06613f, 235.93387f, 140.38066f, 236.0f, 200.0f),
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
        return _arrowBendUpLeft!!
    }

private var _arrowBendUpLeft: ImageVector? = null
