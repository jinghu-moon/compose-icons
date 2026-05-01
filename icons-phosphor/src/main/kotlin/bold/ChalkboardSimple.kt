package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.ChalkboardSimple: ImageVector
    get() {
        if (_chalkboardSimple != null) return _chalkboardSimple!!
        _chalkboardSimple = phosphorBoldIcon(
            name = "ChalkboardSimple",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(240.0f, 188.0f),
                    PathNode.LineTo(236.0f, 188.0f),
                    PathNode.LineTo(236.0f, 160.0f),
                    PathNode.CurveTo(236.0f, 153.37259f, 230.62741f, 148.0f, 224.0f, 148.0f),
                    PathNode.LineTo(160.0f, 148.0f),
                    PathNode.CurveTo(153.37259f, 148.0f, 148.0f, 153.37259f, 148.0f, 160.0f),
                    PathNode.LineTo(148.0f, 188.0f),
                    PathNode.LineTo(44.0f, 188.0f),
                    PathNode.LineTo(44.0f, 60.0f),
                    PathNode.LineTo(212.0f, 60.0f),
                    PathNode.LineTo(212.0f, 120.0f),
                    PathNode.CurveTo(212.0f, 126.62742f, 217.37259f, 132.0f, 224.0f, 132.0f),
                    PathNode.CurveTo(230.62741f, 132.0f, 236.0f, 126.62742f, 236.0f, 120.0f),
                    PathNode.LineTo(236.0f, 56.0f),
                    PathNode.CurveTo(236.0f, 44.954304f, 227.0457f, 36.0f, 216.0f, 36.0f),
                    PathNode.LineTo(40.0f, 36.0f),
                    PathNode.CurveTo(28.954306f, 36.0f, 20.0f, 44.954304f, 20.0f, 56.0f),
                    PathNode.LineTo(20.0f, 188.0f),
                    PathNode.LineTo(16.0f, 188.0f),
                    PathNode.CurveTo(9.372583f, 188.0f, 4.0f, 193.37259f, 4.0f, 200.0f),
                    PathNode.CurveTo(4.0f, 206.62741f, 9.372583f, 212.0f, 16.0f, 212.0f),
                    PathNode.LineTo(240.0f, 212.0f),
                    PathNode.CurveTo(246.62741f, 212.0f, 252.0f, 206.62741f, 252.0f, 200.0f),
                    PathNode.CurveTo(252.0f, 193.37259f, 246.62741f, 188.0f, 240.0f, 188.0f),
                    PathNode.Close,
                    PathNode.MoveTo(172.0f, 172.0f),
                    PathNode.LineTo(212.0f, 172.0f),
                    PathNode.LineTo(212.0f, 188.0f),
                    PathNode.LineTo(172.0f, 188.0f),
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
        return _chalkboardSimple!!
    }

private var _chalkboardSimple: ImageVector? = null
