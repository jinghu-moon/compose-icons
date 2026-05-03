package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Trademark: ImageVector
    get() {
        if (_trademark != null) return _trademark!!
        _trademark = phosphorBoldIcon(
            name = "Trademark",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(128.0f, 20.0f),
                    PathNode.CurveTo(68.35325f, 20.0f, 20.0f, 68.35325f, 20.0f, 128.0f),
                    PathNode.CurveTo(20.0f, 187.64676f, 68.35325f, 236.0f, 128.0f, 236.0f),
                    PathNode.CurveTo(187.64676f, 236.0f, 236.0f, 187.64676f, 236.0f, 128.0f),
                    PathNode.CurveTo(235.93387f, 68.38066f, 187.61934f, 20.066133f, 128.0f, 20.0f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 212.0f),
                    PathNode.CurveTo(81.60808f, 212.0f, 44.0f, 174.39192f, 44.0f, 128.0f),
                    PathNode.CurveTo(44.0f, 81.60808f, 81.60808f, 44.0f, 128.0f, 44.0f),
                    PathNode.CurveTo(174.39192f, 44.0f, 212.0f, 81.60808f, 212.0f, 128.0f),
                    PathNode.CurveTo(211.9504f, 174.37135f, 174.37135f, 211.9504f, 128.0f, 212.0f),
                    PathNode.Close,
                    PathNode.MoveTo(192.0f, 108.0f),
                    PathNode.LineTo(192.0f, 148.0f),
                    PathNode.CurveTo(192.0f, 154.62741f, 186.62741f, 160.0f, 180.0f, 160.0f),
                    PathNode.CurveTo(173.37259f, 160.0f, 168.0f, 154.62741f, 168.0f, 148.0f),
                    PathNode.LineTo(168.0f, 134.09f),
                    PathNode.LineTo(159.81f, 141.09f),
                    PathNode.CurveTo(155.31595f, 144.94247f, 148.68405f, 144.94247f, 144.19f, 141.09f),
                    PathNode.LineTo(136.0f, 134.09f),
                    PathNode.LineTo(136.0f, 148.0f),
                    PathNode.CurveTo(136.0f, 154.62741f, 130.62741f, 160.0f, 124.0f, 160.0f),
                    PathNode.CurveTo(117.37258f, 160.0f, 112.0f, 154.62741f, 112.0f, 148.0f),
                    PathNode.LineTo(112.0f, 120.0f),
                    PathNode.LineTo(100.0f, 120.0f),
                    PathNode.LineTo(100.0f, 148.0f),
                    PathNode.CurveTo(100.0f, 154.62741f, 94.62742f, 160.0f, 88.0f, 160.0f),
                    PathNode.CurveTo(81.37258f, 160.0f, 76.0f, 154.62741f, 76.0f, 148.0f),
                    PathNode.LineTo(76.0f, 120.0f),
                    PathNode.LineTo(72.0f, 120.0f),
                    PathNode.CurveTo(65.37258f, 120.0f, 60.0f, 114.62742f, 60.0f, 108.0f),
                    PathNode.CurveTo(60.0f, 101.37258f, 65.37258f, 96.0f, 72.0f, 96.0f),
                    PathNode.LineTo(124.0f, 96.0f),
                    PathNode.CurveTo(126.864845f, 96.00018f, 129.6351f, 97.02528f, 131.81f, 98.89f),
                    PathNode.LineTo(152.0f, 116.2f),
                    PathNode.LineTo(172.19f, 98.89f),
                    PathNode.CurveTo(175.74799f, 95.83996f, 180.75597f, 95.14023f, 185.01369f, 97.09822f),
                    PathNode.CurveTo(189.27141f, 99.05621f, 191.99974f, 103.313644f, 192.0f, 108.0f),
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
        return _trademark!!
    }

private var _trademark: ImageVector? = null
