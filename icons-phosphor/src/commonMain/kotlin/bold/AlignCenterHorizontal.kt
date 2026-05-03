package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.AlignCenterHorizontal: ImageVector
    get() {
        if (_alignCenterHorizontal != null) return _alignCenterHorizontal!!
        _alignCenterHorizontal = phosphorBoldIcon(
            name = "AlignCenterHorizontal",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(208.0f, 136.0f),
                    PathNode.LineTo(140.0f, 136.0f),
                    PathNode.LineTo(140.0f, 120.0f),
                    PathNode.LineTo(184.0f, 120.0f),
                    PathNode.CurveTo(195.0457f, 120.0f, 204.0f, 111.04569f, 204.0f, 100.0f),
                    PathNode.LineTo(204.0f, 60.0f),
                    PathNode.CurveTo(204.0f, 48.954304f, 195.0457f, 40.0f, 184.0f, 40.0f),
                    PathNode.LineTo(140.0f, 40.0f),
                    PathNode.LineTo(140.0f, 32.0f),
                    PathNode.CurveTo(140.0f, 25.372583f, 134.62741f, 20.0f, 128.0f, 20.0f),
                    PathNode.CurveTo(121.37258f, 20.0f, 116.0f, 25.372583f, 116.0f, 32.0f),
                    PathNode.LineTo(116.0f, 40.0f),
                    PathNode.LineTo(72.0f, 40.0f),
                    PathNode.CurveTo(60.954304f, 40.0f, 52.0f, 48.954304f, 52.0f, 60.0f),
                    PathNode.LineTo(52.0f, 100.0f),
                    PathNode.CurveTo(52.0f, 111.04569f, 60.954304f, 120.0f, 72.0f, 120.0f),
                    PathNode.LineTo(116.0f, 120.0f),
                    PathNode.LineTo(116.0f, 136.0f),
                    PathNode.LineTo(48.0f, 136.0f),
                    PathNode.CurveTo(36.954304f, 136.0f, 28.0f, 144.9543f, 28.0f, 156.0f),
                    PathNode.LineTo(28.0f, 196.0f),
                    PathNode.CurveTo(28.0f, 207.0457f, 36.954304f, 216.0f, 48.0f, 216.0f),
                    PathNode.LineTo(116.0f, 216.0f),
                    PathNode.LineTo(116.0f, 224.0f),
                    PathNode.CurveTo(116.0f, 230.62741f, 121.37258f, 236.0f, 128.0f, 236.0f),
                    PathNode.CurveTo(134.62741f, 236.0f, 140.0f, 230.62741f, 140.0f, 224.0f),
                    PathNode.LineTo(140.0f, 216.0f),
                    PathNode.LineTo(208.0f, 216.0f),
                    PathNode.CurveTo(219.0457f, 216.0f, 228.0f, 207.0457f, 228.0f, 196.0f),
                    PathNode.LineTo(228.0f, 156.0f),
                    PathNode.CurveTo(228.0f, 144.9543f, 219.0457f, 136.0f, 208.0f, 136.0f),
                    PathNode.Close,
                    PathNode.MoveTo(76.0f, 64.0f),
                    PathNode.LineTo(180.0f, 64.0f),
                    PathNode.LineTo(180.0f, 96.0f),
                    PathNode.LineTo(76.0f, 96.0f),
                    PathNode.Close,
                    PathNode.MoveTo(204.0f, 192.0f),
                    PathNode.LineTo(52.0f, 192.0f),
                    PathNode.LineTo(52.0f, 160.0f),
                    PathNode.LineTo(204.0f, 160.0f),
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
        return _alignCenterHorizontal!!
    }

private var _alignCenterHorizontal: ImageVector? = null
