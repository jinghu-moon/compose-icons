package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Cricket: ImageVector
    get() {
        if (_cricket != null) return _cricket!!
        _cricket = phosphorBoldIcon(
            name = "Cricket",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(246.15f, 78.54f),
                    PathNode.LineTo(193.46f, 25.85f),
                    PathNode.CurveTo(185.65001f, 18.04236f, 172.98999f, 18.04236f, 165.18f, 25.85f),
                    PathNode.LineTo(57.86f, 133.17f),
                    PathNode.CurveTo(50.05236f, 140.98f, 50.05236f, 153.64f, 57.86f, 161.45f),
                    PathNode.LineTo(75.72f, 179.31f),
                    PathNode.LineTo(31.52f, 223.51f),
                    PathNode.CurveTo(26.82558f, 228.20442f, 26.82558f, 235.81558f, 31.52f, 240.51f),
                    PathNode.CurveTo(36.21442f, 245.20442f, 43.82558f, 245.20442f, 48.52f, 240.51f),
                    PathNode.LineTo(92.72f, 196.3f),
                    PathNode.LineTo(110.58f, 214.16f),
                    PathNode.CurveTo(118.39f, 221.96764f, 131.05f, 221.96764f, 138.86f, 214.16f),
                    PathNode.LineTo(246.15f, 106.82f),
                    PathNode.CurveTo(253.95764f, 99.01f, 253.95764f, 86.35f, 246.15f, 78.54f),
                    PathNode.Close,
                    PathNode.MoveTo(124.69f, 194.34f),
                    PathNode.LineTo(109.69f, 179.34f),
                    PathNode.LineTo(136.52f, 152.51f),
                    PathNode.CurveTo(141.21442f, 147.81558f, 141.21442f, 140.20442f, 136.52f, 135.51f),
                    PathNode.CurveTo(131.82558f, 130.81558f, 124.214424f, 130.81558f, 119.52f, 135.51f),
                    PathNode.LineTo(92.69f, 162.34f),
                    PathNode.LineTo(77.69f, 147.34f),
                    PathNode.LineTo(109.0f, 116.0f),
                    PathNode.LineTo(156.0f, 116.0f),
                    PathNode.LineTo(156.0f, 163.0f),
                    PathNode.Close,
                    PathNode.MoveTo(180.0f, 139.0f),
                    PathNode.LineTo(180.0f, 104.0f),
                    PathNode.CurveTo(180.0f, 97.37258f, 174.62741f, 92.0f, 168.0f, 92.0f),
                    PathNode.LineTo(133.0f, 92.0f),
                    PathNode.LineTo(179.34f, 45.66f),
                    PathNode.LineTo(226.34f, 92.66f),
                    PathNode.Close,
                    PathNode.MoveTo(60.0f, 92.0f),
                    PathNode.CurveTo(77.67311f, 92.0f, 92.0f, 77.67311f, 92.0f, 60.0f),
                    PathNode.CurveTo(92.0f, 42.32689f, 77.67311f, 28.0f, 60.0f, 28.0f),
                    PathNode.CurveTo(42.32689f, 28.0f, 28.0f, 42.32689f, 28.0f, 60.0f),
                    PathNode.CurveTo(28.0f, 77.67311f, 42.32689f, 92.0f, 60.0f, 92.0f),
                    PathNode.Close,
                    PathNode.MoveTo(60.0f, 52.0f),
                    PathNode.CurveTo(64.41828f, 52.0f, 68.0f, 55.581722f, 68.0f, 60.0f),
                    PathNode.CurveTo(68.0f, 64.41828f, 64.41828f, 68.0f, 60.0f, 68.0f),
                    PathNode.CurveTo(55.581722f, 68.0f, 52.0f, 64.41828f, 52.0f, 60.0f),
                    PathNode.CurveTo(52.0f, 55.581722f, 55.581722f, 52.0f, 60.0f, 52.0f),
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
        return _cricket!!
    }

private var _cricket: ImageVector? = null
