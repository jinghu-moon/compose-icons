package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.DiceTwo: ImageVector
    get() {
        if (_diceTwo != null) return _diceTwo!!
        _diceTwo = phosphorThinIcon(
            name = "DiceTwo",
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
                    PathNode.MoveTo(116.0f, 108.0f),
                    PathNode.CurveTo(116.0f, 112.41828f, 112.41828f, 116.0f, 108.0f, 116.0f),
                    PathNode.CurveTo(103.58172f, 116.0f, 100.0f, 112.41828f, 100.0f, 108.0f),
                    PathNode.CurveTo(100.0f, 103.58172f, 103.58172f, 100.0f, 108.0f, 100.0f),
                    PathNode.CurveTo(112.41828f, 100.0f, 116.0f, 103.58172f, 116.0f, 108.0f),
                    PathNode.Close,
                    PathNode.MoveTo(156.0f, 148.0f),
                    PathNode.CurveTo(156.0f, 152.41827f, 152.41827f, 156.0f, 148.0f, 156.0f),
                    PathNode.CurveTo(143.58173f, 156.0f, 140.0f, 152.41827f, 140.0f, 148.0f),
                    PathNode.CurveTo(140.0f, 143.58173f, 143.58173f, 140.0f, 148.0f, 140.0f),
                    PathNode.CurveTo(152.41827f, 140.0f, 156.0f, 143.58173f, 156.0f, 148.0f),
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
        return _diceTwo!!
    }

private var _diceTwo: ImageVector? = null
