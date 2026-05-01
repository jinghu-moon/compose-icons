package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.DotsSixVertical: ImageVector
    get() {
        if (_dotsSixVertical != null) return _dotsSixVertical!!
        _dotsSixVertical = phosphorThinIcon(
            name = "DotsSixVertical",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(100.0f, 60.0f),
                    PathNode.CurveTo(100.0f, 64.41828f, 96.41828f, 68.0f, 92.0f, 68.0f),
                    PathNode.CurveTo(87.58172f, 68.0f, 84.0f, 64.41828f, 84.0f, 60.0f),
                    PathNode.CurveTo(84.0f, 55.581722f, 87.58172f, 52.0f, 92.0f, 52.0f),
                    PathNode.CurveTo(96.41828f, 52.0f, 100.0f, 55.581722f, 100.0f, 60.0f),
                    PathNode.Close,
                    PathNode.MoveTo(164.0f, 68.0f),
                    PathNode.CurveTo(168.41827f, 68.0f, 172.0f, 64.41828f, 172.0f, 60.0f),
                    PathNode.CurveTo(172.0f, 55.581722f, 168.41827f, 52.0f, 164.0f, 52.0f),
                    PathNode.CurveTo(159.58173f, 52.0f, 156.0f, 55.581722f, 156.0f, 60.0f),
                    PathNode.CurveTo(156.0f, 64.41828f, 159.58173f, 68.0f, 164.0f, 68.0f),
                    PathNode.Close,
                    PathNode.MoveTo(92.0f, 120.0f),
                    PathNode.CurveTo(87.58172f, 120.0f, 84.0f, 123.58172f, 84.0f, 128.0f),
                    PathNode.CurveTo(84.0f, 132.41827f, 87.58172f, 136.0f, 92.0f, 136.0f),
                    PathNode.CurveTo(96.41828f, 136.0f, 100.0f, 132.41827f, 100.0f, 128.0f),
                    PathNode.CurveTo(100.0f, 123.58172f, 96.41828f, 120.0f, 92.0f, 120.0f),
                    PathNode.Close,
                    PathNode.MoveTo(164.0f, 120.0f),
                    PathNode.CurveTo(159.58173f, 120.0f, 156.0f, 123.58172f, 156.0f, 128.0f),
                    PathNode.CurveTo(156.0f, 132.41827f, 159.58173f, 136.0f, 164.0f, 136.0f),
                    PathNode.CurveTo(168.41827f, 136.0f, 172.0f, 132.41827f, 172.0f, 128.0f),
                    PathNode.CurveTo(172.0f, 123.58172f, 168.41827f, 120.0f, 164.0f, 120.0f),
                    PathNode.Close,
                    PathNode.MoveTo(92.0f, 188.0f),
                    PathNode.CurveTo(87.58172f, 188.0f, 84.0f, 191.58173f, 84.0f, 196.0f),
                    PathNode.CurveTo(84.0f, 200.41827f, 87.58172f, 204.0f, 92.0f, 204.0f),
                    PathNode.CurveTo(96.41828f, 204.0f, 100.0f, 200.41827f, 100.0f, 196.0f),
                    PathNode.CurveTo(100.0f, 191.58173f, 96.41828f, 188.0f, 92.0f, 188.0f),
                    PathNode.Close,
                    PathNode.MoveTo(164.0f, 188.0f),
                    PathNode.CurveTo(159.58173f, 188.0f, 156.0f, 191.58173f, 156.0f, 196.0f),
                    PathNode.CurveTo(156.0f, 200.41827f, 159.58173f, 204.0f, 164.0f, 204.0f),
                    PathNode.CurveTo(168.41827f, 204.0f, 172.0f, 200.41827f, 172.0f, 196.0f),
                    PathNode.CurveTo(172.0f, 191.58173f, 168.41827f, 188.0f, 164.0f, 188.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 8.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _dotsSixVertical!!
    }

private var _dotsSixVertical: ImageVector? = null
