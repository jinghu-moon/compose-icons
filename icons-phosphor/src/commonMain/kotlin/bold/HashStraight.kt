package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.HashStraight: ImageVector
    get() {
        if (_hashStraight != null) return _hashStraight!!
        _hashStraight = phosphorBoldIcon(
            name = "HashStraight",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(216.0f, 148.0f),
                    PathNode.LineTo(172.0f, 148.0f),
                    PathNode.LineTo(172.0f, 108.0f),
                    PathNode.LineTo(216.0f, 108.0f),
                    PathNode.CurveTo(222.62741f, 108.0f, 228.0f, 102.62742f, 228.0f, 96.0f),
                    PathNode.CurveTo(228.0f, 89.37258f, 222.62741f, 84.0f, 216.0f, 84.0f),
                    PathNode.LineTo(172.0f, 84.0f),
                    PathNode.LineTo(172.0f, 40.0f),
                    PathNode.CurveTo(172.0f, 33.37258f, 166.62741f, 28.0f, 160.0f, 28.0f),
                    PathNode.CurveTo(153.37259f, 28.0f, 148.0f, 33.37258f, 148.0f, 40.0f),
                    PathNode.LineTo(148.0f, 84.0f),
                    PathNode.LineTo(108.0f, 84.0f),
                    PathNode.LineTo(108.0f, 40.0f),
                    PathNode.CurveTo(108.0f, 33.37258f, 102.62742f, 28.0f, 96.0f, 28.0f),
                    PathNode.CurveTo(89.37258f, 28.0f, 84.0f, 33.37258f, 84.0f, 40.0f),
                    PathNode.LineTo(84.0f, 84.0f),
                    PathNode.LineTo(40.0f, 84.0f),
                    PathNode.CurveTo(33.37258f, 84.0f, 28.0f, 89.37258f, 28.0f, 96.0f),
                    PathNode.CurveTo(28.0f, 102.62742f, 33.37258f, 108.0f, 40.0f, 108.0f),
                    PathNode.LineTo(84.0f, 108.0f),
                    PathNode.LineTo(84.0f, 148.0f),
                    PathNode.LineTo(40.0f, 148.0f),
                    PathNode.CurveTo(33.37258f, 148.0f, 28.0f, 153.37259f, 28.0f, 160.0f),
                    PathNode.CurveTo(28.0f, 166.62741f, 33.37258f, 172.0f, 40.0f, 172.0f),
                    PathNode.LineTo(84.0f, 172.0f),
                    PathNode.LineTo(84.0f, 216.0f),
                    PathNode.CurveTo(84.0f, 222.62741f, 89.37258f, 228.0f, 96.0f, 228.0f),
                    PathNode.CurveTo(102.62742f, 228.0f, 108.0f, 222.62741f, 108.0f, 216.0f),
                    PathNode.LineTo(108.0f, 172.0f),
                    PathNode.LineTo(148.0f, 172.0f),
                    PathNode.LineTo(148.0f, 216.0f),
                    PathNode.CurveTo(148.0f, 222.62741f, 153.37259f, 228.0f, 160.0f, 228.0f),
                    PathNode.CurveTo(166.62741f, 228.0f, 172.0f, 222.62741f, 172.0f, 216.0f),
                    PathNode.LineTo(172.0f, 172.0f),
                    PathNode.LineTo(216.0f, 172.0f),
                    PathNode.CurveTo(222.62741f, 172.0f, 228.0f, 166.62741f, 228.0f, 160.0f),
                    PathNode.CurveTo(228.0f, 153.37259f, 222.62741f, 148.0f, 216.0f, 148.0f),
                    PathNode.Close,
                    PathNode.MoveTo(108.0f, 148.0f),
                    PathNode.LineTo(108.0f, 108.0f),
                    PathNode.LineTo(148.0f, 108.0f),
                    PathNode.LineTo(148.0f, 148.0f),
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
        return _hashStraight!!
    }

private var _hashStraight: ImageVector? = null
