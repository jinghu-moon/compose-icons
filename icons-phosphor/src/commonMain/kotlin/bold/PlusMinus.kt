package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.PlusMinus: ImageVector
    get() {
        if (_plusMinus != null) return _plusMinus!!
        _plusMinus = phosphorBoldIcon(
            name = "PlusMinus",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(208.49f, 64.49f),
                    PathNode.LineTo(64.49f, 208.49f),
                    PathNode.CurveTo(59.79558f, 213.18442f, 52.18442f, 213.18442f, 47.49f, 208.49f),
                    PathNode.CurveTo(42.79558f, 203.79558f, 42.79558f, 196.18442f, 47.49f, 191.49f),
                    PathNode.LineTo(191.49f, 47.49f),
                    PathNode.CurveTo(196.18442f, 42.79558f, 203.79558f, 42.79558f, 208.49f, 47.49f),
                    PathNode.CurveTo(213.18442f, 52.18442f, 213.18442f, 59.79558f, 208.49f, 64.49f),
                    PathNode.Close,
                    PathNode.MoveTo(60.0f, 112.0f),
                    PathNode.CurveTo(60.0f, 118.62742f, 65.37258f, 124.0f, 72.0f, 124.0f),
                    PathNode.CurveTo(78.62742f, 124.0f, 84.0f, 118.62742f, 84.0f, 112.0f),
                    PathNode.LineTo(84.0f, 84.0f),
                    PathNode.LineTo(112.0f, 84.0f),
                    PathNode.CurveTo(118.62742f, 84.0f, 124.0f, 78.62742f, 124.0f, 72.0f),
                    PathNode.CurveTo(124.0f, 65.37258f, 118.62742f, 60.0f, 112.0f, 60.0f),
                    PathNode.LineTo(84.0f, 60.0f),
                    PathNode.LineTo(84.0f, 32.0f),
                    PathNode.CurveTo(84.0f, 25.372583f, 78.62742f, 20.0f, 72.0f, 20.0f),
                    PathNode.CurveTo(65.37258f, 20.0f, 60.0f, 25.372583f, 60.0f, 32.0f),
                    PathNode.LineTo(60.0f, 60.0f),
                    PathNode.LineTo(32.0f, 60.0f),
                    PathNode.CurveTo(25.372583f, 60.0f, 20.0f, 65.37258f, 20.0f, 72.0f),
                    PathNode.CurveTo(20.0f, 78.62742f, 25.372583f, 84.0f, 32.0f, 84.0f),
                    PathNode.LineTo(60.0f, 84.0f),
                    PathNode.Close,
                    PathNode.MoveTo(224.0f, 172.0f),
                    PathNode.LineTo(144.0f, 172.0f),
                    PathNode.CurveTo(137.37259f, 172.0f, 132.0f, 177.37259f, 132.0f, 184.0f),
                    PathNode.CurveTo(132.0f, 190.62741f, 137.37259f, 196.0f, 144.0f, 196.0f),
                    PathNode.LineTo(224.0f, 196.0f),
                    PathNode.CurveTo(230.62741f, 196.0f, 236.0f, 190.62741f, 236.0f, 184.0f),
                    PathNode.CurveTo(236.0f, 177.37259f, 230.62741f, 172.0f, 224.0f, 172.0f),
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
        return _plusMinus!!
    }

private var _plusMinus: ImageVector? = null
