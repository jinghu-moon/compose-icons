package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.ToggleLeft: ImageVector
    get() {
        if (_toggleLeft != null) return _toggleLeft!!
        _toggleLeft = phosphorThinIcon(
            name = "ToggleLeft",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(176.0f, 60.0f),
                    PathNode.LineTo(80.0f, 60.0f),
                    PathNode.CurveTo(42.444637f, 60.0f, 12.0f, 90.44463f, 12.0f, 128.0f),
                    PathNode.CurveTo(12.0f, 165.55536f, 42.444637f, 196.0f, 80.0f, 196.0f),
                    PathNode.LineTo(176.0f, 196.0f),
                    PathNode.CurveTo(213.55536f, 196.0f, 244.0f, 165.55536f, 244.0f, 128.0f),
                    PathNode.CurveTo(244.0f, 90.44463f, 213.55536f, 60.0f, 176.0f, 60.0f),
                    PathNode.Close,
                    PathNode.MoveTo(176.0f, 188.0f),
                    PathNode.LineTo(80.0f, 188.0f),
                    PathNode.CurveTo(46.862915f, 188.0f, 20.0f, 161.13708f, 20.0f, 128.0f),
                    PathNode.CurveTo(20.0f, 94.862915f, 46.862915f, 68.0f, 80.0f, 68.0f),
                    PathNode.LineTo(176.0f, 68.0f),
                    PathNode.CurveTo(209.13708f, 68.0f, 236.0f, 94.862915f, 236.0f, 128.0f),
                    PathNode.CurveTo(236.0f, 161.13708f, 209.13708f, 188.0f, 176.0f, 188.0f),
                    PathNode.Close,
                    PathNode.MoveTo(80.0f, 92.0f),
                    PathNode.CurveTo(60.11775f, 92.0f, 44.0f, 108.11775f, 44.0f, 128.0f),
                    PathNode.CurveTo(44.0f, 147.88223f, 60.11775f, 164.0f, 80.0f, 164.0f),
                    PathNode.CurveTo(99.88225f, 164.0f, 116.0f, 147.88223f, 116.0f, 128.0f),
                    PathNode.CurveTo(116.0f, 108.11775f, 99.88225f, 92.0f, 80.0f, 92.0f),
                    PathNode.Close,
                    PathNode.MoveTo(80.0f, 156.0f),
                    PathNode.CurveTo(64.536026f, 156.0f, 52.0f, 143.46397f, 52.0f, 128.0f),
                    PathNode.CurveTo(52.0f, 112.536026f, 64.536026f, 100.0f, 80.0f, 100.0f),
                    PathNode.CurveTo(95.463974f, 100.0f, 108.0f, 112.536026f, 108.0f, 128.0f),
                    PathNode.CurveTo(108.0f, 143.46397f, 95.463974f, 156.0f, 80.0f, 156.0f),
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
        return _toggleLeft!!
    }

private var _toggleLeft: ImageVector? = null
