package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.BookOpen: ImageVector
    get() {
        if (_bookOpen != null) return _bookOpen!!
        _bookOpen = phosphorBoldIcon(
            name = "BookOpen",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(232.0f, 44.0f),
                    PathNode.LineTo(160.0f, 44.0f),
                    PathNode.CurveTo(147.8777f, 43.99611f, 136.29436f, 49.009525f, 128.0f, 57.85f),
                    PathNode.CurveTo(119.70564f, 49.009525f, 108.12231f, 43.99611f, 96.0f, 44.0f),
                    PathNode.LineTo(24.0f, 44.0f),
                    PathNode.CurveTo(17.372583f, 44.0f, 12.0f, 49.37258f, 12.0f, 56.0f),
                    PathNode.LineTo(12.0f, 200.0f),
                    PathNode.CurveTo(12.0f, 206.62741f, 17.372583f, 212.0f, 24.0f, 212.0f),
                    PathNode.LineTo(96.0f, 212.0f),
                    PathNode.CurveTo(107.04569f, 212.0f, 116.0f, 220.9543f, 116.0f, 232.0f),
                    PathNode.CurveTo(116.0f, 238.62741f, 121.37258f, 244.0f, 128.0f, 244.0f),
                    PathNode.CurveTo(134.62741f, 244.0f, 140.0f, 238.62741f, 140.0f, 232.0f),
                    PathNode.CurveTo(140.0f, 220.9543f, 148.9543f, 212.0f, 160.0f, 212.0f),
                    PathNode.LineTo(232.0f, 212.0f),
                    PathNode.CurveTo(238.62741f, 212.0f, 244.0f, 206.62741f, 244.0f, 200.0f),
                    PathNode.LineTo(244.0f, 56.0f),
                    PathNode.CurveTo(244.0f, 49.37258f, 238.62741f, 44.0f, 232.0f, 44.0f),
                    PathNode.Close,
                    PathNode.MoveTo(96.0f, 188.0f),
                    PathNode.LineTo(36.0f, 188.0f),
                    PathNode.LineTo(36.0f, 68.0f),
                    PathNode.LineTo(96.0f, 68.0f),
                    PathNode.CurveTo(107.04569f, 68.0f, 116.0f, 76.95431f, 116.0f, 88.0f),
                    PathNode.LineTo(116.0f, 192.81f),
                    PathNode.CurveTo(109.80983f, 189.64137f, 102.95402f, 187.99255f, 96.0f, 188.0f),
                    PathNode.Close,
                    PathNode.MoveTo(220.0f, 188.0f),
                    PathNode.LineTo(160.0f, 188.0f),
                    PathNode.CurveTo(153.04396f, 187.99567f, 146.18738f, 189.65154f, 140.0f, 192.83f),
                    PathNode.LineTo(140.0f, 88.0f),
                    PathNode.CurveTo(140.0f, 76.95431f, 148.9543f, 68.0f, 160.0f, 68.0f),
                    PathNode.LineTo(220.0f, 68.0f),
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
        return _bookOpen!!
    }

private var _bookOpen: ImageVector? = null
