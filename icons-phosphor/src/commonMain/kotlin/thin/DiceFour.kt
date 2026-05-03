package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.DiceFour: ImageVector
    get() {
        if (_diceFour != null) return _diceFour!!
        _diceFour = phosphorThinIcon(
            name = "DiceFour",
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
                    PathNode.MoveTo(108.0f, 100.0f),
                    PathNode.CurveTo(108.0f, 104.41828f, 104.41828f, 108.0f, 100.0f, 108.0f),
                    PathNode.CurveTo(95.58172f, 108.0f, 92.0f, 104.41828f, 92.0f, 100.0f),
                    PathNode.CurveTo(92.0f, 95.58172f, 95.58172f, 92.0f, 100.0f, 92.0f),
                    PathNode.CurveTo(104.41828f, 92.0f, 108.0f, 95.58172f, 108.0f, 100.0f),
                    PathNode.Close,
                    PathNode.MoveTo(164.0f, 100.0f),
                    PathNode.CurveTo(164.0f, 104.41828f, 160.41827f, 108.0f, 156.0f, 108.0f),
                    PathNode.CurveTo(151.58173f, 108.0f, 148.0f, 104.41828f, 148.0f, 100.0f),
                    PathNode.CurveTo(148.0f, 95.58172f, 151.58173f, 92.0f, 156.0f, 92.0f),
                    PathNode.CurveTo(160.41827f, 92.0f, 164.0f, 95.58172f, 164.0f, 100.0f),
                    PathNode.Close,
                    PathNode.MoveTo(108.0f, 156.0f),
                    PathNode.CurveTo(108.0f, 160.41827f, 104.41828f, 164.0f, 100.0f, 164.0f),
                    PathNode.CurveTo(95.58172f, 164.0f, 92.0f, 160.41827f, 92.0f, 156.0f),
                    PathNode.CurveTo(92.0f, 151.58173f, 95.58172f, 148.0f, 100.0f, 148.0f),
                    PathNode.CurveTo(104.41828f, 148.0f, 108.0f, 151.58173f, 108.0f, 156.0f),
                    PathNode.Close,
                    PathNode.MoveTo(164.0f, 156.0f),
                    PathNode.CurveTo(164.0f, 160.41827f, 160.41827f, 164.0f, 156.0f, 164.0f),
                    PathNode.CurveTo(151.58173f, 164.0f, 148.0f, 160.41827f, 148.0f, 156.0f),
                    PathNode.CurveTo(148.0f, 151.58173f, 151.58173f, 148.0f, 156.0f, 148.0f),
                    PathNode.CurveTo(160.41827f, 148.0f, 164.0f, 151.58173f, 164.0f, 156.0f),
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
        return _diceFour!!
    }

private var _diceFour: ImageVector? = null
