package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.DotsSix: ImageVector
    get() {
        if (_dotsSix != null) return _dotsSix!!
        _dotsSix = phosphorThinIcon(
            name = "DotsSix",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(68.0f, 92.0f),
                    PathNode.CurveTo(68.0f, 96.41828f, 64.41828f, 100.0f, 60.0f, 100.0f),
                    PathNode.CurveTo(55.581722f, 100.0f, 52.0f, 96.41828f, 52.0f, 92.0f),
                    PathNode.CurveTo(52.0f, 87.58172f, 55.581722f, 84.0f, 60.0f, 84.0f),
                    PathNode.CurveTo(64.41828f, 84.0f, 68.0f, 87.58172f, 68.0f, 92.0f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 84.0f),
                    PathNode.CurveTo(123.58172f, 84.0f, 120.0f, 87.58172f, 120.0f, 92.0f),
                    PathNode.CurveTo(120.0f, 96.41828f, 123.58172f, 100.0f, 128.0f, 100.0f),
                    PathNode.CurveTo(132.41827f, 100.0f, 136.0f, 96.41828f, 136.0f, 92.0f),
                    PathNode.CurveTo(136.0f, 87.58172f, 132.41827f, 84.0f, 128.0f, 84.0f),
                    PathNode.Close,
                    PathNode.MoveTo(196.0f, 100.0f),
                    PathNode.CurveTo(200.41827f, 100.0f, 204.0f, 96.41828f, 204.0f, 92.0f),
                    PathNode.CurveTo(204.0f, 87.58172f, 200.41827f, 84.0f, 196.0f, 84.0f),
                    PathNode.CurveTo(191.58173f, 84.0f, 188.0f, 87.58172f, 188.0f, 92.0f),
                    PathNode.CurveTo(188.0f, 96.41828f, 191.58173f, 100.0f, 196.0f, 100.0f),
                    PathNode.Close,
                    PathNode.MoveTo(60.0f, 156.0f),
                    PathNode.CurveTo(55.581722f, 156.0f, 52.0f, 159.58173f, 52.0f, 164.0f),
                    PathNode.CurveTo(52.0f, 168.41827f, 55.581722f, 172.0f, 60.0f, 172.0f),
                    PathNode.CurveTo(64.41828f, 172.0f, 68.0f, 168.41827f, 68.0f, 164.0f),
                    PathNode.CurveTo(68.0f, 159.58173f, 64.41828f, 156.0f, 60.0f, 156.0f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 156.0f),
                    PathNode.CurveTo(123.58172f, 156.0f, 120.0f, 159.58173f, 120.0f, 164.0f),
                    PathNode.CurveTo(120.0f, 168.41827f, 123.58172f, 172.0f, 128.0f, 172.0f),
                    PathNode.CurveTo(132.41827f, 172.0f, 136.0f, 168.41827f, 136.0f, 164.0f),
                    PathNode.CurveTo(136.0f, 159.58173f, 132.41827f, 156.0f, 128.0f, 156.0f),
                    PathNode.Close,
                    PathNode.MoveTo(196.0f, 156.0f),
                    PathNode.CurveTo(191.58173f, 156.0f, 188.0f, 159.58173f, 188.0f, 164.0f),
                    PathNode.CurveTo(188.0f, 168.41827f, 191.58173f, 172.0f, 196.0f, 172.0f),
                    PathNode.CurveTo(200.41827f, 172.0f, 204.0f, 168.41827f, 204.0f, 164.0f),
                    PathNode.CurveTo(204.0f, 159.58173f, 200.41827f, 156.0f, 196.0f, 156.0f),
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
        return _dotsSix!!
    }

private var _dotsSix: ImageVector? = null
