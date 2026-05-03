package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.AlignCenterVerticalSimple: ImageVector
    get() {
        if (_alignCenterVerticalSimple != null) return _alignCenterVerticalSimple!!
        _alignCenterVerticalSimple = phosphorBoldIcon(
            name = "AlignCenterVerticalSimple",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(208.0f, 116.0f),
                    PathNode.LineTo(180.0f, 116.0f),
                    PathNode.LineTo(180.0f, 48.0f),
                    PathNode.CurveTo(180.0f, 36.954304f, 171.0457f, 28.0f, 160.0f, 28.0f),
                    PathNode.LineTo(96.0f, 28.0f),
                    PathNode.CurveTo(84.95431f, 28.0f, 76.0f, 36.954304f, 76.0f, 48.0f),
                    PathNode.LineTo(76.0f, 116.0f),
                    PathNode.LineTo(48.0f, 116.0f),
                    PathNode.CurveTo(41.37258f, 116.0f, 36.0f, 121.37258f, 36.0f, 128.0f),
                    PathNode.CurveTo(36.0f, 134.62741f, 41.37258f, 140.0f, 48.0f, 140.0f),
                    PathNode.LineTo(76.0f, 140.0f),
                    PathNode.LineTo(76.0f, 208.0f),
                    PathNode.CurveTo(76.0f, 219.0457f, 84.95431f, 228.0f, 96.0f, 228.0f),
                    PathNode.LineTo(160.0f, 228.0f),
                    PathNode.CurveTo(171.0457f, 228.0f, 180.0f, 219.0457f, 180.0f, 208.0f),
                    PathNode.LineTo(180.0f, 140.0f),
                    PathNode.LineTo(208.0f, 140.0f),
                    PathNode.CurveTo(214.62741f, 140.0f, 220.0f, 134.62741f, 220.0f, 128.0f),
                    PathNode.CurveTo(220.0f, 121.37258f, 214.62741f, 116.0f, 208.0f, 116.0f),
                    PathNode.Close,
                    PathNode.MoveTo(156.0f, 204.0f),
                    PathNode.LineTo(100.0f, 204.0f),
                    PathNode.LineTo(100.0f, 52.0f),
                    PathNode.LineTo(156.0f, 52.0f),
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
        return _alignCenterVerticalSimple!!
    }

private var _alignCenterVerticalSimple: ImageVector? = null
