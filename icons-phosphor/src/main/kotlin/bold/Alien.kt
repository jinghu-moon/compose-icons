package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Alien: ImageVector
    get() {
        if (_alien != null) return _alien!!
        _alien = phosphorBoldIcon(
            name = "Alien",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(128.0f, 12.0f),
                    PathNode.CurveTo(72.79665f, 12.060624f, 28.060623f, 56.796658f, 28.0f, 112.0f),
                    PathNode.CurveTo(28.0f, 136.86f, 40.86f, 168.8f, 62.41f, 197.44f),
                    PathNode.CurveTo(70.63f, 208.36f, 99.64f, 244.0f, 128.0f, 244.0f),
                    PathNode.CurveTo(156.36f, 244.0f, 185.37f, 208.36f, 193.59f, 197.44f),
                    PathNode.CurveTo(215.14f, 168.8f, 228.0f, 136.86f, 228.0f, 112.0f),
                    PathNode.CurveTo(227.93938f, 56.796658f, 183.20334f, 12.060624f, 128.0f, 12.0f),
                    PathNode.Close,
                    PathNode.MoveTo(174.41f, 183.0f),
                    PathNode.CurveTo(160.58f, 201.38f, 140.2f, 220.0f, 128.0f, 220.0f),
                    PathNode.CurveTo(115.8f, 220.0f, 95.42f, 201.39f, 81.59f, 183.0f),
                    PathNode.CurveTo(63.34f, 158.75f, 52.0f, 131.54f, 52.0f, 112.0f),
                    PathNode.CurveTo(52.0f, 70.02636f, 86.02636f, 36.0f, 128.0f, 36.0f),
                    PathNode.CurveTo(169.97365f, 36.0f, 204.0f, 70.02636f, 204.0f, 112.0f),
                    PathNode.CurveTo(204.0f, 131.54f, 192.66f, 158.75f, 174.41f, 183.0f),
                    PathNode.Close,
                    PathNode.MoveTo(104.0f, 148.0f),
                    PathNode.CurveTo(84.11775f, 148.0f, 68.0f, 131.88225f, 68.0f, 112.0f),
                    PathNode.CurveTo(68.0f, 105.37258f, 73.37258f, 100.0f, 80.0f, 100.0f),
                    PathNode.CurveTo(99.88225f, 100.0f, 116.0f, 116.11775f, 116.0f, 136.0f),
                    PathNode.CurveTo(116.0f, 142.62741f, 110.62742f, 148.0f, 104.0f, 148.0f),
                    PathNode.Close,
                    PathNode.MoveTo(188.0f, 112.0f),
                    PathNode.CurveTo(188.0f, 131.88225f, 171.88223f, 148.0f, 152.0f, 148.0f),
                    PathNode.CurveTo(145.37259f, 148.0f, 140.0f, 142.62741f, 140.0f, 136.0f),
                    PathNode.CurveTo(140.0f, 116.11775f, 156.11777f, 100.0f, 176.0f, 100.0f),
                    PathNode.CurveTo(182.62741f, 100.0f, 188.0f, 105.37258f, 188.0f, 112.0f),
                    PathNode.Close,
                    PathNode.MoveTo(152.0f, 184.0f),
                    PathNode.CurveTo(152.0f, 190.62741f, 146.62741f, 196.0f, 140.0f, 196.0f),
                    PathNode.LineTo(116.0f, 196.0f),
                    PathNode.CurveTo(109.37258f, 196.0f, 104.0f, 190.62741f, 104.0f, 184.0f),
                    PathNode.CurveTo(104.0f, 177.37259f, 109.37258f, 172.0f, 116.0f, 172.0f),
                    PathNode.LineTo(140.0f, 172.0f),
                    PathNode.CurveTo(146.62741f, 172.0f, 152.0f, 177.37259f, 152.0f, 184.0f),
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
        return _alien!!
    }

private var _alien: ImageVector? = null
