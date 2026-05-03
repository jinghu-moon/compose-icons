package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.DotsNine: ImageVector
    get() {
        if (_dotsNine != null) return _dotsNine!!
        _dotsNine = phosphorDuotoneIcon(
            name = "DotsNine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(224.0f, 48.0f),
                    PathNode.LineTo(224.0f, 208.0f),
                    PathNode.CurveTo(224.0f, 216.83656f, 216.83656f, 224.0f, 208.0f, 224.0f),
                    PathNode.LineTo(48.0f, 224.0f),
                    PathNode.CurveTo(39.163445f, 224.0f, 32.0f, 216.83656f, 32.0f, 208.0f),
                    PathNode.LineTo(32.0f, 48.0f),
                    PathNode.CurveTo(32.0f, 39.163445f, 39.163445f, 32.0f, 48.0f, 32.0f),
                    PathNode.LineTo(208.0f, 32.0f),
                    PathNode.CurveTo(216.83656f, 32.0f, 224.0f, 39.163445f, 224.0f, 48.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 0.2f,
                stroke = null,
                strokeAlpha = 0.2f,
                strokeLineWidth = 16.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(72.0f, 60.0f),
                    PathNode.CurveTo(72.0f, 66.62742f, 66.62742f, 72.0f, 60.0f, 72.0f),
                    PathNode.CurveTo(53.37258f, 72.0f, 48.0f, 66.62742f, 48.0f, 60.0f),
                    PathNode.CurveTo(48.0f, 53.37258f, 53.37258f, 48.0f, 60.0f, 48.0f),
                    PathNode.CurveTo(66.62742f, 48.0f, 72.0f, 53.37258f, 72.0f, 60.0f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 48.0f),
                    PathNode.CurveTo(121.37258f, 48.0f, 116.0f, 53.37258f, 116.0f, 60.0f),
                    PathNode.CurveTo(116.0f, 66.62742f, 121.37258f, 72.0f, 128.0f, 72.0f),
                    PathNode.CurveTo(134.62741f, 72.0f, 140.0f, 66.62742f, 140.0f, 60.0f),
                    PathNode.CurveTo(140.0f, 53.37258f, 134.62741f, 48.0f, 128.0f, 48.0f),
                    PathNode.Close,
                    PathNode.MoveTo(196.0f, 72.0f),
                    PathNode.CurveTo(202.62741f, 72.0f, 208.0f, 66.62742f, 208.0f, 60.0f),
                    PathNode.CurveTo(208.0f, 53.37258f, 202.62741f, 48.0f, 196.0f, 48.0f),
                    PathNode.CurveTo(189.37259f, 48.0f, 184.0f, 53.37258f, 184.0f, 60.0f),
                    PathNode.CurveTo(184.0f, 66.62742f, 189.37259f, 72.0f, 196.0f, 72.0f),
                    PathNode.Close,
                    PathNode.MoveTo(60.0f, 116.0f),
                    PathNode.CurveTo(53.37258f, 116.0f, 48.0f, 121.37258f, 48.0f, 128.0f),
                    PathNode.CurveTo(48.0f, 134.62741f, 53.37258f, 140.0f, 60.0f, 140.0f),
                    PathNode.CurveTo(66.62742f, 140.0f, 72.0f, 134.62741f, 72.0f, 128.0f),
                    PathNode.CurveTo(72.0f, 121.37258f, 66.62742f, 116.0f, 60.0f, 116.0f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 116.0f),
                    PathNode.CurveTo(121.37258f, 116.0f, 116.0f, 121.37258f, 116.0f, 128.0f),
                    PathNode.CurveTo(116.0f, 134.62741f, 121.37258f, 140.0f, 128.0f, 140.0f),
                    PathNode.CurveTo(134.62741f, 140.0f, 140.0f, 134.62741f, 140.0f, 128.0f),
                    PathNode.CurveTo(140.0f, 121.37258f, 134.62741f, 116.0f, 128.0f, 116.0f),
                    PathNode.Close,
                    PathNode.MoveTo(196.0f, 116.0f),
                    PathNode.CurveTo(189.37259f, 116.0f, 184.0f, 121.37258f, 184.0f, 128.0f),
                    PathNode.CurveTo(184.0f, 134.62741f, 189.37259f, 140.0f, 196.0f, 140.0f),
                    PathNode.CurveTo(202.62741f, 140.0f, 208.0f, 134.62741f, 208.0f, 128.0f),
                    PathNode.CurveTo(208.0f, 121.37258f, 202.62741f, 116.0f, 196.0f, 116.0f),
                    PathNode.Close,
                    PathNode.MoveTo(60.0f, 184.0f),
                    PathNode.CurveTo(53.37258f, 184.0f, 48.0f, 189.37259f, 48.0f, 196.0f),
                    PathNode.CurveTo(48.0f, 202.62741f, 53.37258f, 208.0f, 60.0f, 208.0f),
                    PathNode.CurveTo(66.62742f, 208.0f, 72.0f, 202.62741f, 72.0f, 196.0f),
                    PathNode.CurveTo(72.0f, 189.37259f, 66.62742f, 184.0f, 60.0f, 184.0f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 184.0f),
                    PathNode.CurveTo(121.37258f, 184.0f, 116.0f, 189.37259f, 116.0f, 196.0f),
                    PathNode.CurveTo(116.0f, 202.62741f, 121.37258f, 208.0f, 128.0f, 208.0f),
                    PathNode.CurveTo(134.62741f, 208.0f, 140.0f, 202.62741f, 140.0f, 196.0f),
                    PathNode.CurveTo(140.0f, 189.37259f, 134.62741f, 184.0f, 128.0f, 184.0f),
                    PathNode.Close,
                    PathNode.MoveTo(196.0f, 184.0f),
                    PathNode.CurveTo(189.37259f, 184.0f, 184.0f, 189.37259f, 184.0f, 196.0f),
                    PathNode.CurveTo(184.0f, 202.62741f, 189.37259f, 208.0f, 196.0f, 208.0f),
                    PathNode.CurveTo(202.62741f, 208.0f, 208.0f, 202.62741f, 208.0f, 196.0f),
                    PathNode.CurveTo(208.0f, 189.37259f, 202.62741f, 184.0f, 196.0f, 184.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 16.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _dotsNine!!
    }

private var _dotsNine: ImageVector? = null
