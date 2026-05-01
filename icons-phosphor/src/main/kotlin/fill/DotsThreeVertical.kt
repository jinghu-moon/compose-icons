package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.DotsThreeVertical: ImageVector
    get() {
        if (_dotsThreeVertical != null) return _dotsThreeVertical!!
        _dotsThreeVertical = phosphorFillIcon(
            name = "DotsThreeVertical",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(160.0f, 16.0f),
                    PathNode.LineTo(96.0f, 16.0f),
                    PathNode.CurveTo(87.163445f, 16.0f, 80.0f, 23.163445f, 80.0f, 32.0f),
                    PathNode.LineTo(80.0f, 224.0f),
                    PathNode.CurveTo(80.0f, 232.83656f, 87.163445f, 240.0f, 96.0f, 240.0f),
                    PathNode.LineTo(160.0f, 240.0f),
                    PathNode.CurveTo(168.83656f, 240.0f, 176.0f, 232.83656f, 176.0f, 224.0f),
                    PathNode.LineTo(176.0f, 32.0f),
                    PathNode.CurveTo(176.0f, 23.163445f, 168.83656f, 16.0f, 160.0f, 16.0f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 208.0f),
                    PathNode.CurveTo(121.37258f, 208.0f, 116.0f, 202.62741f, 116.0f, 196.0f),
                    PathNode.CurveTo(116.0f, 189.37259f, 121.37258f, 184.0f, 128.0f, 184.0f),
                    PathNode.CurveTo(134.62741f, 184.0f, 140.0f, 189.37259f, 140.0f, 196.0f),
                    PathNode.CurveTo(140.0f, 202.62741f, 134.62741f, 208.0f, 128.0f, 208.0f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 140.0f),
                    PathNode.CurveTo(121.37258f, 140.0f, 116.0f, 134.62741f, 116.0f, 128.0f),
                    PathNode.CurveTo(116.0f, 121.37258f, 121.37258f, 116.0f, 128.0f, 116.0f),
                    PathNode.CurveTo(134.62741f, 116.0f, 140.0f, 121.37258f, 140.0f, 128.0f),
                    PathNode.CurveTo(140.0f, 134.62741f, 134.62741f, 140.0f, 128.0f, 140.0f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 72.0f),
                    PathNode.CurveTo(121.37258f, 72.0f, 116.0f, 66.62742f, 116.0f, 60.0f),
                    PathNode.CurveTo(116.0f, 53.37258f, 121.37258f, 48.0f, 128.0f, 48.0f),
                    PathNode.CurveTo(134.62741f, 48.0f, 140.0f, 53.37258f, 140.0f, 60.0f),
                    PathNode.CurveTo(140.0f, 66.62742f, 134.62741f, 72.0f, 128.0f, 72.0f),
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
        return _dotsThreeVertical!!
    }

private var _dotsThreeVertical: ImageVector? = null
