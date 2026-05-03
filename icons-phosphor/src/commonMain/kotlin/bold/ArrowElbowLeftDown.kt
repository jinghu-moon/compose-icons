package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.ArrowElbowLeftDown: ImageVector
    get() {
        if (_arrowElbowLeftDown != null) return _arrowElbowLeftDown!!
        _arrowElbowLeftDown = phosphorBoldIcon(
            name = "ArrowElbowLeftDown",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(244.0f, 72.0f),
                    PathNode.CurveTo(244.0f, 78.62742f, 238.62741f, 84.0f, 232.0f, 84.0f),
                    PathNode.LineTo(100.0f, 84.0f),
                    PathNode.LineTo(100.0f, 187.0f),
                    PathNode.LineTo(127.51f, 159.48f),
                    PathNode.CurveTo(132.20442f, 154.78558f, 139.81558f, 154.78558f, 144.51f, 159.48f),
                    PathNode.CurveTo(149.20442f, 164.17442f, 149.20442f, 171.78558f, 144.51f, 176.48f),
                    PathNode.LineTo(96.51f, 224.48f),
                    PathNode.CurveTo(94.25838f, 226.73946f, 91.19982f, 228.00946f, 88.01f, 228.00946f),
                    PathNode.CurveTo(84.82018f, 228.00946f, 81.76162f, 226.73946f, 79.51f, 224.48f),
                    PathNode.LineTo(31.51f, 176.48f),
                    PathNode.CurveTo(26.81558f, 171.78558f, 26.815578f, 164.17442f, 31.51f, 159.48f),
                    PathNode.CurveTo(36.20442f, 154.78558f, 43.81558f, 154.78558f, 48.51f, 159.48f),
                    PathNode.LineTo(76.0f, 187.0f),
                    PathNode.LineTo(76.0f, 72.0f),
                    PathNode.CurveTo(76.0f, 65.37258f, 81.37258f, 60.0f, 88.0f, 60.0f),
                    PathNode.LineTo(232.0f, 60.0f),
                    PathNode.CurveTo(238.62741f, 60.0f, 244.0f, 65.37258f, 244.0f, 72.0f),
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
        return _arrowElbowLeftDown!!
    }

private var _arrowElbowLeftDown: ImageVector? = null
