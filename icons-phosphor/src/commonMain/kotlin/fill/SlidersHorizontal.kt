package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.SlidersHorizontal: ImageVector
    get() {
        if (_slidersHorizontal != null) return _slidersHorizontal!!
        _slidersHorizontal = phosphorFillIcon(
            name = "SlidersHorizontal",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(32.0f, 80.0f),
                    PathNode.CurveTo(32.0f, 75.58172f, 35.581722f, 72.0f, 40.0f, 72.0f),
                    PathNode.LineTo(77.17f, 72.0f),
                    PathNode.CurveTo(80.711044f, 60.138214f, 91.62095f, 52.009438f, 104.0f, 52.009438f),
                    PathNode.CurveTo(116.37905f, 52.009438f, 127.288956f, 60.138214f, 130.83f, 72.0f),
                    PathNode.LineTo(216.0f, 72.0f),
                    PathNode.CurveTo(220.41827f, 72.0f, 224.0f, 75.58172f, 224.0f, 80.0f),
                    PathNode.CurveTo(224.0f, 84.41828f, 220.41827f, 88.0f, 216.0f, 88.0f),
                    PathNode.LineTo(130.83f, 88.0f),
                    PathNode.CurveTo(127.288956f, 99.86178f, 116.37905f, 107.99056f, 104.0f, 107.99056f),
                    PathNode.CurveTo(91.62095f, 107.99056f, 80.711044f, 99.86178f, 77.17f, 88.0f),
                    PathNode.LineTo(40.0f, 88.0f),
                    PathNode.CurveTo(35.581722f, 88.0f, 32.0f, 84.41828f, 32.0f, 80.0f),
                    PathNode.Close,
                    PathNode.MoveTo(216.0f, 168.0f),
                    PathNode.LineTo(194.83f, 168.0f),
                    PathNode.CurveTo(191.28896f, 156.13821f, 180.37904f, 148.00945f, 168.0f, 148.00945f),
                    PathNode.CurveTo(155.62096f, 148.00945f, 144.71104f, 156.13821f, 141.17f, 168.0f),
                    PathNode.LineTo(40.0f, 168.0f),
                    PathNode.CurveTo(35.581722f, 168.0f, 32.0f, 171.58173f, 32.0f, 176.0f),
                    PathNode.CurveTo(32.0f, 180.41827f, 35.581722f, 184.0f, 40.0f, 184.0f),
                    PathNode.LineTo(141.17f, 184.0f),
                    PathNode.CurveTo(144.71104f, 195.86179f, 155.62096f, 203.99055f, 168.0f, 203.99055f),
                    PathNode.CurveTo(180.37904f, 203.99055f, 191.28896f, 195.86179f, 194.83f, 184.0f),
                    PathNode.LineTo(216.0f, 184.0f),
                    PathNode.CurveTo(220.41827f, 184.0f, 224.0f, 180.41827f, 224.0f, 176.0f),
                    PathNode.CurveTo(224.0f, 171.58173f, 220.41827f, 168.0f, 216.0f, 168.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 4f,
            )
        }
        return _slidersHorizontal!!
    }

private var _slidersHorizontal: ImageVector? = null
