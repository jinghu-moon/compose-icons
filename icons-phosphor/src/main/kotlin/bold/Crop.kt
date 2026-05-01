package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Crop: ImageVector
    get() {
        if (_crop != null) return _crop!!
        _crop = phosphorBoldIcon(
            name = "Crop",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(244.0f, 192.0f),
                    PathNode.CurveTo(244.0f, 198.62741f, 238.62741f, 204.0f, 232.0f, 204.0f),
                    PathNode.LineTo(204.0f, 204.0f),
                    PathNode.LineTo(204.0f, 232.0f),
                    PathNode.CurveTo(204.0f, 238.62741f, 198.62741f, 244.0f, 192.0f, 244.0f),
                    PathNode.CurveTo(185.37259f, 244.0f, 180.0f, 238.62741f, 180.0f, 232.0f),
                    PathNode.LineTo(180.0f, 204.0f),
                    PathNode.LineTo(64.0f, 204.0f),
                    PathNode.CurveTo(57.37258f, 204.0f, 52.0f, 198.62741f, 52.0f, 192.0f),
                    PathNode.LineTo(52.0f, 76.0f),
                    PathNode.LineTo(24.0f, 76.0f),
                    PathNode.CurveTo(17.372583f, 76.0f, 12.0f, 70.62742f, 12.0f, 64.0f),
                    PathNode.CurveTo(12.0f, 57.37258f, 17.372583f, 52.0f, 24.0f, 52.0f),
                    PathNode.LineTo(52.0f, 52.0f),
                    PathNode.LineTo(52.0f, 24.0f),
                    PathNode.CurveTo(52.0f, 17.372583f, 57.37258f, 12.0f, 64.0f, 12.0f),
                    PathNode.CurveTo(70.62742f, 12.0f, 76.0f, 17.372583f, 76.0f, 24.0f),
                    PathNode.LineTo(76.0f, 180.0f),
                    PathNode.LineTo(232.0f, 180.0f),
                    PathNode.CurveTo(238.62741f, 180.0f, 244.0f, 185.37259f, 244.0f, 192.0f),
                    PathNode.Close,
                    PathNode.MoveTo(104.0f, 76.0f),
                    PathNode.LineTo(180.0f, 76.0f),
                    PathNode.LineTo(180.0f, 152.0f),
                    PathNode.CurveTo(180.0f, 158.62741f, 185.37259f, 164.0f, 192.0f, 164.0f),
                    PathNode.CurveTo(198.62741f, 164.0f, 204.0f, 158.62741f, 204.0f, 152.0f),
                    PathNode.LineTo(204.0f, 64.0f),
                    PathNode.CurveTo(204.0f, 57.37258f, 198.62741f, 52.0f, 192.0f, 52.0f),
                    PathNode.LineTo(104.0f, 52.0f),
                    PathNode.CurveTo(97.37258f, 52.0f, 92.0f, 57.37258f, 92.0f, 64.0f),
                    PathNode.CurveTo(92.0f, 70.62742f, 97.37258f, 76.0f, 104.0f, 76.0f),
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
        return _crop!!
    }

private var _crop: ImageVector? = null
