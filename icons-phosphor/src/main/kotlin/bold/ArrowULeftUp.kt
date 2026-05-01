package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.ArrowULeftUp: ImageVector
    get() {
        if (_arrowULeftUp != null) return _arrowULeftUp!!
        _arrowULeftUp = phosphorBoldIcon(
            name = "ArrowULeftUp",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(212.0f, 80.0f),
                    PathNode.LineTo(212.0f, 168.0f),
                    PathNode.CurveTo(212.0f, 205.55536f, 181.55536f, 236.0f, 144.0f, 236.0f),
                    PathNode.CurveTo(106.44463f, 236.0f, 76.0f, 205.55536f, 76.0f, 168.0f),
                    PathNode.LineTo(76.0f, 61.0f),
                    PathNode.LineTo(48.49f, 88.49f),
                    PathNode.CurveTo(43.79558f, 93.18442f, 36.18442f, 93.18442f, 31.49f, 88.49f),
                    PathNode.CurveTo(26.79558f, 83.79558f, 26.79558f, 76.18442f, 31.49f, 71.49f),
                    PathNode.LineTo(79.49f, 23.49f),
                    PathNode.CurveTo(81.74162f, 21.230547f, 84.80018f, 19.960535f, 87.99f, 19.960535f),
                    PathNode.CurveTo(91.17982f, 19.960535f, 94.23838f, 21.230547f, 96.49f, 23.49f),
                    PathNode.LineTo(144.49f, 71.49f),
                    PathNode.CurveTo(149.18442f, 76.18442f, 149.18442f, 83.79558f, 144.49f, 88.49f),
                    PathNode.CurveTo(139.79558f, 93.18442f, 132.18442f, 93.18442f, 127.49f, 88.49f),
                    PathNode.LineTo(100.0f, 61.0f),
                    PathNode.LineTo(100.0f, 168.0f),
                    PathNode.CurveTo(100.0f, 192.30052f, 119.69947f, 212.0f, 144.0f, 212.0f),
                    PathNode.CurveTo(168.30052f, 212.0f, 188.0f, 192.30052f, 188.0f, 168.0f),
                    PathNode.LineTo(188.0f, 80.0f),
                    PathNode.CurveTo(188.0f, 73.37258f, 193.37259f, 68.0f, 200.0f, 68.0f),
                    PathNode.CurveTo(206.62741f, 68.0f, 212.0f, 73.37258f, 212.0f, 80.0f),
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
        return _arrowULeftUp!!
    }

private var _arrowULeftUp: ImageVector? = null
