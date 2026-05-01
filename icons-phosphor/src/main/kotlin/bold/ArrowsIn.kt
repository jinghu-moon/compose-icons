package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.ArrowsIn: ImageVector
    get() {
        if (_arrowsIn != null) return _arrowsIn!!
        _arrowsIn = phosphorBoldIcon(
            name = "ArrowsIn",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(140.0f, 104.0f),
                    PathNode.LineTo(140.0f, 64.0f),
                    PathNode.CurveTo(140.0f, 57.37258f, 145.37259f, 52.0f, 152.0f, 52.0f),
                    PathNode.CurveTo(158.62741f, 52.0f, 164.0f, 57.37258f, 164.0f, 64.0f),
                    PathNode.LineTo(164.0f, 75.0f),
                    PathNode.LineTo(199.51f, 39.48f),
                    PathNode.CurveTo(204.20442f, 34.78558f, 211.81558f, 34.78558f, 216.51f, 39.48f),
                    PathNode.CurveTo(221.20442f, 44.17442f, 221.20442f, 51.78558f, 216.51f, 56.48f),
                    PathNode.LineTo(181.0f, 92.0f),
                    PathNode.LineTo(192.0f, 92.0f),
                    PathNode.CurveTo(198.62741f, 92.0f, 204.0f, 97.37258f, 204.0f, 104.0f),
                    PathNode.CurveTo(204.0f, 110.62742f, 198.62741f, 116.0f, 192.0f, 116.0f),
                    PathNode.LineTo(152.0f, 116.0f),
                    PathNode.CurveTo(145.37259f, 116.0f, 140.0f, 110.62742f, 140.0f, 104.0f),
                    PathNode.Close,
                    PathNode.MoveTo(104.0f, 140.0f),
                    PathNode.LineTo(64.0f, 140.0f),
                    PathNode.CurveTo(57.37258f, 140.0f, 52.0f, 145.37259f, 52.0f, 152.0f),
                    PathNode.CurveTo(52.0f, 158.62741f, 57.37258f, 164.0f, 64.0f, 164.0f),
                    PathNode.LineTo(75.0f, 164.0f),
                    PathNode.LineTo(39.51f, 199.51f),
                    PathNode.CurveTo(34.81558f, 204.20442f, 34.81558f, 211.81558f, 39.51f, 216.51f),
                    PathNode.CurveTo(44.20442f, 221.20442f, 51.81558f, 221.20442f, 56.51f, 216.51f),
                    PathNode.LineTo(92.0f, 181.0f),
                    PathNode.LineTo(92.0f, 192.0f),
                    PathNode.CurveTo(92.0f, 198.62741f, 97.37258f, 204.0f, 104.0f, 204.0f),
                    PathNode.CurveTo(110.62742f, 204.0f, 116.0f, 198.62741f, 116.0f, 192.0f),
                    PathNode.LineTo(116.0f, 152.0f),
                    PathNode.CurveTo(116.0f, 145.37259f, 110.62742f, 140.0f, 104.0f, 140.0f),
                    PathNode.Close,
                    PathNode.MoveTo(181.0f, 164.0f),
                    PathNode.LineTo(192.0f, 164.0f),
                    PathNode.CurveTo(198.62741f, 164.0f, 204.0f, 158.62741f, 204.0f, 152.0f),
                    PathNode.CurveTo(204.0f, 145.37259f, 198.62741f, 140.0f, 192.0f, 140.0f),
                    PathNode.LineTo(152.0f, 140.0f),
                    PathNode.CurveTo(145.37259f, 140.0f, 140.0f, 145.37259f, 140.0f, 152.0f),
                    PathNode.LineTo(140.0f, 192.0f),
                    PathNode.CurveTo(140.0f, 198.62741f, 145.37259f, 204.0f, 152.0f, 204.0f),
                    PathNode.CurveTo(158.62741f, 204.0f, 164.0f, 198.62741f, 164.0f, 192.0f),
                    PathNode.LineTo(164.0f, 181.0f),
                    PathNode.LineTo(199.51f, 216.52f),
                    PathNode.CurveTo(204.20442f, 221.21442f, 211.81558f, 221.21442f, 216.51f, 216.52f),
                    PathNode.CurveTo(221.20442f, 211.82558f, 221.20442f, 204.21442f, 216.51f, 199.52f),
                    PathNode.Close,
                    PathNode.MoveTo(104.0f, 52.0f),
                    PathNode.CurveTo(97.37258f, 52.0f, 92.0f, 57.37258f, 92.0f, 64.0f),
                    PathNode.LineTo(92.0f, 75.0f),
                    PathNode.LineTo(56.49f, 39.51f),
                    PathNode.CurveTo(51.79558f, 34.81558f, 44.18442f, 34.81558f, 39.49f, 39.51f),
                    PathNode.CurveTo(34.79558f, 44.20442f, 34.79558f, 51.81558f, 39.49f, 56.51f),
                    PathNode.LineTo(75.0f, 92.0f),
                    PathNode.LineTo(64.0f, 92.0f),
                    PathNode.CurveTo(57.37258f, 92.0f, 52.0f, 97.37258f, 52.0f, 104.0f),
                    PathNode.CurveTo(52.0f, 110.62742f, 57.37258f, 116.0f, 64.0f, 116.0f),
                    PathNode.LineTo(104.0f, 116.0f),
                    PathNode.CurveTo(110.62742f, 116.0f, 116.0f, 110.62742f, 116.0f, 104.0f),
                    PathNode.LineTo(116.0f, 64.0f),
                    PathNode.CurveTo(116.0f, 57.37258f, 110.62742f, 52.0f, 104.0f, 52.0f),
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
        return _arrowsIn!!
    }

private var _arrowsIn: ImageVector? = null
