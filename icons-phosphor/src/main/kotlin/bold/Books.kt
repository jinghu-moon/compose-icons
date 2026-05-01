package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Books: ImageVector
    get() {
        if (_books != null) return _books!!
        _books = phosphorBoldIcon(
            name = "Books",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(235.57f, 193.73f),
                    PathNode.LineTo(202.38f, 35.93f),
                    PathNode.CurveTo(201.2947f, 30.719442f, 198.17726f, 26.156391f, 193.71783f, 23.251005f),
                    PathNode.CurveTo(189.2584f, 20.345617f, 183.82483f, 19.337563f, 178.62f, 20.45f),
                    PathNode.LineTo(131.81f, 30.51f),
                    PathNode.CurveTo(127.5064f, 31.443129f, 123.63611f, 33.782894f, 120.81f, 37.16f),
                    PathNode.CurveTo(117.12676f, 31.449085f, 110.79565f, 27.999174f, 104.0f, 28.0f),
                    PathNode.LineTo(56.0f, 28.0f),
                    PathNode.CurveTo(44.954304f, 28.0f, 36.0f, 36.954304f, 36.0f, 48.0f),
                    PathNode.LineTo(36.0f, 208.0f),
                    PathNode.CurveTo(36.0f, 219.0457f, 44.954304f, 228.0f, 56.0f, 228.0f),
                    PathNode.LineTo(104.0f, 228.0f),
                    PathNode.CurveTo(115.04569f, 228.0f, 124.0f, 219.0457f, 124.0f, 208.0f),
                    PathNode.LineTo(124.0f, 90.25f),
                    PathNode.LineTo(149.62f, 212.07f),
                    PathNode.CurveTo(151.5446f, 221.32979f, 159.69234f, 227.97565f, 169.15f, 228.0f),
                    PathNode.CurveTo(170.57188f, 227.99878f, 171.98969f, 227.84795f, 173.38f, 227.55f),
                    PathNode.LineTo(220.19f, 217.49f),
                    PathNode.CurveTo(230.96906f, 215.13373f, 237.83363f, 204.52888f, 235.57f, 193.73f),
                    PathNode.Close,
                    PathNode.MoveTo(148.19f, 88.65f),
                    PathNode.LineTo(187.19f, 80.27f),
                    PathNode.LineTo(189.72f, 92.27f),
                    PathNode.LineTo(150.72f, 100.65f),
                    PathNode.Close,
                    PathNode.MoveTo(155.65f, 124.15f),
                    PathNode.LineTo(194.65f, 115.77f),
                    PathNode.LineTo(203.81f, 159.35f),
                    PathNode.LineTo(164.81f, 167.73f),
                    PathNode.Close,
                    PathNode.MoveTo(179.71f, 44.76f),
                    PathNode.LineTo(182.24f, 56.76f),
                    PathNode.LineTo(143.24f, 65.14f),
                    PathNode.LineTo(140.71f, 53.14f),
                    PathNode.Close,
                    PathNode.MoveTo(60.0f, 88.0f),
                    PathNode.LineTo(100.0f, 88.0f),
                    PathNode.LineTo(100.0f, 168.0f),
                    PathNode.LineTo(60.0f, 168.0f),
                    PathNode.Close,
                    PathNode.MoveTo(100.0f, 52.0f),
                    PathNode.LineTo(100.0f, 64.0f),
                    PathNode.LineTo(60.0f, 64.0f),
                    PathNode.LineTo(60.0f, 52.0f),
                    PathNode.Close,
                    PathNode.MoveTo(60.0f, 204.0f),
                    PathNode.LineTo(60.0f, 192.0f),
                    PathNode.LineTo(100.0f, 192.0f),
                    PathNode.LineTo(100.0f, 204.0f),
                    PathNode.Close,
                    PathNode.MoveTo(172.29f, 203.24f),
                    PathNode.LineTo(169.76f, 191.24f),
                    PathNode.LineTo(208.76f, 182.86f),
                    PathNode.LineTo(211.29f, 194.86f),
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
        return _books!!
    }

private var _books: ImageVector? = null
