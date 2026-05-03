package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.TextOutdent: ImageVector
    get() {
        if (_textOutdent != null) return _textOutdent!!
        _textOutdent = phosphorBoldIcon(
            name = "TextOutdent",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(228.0f, 128.0f),
                    PathNode.CurveTo(228.0f, 134.62741f, 222.62741f, 140.0f, 216.0f, 140.0f),
                    PathNode.LineTo(120.0f, 140.0f),
                    PathNode.CurveTo(113.37258f, 140.0f, 108.0f, 134.62741f, 108.0f, 128.0f),
                    PathNode.CurveTo(108.0f, 121.37258f, 113.37258f, 116.0f, 120.0f, 116.0f),
                    PathNode.LineTo(216.0f, 116.0f),
                    PathNode.CurveTo(222.62741f, 116.0f, 228.0f, 121.37258f, 228.0f, 128.0f),
                    PathNode.Close,
                    PathNode.MoveTo(120.0f, 76.0f),
                    PathNode.LineTo(216.0f, 76.0f),
                    PathNode.CurveTo(222.62741f, 76.0f, 228.0f, 70.62742f, 228.0f, 64.0f),
                    PathNode.CurveTo(228.0f, 57.37258f, 222.62741f, 52.0f, 216.0f, 52.0f),
                    PathNode.LineTo(120.0f, 52.0f),
                    PathNode.CurveTo(113.37258f, 52.0f, 108.0f, 57.37258f, 108.0f, 64.0f),
                    PathNode.CurveTo(108.0f, 70.62742f, 113.37258f, 76.0f, 120.0f, 76.0f),
                    PathNode.Close,
                    PathNode.MoveTo(216.0f, 180.0f),
                    PathNode.LineTo(40.0f, 180.0f),
                    PathNode.CurveTo(33.37258f, 180.0f, 28.0f, 185.37259f, 28.0f, 192.0f),
                    PathNode.CurveTo(28.0f, 198.62741f, 33.37258f, 204.0f, 40.0f, 204.0f),
                    PathNode.LineTo(216.0f, 204.0f),
                    PathNode.CurveTo(222.62741f, 204.0f, 228.0f, 198.62741f, 228.0f, 192.0f),
                    PathNode.CurveTo(228.0f, 185.37259f, 222.62741f, 180.0f, 216.0f, 180.0f),
                    PathNode.Close,
                    PathNode.MoveTo(72.0f, 148.0f),
                    PathNode.CurveTo(76.85648f, 148.00381f, 81.23646f, 145.08008f, 83.09547f, 140.59348f),
                    PathNode.CurveTo(84.95448f, 136.10687f, 83.925964f, 130.94214f, 80.49f, 127.51f),
                    PathNode.LineTo(49.0f, 96.0f),
                    PathNode.LineTo(80.49f, 64.48f),
                    PathNode.CurveTo(85.18442f, 59.78558f, 85.18442f, 52.17442f, 80.49f, 47.48f),
                    PathNode.CurveTo(75.79558f, 42.78558f, 68.18442f, 42.78558f, 63.49f, 47.48f),
                    PathNode.LineTo(23.49f, 87.48f),
                    PathNode.CurveTo(21.230547f, 89.73162f, 19.960535f, 92.790184f, 19.960535f, 95.98f),
                    PathNode.CurveTo(19.960535f, 99.169815f, 21.230547f, 102.22838f, 23.49f, 104.48f),
                    PathNode.LineTo(63.49f, 144.48f),
                    PathNode.CurveTo(65.74562f, 146.73843f, 68.80808f, 148.00517f, 72.0f, 148.0f),
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
        return _textOutdent!!
    }

private var _textOutdent: ImageVector? = null
