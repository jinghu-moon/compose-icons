package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Bookmarks: ImageVector
    get() {
        if (_bookmarks != null) return _bookmarks!!
        _bookmarks = phosphorBoldIcon(
            name = "Bookmarks",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(192.0f, 20.0f),
                    PathNode.LineTo(96.0f, 20.0f),
                    PathNode.CurveTo(84.95431f, 20.0f, 76.0f, 28.954306f, 76.0f, 40.0f),
                    PathNode.LineTo(76.0f, 60.0f),
                    PathNode.LineTo(64.0f, 60.0f),
                    PathNode.CurveTo(52.954304f, 60.0f, 44.0f, 68.95431f, 44.0f, 80.0f),
                    PathNode.LineTo(44.0f, 224.0f),
                    PathNode.CurveTo(43.99955f, 228.57262f, 46.597862f, 232.74811f, 50.700413f, 234.76753f),
                    PathNode.CurveTo(54.802963f, 236.78696f, 59.696636f, 236.2993f, 63.32f, 233.51f),
                    PathNode.LineTo(108.0f, 199.14f),
                    PathNode.LineTo(152.69f, 233.51f),
                    PathNode.CurveTo(156.31339f, 236.29327f, 161.20294f, 236.7774f, 165.3018f, 234.75876f),
                    PathNode.CurveTo(169.40065f, 232.74011f, 171.99754f, 228.56897f, 172.0f, 224.0f),
                    PathNode.LineTo(172.0f, 177.6f),
                    PathNode.LineTo(192.68f, 193.51f),
                    PathNode.CurveTo(196.30336f, 196.2993f, 201.19704f, 196.78696f, 205.29959f, 194.76753f),
                    PathNode.CurveTo(209.40215f, 192.74811f, 212.00046f, 188.57262f, 212.0f, 184.0f),
                    PathNode.LineTo(212.0f, 40.0f),
                    PathNode.CurveTo(212.0f, 28.954306f, 203.0457f, 20.0f, 192.0f, 20.0f),
                    PathNode.Close,
                    PathNode.MoveTo(148.0f, 199.63f),
                    PathNode.LineTo(115.31f, 174.49f),
                    PathNode.CurveTo(110.997185f, 171.17355f, 104.99282f, 171.17355f, 100.68f, 174.49f),
                    PathNode.LineTo(68.0f, 199.63f),
                    PathNode.LineTo(68.0f, 84.0f),
                    PathNode.LineTo(148.0f, 84.0f),
                    PathNode.Close,
                    PathNode.MoveTo(188.0f, 159.63f),
                    PathNode.LineTo(172.0f, 147.33f),
                    PathNode.LineTo(172.0f, 80.0f),
                    PathNode.CurveTo(172.0f, 68.95431f, 163.0457f, 60.0f, 152.0f, 60.0f),
                    PathNode.LineTo(100.0f, 60.0f),
                    PathNode.LineTo(100.0f, 44.0f),
                    PathNode.LineTo(188.0f, 44.0f),
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
        return _bookmarks!!
    }

private var _bookmarks: ImageVector? = null
