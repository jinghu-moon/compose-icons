package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.DotsThree: ImageVector
    get() {
        if (_dotsThree != null) return _dotsThree!!
        _dotsThree = phosphorFillIcon(
            name = "DotsThree",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(224.0f, 80.0f),
                    PathNode.LineTo(32.0f, 80.0f),
                    PathNode.CurveTo(23.163445f, 80.0f, 16.0f, 87.163445f, 16.0f, 96.0f),
                    PathNode.LineTo(16.0f, 160.0f),
                    PathNode.CurveTo(16.0f, 168.83656f, 23.163445f, 176.0f, 32.0f, 176.0f),
                    PathNode.LineTo(224.0f, 176.0f),
                    PathNode.CurveTo(232.83656f, 176.0f, 240.0f, 168.83656f, 240.0f, 160.0f),
                    PathNode.LineTo(240.0f, 96.0f),
                    PathNode.CurveTo(240.0f, 87.163445f, 232.83656f, 80.0f, 224.0f, 80.0f),
                    PathNode.Close,
                    PathNode.MoveTo(60.0f, 140.0f),
                    PathNode.CurveTo(53.37258f, 140.0f, 48.0f, 134.62741f, 48.0f, 128.0f),
                    PathNode.CurveTo(48.0f, 121.37258f, 53.37258f, 116.0f, 60.0f, 116.0f),
                    PathNode.CurveTo(66.62742f, 116.0f, 72.0f, 121.37258f, 72.0f, 128.0f),
                    PathNode.CurveTo(72.0f, 134.62741f, 66.62742f, 140.0f, 60.0f, 140.0f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 140.0f),
                    PathNode.CurveTo(121.37258f, 140.0f, 116.0f, 134.62741f, 116.0f, 128.0f),
                    PathNode.CurveTo(116.0f, 121.37258f, 121.37258f, 116.0f, 128.0f, 116.0f),
                    PathNode.CurveTo(134.62741f, 116.0f, 140.0f, 121.37258f, 140.0f, 128.0f),
                    PathNode.CurveTo(140.0f, 134.62741f, 134.62741f, 140.0f, 128.0f, 140.0f),
                    PathNode.Close,
                    PathNode.MoveTo(196.0f, 140.0f),
                    PathNode.CurveTo(189.37259f, 140.0f, 184.0f, 134.62741f, 184.0f, 128.0f),
                    PathNode.CurveTo(184.0f, 121.37258f, 189.37259f, 116.0f, 196.0f, 116.0f),
                    PathNode.CurveTo(202.62741f, 116.0f, 208.0f, 121.37258f, 208.0f, 128.0f),
                    PathNode.CurveTo(208.0f, 134.62741f, 202.62741f, 140.0f, 196.0f, 140.0f),
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
        return _dotsThree!!
    }

private var _dotsThree: ImageVector? = null
