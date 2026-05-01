package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Gif: ImageVector
    get() {
        if (_gif != null) return _gif!!
        _gif = phosphorBoldIcon(
            name = "Gif",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(148.0f, 72.0f),
                    PathNode.LineTo(148.0f, 184.0f),
                    PathNode.CurveTo(148.0f, 190.62741f, 142.62741f, 196.0f, 136.0f, 196.0f),
                    PathNode.CurveTo(129.37259f, 196.0f, 124.0f, 190.62741f, 124.0f, 184.0f),
                    PathNode.LineTo(124.0f, 72.0f),
                    PathNode.CurveTo(124.0f, 65.37258f, 129.37259f, 60.0f, 136.0f, 60.0f),
                    PathNode.CurveTo(142.62741f, 60.0f, 148.0f, 65.37258f, 148.0f, 72.0f),
                    PathNode.Close,
                    PathNode.MoveTo(232.0f, 84.0f),
                    PathNode.CurveTo(238.62741f, 84.0f, 244.0f, 78.62742f, 244.0f, 72.0f),
                    PathNode.CurveTo(244.0f, 65.37258f, 238.62741f, 60.0f, 232.0f, 60.0f),
                    PathNode.LineTo(176.0f, 60.0f),
                    PathNode.CurveTo(169.37259f, 60.0f, 164.0f, 65.37258f, 164.0f, 72.0f),
                    PathNode.LineTo(164.0f, 184.0f),
                    PathNode.CurveTo(164.0f, 190.62741f, 169.37259f, 196.0f, 176.0f, 196.0f),
                    PathNode.CurveTo(182.62741f, 196.0f, 188.0f, 190.62741f, 188.0f, 184.0f),
                    PathNode.LineTo(188.0f, 140.0f),
                    PathNode.LineTo(224.0f, 140.0f),
                    PathNode.CurveTo(230.62741f, 140.0f, 236.0f, 134.62741f, 236.0f, 128.0f),
                    PathNode.CurveTo(236.0f, 121.37258f, 230.62741f, 116.0f, 224.0f, 116.0f),
                    PathNode.LineTo(188.0f, 116.0f),
                    PathNode.LineTo(188.0f, 84.0f),
                    PathNode.Close,
                    PathNode.MoveTo(96.0f, 116.0f),
                    PathNode.LineTo(72.0f, 116.0f),
                    PathNode.CurveTo(65.37258f, 116.0f, 60.0f, 121.37258f, 60.0f, 128.0f),
                    PathNode.CurveTo(60.0f, 134.62741f, 65.37258f, 140.0f, 72.0f, 140.0f),
                    PathNode.LineTo(84.0f, 140.0f),
                    PathNode.LineTo(84.0f, 152.0f),
                    PathNode.CurveTo(84.0f, 163.0457f, 75.04569f, 172.0f, 64.0f, 172.0f),
                    PathNode.CurveTo(52.954304f, 172.0f, 44.0f, 163.0457f, 44.0f, 152.0f),
                    PathNode.LineTo(44.0f, 104.0f),
                    PathNode.CurveTo(44.0f, 92.95431f, 52.954304f, 84.0f, 64.0f, 84.0f),
                    PathNode.CurveTo(73.42f, 84.0f, 82.18f, 90.45f, 84.38f, 99.0f),
                    PathNode.CurveTo(86.03686f, 105.41755f, 92.58245f, 109.276855f, 99.0f, 107.62f),
                    PathNode.CurveTo(105.41755f, 105.96314f, 109.276855f, 99.41755f, 107.62f, 93.0f),
                    PathNode.CurveTo(102.7f, 73.88f, 84.35f, 60.0f, 64.0f, 60.0f),
                    PathNode.CurveTo(39.71089f, 60.027554f, 20.027554f, 79.71089f, 20.0f, 104.0f),
                    PathNode.LineTo(20.0f, 152.0f),
                    PathNode.CurveTo(20.0f, 176.30052f, 39.69947f, 196.0f, 64.0f, 196.0f),
                    PathNode.CurveTo(88.30053f, 196.0f, 108.0f, 176.30052f, 108.0f, 152.0f),
                    PathNode.LineTo(108.0f, 128.0f),
                    PathNode.CurveTo(108.0f, 121.37258f, 102.62742f, 116.0f, 96.0f, 116.0f),
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
        return _gif!!
    }

private var _gif: ImageVector? = null
