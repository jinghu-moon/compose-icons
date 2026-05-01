package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.HashStraight: ImageVector
    get() {
        if (_hashStraight != null) return _hashStraight!!
        _hashStraight = phosphorDuotoneIcon(
            name = "HashStraight",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(160.0f, 96.0f),
                    PathNode.LineTo(160.0f, 160.0f),
                    PathNode.LineTo(96.0f, 160.0f),
                    PathNode.LineTo(96.0f, 96.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 16.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(216.0f, 152.0f),
                    PathNode.LineTo(168.0f, 152.0f),
                    PathNode.LineTo(168.0f, 104.0f),
                    PathNode.LineTo(216.0f, 104.0f),
                    PathNode.CurveTo(220.41827f, 104.0f, 224.0f, 100.41828f, 224.0f, 96.0f),
                    PathNode.CurveTo(224.0f, 91.58172f, 220.41827f, 88.0f, 216.0f, 88.0f),
                    PathNode.LineTo(168.0f, 88.0f),
                    PathNode.LineTo(168.0f, 40.0f),
                    PathNode.CurveTo(168.0f, 35.581722f, 164.41827f, 32.0f, 160.0f, 32.0f),
                    PathNode.CurveTo(155.58173f, 32.0f, 152.0f, 35.581722f, 152.0f, 40.0f),
                    PathNode.LineTo(152.0f, 88.0f),
                    PathNode.LineTo(104.0f, 88.0f),
                    PathNode.LineTo(104.0f, 40.0f),
                    PathNode.CurveTo(104.0f, 35.581722f, 100.41828f, 32.0f, 96.0f, 32.0f),
                    PathNode.CurveTo(91.58172f, 32.0f, 88.0f, 35.581722f, 88.0f, 40.0f),
                    PathNode.LineTo(88.0f, 88.0f),
                    PathNode.LineTo(40.0f, 88.0f),
                    PathNode.CurveTo(35.581722f, 88.0f, 32.0f, 91.58172f, 32.0f, 96.0f),
                    PathNode.CurveTo(32.0f, 100.41828f, 35.581722f, 104.0f, 40.0f, 104.0f),
                    PathNode.LineTo(88.0f, 104.0f),
                    PathNode.LineTo(88.0f, 152.0f),
                    PathNode.LineTo(40.0f, 152.0f),
                    PathNode.CurveTo(35.581722f, 152.0f, 32.0f, 155.58173f, 32.0f, 160.0f),
                    PathNode.CurveTo(32.0f, 164.41827f, 35.581722f, 168.0f, 40.0f, 168.0f),
                    PathNode.LineTo(88.0f, 168.0f),
                    PathNode.LineTo(88.0f, 216.0f),
                    PathNode.CurveTo(88.0f, 220.41827f, 91.58172f, 224.0f, 96.0f, 224.0f),
                    PathNode.CurveTo(100.41828f, 224.0f, 104.0f, 220.41827f, 104.0f, 216.0f),
                    PathNode.LineTo(104.0f, 168.0f),
                    PathNode.LineTo(152.0f, 168.0f),
                    PathNode.LineTo(152.0f, 216.0f),
                    PathNode.CurveTo(152.0f, 220.41827f, 155.58173f, 224.0f, 160.0f, 224.0f),
                    PathNode.CurveTo(164.41827f, 224.0f, 168.0f, 220.41827f, 168.0f, 216.0f),
                    PathNode.LineTo(168.0f, 168.0f),
                    PathNode.LineTo(216.0f, 168.0f),
                    PathNode.CurveTo(220.41827f, 168.0f, 224.0f, 164.41827f, 224.0f, 160.0f),
                    PathNode.CurveTo(224.0f, 155.58173f, 220.41827f, 152.0f, 216.0f, 152.0f),
                    PathNode.Close,
                    PathNode.MoveTo(104.0f, 152.0f),
                    PathNode.LineTo(104.0f, 104.0f),
                    PathNode.LineTo(152.0f, 104.0f),
                    PathNode.LineTo(152.0f, 152.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 16.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _hashStraight!!
    }

private var _hashStraight: ImageVector? = null
