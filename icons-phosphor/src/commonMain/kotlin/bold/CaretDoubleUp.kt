package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.CaretDoubleUp: ImageVector
    get() {
        if (_caretDoubleUp != null) return _caretDoubleUp!!
        _caretDoubleUp = phosphorBoldIcon(
            name = "CaretDoubleUp",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(216.49f, 191.51f),
                    PathNode.CurveTo(221.18442f, 196.20442f, 221.18442f, 203.81558f, 216.49f, 208.51f),
                    PathNode.CurveTo(211.79558f, 213.20442f, 204.18442f, 213.20442f, 199.49f, 208.51f),
                    PathNode.LineTo(128.0f, 137.0f),
                    PathNode.LineTo(56.49f, 208.49f),
                    PathNode.CurveTo(51.79558f, 213.18442f, 44.18442f, 213.18442f, 39.49f, 208.49f),
                    PathNode.CurveTo(34.79558f, 203.79558f, 34.79558f, 196.18442f, 39.49f, 191.49f),
                    PathNode.LineTo(119.49f, 111.49f),
                    PathNode.CurveTo(121.74162f, 109.230545f, 124.80018f, 107.96054f, 127.99f, 107.96054f),
                    PathNode.CurveTo(131.17982f, 107.96054f, 134.23837f, 109.230545f, 136.49f, 111.49f),
                    PathNode.Close,
                    PathNode.MoveTo(56.49f, 128.51f),
                    PathNode.LineTo(128.0f, 57.0f),
                    PathNode.LineTo(199.51f, 128.52f),
                    PathNode.CurveTo(204.20442f, 133.21442f, 211.81558f, 133.21442f, 216.51f, 128.52f),
                    PathNode.CurveTo(221.20442f, 123.82558f, 221.20442f, 116.214424f, 216.51f, 111.52f),
                    PathNode.LineTo(136.51f, 31.52f),
                    PathNode.CurveTo(134.25838f, 29.260546f, 131.19981f, 27.990538f, 128.01f, 27.990538f),
                    PathNode.CurveTo(124.82018f, 27.990538f, 121.76162f, 29.260546f, 119.51f, 31.52f),
                    PathNode.LineTo(39.51f, 111.52f),
                    PathNode.CurveTo(34.81558f, 116.214424f, 34.81558f, 123.82558f, 39.51f, 128.52f),
                    PathNode.CurveTo(44.20442f, 133.21442f, 51.81558f, 133.21442f, 56.51f, 128.52f),
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
        return _caretDoubleUp!!
    }

private var _caretDoubleUp: ImageVector? = null
