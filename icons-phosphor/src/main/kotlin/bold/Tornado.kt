package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Tornado: ImageVector
    get() {
        if (_tornado != null) return _tornado!!
        _tornado = phosphorBoldIcon(
            name = "Tornado",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(232.0f, 44.0f),
                    PathNode.CurveTo(232.0f, 50.62742f, 226.62741f, 56.0f, 220.0f, 56.0f),
                    PathNode.LineTo(60.0f, 56.0f),
                    PathNode.CurveTo(53.37258f, 56.0f, 48.0f, 50.62742f, 48.0f, 44.0f),
                    PathNode.CurveTo(48.0f, 37.37258f, 53.37258f, 32.0f, 60.0f, 32.0f),
                    PathNode.LineTo(220.0f, 32.0f),
                    PathNode.CurveTo(226.62741f, 32.0f, 232.0f, 37.37258f, 232.0f, 44.0f),
                    PathNode.Close,
                    PathNode.MoveTo(176.0f, 88.0f),
                    PathNode.CurveTo(176.0f, 81.37258f, 170.62741f, 76.0f, 164.0f, 76.0f),
                    PathNode.LineTo(44.0f, 76.0f),
                    PathNode.CurveTo(37.37258f, 76.0f, 32.0f, 81.37258f, 32.0f, 88.0f),
                    PathNode.CurveTo(32.0f, 94.62742f, 37.37258f, 100.0f, 44.0f, 100.0f),
                    PathNode.LineTo(164.0f, 100.0f),
                    PathNode.CurveTo(170.62741f, 100.0f, 176.0f, 94.62742f, 176.0f, 88.0f),
                    PathNode.Close,
                    PathNode.MoveTo(176.0f, 132.0f),
                    PathNode.CurveTo(176.0f, 125.37258f, 170.62741f, 120.0f, 164.0f, 120.0f),
                    PathNode.LineTo(76.0f, 120.0f),
                    PathNode.CurveTo(69.37258f, 120.0f, 64.0f, 125.37258f, 64.0f, 132.0f),
                    PathNode.CurveTo(64.0f, 138.62741f, 69.37258f, 144.0f, 76.0f, 144.0f),
                    PathNode.LineTo(164.0f, 144.0f),
                    PathNode.CurveTo(170.62741f, 144.0f, 176.0f, 138.62741f, 176.0f, 132.0f),
                    PathNode.Close,
                    PathNode.MoveTo(172.0f, 164.0f),
                    PathNode.LineTo(132.0f, 164.0f),
                    PathNode.CurveTo(125.37258f, 164.0f, 120.0f, 169.37259f, 120.0f, 176.0f),
                    PathNode.CurveTo(120.0f, 182.62741f, 125.37258f, 188.0f, 132.0f, 188.0f),
                    PathNode.LineTo(172.0f, 188.0f),
                    PathNode.CurveTo(178.62741f, 188.0f, 184.0f, 182.62741f, 184.0f, 176.0f),
                    PathNode.CurveTo(184.0f, 169.37259f, 178.62741f, 164.0f, 172.0f, 164.0f),
                    PathNode.Close,
                    PathNode.MoveTo(140.0f, 208.0f),
                    PathNode.LineTo(124.0f, 208.0f),
                    PathNode.CurveTo(117.37258f, 208.0f, 112.0f, 213.37259f, 112.0f, 220.0f),
                    PathNode.CurveTo(112.0f, 226.62741f, 117.37258f, 232.0f, 124.0f, 232.0f),
                    PathNode.LineTo(140.0f, 232.0f),
                    PathNode.CurveTo(146.62741f, 232.0f, 152.0f, 226.62741f, 152.0f, 220.0f),
                    PathNode.CurveTo(152.0f, 213.37259f, 146.62741f, 208.0f, 140.0f, 208.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 24.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _tornado!!
    }

private var _tornado: ImageVector? = null
