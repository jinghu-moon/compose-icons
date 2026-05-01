package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.CaretDoubleRight: ImageVector
    get() {
        if (_caretDoubleRight != null) return _caretDoubleRight!!
        _caretDoubleRight = phosphorDuotoneIcon(
            name = "CaretDoubleRight",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(136.0f, 128.0f),
                    PathNode.LineTo(56.0f, 208.0f),
                    PathNode.LineTo(56.0f, 48.0f),
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
                    PathNode.MoveTo(141.66f, 122.34f),
                    PathNode.LineTo(61.66f, 42.34f),
                    PathNode.CurveTo(59.371906f, 40.04936f, 55.928738f, 39.363674f, 52.93768f, 40.60302f),
                    PathNode.CurveTo(49.94662f, 41.84236f, 47.99745f, 44.76235f, 48.0f, 48.0f),
                    PathNode.LineTo(48.0f, 208.0f),
                    PathNode.CurveTo(47.99745f, 211.23764f, 49.94662f, 214.15764f, 52.93768f, 215.39697f),
                    PathNode.CurveTo(55.928738f, 216.63632f, 59.371906f, 215.95064f, 61.66f, 213.66f),
                    PathNode.LineTo(141.66f, 133.66f),
                    PathNode.CurveTo(143.16223f, 132.15945f, 144.00629f, 130.12328f, 144.00629f, 128.0f),
                    PathNode.CurveTo(144.00629f, 125.876724f, 143.16223f, 123.840546f, 141.66f, 122.34f),
                    PathNode.Close,
                    PathNode.MoveTo(64.0f, 188.69f),
                    PathNode.LineTo(64.0f, 67.31f),
                    PathNode.LineTo(124.69f, 128.0f),
                    PathNode.Close,
                    PathNode.MoveTo(221.66f, 133.69f),
                    PathNode.LineTo(141.66f, 213.69f),
                    PathNode.CurveTo(138.53407f, 216.81593f, 133.46593f, 216.81593f, 130.34f, 213.69f),
                    PathNode.CurveTo(127.214066f, 210.56406f, 127.214066f, 205.49593f, 130.34f, 202.37f),
                    PathNode.LineTo(204.69f, 128.0f),
                    PathNode.LineTo(130.34f, 53.66f),
                    PathNode.CurveTo(127.214066f, 50.53407f, 127.214066f, 45.46593f, 130.34f, 42.34f),
                    PathNode.CurveTo(133.46593f, 39.21407f, 138.53407f, 39.21407f, 141.66f, 42.34f),
                    PathNode.LineTo(221.66f, 122.34f),
                    PathNode.CurveTo(223.16223f, 123.840546f, 224.00629f, 125.876724f, 224.00629f, 128.0f),
                    PathNode.CurveTo(224.00629f, 130.12328f, 223.16223f, 132.15945f, 221.66f, 133.66f),
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
        return _caretDoubleRight!!
    }

private var _caretDoubleRight: ImageVector? = null
