package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.ArrowSquareOut: ImageVector
    get() {
        if (_arrowSquareOut != null) return _arrowSquareOut!!
        _arrowSquareOut = phosphorBoldIcon(
            name = "ArrowSquareOut",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(228.0f, 104.0f),
                    PathNode.CurveTo(228.0f, 110.62742f, 222.62741f, 116.0f, 216.0f, 116.0f),
                    PathNode.CurveTo(209.37259f, 116.0f, 204.0f, 110.62742f, 204.0f, 104.0f),
                    PathNode.LineTo(204.0f, 69.0f),
                    PathNode.LineTo(144.49f, 128.51f),
                    PathNode.CurveTo(139.79558f, 133.20442f, 132.18442f, 133.20442f, 127.49f, 128.51f),
                    PathNode.CurveTo(122.79558f, 123.81558f, 122.79558f, 116.20442f, 127.49f, 111.51f),
                    PathNode.LineTo(187.0f, 52.0f),
                    PathNode.LineTo(152.0f, 52.0f),
                    PathNode.CurveTo(145.37259f, 52.0f, 140.0f, 46.62742f, 140.0f, 40.0f),
                    PathNode.CurveTo(140.0f, 33.37258f, 145.37259f, 28.0f, 152.0f, 28.0f),
                    PathNode.LineTo(216.0f, 28.0f),
                    PathNode.CurveTo(222.62741f, 28.0f, 228.0f, 33.37258f, 228.0f, 40.0f),
                    PathNode.Close,
                    PathNode.MoveTo(184.0f, 128.0f),
                    PathNode.CurveTo(177.37259f, 128.0f, 172.0f, 133.37259f, 172.0f, 140.0f),
                    PathNode.LineTo(172.0f, 204.0f),
                    PathNode.LineTo(52.0f, 204.0f),
                    PathNode.LineTo(52.0f, 84.0f),
                    PathNode.LineTo(116.0f, 84.0f),
                    PathNode.CurveTo(122.62742f, 84.0f, 128.0f, 78.62742f, 128.0f, 72.0f),
                    PathNode.CurveTo(128.0f, 65.37258f, 122.62742f, 60.0f, 116.0f, 60.0f),
                    PathNode.LineTo(48.0f, 60.0f),
                    PathNode.CurveTo(36.954304f, 60.0f, 28.0f, 68.95431f, 28.0f, 80.0f),
                    PathNode.LineTo(28.0f, 208.0f),
                    PathNode.CurveTo(28.0f, 219.0457f, 36.954304f, 228.0f, 48.0f, 228.0f),
                    PathNode.LineTo(176.0f, 228.0f),
                    PathNode.CurveTo(187.0457f, 228.0f, 196.0f, 219.0457f, 196.0f, 208.0f),
                    PathNode.LineTo(196.0f, 140.0f),
                    PathNode.CurveTo(196.0f, 133.37259f, 190.62741f, 128.0f, 184.0f, 128.0f),
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
        return _arrowSquareOut!!
    }

private var _arrowSquareOut: ImageVector? = null
