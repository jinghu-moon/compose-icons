package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.DiceFive: ImageVector
    get() {
        if (_diceFive != null) return _diceFive!!
        _diceFive = phosphorThinIcon(
            name = "DiceFive",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(192.0f, 36.0f),
                    PathNode.LineTo(64.0f, 36.0f),
                    PathNode.CurveTo(48.53603f, 36.0f, 36.0f, 48.53603f, 36.0f, 64.0f),
                    PathNode.LineTo(36.0f, 192.0f),
                    PathNode.CurveTo(36.0f, 207.46397f, 48.53603f, 220.0f, 64.0f, 220.0f),
                    PathNode.LineTo(192.0f, 220.0f),
                    PathNode.CurveTo(207.46397f, 220.0f, 220.0f, 207.46397f, 220.0f, 192.0f),
                    PathNode.LineTo(220.0f, 64.0f),
                    PathNode.CurveTo(220.0f, 48.53603f, 207.46397f, 36.0f, 192.0f, 36.0f),
                    PathNode.Close,
                    PathNode.MoveTo(212.0f, 192.0f),
                    PathNode.CurveTo(212.0f, 203.0457f, 203.0457f, 212.0f, 192.0f, 212.0f),
                    PathNode.LineTo(64.0f, 212.0f),
                    PathNode.CurveTo(52.954304f, 212.0f, 44.0f, 203.0457f, 44.0f, 192.0f),
                    PathNode.LineTo(44.0f, 64.0f),
                    PathNode.CurveTo(44.0f, 52.954304f, 52.954304f, 44.0f, 64.0f, 44.0f),
                    PathNode.LineTo(192.0f, 44.0f),
                    PathNode.CurveTo(203.0457f, 44.0f, 212.0f, 52.954304f, 212.0f, 64.0f),
                    PathNode.Close,
                    PathNode.MoveTo(100.0f, 92.0f),
                    PathNode.CurveTo(100.0f, 96.41828f, 96.41828f, 100.0f, 92.0f, 100.0f),
                    PathNode.CurveTo(87.58172f, 100.0f, 84.0f, 96.41828f, 84.0f, 92.0f),
                    PathNode.CurveTo(84.0f, 87.58172f, 87.58172f, 84.0f, 92.0f, 84.0f),
                    PathNode.CurveTo(96.41828f, 84.0f, 100.0f, 87.58172f, 100.0f, 92.0f),
                    PathNode.Close,
                    PathNode.MoveTo(136.0f, 128.0f),
                    PathNode.CurveTo(136.0f, 132.41827f, 132.41827f, 136.0f, 128.0f, 136.0f),
                    PathNode.CurveTo(123.58172f, 136.0f, 120.0f, 132.41827f, 120.0f, 128.0f),
                    PathNode.CurveTo(120.0f, 123.58172f, 123.58172f, 120.0f, 128.0f, 120.0f),
                    PathNode.CurveTo(132.41827f, 120.0f, 136.0f, 123.58172f, 136.0f, 128.0f),
                    PathNode.Close,
                    PathNode.MoveTo(172.0f, 92.0f),
                    PathNode.CurveTo(172.0f, 96.41828f, 168.41827f, 100.0f, 164.0f, 100.0f),
                    PathNode.CurveTo(159.58173f, 100.0f, 156.0f, 96.41828f, 156.0f, 92.0f),
                    PathNode.CurveTo(156.0f, 87.58172f, 159.58173f, 84.0f, 164.0f, 84.0f),
                    PathNode.CurveTo(168.41827f, 84.0f, 172.0f, 87.58172f, 172.0f, 92.0f),
                    PathNode.Close,
                    PathNode.MoveTo(100.0f, 164.0f),
                    PathNode.CurveTo(100.0f, 168.41827f, 96.41828f, 172.0f, 92.0f, 172.0f),
                    PathNode.CurveTo(87.58172f, 172.0f, 84.0f, 168.41827f, 84.0f, 164.0f),
                    PathNode.CurveTo(84.0f, 159.58173f, 87.58172f, 156.0f, 92.0f, 156.0f),
                    PathNode.CurveTo(96.41828f, 156.0f, 100.0f, 159.58173f, 100.0f, 164.0f),
                    PathNode.Close,
                    PathNode.MoveTo(172.0f, 164.0f),
                    PathNode.CurveTo(172.0f, 168.41827f, 168.41827f, 172.0f, 164.0f, 172.0f),
                    PathNode.CurveTo(159.58173f, 172.0f, 156.0f, 168.41827f, 156.0f, 164.0f),
                    PathNode.CurveTo(156.0f, 159.58173f, 159.58173f, 156.0f, 164.0f, 156.0f),
                    PathNode.CurveTo(168.41827f, 156.0f, 172.0f, 159.58173f, 172.0f, 164.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 8.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _diceFive!!
    }

private var _diceFive: ImageVector? = null
