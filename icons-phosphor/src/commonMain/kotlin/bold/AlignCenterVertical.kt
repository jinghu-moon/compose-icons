package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.AlignCenterVertical: ImageVector
    get() {
        if (_alignCenterVertical != null) return _alignCenterVertical!!
        _alignCenterVertical = phosphorBoldIcon(
            name = "AlignCenterVertical",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(224.0f, 116.0f),
                    PathNode.LineTo(216.0f, 116.0f),
                    PathNode.LineTo(216.0f, 72.0f),
                    PathNode.CurveTo(216.0f, 60.954304f, 207.0457f, 52.0f, 196.0f, 52.0f),
                    PathNode.LineTo(156.0f, 52.0f),
                    PathNode.CurveTo(144.9543f, 52.0f, 136.0f, 60.954304f, 136.0f, 72.0f),
                    PathNode.LineTo(136.0f, 116.0f),
                    PathNode.LineTo(120.0f, 116.0f),
                    PathNode.LineTo(120.0f, 48.0f),
                    PathNode.CurveTo(120.0f, 36.954304f, 111.04569f, 28.0f, 100.0f, 28.0f),
                    PathNode.LineTo(60.0f, 28.0f),
                    PathNode.CurveTo(48.954304f, 28.0f, 40.0f, 36.954304f, 40.0f, 48.0f),
                    PathNode.LineTo(40.0f, 116.0f),
                    PathNode.LineTo(32.0f, 116.0f),
                    PathNode.CurveTo(25.372583f, 116.0f, 20.0f, 121.37258f, 20.0f, 128.0f),
                    PathNode.CurveTo(20.0f, 134.62741f, 25.372583f, 140.0f, 32.0f, 140.0f),
                    PathNode.LineTo(40.0f, 140.0f),
                    PathNode.LineTo(40.0f, 208.0f),
                    PathNode.CurveTo(40.0f, 219.0457f, 48.954304f, 228.0f, 60.0f, 228.0f),
                    PathNode.LineTo(100.0f, 228.0f),
                    PathNode.CurveTo(111.04569f, 228.0f, 120.0f, 219.0457f, 120.0f, 208.0f),
                    PathNode.LineTo(120.0f, 140.0f),
                    PathNode.LineTo(136.0f, 140.0f),
                    PathNode.LineTo(136.0f, 184.0f),
                    PathNode.CurveTo(136.0f, 195.0457f, 144.9543f, 204.0f, 156.0f, 204.0f),
                    PathNode.LineTo(196.0f, 204.0f),
                    PathNode.CurveTo(207.0457f, 204.0f, 216.0f, 195.0457f, 216.0f, 184.0f),
                    PathNode.LineTo(216.0f, 140.0f),
                    PathNode.LineTo(224.0f, 140.0f),
                    PathNode.CurveTo(230.62741f, 140.0f, 236.0f, 134.62741f, 236.0f, 128.0f),
                    PathNode.CurveTo(236.0f, 121.37258f, 230.62741f, 116.0f, 224.0f, 116.0f),
                    PathNode.Close,
                    PathNode.MoveTo(96.0f, 204.0f),
                    PathNode.LineTo(64.0f, 204.0f),
                    PathNode.LineTo(64.0f, 52.0f),
                    PathNode.LineTo(96.0f, 52.0f),
                    PathNode.Close,
                    PathNode.MoveTo(192.0f, 180.0f),
                    PathNode.LineTo(160.0f, 180.0f),
                    PathNode.LineTo(160.0f, 76.0f),
                    PathNode.LineTo(192.0f, 76.0f),
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
        return _alignCenterVertical!!
    }

private var _alignCenterVertical: ImageVector? = null
