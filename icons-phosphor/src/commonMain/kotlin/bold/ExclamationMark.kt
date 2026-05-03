package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.ExclamationMark: ImageVector
    get() {
        if (_exclamationMark != null) return _exclamationMark!!
        _exclamationMark = phosphorBoldIcon(
            name = "ExclamationMark",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(148.0f, 200.0f),
                    PathNode.CurveTo(148.0f, 211.0457f, 139.0457f, 220.0f, 128.0f, 220.0f),
                    PathNode.CurveTo(116.95431f, 220.0f, 108.0f, 211.0457f, 108.0f, 200.0f),
                    PathNode.CurveTo(108.0f, 188.9543f, 116.95431f, 180.0f, 128.0f, 180.0f),
                    PathNode.CurveTo(139.0457f, 180.0f, 148.0f, 188.9543f, 148.0f, 200.0f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 160.0f),
                    PathNode.CurveTo(134.62741f, 160.0f, 140.0f, 154.62741f, 140.0f, 148.0f),
                    PathNode.LineTo(140.0f, 48.0f),
                    PathNode.CurveTo(140.0f, 41.37258f, 134.62741f, 36.0f, 128.0f, 36.0f),
                    PathNode.CurveTo(121.37258f, 36.0f, 116.0f, 41.37258f, 116.0f, 48.0f),
                    PathNode.LineTo(116.0f, 148.0f),
                    PathNode.CurveTo(116.0f, 154.62741f, 121.37258f, 160.0f, 128.0f, 160.0f),
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
        return _exclamationMark!!
    }

private var _exclamationMark: ImageVector? = null
