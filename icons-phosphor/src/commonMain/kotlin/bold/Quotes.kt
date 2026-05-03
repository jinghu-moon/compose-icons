package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Quotes: ImageVector
    get() {
        if (_quotes != null) return _quotes!!
        _quotes = phosphorBoldIcon(
            name = "Quotes",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(100.0f, 52.0f),
                    PathNode.LineTo(40.0f, 52.0f),
                    PathNode.CurveTo(28.954306f, 52.0f, 20.0f, 60.954304f, 20.0f, 72.0f),
                    PathNode.LineTo(20.0f, 136.0f),
                    PathNode.CurveTo(20.0f, 147.0457f, 28.954306f, 156.0f, 40.0f, 156.0f),
                    PathNode.LineTo(96.0f, 156.0f),
                    PathNode.LineTo(96.0f, 160.0f),
                    PathNode.CurveTo(96.0f, 175.46397f, 83.463974f, 188.0f, 68.0f, 188.0f),
                    PathNode.CurveTo(61.37258f, 188.0f, 56.0f, 193.37259f, 56.0f, 200.0f),
                    PathNode.CurveTo(56.0f, 206.62741f, 61.37258f, 212.0f, 68.0f, 212.0f),
                    PathNode.CurveTo(96.7051f, 211.96693f, 119.966934f, 188.7051f, 120.0f, 160.0f),
                    PathNode.LineTo(120.0f, 72.0f),
                    PathNode.CurveTo(120.0f, 60.954304f, 111.04569f, 52.0f, 100.0f, 52.0f),
                    PathNode.Close,
                    PathNode.MoveTo(96.0f, 132.0f),
                    PathNode.LineTo(44.0f, 132.0f),
                    PathNode.LineTo(44.0f, 76.0f),
                    PathNode.LineTo(96.0f, 76.0f),
                    PathNode.Close,
                    PathNode.MoveTo(216.0f, 52.0f),
                    PathNode.LineTo(156.0f, 52.0f),
                    PathNode.CurveTo(144.9543f, 52.0f, 136.0f, 60.954304f, 136.0f, 72.0f),
                    PathNode.LineTo(136.0f, 136.0f),
                    PathNode.CurveTo(136.0f, 147.0457f, 144.9543f, 156.0f, 156.0f, 156.0f),
                    PathNode.LineTo(212.0f, 156.0f),
                    PathNode.LineTo(212.0f, 160.0f),
                    PathNode.CurveTo(212.0f, 175.46397f, 199.46397f, 188.0f, 184.0f, 188.0f),
                    PathNode.CurveTo(177.37259f, 188.0f, 172.0f, 193.37259f, 172.0f, 200.0f),
                    PathNode.CurveTo(172.0f, 206.62741f, 177.37259f, 212.0f, 184.0f, 212.0f),
                    PathNode.CurveTo(212.7051f, 211.96693f, 235.96693f, 188.7051f, 236.0f, 160.0f),
                    PathNode.LineTo(236.0f, 72.0f),
                    PathNode.CurveTo(236.0f, 60.954304f, 227.0457f, 52.0f, 216.0f, 52.0f),
                    PathNode.Close,
                    PathNode.MoveTo(212.0f, 132.0f),
                    PathNode.LineTo(160.0f, 132.0f),
                    PathNode.LineTo(160.0f, 76.0f),
                    PathNode.LineTo(212.0f, 76.0f),
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
        return _quotes!!
    }

private var _quotes: ImageVector? = null
