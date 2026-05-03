package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.NumberSeven: ImageVector
    get() {
        if (_numberSeven != null) return _numberSeven!!
        _numberSeven = phosphorFillIcon(
            name = "NumberSeven",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(200.0f, 24.0f),
                    PathNode.LineTo(56.0f, 24.0f),
                    PathNode.CurveTo(47.163445f, 24.0f, 40.0f, 31.163445f, 40.0f, 40.0f),
                    PathNode.LineTo(40.0f, 216.0f),
                    PathNode.CurveTo(40.0f, 224.83656f, 47.163445f, 232.0f, 56.0f, 232.0f),
                    PathNode.LineTo(200.0f, 232.0f),
                    PathNode.CurveTo(208.83656f, 232.0f, 216.0f, 224.83656f, 216.0f, 216.0f),
                    PathNode.LineTo(216.0f, 40.0f),
                    PathNode.CurveTo(216.0f, 31.163445f, 208.83656f, 24.0f, 200.0f, 24.0f),
                    PathNode.Close,
                    PathNode.MoveTo(167.53f, 74.69f),
                    PathNode.LineTo(127.53f, 186.69f),
                    PathNode.CurveTo(126.63504f, 189.46736f, 124.29887f, 191.53716f, 121.4339f, 192.09096f),
                    PathNode.CurveTo(118.56893f, 192.64478f, 115.629684f, 191.59477f, 113.764114f, 189.35103f),
                    PathNode.CurveTo(111.898544f, 187.10728f, 111.4026f, 184.02577f, 112.47f, 181.31f),
                    PathNode.LineTo(148.65f, 80.0f),
                    PathNode.LineTo(96.0f, 80.0f),
                    PathNode.CurveTo(91.58172f, 80.0f, 88.0f, 76.41828f, 88.0f, 72.0f),
                    PathNode.CurveTo(88.0f, 67.58172f, 91.58172f, 64.0f, 96.0f, 64.0f),
                    PathNode.LineTo(160.0f, 64.0f),
                    PathNode.CurveTo(162.60071f, 64.00136f, 165.03845f, 65.26684f, 166.53613f, 67.39302f),
                    PathNode.CurveTo(168.03381f, 69.5192f, 168.4045f, 72.24072f, 167.53f, 74.69f),
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
        return _numberSeven!!
    }

private var _numberSeven: ImageVector? = null
