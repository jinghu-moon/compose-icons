package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.FunnelSimple: ImageVector
    get() {
        if (_funnelSimple != null) return _funnelSimple!!
        _funnelSimple = phosphorBoldIcon(
            name = "FunnelSimple",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(204.0f, 136.0f),
                    PathNode.CurveTo(204.0f, 142.62741f, 198.62741f, 148.0f, 192.0f, 148.0f),
                    PathNode.LineTo(64.0f, 148.0f),
                    PathNode.CurveTo(57.37258f, 148.0f, 52.0f, 142.62741f, 52.0f, 136.0f),
                    PathNode.CurveTo(52.0f, 129.37259f, 57.37258f, 124.0f, 64.0f, 124.0f),
                    PathNode.LineTo(192.0f, 124.0f),
                    PathNode.CurveTo(198.62741f, 124.0f, 204.0f, 129.37259f, 204.0f, 136.0f),
                    PathNode.Close,
                    PathNode.MoveTo(232.0f, 76.0f),
                    PathNode.LineTo(24.0f, 76.0f),
                    PathNode.CurveTo(17.372583f, 76.0f, 12.0f, 81.37258f, 12.0f, 88.0f),
                    PathNode.CurveTo(12.0f, 94.62742f, 17.372583f, 100.0f, 24.0f, 100.0f),
                    PathNode.LineTo(232.0f, 100.0f),
                    PathNode.CurveTo(238.62741f, 100.0f, 244.0f, 94.62742f, 244.0f, 88.0f),
                    PathNode.CurveTo(244.0f, 81.37258f, 238.62741f, 76.0f, 232.0f, 76.0f),
                    PathNode.Close,
                    PathNode.MoveTo(152.0f, 172.0f),
                    PathNode.LineTo(104.0f, 172.0f),
                    PathNode.CurveTo(97.37258f, 172.0f, 92.0f, 177.37259f, 92.0f, 184.0f),
                    PathNode.CurveTo(92.0f, 190.62741f, 97.37258f, 196.0f, 104.0f, 196.0f),
                    PathNode.LineTo(152.0f, 196.0f),
                    PathNode.CurveTo(158.62741f, 196.0f, 164.0f, 190.62741f, 164.0f, 184.0f),
                    PathNode.CurveTo(164.0f, 177.37259f, 158.62741f, 172.0f, 152.0f, 172.0f),
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
        return _funnelSimple!!
    }

private var _funnelSimple: ImageVector? = null
