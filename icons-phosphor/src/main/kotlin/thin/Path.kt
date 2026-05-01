package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Path: ImageVector
    get() {
        if (_path != null) return _path!!
        _path = phosphorThinIcon(
            name = "Path",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(200.0f, 172.0f),
                    PathNode.CurveTo(186.08228f, 172.0014f, 174.27824f, 182.22502f, 172.29f, 196.0f),
                    PathNode.LineTo(72.0f, 196.0f),
                    PathNode.CurveTo(52.11775f, 196.0f, 36.0f, 179.88223f, 36.0f, 160.0f),
                    PathNode.CurveTo(36.0f, 140.11777f, 52.11775f, 124.0f, 72.0f, 124.0f),
                    PathNode.LineTo(168.0f, 124.0f),
                    PathNode.CurveTo(187.88223f, 124.0f, 204.0f, 107.88225f, 204.0f, 88.0f),
                    PathNode.CurveTo(204.0f, 68.11775f, 187.88223f, 52.0f, 168.0f, 52.0f),
                    PathNode.LineTo(72.0f, 52.0f),
                    PathNode.CurveTo(69.79086f, 52.0f, 68.0f, 53.79086f, 68.0f, 56.0f),
                    PathNode.CurveTo(68.0f, 58.20914f, 69.79086f, 60.0f, 72.0f, 60.0f),
                    PathNode.LineTo(168.0f, 60.0f),
                    PathNode.CurveTo(183.46397f, 60.0f, 196.0f, 72.536026f, 196.0f, 88.0f),
                    PathNode.CurveTo(196.0f, 103.463974f, 183.46397f, 116.0f, 168.0f, 116.0f),
                    PathNode.LineTo(72.0f, 116.0f),
                    PathNode.CurveTo(47.69947f, 116.0f, 28.0f, 135.69948f, 28.0f, 160.0f),
                    PathNode.CurveTo(28.0f, 184.30052f, 47.69947f, 204.0f, 72.0f, 204.0f),
                    PathNode.LineTo(172.29f, 204.0f),
                    PathNode.CurveTo(174.42491f, 218.79112f, 187.79933f, 229.29865f, 202.67549f, 227.87215f),
                    PathNode.CurveTo(217.55165f, 226.44566f, 228.68558f, 213.58801f, 227.97076f, 198.66072f),
                    PathNode.CurveTo(227.25595f, 183.73343f, 214.9444f, 171.9985f, 200.0f, 172.0f),
                    PathNode.Close,
                    PathNode.MoveTo(200.0f, 220.0f),
                    PathNode.CurveTo(188.9543f, 220.0f, 180.0f, 211.0457f, 180.0f, 200.0f),
                    PathNode.CurveTo(180.0f, 188.9543f, 188.9543f, 180.0f, 200.0f, 180.0f),
                    PathNode.CurveTo(211.0457f, 180.0f, 220.0f, 188.9543f, 220.0f, 200.0f),
                    PathNode.CurveTo(220.0f, 211.0457f, 211.0457f, 220.0f, 200.0f, 220.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 8.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _path!!
    }

private var _path: ImageVector? = null
