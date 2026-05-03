package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Book: ImageVector
    get() {
        if (_book != null) return _book!!
        _book = phosphorBoldIcon(
            name = "Book",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(208.0f, 20.0f),
                    PathNode.LineTo(72.0f, 20.0f),
                    PathNode.CurveTo(52.11775f, 20.0f, 36.0f, 36.11775f, 36.0f, 56.0f),
                    PathNode.LineTo(36.0f, 224.0f),
                    PathNode.CurveTo(36.0f, 230.62741f, 41.37258f, 236.0f, 48.0f, 236.0f),
                    PathNode.LineTo(192.0f, 236.0f),
                    PathNode.CurveTo(198.62741f, 236.0f, 204.0f, 230.62741f, 204.0f, 224.0f),
                    PathNode.CurveTo(204.0f, 217.37259f, 198.62741f, 212.0f, 192.0f, 212.0f),
                    PathNode.LineTo(60.0f, 212.0f),
                    PathNode.LineTo(60.0f, 208.0f),
                    PathNode.CurveTo(60.0f, 201.37259f, 65.37258f, 196.0f, 72.0f, 196.0f),
                    PathNode.LineTo(208.0f, 196.0f),
                    PathNode.CurveTo(214.62741f, 196.0f, 220.0f, 190.62741f, 220.0f, 184.0f),
                    PathNode.LineTo(220.0f, 32.0f),
                    PathNode.CurveTo(220.0f, 25.372583f, 214.62741f, 20.0f, 208.0f, 20.0f),
                    PathNode.Close,
                    PathNode.MoveTo(196.0f, 172.0f),
                    PathNode.LineTo(72.0f, 172.0f),
                    PathNode.CurveTo(67.91137f, 171.99228f, 63.85198f, 172.68915f, 60.0f, 174.06f),
                    PathNode.LineTo(60.0f, 56.0f),
                    PathNode.CurveTo(60.0f, 49.37258f, 65.37258f, 44.0f, 72.0f, 44.0f),
                    PathNode.LineTo(196.0f, 44.0f),
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
        return _book!!
    }

private var _book: ImageVector? = null
