package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.DotsSix: ImageVector
    get() {
        if (_dotsSix != null) return _dotsSix!!
        _dotsSix = phosphorDuotoneIcon(
            name = "DotsSix",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(240.0f, 64.0f),
                    PathNode.LineTo(240.0f, 192.0f),
                    PathNode.CurveTo(240.0f, 200.83656f, 232.83656f, 208.0f, 224.0f, 208.0f),
                    PathNode.LineTo(32.0f, 208.0f),
                    PathNode.CurveTo(23.163445f, 208.0f, 16.0f, 200.83656f, 16.0f, 192.0f),
                    PathNode.LineTo(16.0f, 64.0f),
                    PathNode.CurveTo(16.0f, 55.163445f, 23.163445f, 48.0f, 32.0f, 48.0f),
                    PathNode.LineTo(224.0f, 48.0f),
                    PathNode.CurveTo(232.83656f, 48.0f, 240.0f, 55.163445f, 240.0f, 64.0f),
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
                    PathNode.MoveTo(72.0f, 92.0f),
                    PathNode.CurveTo(72.0f, 98.62742f, 66.62742f, 104.0f, 60.0f, 104.0f),
                    PathNode.CurveTo(53.37258f, 104.0f, 48.0f, 98.62742f, 48.0f, 92.0f),
                    PathNode.CurveTo(48.0f, 85.37258f, 53.37258f, 80.0f, 60.0f, 80.0f),
                    PathNode.CurveTo(66.62742f, 80.0f, 72.0f, 85.37258f, 72.0f, 92.0f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 80.0f),
                    PathNode.CurveTo(121.37258f, 80.0f, 116.0f, 85.37258f, 116.0f, 92.0f),
                    PathNode.CurveTo(116.0f, 98.62742f, 121.37258f, 104.0f, 128.0f, 104.0f),
                    PathNode.CurveTo(134.62741f, 104.0f, 140.0f, 98.62742f, 140.0f, 92.0f),
                    PathNode.CurveTo(140.0f, 85.37258f, 134.62741f, 80.0f, 128.0f, 80.0f),
                    PathNode.Close,
                    PathNode.MoveTo(196.0f, 104.0f),
                    PathNode.CurveTo(202.62741f, 104.0f, 208.0f, 98.62742f, 208.0f, 92.0f),
                    PathNode.CurveTo(208.0f, 85.37258f, 202.62741f, 80.0f, 196.0f, 80.0f),
                    PathNode.CurveTo(189.37259f, 80.0f, 184.0f, 85.37258f, 184.0f, 92.0f),
                    PathNode.CurveTo(184.0f, 98.62742f, 189.37259f, 104.0f, 196.0f, 104.0f),
                    PathNode.Close,
                    PathNode.MoveTo(60.0f, 152.0f),
                    PathNode.CurveTo(53.37258f, 152.0f, 48.0f, 157.37259f, 48.0f, 164.0f),
                    PathNode.CurveTo(48.0f, 170.62741f, 53.37258f, 176.0f, 60.0f, 176.0f),
                    PathNode.CurveTo(66.62742f, 176.0f, 72.0f, 170.62741f, 72.0f, 164.0f),
                    PathNode.CurveTo(72.0f, 157.37259f, 66.62742f, 152.0f, 60.0f, 152.0f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 152.0f),
                    PathNode.CurveTo(121.37258f, 152.0f, 116.0f, 157.37259f, 116.0f, 164.0f),
                    PathNode.CurveTo(116.0f, 170.62741f, 121.37258f, 176.0f, 128.0f, 176.0f),
                    PathNode.CurveTo(134.62741f, 176.0f, 140.0f, 170.62741f, 140.0f, 164.0f),
                    PathNode.CurveTo(140.0f, 157.37259f, 134.62741f, 152.0f, 128.0f, 152.0f),
                    PathNode.Close,
                    PathNode.MoveTo(196.0f, 152.0f),
                    PathNode.CurveTo(189.37259f, 152.0f, 184.0f, 157.37259f, 184.0f, 164.0f),
                    PathNode.CurveTo(184.0f, 170.62741f, 189.37259f, 176.0f, 196.0f, 176.0f),
                    PathNode.CurveTo(202.62741f, 176.0f, 208.0f, 170.62741f, 208.0f, 164.0f),
                    PathNode.CurveTo(208.0f, 157.37259f, 202.62741f, 152.0f, 196.0f, 152.0f),
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
        return _dotsSix!!
    }

private var _dotsSix: ImageVector? = null
