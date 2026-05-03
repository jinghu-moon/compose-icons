package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.CaretLineRight: ImageVector
    get() {
        if (_caretLineRight != null) return _caretLineRight!!
        _caretLineRight = phosphorBoldIcon(
            name = "CaretLineRight",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(152.49f, 119.51f),
                    PathNode.CurveTo(154.74945f, 121.76162f, 156.01947f, 124.82018f, 156.01947f, 128.01f),
                    PathNode.CurveTo(156.01947f, 131.19981f, 154.74945f, 134.25838f, 152.49f, 136.51f),
                    PathNode.LineTo(72.49f, 216.51f),
                    PathNode.CurveTo(67.79558f, 221.20442f, 60.18442f, 221.20442f, 55.49f, 216.51f),
                    PathNode.CurveTo(50.79558f, 211.81558f, 50.79558f, 204.20442f, 55.49f, 199.51f),
                    PathNode.LineTo(127.0f, 128.0f),
                    PathNode.LineTo(55.51f, 56.49f),
                    PathNode.CurveTo(50.81558f, 51.79558f, 50.81558f, 44.18442f, 55.51f, 39.49f),
                    PathNode.CurveTo(60.20442f, 34.79558f, 67.81558f, 34.79558f, 72.51f, 39.49f),
                    PathNode.Close,
                    PathNode.MoveTo(184.0f, 36.0f),
                    PathNode.CurveTo(177.37259f, 36.0f, 172.0f, 41.37258f, 172.0f, 48.0f),
                    PathNode.LineTo(172.0f, 208.0f),
                    PathNode.CurveTo(172.0f, 214.62741f, 177.37259f, 220.0f, 184.0f, 220.0f),
                    PathNode.CurveTo(190.62741f, 220.0f, 196.0f, 214.62741f, 196.0f, 208.0f),
                    PathNode.LineTo(196.0f, 48.0f),
                    PathNode.CurveTo(196.0f, 41.37258f, 190.62741f, 36.0f, 184.0f, 36.0f),
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
        return _caretLineRight!!
    }

private var _caretLineRight: ImageVector? = null
