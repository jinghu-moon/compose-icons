package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.CaretLineRight: ImageVector
    get() {
        if (_caretLineRight != null) return _caretLineRight!!
        _caretLineRight = phosphorFillIcon(
            name = "CaretLineRight",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(149.66f, 122.34f),
                    PathNode.CurveTo(151.16223f, 123.840546f, 152.00629f, 125.876724f, 152.00629f, 128.0f),
                    PathNode.CurveTo(152.00629f, 130.12328f, 151.16223f, 132.15945f, 149.66f, 133.66f),
                    PathNode.LineTo(69.66f, 213.66f),
                    PathNode.CurveTo(67.37191f, 215.95064f, 63.928738f, 216.63632f, 60.93768f, 215.39697f),
                    PathNode.CurveTo(57.94662f, 214.15764f, 55.99745f, 211.23764f, 56.0f, 208.0f),
                    PathNode.LineTo(56.0f, 48.0f),
                    PathNode.CurveTo(55.99745f, 44.76235f, 57.94662f, 41.84236f, 60.93768f, 40.60302f),
                    PathNode.CurveTo(63.928738f, 39.363674f, 67.37191f, 40.04936f, 69.66f, 42.34f),
                    PathNode.Close,
                    PathNode.MoveTo(184.0f, 40.0f),
                    PathNode.CurveTo(179.58173f, 40.0f, 176.0f, 43.581722f, 176.0f, 48.0f),
                    PathNode.LineTo(176.0f, 208.0f),
                    PathNode.CurveTo(176.0f, 212.41827f, 179.58173f, 216.0f, 184.0f, 216.0f),
                    PathNode.CurveTo(188.41827f, 216.0f, 192.0f, 212.41827f, 192.0f, 208.0f),
                    PathNode.LineTo(192.0f, 48.0f),
                    PathNode.CurveTo(192.0f, 43.581722f, 188.41827f, 40.0f, 184.0f, 40.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 4f,
            )
        }
        return _caretLineRight!!
    }

private var _caretLineRight: ImageVector? = null
