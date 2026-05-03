package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Desktop: ImageVector
    get() {
        if (_desktop != null) return _desktop!!
        _desktop = phosphorBoldIcon(
            name = "Desktop",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(208.0f, 36.0f),
                    PathNode.LineTo(48.0f, 36.0f),
                    PathNode.CurveTo(32.536026f, 36.0f, 20.0f, 48.53603f, 20.0f, 64.0f),
                    PathNode.LineTo(20.0f, 172.0f),
                    PathNode.CurveTo(20.0f, 187.46397f, 32.536026f, 200.0f, 48.0f, 200.0f),
                    PathNode.LineTo(116.0f, 200.0f),
                    PathNode.LineTo(116.0f, 212.0f),
                    PathNode.LineTo(96.0f, 212.0f),
                    PathNode.CurveTo(89.37258f, 212.0f, 84.0f, 217.37259f, 84.0f, 224.0f),
                    PathNode.CurveTo(84.0f, 230.62741f, 89.37258f, 236.0f, 96.0f, 236.0f),
                    PathNode.LineTo(160.0f, 236.0f),
                    PathNode.CurveTo(166.62741f, 236.0f, 172.0f, 230.62741f, 172.0f, 224.0f),
                    PathNode.CurveTo(172.0f, 217.37259f, 166.62741f, 212.0f, 160.0f, 212.0f),
                    PathNode.LineTo(140.0f, 212.0f),
                    PathNode.LineTo(140.0f, 200.0f),
                    PathNode.LineTo(208.0f, 200.0f),
                    PathNode.CurveTo(223.46397f, 200.0f, 236.0f, 187.46397f, 236.0f, 172.0f),
                    PathNode.LineTo(236.0f, 64.0f),
                    PathNode.CurveTo(236.0f, 48.53603f, 223.46397f, 36.0f, 208.0f, 36.0f),
                    PathNode.Close,
                    PathNode.MoveTo(48.0f, 60.0f),
                    PathNode.LineTo(208.0f, 60.0f),
                    PathNode.CurveTo(210.20914f, 60.0f, 212.0f, 61.79086f, 212.0f, 64.0f),
                    PathNode.LineTo(212.0f, 136.0f),
                    PathNode.LineTo(44.0f, 136.0f),
                    PathNode.LineTo(44.0f, 64.0f),
                    PathNode.CurveTo(44.0f, 61.79086f, 45.79086f, 60.0f, 48.0f, 60.0f),
                    PathNode.Close,
                    PathNode.MoveTo(208.0f, 176.0f),
                    PathNode.LineTo(48.0f, 176.0f),
                    PathNode.CurveTo(45.79086f, 176.0f, 44.0f, 174.20914f, 44.0f, 172.0f),
                    PathNode.LineTo(44.0f, 160.0f),
                    PathNode.LineTo(212.0f, 160.0f),
                    PathNode.LineTo(212.0f, 172.0f),
                    PathNode.CurveTo(212.0f, 174.20914f, 210.20914f, 176.0f, 208.0f, 176.0f),
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
        return _desktop!!
    }

private var _desktop: ImageVector? = null
