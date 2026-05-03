package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.CaretDoubleLeft: ImageVector
    get() {
        if (_caretDoubleLeft != null) return _caretDoubleLeft!!
        _caretDoubleLeft = phosphorBoldIcon(
            name = "CaretDoubleLeft",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(208.49f, 199.51f),
                    PathNode.CurveTo(213.18442f, 204.20442f, 213.18442f, 211.81558f, 208.49f, 216.51f),
                    PathNode.CurveTo(203.79558f, 221.20442f, 196.18442f, 221.20442f, 191.49f, 216.51f),
                    PathNode.LineTo(111.49f, 136.51f),
                    PathNode.CurveTo(109.230545f, 134.25838f, 107.96054f, 131.19981f, 107.96054f, 128.01f),
                    PathNode.CurveTo(107.96054f, 124.82018f, 109.230545f, 121.76162f, 111.49f, 119.51f),
                    PathNode.LineTo(191.49f, 39.51f),
                    PathNode.CurveTo(196.18442f, 34.81558f, 203.79558f, 34.81558f, 208.49f, 39.51f),
                    PathNode.CurveTo(213.18442f, 44.20442f, 213.18442f, 51.81558f, 208.49f, 56.51f),
                    PathNode.LineTo(137.0f, 128.0f),
                    PathNode.Close,
                    PathNode.MoveTo(57.0f, 128.0f),
                    PathNode.LineTo(128.52f, 56.49f),
                    PathNode.CurveTo(133.21442f, 51.79558f, 133.21442f, 44.18442f, 128.52f, 39.49f),
                    PathNode.CurveTo(123.82558f, 34.79558f, 116.214424f, 34.79558f, 111.52f, 39.49f),
                    PathNode.LineTo(31.52f, 119.49f),
                    PathNode.CurveTo(29.260546f, 121.74162f, 27.990538f, 124.80018f, 27.990538f, 127.99f),
                    PathNode.CurveTo(27.990538f, 131.17982f, 29.260546f, 134.23837f, 31.52f, 136.49f),
                    PathNode.LineTo(111.52f, 216.49f),
                    PathNode.CurveTo(116.214424f, 221.18442f, 123.82558f, 221.18442f, 128.52f, 216.49f),
                    PathNode.CurveTo(133.21442f, 211.79558f, 133.21442f, 204.18442f, 128.52f, 199.49f),
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
        return _caretDoubleLeft!!
    }

private var _caretDoubleLeft: ImageVector? = null
