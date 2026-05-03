package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.FilmReel: ImageVector
    get() {
        if (_filmReel != null) return _filmReel!!
        _filmReel = phosphorBoldIcon(
            name = "FilmReel",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(232.0f, 212.0f),
                    PathNode.LineTo(195.8f, 212.0f),
                    PathNode.CurveTo(236.68474f, 178.94684f, 247.80833f, 121.24492f, 222.14066f, 75.361984f),
                    PathNode.CurveTo(196.47296f, 29.479055f, 141.48114f, 8.763219f, 91.92015f, 26.306932f),
                    PathNode.CurveTo(42.35916f, 43.850647f, 12.647113f, 94.550156f, 21.562088f, 146.36325f),
                    PathNode.CurveTo(30.477064f, 198.17635f, 75.42555f, 236.02974f, 128.0f, 236.0f),
                    PathNode.LineTo(232.0f, 236.0f),
                    PathNode.CurveTo(238.62741f, 236.0f, 244.0f, 230.62741f, 244.0f, 224.0f),
                    PathNode.CurveTo(244.0f, 217.37259f, 238.62741f, 212.0f, 232.0f, 212.0f),
                    PathNode.Close,
                    PathNode.MoveTo(44.0f, 128.0f),
                    PathNode.CurveTo(44.0f, 81.60808f, 81.60808f, 44.0f, 128.0f, 44.0f),
                    PathNode.CurveTo(174.39192f, 44.0f, 212.0f, 81.60808f, 212.0f, 128.0f),
                    PathNode.CurveTo(212.0f, 174.39192f, 174.39192f, 212.0f, 128.0f, 212.0f),
                    PathNode.CurveTo(81.62865f, 211.9504f, 44.049603f, 174.37135f, 44.0f, 128.0f),
                    PathNode.Close,
                    PathNode.MoveTo(108.0f, 84.0f),
                    PathNode.CurveTo(108.0f, 72.95431f, 116.95431f, 64.0f, 128.0f, 64.0f),
                    PathNode.CurveTo(139.0457f, 64.0f, 148.0f, 72.95431f, 148.0f, 84.0f),
                    PathNode.CurveTo(148.0f, 95.04569f, 139.0457f, 104.0f, 128.0f, 104.0f),
                    PathNode.CurveTo(116.95431f, 104.0f, 108.0f, 95.04569f, 108.0f, 84.0f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 192.0f),
                    PathNode.CurveTo(116.95431f, 192.0f, 108.0f, 183.0457f, 108.0f, 172.0f),
                    PathNode.CurveTo(108.0f, 160.9543f, 116.95431f, 152.0f, 128.0f, 152.0f),
                    PathNode.CurveTo(139.0457f, 152.0f, 148.0f, 160.9543f, 148.0f, 172.0f),
                    PathNode.CurveTo(148.0f, 183.0457f, 139.0457f, 192.0f, 128.0f, 192.0f),
                    PathNode.Close,
                    PathNode.MoveTo(152.0f, 128.0f),
                    PathNode.CurveTo(152.0f, 116.95431f, 160.9543f, 108.0f, 172.0f, 108.0f),
                    PathNode.CurveTo(183.0457f, 108.0f, 192.0f, 116.95431f, 192.0f, 128.0f),
                    PathNode.CurveTo(192.0f, 139.0457f, 183.0457f, 148.0f, 172.0f, 148.0f),
                    PathNode.CurveTo(160.9543f, 148.0f, 152.0f, 139.0457f, 152.0f, 128.0f),
                    PathNode.Close,
                    PathNode.MoveTo(104.0f, 128.0f),
                    PathNode.CurveTo(104.0f, 139.0457f, 95.04569f, 148.0f, 84.0f, 148.0f),
                    PathNode.CurveTo(72.95431f, 148.0f, 64.0f, 139.0457f, 64.0f, 128.0f),
                    PathNode.CurveTo(64.0f, 116.95431f, 72.95431f, 108.0f, 84.0f, 108.0f),
                    PathNode.CurveTo(95.04569f, 108.0f, 104.0f, 116.95431f, 104.0f, 128.0f),
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
        return _filmReel!!
    }

private var _filmReel: ImageVector? = null
