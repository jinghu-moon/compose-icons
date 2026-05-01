package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Laptop: ImageVector
    get() {
        if (_laptop != null) return _laptop!!
        _laptop = phosphorFillIcon(
            name = "Laptop",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(232.0f, 168.0f),
                    PathNode.LineTo(224.0f, 168.0f),
                    PathNode.LineTo(224.0f, 72.0f),
                    PathNode.CurveTo(224.0f, 58.745167f, 213.25484f, 48.0f, 200.0f, 48.0f),
                    PathNode.LineTo(56.0f, 48.0f),
                    PathNode.CurveTo(42.745167f, 48.0f, 32.0f, 58.745167f, 32.0f, 72.0f),
                    PathNode.LineTo(32.0f, 168.0f),
                    PathNode.LineTo(24.0f, 168.0f),
                    PathNode.CurveTo(19.581722f, 168.0f, 16.0f, 171.58173f, 16.0f, 176.0f),
                    PathNode.LineTo(16.0f, 192.0f),
                    PathNode.CurveTo(16.0f, 205.25484f, 26.745167f, 216.0f, 40.0f, 216.0f),
                    PathNode.LineTo(216.0f, 216.0f),
                    PathNode.CurveTo(229.25484f, 216.0f, 240.0f, 205.25484f, 240.0f, 192.0f),
                    PathNode.LineTo(240.0f, 176.0f),
                    PathNode.CurveTo(240.0f, 171.58173f, 236.41827f, 168.0f, 232.0f, 168.0f),
                    PathNode.Close,
                    PathNode.MoveTo(112.0f, 72.0f),
                    PathNode.LineTo(144.0f, 72.0f),
                    PathNode.CurveTo(148.41827f, 72.0f, 152.0f, 75.58172f, 152.0f, 80.0f),
                    PathNode.CurveTo(152.0f, 84.41828f, 148.41827f, 88.0f, 144.0f, 88.0f),
                    PathNode.LineTo(112.0f, 88.0f),
                    PathNode.CurveTo(107.58172f, 88.0f, 104.0f, 84.41828f, 104.0f, 80.0f),
                    PathNode.CurveTo(104.0f, 75.58172f, 107.58172f, 72.0f, 112.0f, 72.0f),
                    PathNode.Close,
                    PathNode.MoveTo(224.0f, 192.0f),
                    PathNode.CurveTo(224.0f, 196.41827f, 220.41827f, 200.0f, 216.0f, 200.0f),
                    PathNode.LineTo(40.0f, 200.0f),
                    PathNode.CurveTo(35.581722f, 200.0f, 32.0f, 196.41827f, 32.0f, 192.0f),
                    PathNode.LineTo(32.0f, 184.0f),
                    PathNode.LineTo(224.0f, 184.0f),
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
        return _laptop!!
    }

private var _laptop: ImageVector? = null
