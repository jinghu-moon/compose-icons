package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Divide: ImageVector
    get() {
        if (_divide != null) return _divide!!
        _divide = phosphorBoldIcon(
            name = "Divide",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(228.0f, 128.0f),
                    PathNode.CurveTo(228.0f, 134.62741f, 222.62741f, 140.0f, 216.0f, 140.0f),
                    PathNode.LineTo(40.0f, 140.0f),
                    PathNode.CurveTo(33.37258f, 140.0f, 28.0f, 134.62741f, 28.0f, 128.0f),
                    PathNode.CurveTo(28.0f, 121.37258f, 33.37258f, 116.0f, 40.0f, 116.0f),
                    PathNode.LineTo(216.0f, 116.0f),
                    PathNode.CurveTo(222.62741f, 116.0f, 228.0f, 121.37258f, 228.0f, 128.0f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 84.0f),
                    PathNode.CurveTo(139.0457f, 84.0f, 148.0f, 75.04569f, 148.0f, 64.0f),
                    PathNode.CurveTo(148.0f, 52.954304f, 139.0457f, 44.0f, 128.0f, 44.0f),
                    PathNode.CurveTo(116.95431f, 44.0f, 108.0f, 52.954304f, 108.0f, 64.0f),
                    PathNode.CurveTo(108.0f, 75.04569f, 116.95431f, 84.0f, 128.0f, 84.0f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 172.0f),
                    PathNode.CurveTo(116.95431f, 172.0f, 108.0f, 180.9543f, 108.0f, 192.0f),
                    PathNode.CurveTo(108.0f, 203.0457f, 116.95431f, 212.0f, 128.0f, 212.0f),
                    PathNode.CurveTo(139.0457f, 212.0f, 148.0f, 203.0457f, 148.0f, 192.0f),
                    PathNode.CurveTo(148.0f, 180.9543f, 139.0457f, 172.0f, 128.0f, 172.0f),
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
        return _divide!!
    }

private var _divide: ImageVector? = null
