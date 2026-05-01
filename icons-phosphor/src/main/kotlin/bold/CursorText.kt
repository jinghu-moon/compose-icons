package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.CursorText: ImageVector
    get() {
        if (_cursorText != null) return _cursorText!!
        _cursorText = phosphorBoldIcon(
            name = "CursorText",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(188.0f, 208.0f),
                    PathNode.CurveTo(188.0f, 214.62741f, 182.62741f, 220.0f, 176.0f, 220.0f),
                    PathNode.LineTo(160.0f, 220.0f),
                    PathNode.CurveTo(147.8777f, 220.00389f, 136.29436f, 214.99048f, 128.0f, 206.15f),
                    PathNode.CurveTo(119.70564f, 214.99048f, 108.12231f, 220.00389f, 96.0f, 220.0f),
                    PathNode.LineTo(80.0f, 220.0f),
                    PathNode.CurveTo(73.37258f, 220.0f, 68.0f, 214.62741f, 68.0f, 208.0f),
                    PathNode.CurveTo(68.0f, 201.37259f, 73.37258f, 196.0f, 80.0f, 196.0f),
                    PathNode.LineTo(96.0f, 196.0f),
                    PathNode.CurveTo(107.04569f, 196.0f, 116.0f, 187.0457f, 116.0f, 176.0f),
                    PathNode.LineTo(116.0f, 140.0f),
                    PathNode.LineTo(104.0f, 140.0f),
                    PathNode.CurveTo(97.37258f, 140.0f, 92.0f, 134.62741f, 92.0f, 128.0f),
                    PathNode.CurveTo(92.0f, 121.37258f, 97.37258f, 116.0f, 104.0f, 116.0f),
                    PathNode.LineTo(116.0f, 116.0f),
                    PathNode.LineTo(116.0f, 80.0f),
                    PathNode.CurveTo(116.0f, 68.95431f, 107.04569f, 60.0f, 96.0f, 60.0f),
                    PathNode.LineTo(80.0f, 60.0f),
                    PathNode.CurveTo(73.37258f, 60.0f, 68.0f, 54.62742f, 68.0f, 48.0f),
                    PathNode.CurveTo(68.0f, 41.37258f, 73.37258f, 36.0f, 80.0f, 36.0f),
                    PathNode.LineTo(96.0f, 36.0f),
                    PathNode.CurveTo(108.12231f, 35.99611f, 119.70564f, 41.009525f, 128.0f, 49.85f),
                    PathNode.CurveTo(136.29436f, 41.009525f, 147.8777f, 35.99611f, 160.0f, 36.0f),
                    PathNode.LineTo(176.0f, 36.0f),
                    PathNode.CurveTo(182.62741f, 36.0f, 188.0f, 41.37258f, 188.0f, 48.0f),
                    PathNode.CurveTo(188.0f, 54.62742f, 182.62741f, 60.0f, 176.0f, 60.0f),
                    PathNode.LineTo(160.0f, 60.0f),
                    PathNode.CurveTo(148.9543f, 60.0f, 140.0f, 68.95431f, 140.0f, 80.0f),
                    PathNode.LineTo(140.0f, 116.0f),
                    PathNode.LineTo(152.0f, 116.0f),
                    PathNode.CurveTo(158.62741f, 116.0f, 164.0f, 121.37258f, 164.0f, 128.0f),
                    PathNode.CurveTo(164.0f, 134.62741f, 158.62741f, 140.0f, 152.0f, 140.0f),
                    PathNode.LineTo(140.0f, 140.0f),
                    PathNode.LineTo(140.0f, 176.0f),
                    PathNode.CurveTo(140.0f, 187.0457f, 148.9543f, 196.0f, 160.0f, 196.0f),
                    PathNode.LineTo(176.0f, 196.0f),
                    PathNode.CurveTo(182.62741f, 196.0f, 188.0f, 201.37259f, 188.0f, 208.0f),
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
        return _cursorText!!
    }

private var _cursorText: ImageVector? = null
