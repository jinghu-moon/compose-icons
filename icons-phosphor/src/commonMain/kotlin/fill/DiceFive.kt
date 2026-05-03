package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.DiceFive: ImageVector
    get() {
        if (_diceFive != null) return _diceFive!!
        _diceFive = phosphorFillIcon(
            name = "DiceFive",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(192.0f, 32.0f),
                    PathNode.LineTo(64.0f, 32.0f),
                    PathNode.CurveTo(46.32689f, 32.0f, 32.0f, 46.32689f, 32.0f, 64.0f),
                    PathNode.LineTo(32.0f, 192.0f),
                    PathNode.CurveTo(32.0f, 209.67311f, 46.32689f, 224.0f, 64.0f, 224.0f),
                    PathNode.LineTo(192.0f, 224.0f),
                    PathNode.CurveTo(209.67311f, 224.0f, 224.0f, 209.67311f, 224.0f, 192.0f),
                    PathNode.LineTo(224.0f, 64.0f),
                    PathNode.CurveTo(224.0f, 46.32689f, 209.67311f, 32.0f, 192.0f, 32.0f),
                    PathNode.Close,
                    PathNode.MoveTo(92.0f, 176.0f),
                    PathNode.CurveTo(85.37258f, 176.0f, 80.0f, 170.62741f, 80.0f, 164.0f),
                    PathNode.CurveTo(80.0f, 157.37259f, 85.37258f, 152.0f, 92.0f, 152.0f),
                    PathNode.CurveTo(98.62742f, 152.0f, 104.0f, 157.37259f, 104.0f, 164.0f),
                    PathNode.CurveTo(104.0f, 170.62741f, 98.62742f, 176.0f, 92.0f, 176.0f),
                    PathNode.Close,
                    PathNode.MoveTo(92.0f, 104.0f),
                    PathNode.CurveTo(85.37258f, 104.0f, 80.0f, 98.62742f, 80.0f, 92.0f),
                    PathNode.CurveTo(80.0f, 85.37258f, 85.37258f, 80.0f, 92.0f, 80.0f),
                    PathNode.CurveTo(98.62742f, 80.0f, 104.0f, 85.37258f, 104.0f, 92.0f),
                    PathNode.CurveTo(104.0f, 98.62742f, 98.62742f, 104.0f, 92.0f, 104.0f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 140.0f),
                    PathNode.CurveTo(121.37258f, 140.0f, 116.0f, 134.62741f, 116.0f, 128.0f),
                    PathNode.CurveTo(116.0f, 121.37258f, 121.37258f, 116.0f, 128.0f, 116.0f),
                    PathNode.CurveTo(134.62741f, 116.0f, 140.0f, 121.37258f, 140.0f, 128.0f),
                    PathNode.CurveTo(140.0f, 134.62741f, 134.62741f, 140.0f, 128.0f, 140.0f),
                    PathNode.Close,
                    PathNode.MoveTo(164.0f, 176.0f),
                    PathNode.CurveTo(157.37259f, 176.0f, 152.0f, 170.62741f, 152.0f, 164.0f),
                    PathNode.CurveTo(152.0f, 157.37259f, 157.37259f, 152.0f, 164.0f, 152.0f),
                    PathNode.CurveTo(170.62741f, 152.0f, 176.0f, 157.37259f, 176.0f, 164.0f),
                    PathNode.CurveTo(176.0f, 170.62741f, 170.62741f, 176.0f, 164.0f, 176.0f),
                    PathNode.Close,
                    PathNode.MoveTo(164.0f, 104.0f),
                    PathNode.CurveTo(157.37259f, 104.0f, 152.0f, 98.62742f, 152.0f, 92.0f),
                    PathNode.CurveTo(152.0f, 85.37258f, 157.37259f, 80.0f, 164.0f, 80.0f),
                    PathNode.CurveTo(170.62741f, 80.0f, 176.0f, 85.37258f, 176.0f, 92.0f),
                    PathNode.CurveTo(176.0f, 98.62742f, 170.62741f, 104.0f, 164.0f, 104.0f),
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
        return _diceFive!!
    }

private var _diceFive: ImageVector? = null
