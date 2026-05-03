package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.ArrowElbowLeftUp: ImageVector
    get() {
        if (_arrowElbowLeftUp != null) return _arrowElbowLeftUp!!
        _arrowElbowLeftUp = phosphorBoldIcon(
            name = "ArrowElbowLeftUp",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(244.0f, 192.0f),
                    PathNode.CurveTo(244.0f, 198.62741f, 238.62741f, 204.0f, 232.0f, 204.0f),
                    PathNode.LineTo(88.0f, 204.0f),
                    PathNode.CurveTo(81.37258f, 204.0f, 76.0f, 198.62741f, 76.0f, 192.0f),
                    PathNode.LineTo(76.0f, 77.0f),
                    PathNode.LineTo(48.49f, 104.49f),
                    PathNode.CurveTo(43.79558f, 109.18442f, 36.18442f, 109.18442f, 31.49f, 104.49f),
                    PathNode.CurveTo(26.79558f, 99.79558f, 26.79558f, 92.18442f, 31.49f, 87.49f),
                    PathNode.LineTo(79.49f, 39.49f),
                    PathNode.CurveTo(81.74162f, 37.230545f, 84.80018f, 35.960537f, 87.99f, 35.960537f),
                    PathNode.CurveTo(91.17982f, 35.960537f, 94.23838f, 37.230545f, 96.49f, 39.49f),
                    PathNode.LineTo(144.49f, 87.49f),
                    PathNode.CurveTo(149.18442f, 92.18442f, 149.18442f, 99.79558f, 144.49f, 104.49f),
                    PathNode.CurveTo(139.79558f, 109.18442f, 132.18442f, 109.18442f, 127.49f, 104.49f),
                    PathNode.LineTo(100.0f, 77.0f),
                    PathNode.LineTo(100.0f, 180.0f),
                    PathNode.LineTo(232.0f, 180.0f),
                    PathNode.CurveTo(238.62741f, 180.0f, 244.0f, 185.37259f, 244.0f, 192.0f),
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
        return _arrowElbowLeftUp!!
    }

private var _arrowElbowLeftUp: ImageVector? = null
