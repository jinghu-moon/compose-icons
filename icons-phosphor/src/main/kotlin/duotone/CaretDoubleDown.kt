package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.CaretDoubleDown: ImageVector
    get() {
        if (_caretDoubleDown != null) return _caretDoubleDown!!
        _caretDoubleDown = phosphorDuotoneIcon(
            name = "CaretDoubleDown",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(208.0f, 56.0f),
                    PathNode.LineTo(128.0f, 136.0f),
                    PathNode.LineTo(48.0f, 56.0f),
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
                    PathNode.MoveTo(213.66f, 141.66f),
                    PathNode.LineTo(133.66f, 221.66f),
                    PathNode.CurveTo(132.15945f, 223.16223f, 130.12328f, 224.00629f, 128.0f, 224.00629f),
                    PathNode.CurveTo(125.876724f, 224.00629f, 123.840546f, 223.16223f, 122.34f, 221.66f),
                    PathNode.LineTo(42.34f, 141.66f),
                    PathNode.CurveTo(39.21407f, 138.53407f, 39.21407f, 133.46593f, 42.34f, 130.34f),
                    PathNode.CurveTo(45.46593f, 127.214066f, 50.53407f, 127.214066f, 53.66f, 130.34f),
                    PathNode.LineTo(128.0f, 204.69f),
                    PathNode.LineTo(202.34f, 130.34f),
                    PathNode.CurveTo(205.46593f, 127.214066f, 210.53407f, 127.214066f, 213.66f, 130.34f),
                    PathNode.CurveTo(216.78593f, 133.46593f, 216.78593f, 138.53407f, 213.66f, 141.66f),
                    PathNode.Close,
                    PathNode.MoveTo(42.34f, 61.66f),
                    PathNode.CurveTo(40.04936f, 59.371906f, 39.363674f, 55.928738f, 40.60302f, 52.93768f),
                    PathNode.CurveTo(41.84236f, 49.94662f, 44.76235f, 47.99745f, 48.0f, 48.0f),
                    PathNode.LineTo(208.0f, 48.0f),
                    PathNode.CurveTo(211.23764f, 47.99745f, 214.15764f, 49.94662f, 215.39697f, 52.93768f),
                    PathNode.CurveTo(216.63632f, 55.928738f, 215.95064f, 59.371906f, 213.66f, 61.66f),
                    PathNode.LineTo(133.66f, 141.66f),
                    PathNode.CurveTo(132.15945f, 143.16223f, 130.12328f, 144.00629f, 128.0f, 144.00629f),
                    PathNode.CurveTo(125.876724f, 144.00629f, 123.840546f, 143.16223f, 122.34f, 141.66f),
                    PathNode.Close,
                    PathNode.MoveTo(67.34f, 64.0f),
                    PathNode.LineTo(128.0f, 124.69f),
                    PathNode.LineTo(188.69f, 64.0f),
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
        return _caretDoubleDown!!
    }

private var _caretDoubleDown: ImageVector? = null
