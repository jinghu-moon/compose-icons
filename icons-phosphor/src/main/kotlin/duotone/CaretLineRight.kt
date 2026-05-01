package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.CaretLineRight: ImageVector
    get() {
        if (_caretLineRight != null) return _caretLineRight!!
        _caretLineRight = phosphorDuotoneIcon(
            name = "CaretLineRight",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(144.0f, 128.0f),
                    PathNode.LineTo(64.0f, 208.0f),
                    PathNode.LineTo(64.0f, 48.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 16.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(69.66f, 42.34f),
                    PathNode.CurveTo(67.37191f, 40.04936f, 63.928738f, 39.363674f, 60.93768f, 40.60302f),
                    PathNode.CurveTo(57.94662f, 41.84236f, 55.99745f, 44.76235f, 56.0f, 48.0f),
                    PathNode.LineTo(56.0f, 208.0f),
                    PathNode.CurveTo(55.99745f, 211.23764f, 57.94662f, 214.15764f, 60.93768f, 215.39697f),
                    PathNode.CurveTo(63.928738f, 216.63632f, 67.37191f, 215.95064f, 69.66f, 213.66f),
                    PathNode.LineTo(149.66f, 133.66f),
                    PathNode.CurveTo(151.16223f, 132.15945f, 152.00629f, 130.12328f, 152.00629f, 128.0f),
                    PathNode.CurveTo(152.00629f, 125.876724f, 151.16223f, 123.840546f, 149.66f, 122.34f),
                    PathNode.Close,
                    PathNode.MoveTo(72.0f, 188.69f),
                    PathNode.LineTo(72.0f, 67.31f),
                    PathNode.LineTo(132.69f, 128.0f),
                    PathNode.Close,
                    PathNode.MoveTo(192.0f, 48.0f),
                    PathNode.LineTo(192.0f, 208.0f),
                    PathNode.CurveTo(192.0f, 212.41827f, 188.41827f, 216.0f, 184.0f, 216.0f),
                    PathNode.CurveTo(179.58173f, 216.0f, 176.0f, 212.41827f, 176.0f, 208.0f),
                    PathNode.LineTo(176.0f, 48.0f),
                    PathNode.CurveTo(176.0f, 43.581722f, 179.58173f, 40.0f, 184.0f, 40.0f),
                    PathNode.CurveTo(188.41827f, 40.0f, 192.0f, 43.581722f, 192.0f, 48.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 16.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _caretLineRight!!
    }

private var _caretLineRight: ImageVector? = null
