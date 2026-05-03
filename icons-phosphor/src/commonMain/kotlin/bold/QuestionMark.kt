package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.QuestionMark: ImageVector
    get() {
        if (_questionMark != null) return _questionMark!!
        _questionMark = phosphorBoldIcon(
            name = "QuestionMark",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(196.0f, 96.0f),
                    PathNode.CurveTo(196.0f, 125.47f, 171.79f, 150.05f, 140.0f, 155.06f),
                    PathNode.LineTo(140.0f, 156.0f),
                    PathNode.CurveTo(140.0f, 162.62741f, 134.62741f, 168.0f, 128.0f, 168.0f),
                    PathNode.CurveTo(121.37258f, 168.0f, 116.0f, 162.62741f, 116.0f, 156.0f),
                    PathNode.LineTo(116.0f, 144.0f),
                    PathNode.CurveTo(116.0f, 137.37259f, 121.37258f, 132.0f, 128.0f, 132.0f),
                    PathNode.CurveTo(152.26f, 132.0f, 172.0f, 115.85f, 172.0f, 96.0f),
                    PathNode.CurveTo(172.0f, 76.15f, 152.26f, 60.0f, 128.0f, 60.0f),
                    PathNode.CurveTo(103.74f, 60.0f, 84.0f, 76.15f, 84.0f, 96.0f),
                    PathNode.CurveTo(84.0f, 102.62742f, 78.62742f, 108.0f, 72.0f, 108.0f),
                    PathNode.CurveTo(65.37258f, 108.0f, 60.0f, 102.62742f, 60.0f, 96.0f),
                    PathNode.CurveTo(60.0f, 62.92f, 90.5f, 36.0f, 128.0f, 36.0f),
                    PathNode.CurveTo(165.5f, 36.0f, 196.0f, 62.92f, 196.0f, 96.0f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 188.0f),
                    PathNode.CurveTo(116.95431f, 188.0f, 108.0f, 196.9543f, 108.0f, 208.0f),
                    PathNode.CurveTo(108.0f, 219.0457f, 116.95431f, 228.0f, 128.0f, 228.0f),
                    PathNode.CurveTo(139.0457f, 228.0f, 148.0f, 219.0457f, 148.0f, 208.0f),
                    PathNode.CurveTo(148.0f, 196.9543f, 139.0457f, 188.0f, 128.0f, 188.0f),
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
        return _questionMark!!
    }

private var _questionMark: ImageVector? = null
