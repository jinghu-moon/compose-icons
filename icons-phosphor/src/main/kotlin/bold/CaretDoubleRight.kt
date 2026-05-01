package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.CaretDoubleRight: ImageVector
    get() {
        if (_caretDoubleRight != null) return _caretDoubleRight!!
        _caretDoubleRight = phosphorBoldIcon(
            name = "CaretDoubleRight",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(144.49f, 136.49f),
                    PathNode.LineTo(64.49f, 216.49f),
                    PathNode.CurveTo(59.79558f, 221.18442f, 52.18442f, 221.18442f, 47.49f, 216.49f),
                    PathNode.CurveTo(42.79558f, 211.79558f, 42.79558f, 204.18442f, 47.49f, 199.49f),
                    PathNode.LineTo(119.0f, 128.0f),
                    PathNode.LineTo(47.51f, 56.49f),
                    PathNode.CurveTo(42.81558f, 51.79558f, 42.81558f, 44.18442f, 47.51f, 39.49f),
                    PathNode.CurveTo(52.20442f, 34.79558f, 59.81558f, 34.79558f, 64.51f, 39.49f),
                    PathNode.LineTo(144.51f, 119.49f),
                    PathNode.CurveTo(146.7668f, 121.74428f, 148.03322f, 124.80434f, 148.02946f, 127.99415f),
                    PathNode.CurveTo(148.02571f, 131.18398f, 146.7521f, 134.24104f, 144.49f, 136.49f),
                    PathNode.Close,
                    PathNode.MoveTo(224.49f, 119.49f),
                    PathNode.LineTo(144.49f, 39.49f),
                    PathNode.CurveTo(139.79558f, 34.79558f, 132.18442f, 34.79558f, 127.49f, 39.49f),
                    PathNode.CurveTo(122.79558f, 44.18442f, 122.79558f, 51.79558f, 127.49f, 56.49f),
                    PathNode.LineTo(199.0f, 128.0f),
                    PathNode.LineTo(127.48f, 199.51f),
                    PathNode.CurveTo(122.78558f, 204.20442f, 122.78558f, 211.81558f, 127.48f, 216.51f),
                    PathNode.CurveTo(132.17442f, 221.20442f, 139.78558f, 221.20442f, 144.48f, 216.51f),
                    PathNode.LineTo(224.48f, 136.51f),
                    PathNode.CurveTo(226.74078f, 134.2597f, 228.01259f, 131.20189f, 228.01447f, 128.01207f),
                    PathNode.CurveTo(228.01634f, 124.82226f, 226.74812f, 121.762955f, 224.49f, 119.51f),
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
        return _caretDoubleRight!!
    }

private var _caretDoubleRight: ImageVector? = null
