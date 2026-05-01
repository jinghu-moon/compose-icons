package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Toolbox: ImageVector
    get() {
        if (_toolbox != null) return _toolbox!!
        _toolbox = phosphorBoldIcon(
            name = "Toolbox",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(224.0f, 64.0f),
                    PathNode.LineTo(180.0f, 64.0f),
                    PathNode.LineTo(180.0f, 56.0f),
                    PathNode.CurveTo(180.0f, 40.53603f, 167.46397f, 28.0f, 152.0f, 28.0f),
                    PathNode.LineTo(104.0f, 28.0f),
                    PathNode.CurveTo(88.536026f, 28.0f, 76.0f, 40.53603f, 76.0f, 56.0f),
                    PathNode.LineTo(76.0f, 64.0f),
                    PathNode.LineTo(32.0f, 64.0f),
                    PathNode.CurveTo(20.954306f, 64.0f, 12.0f, 72.95431f, 12.0f, 84.0f),
                    PathNode.LineTo(12.0f, 192.0f),
                    PathNode.CurveTo(12.0f, 203.0457f, 20.954306f, 212.0f, 32.0f, 212.0f),
                    PathNode.LineTo(224.0f, 212.0f),
                    PathNode.CurveTo(235.0457f, 212.0f, 244.0f, 203.0457f, 244.0f, 192.0f),
                    PathNode.LineTo(244.0f, 84.0f),
                    PathNode.CurveTo(244.0f, 72.95431f, 235.0457f, 64.0f, 224.0f, 64.0f),
                    PathNode.Close,
                    PathNode.MoveTo(100.0f, 56.0f),
                    PathNode.CurveTo(100.0f, 53.79086f, 101.79086f, 52.0f, 104.0f, 52.0f),
                    PathNode.LineTo(152.0f, 52.0f),
                    PathNode.CurveTo(154.20914f, 52.0f, 156.0f, 53.79086f, 156.0f, 56.0f),
                    PathNode.LineTo(156.0f, 64.0f),
                    PathNode.LineTo(100.0f, 64.0f),
                    PathNode.Close,
                    PathNode.MoveTo(220.0f, 88.0f),
                    PathNode.LineTo(220.0f, 120.0f),
                    PathNode.LineTo(196.0f, 120.0f),
                    PathNode.LineTo(196.0f, 116.0f),
                    PathNode.CurveTo(196.0f, 109.37258f, 190.62741f, 104.0f, 184.0f, 104.0f),
                    PathNode.CurveTo(177.37259f, 104.0f, 172.0f, 109.37258f, 172.0f, 116.0f),
                    PathNode.LineTo(172.0f, 120.0f),
                    PathNode.LineTo(84.0f, 120.0f),
                    PathNode.LineTo(84.0f, 116.0f),
                    PathNode.CurveTo(84.0f, 109.37258f, 78.62742f, 104.0f, 72.0f, 104.0f),
                    PathNode.CurveTo(65.37258f, 104.0f, 60.0f, 109.37258f, 60.0f, 116.0f),
                    PathNode.LineTo(60.0f, 120.0f),
                    PathNode.LineTo(36.0f, 120.0f),
                    PathNode.LineTo(36.0f, 88.0f),
                    PathNode.Close,
                    PathNode.MoveTo(36.0f, 188.0f),
                    PathNode.LineTo(36.0f, 144.0f),
                    PathNode.LineTo(60.0f, 144.0f),
                    PathNode.LineTo(60.0f, 148.0f),
                    PathNode.CurveTo(60.0f, 154.62741f, 65.37258f, 160.0f, 72.0f, 160.0f),
                    PathNode.CurveTo(78.62742f, 160.0f, 84.0f, 154.62741f, 84.0f, 148.0f),
                    PathNode.LineTo(84.0f, 144.0f),
                    PathNode.LineTo(172.0f, 144.0f),
                    PathNode.LineTo(172.0f, 148.0f),
                    PathNode.CurveTo(172.0f, 154.62741f, 177.37259f, 160.0f, 184.0f, 160.0f),
                    PathNode.CurveTo(190.62741f, 160.0f, 196.0f, 154.62741f, 196.0f, 148.0f),
                    PathNode.LineTo(196.0f, 144.0f),
                    PathNode.LineTo(220.0f, 144.0f),
                    PathNode.LineTo(220.0f, 188.0f),
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
        return _toolbox!!
    }

private var _toolbox: ImageVector? = null
