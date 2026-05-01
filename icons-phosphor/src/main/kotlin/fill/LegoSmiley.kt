package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.LegoSmiley: ImageVector
    get() {
        if (_legoSmiley != null) return _legoSmiley!!
        _legoSmiley = phosphorFillIcon(
            name = "LegoSmiley",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(184.0f, 48.0f),
                    PathNode.LineTo(168.0f, 48.0f),
                    PathNode.LineTo(168.0f, 32.0f),
                    PathNode.CurveTo(168.0f, 23.163445f, 160.83656f, 16.0f, 152.0f, 16.0f),
                    PathNode.LineTo(104.0f, 16.0f),
                    PathNode.CurveTo(95.163445f, 16.0f, 88.0f, 23.163445f, 88.0f, 32.0f),
                    PathNode.LineTo(88.0f, 48.0f),
                    PathNode.LineTo(72.0f, 48.0f),
                    PathNode.CurveTo(54.32689f, 48.0f, 40.0f, 62.32689f, 40.0f, 80.0f),
                    PathNode.LineTo(40.0f, 176.0f),
                    PathNode.CurveTo(40.01379f, 190.59071f, 49.877895f, 203.33186f, 64.0f, 207.0f),
                    PathNode.LineTo(64.0f, 224.0f),
                    PathNode.CurveTo(64.0f, 232.83656f, 71.163445f, 240.0f, 80.0f, 240.0f),
                    PathNode.LineTo(176.0f, 240.0f),
                    PathNode.CurveTo(184.83656f, 240.0f, 192.0f, 232.83656f, 192.0f, 224.0f),
                    PathNode.LineTo(192.0f, 207.0f),
                    PathNode.CurveTo(206.1221f, 203.33186f, 215.9862f, 190.59071f, 216.0f, 176.0f),
                    PathNode.LineTo(216.0f, 80.0f),
                    PathNode.CurveTo(216.0f, 62.32689f, 201.67311f, 48.0f, 184.0f, 48.0f),
                    PathNode.Close,
                    PathNode.MoveTo(156.0f, 100.0f),
                    PathNode.CurveTo(162.62741f, 100.0f, 168.0f, 105.37258f, 168.0f, 112.0f),
                    PathNode.CurveTo(168.0f, 118.62742f, 162.62741f, 124.0f, 156.0f, 124.0f),
                    PathNode.CurveTo(149.37259f, 124.0f, 144.0f, 118.62742f, 144.0f, 112.0f),
                    PathNode.CurveTo(144.0f, 105.37258f, 149.37259f, 100.0f, 156.0f, 100.0f),
                    PathNode.Close,
                    PathNode.MoveTo(160.27f, 158.77f),
                    PathNode.CurveTo(140.51846f, 171.08292f, 115.481544f, 171.08292f, 95.73f, 158.77f),
                    PathNode.CurveTo(91.991035f, 156.41174f, 90.87174f, 151.46896f, 93.23f, 147.73f),
                    PathNode.CurveTo(95.58826f, 143.99103f, 100.53103f, 142.87175f, 104.27f, 145.23f),
                    PathNode.CurveTo(118.80414f, 154.2505f, 137.19586f, 154.2505f, 151.73f, 145.23f),
                    PathNode.CurveTo(155.46896f, 142.87175f, 160.41174f, 143.99103f, 162.77f, 147.73f),
                    PathNode.CurveTo(165.12825f, 151.46896f, 164.00897f, 156.41174f, 160.27f, 158.77f),
                    PathNode.Close,
                    PathNode.MoveTo(104.0f, 32.0f),
                    PathNode.LineTo(152.0f, 32.0f),
                    PathNode.LineTo(152.0f, 48.0f),
                    PathNode.LineTo(104.0f, 48.0f),
                    PathNode.Close,
                    PathNode.MoveTo(100.0f, 100.0f),
                    PathNode.CurveTo(106.62742f, 100.0f, 112.0f, 105.37258f, 112.0f, 112.0f),
                    PathNode.CurveTo(112.0f, 118.62742f, 106.62742f, 124.0f, 100.0f, 124.0f),
                    PathNode.CurveTo(93.37258f, 124.0f, 88.0f, 118.62742f, 88.0f, 112.0f),
                    PathNode.CurveTo(88.0f, 105.37258f, 93.37258f, 100.0f, 100.0f, 100.0f),
                    PathNode.Close,
                    PathNode.MoveTo(176.0f, 224.0f),
                    PathNode.LineTo(80.0f, 224.0f),
                    PathNode.LineTo(80.0f, 208.0f),
                    PathNode.LineTo(176.0f, 208.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 4f,
            )
        }
        return _legoSmiley!!
    }

private var _legoSmiley: ImageVector? = null
