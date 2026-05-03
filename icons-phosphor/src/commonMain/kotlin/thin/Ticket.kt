package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Ticket: ImageVector
    get() {
        if (_ticket != null) return _ticket!!
        _ticket = phosphorThinIcon(
            name = "Ticket",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(232.0f, 100.0f),
                    PathNode.CurveTo(234.20914f, 100.0f, 236.0f, 98.20914f, 236.0f, 96.0f),
                    PathNode.LineTo(236.0f, 64.0f),
                    PathNode.CurveTo(236.0f, 57.37258f, 230.62741f, 52.0f, 224.0f, 52.0f),
                    PathNode.LineTo(32.0f, 52.0f),
                    PathNode.CurveTo(25.372583f, 52.0f, 20.0f, 57.37258f, 20.0f, 64.0f),
                    PathNode.LineTo(20.0f, 96.0f),
                    PathNode.CurveTo(20.0f, 98.20914f, 21.790861f, 100.0f, 24.0f, 100.0f),
                    PathNode.CurveTo(39.46397f, 100.0f, 52.0f, 112.536026f, 52.0f, 128.0f),
                    PathNode.CurveTo(52.0f, 143.46397f, 39.46397f, 156.0f, 24.0f, 156.0f),
                    PathNode.CurveTo(21.790861f, 156.0f, 20.0f, 157.79086f, 20.0f, 160.0f),
                    PathNode.LineTo(20.0f, 192.0f),
                    PathNode.CurveTo(20.0f, 198.62741f, 25.372583f, 204.0f, 32.0f, 204.0f),
                    PathNode.LineTo(224.0f, 204.0f),
                    PathNode.CurveTo(230.62741f, 204.0f, 236.0f, 198.62741f, 236.0f, 192.0f),
                    PathNode.LineTo(236.0f, 160.0f),
                    PathNode.CurveTo(236.0f, 157.79086f, 234.20914f, 156.0f, 232.0f, 156.0f),
                    PathNode.CurveTo(216.53603f, 156.0f, 204.0f, 143.46397f, 204.0f, 128.0f),
                    PathNode.CurveTo(204.0f, 112.536026f, 216.53603f, 100.0f, 232.0f, 100.0f),
                    PathNode.Close,
                    PathNode.MoveTo(28.0f, 192.0f),
                    PathNode.LineTo(28.0f, 163.78f),
                    PathNode.CurveTo(46.232307f, 161.75505f, 60.026134f, 146.34442f, 60.026134f, 128.0f),
                    PathNode.CurveTo(60.026134f, 109.65559f, 46.232307f, 94.24495f, 28.0f, 92.22f),
                    PathNode.LineTo(28.0f, 64.0f),
                    PathNode.CurveTo(28.0f, 61.79086f, 29.790861f, 60.0f, 32.0f, 60.0f),
                    PathNode.LineTo(92.0f, 60.0f),
                    PathNode.LineTo(92.0f, 196.0f),
                    PathNode.LineTo(32.0f, 196.0f),
                    PathNode.CurveTo(29.790861f, 196.0f, 28.0f, 194.20914f, 28.0f, 192.0f),
                    PathNode.Close,
                    PathNode.MoveTo(196.0f, 128.0f),
                    PathNode.CurveTo(196.02577f, 146.32506f, 209.79144f, 161.7168f, 228.0f, 163.78f),
                    PathNode.LineTo(228.0f, 192.0f),
                    PathNode.CurveTo(228.0f, 194.20914f, 226.20914f, 196.0f, 224.0f, 196.0f),
                    PathNode.LineTo(100.0f, 196.0f),
                    PathNode.LineTo(100.0f, 60.0f),
                    PathNode.LineTo(224.0f, 60.0f),
                    PathNode.CurveTo(226.20914f, 60.0f, 228.0f, 61.79086f, 228.0f, 64.0f),
                    PathNode.LineTo(228.0f, 92.22f),
                    PathNode.CurveTo(209.79144f, 94.2832f, 196.02577f, 109.67494f, 196.0f, 128.0f),
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
        return _ticket!!
    }

private var _ticket: ImageVector? = null
