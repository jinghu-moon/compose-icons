package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.CaretDoubleRight: ImageVector
    get() {
        if (_caretDoubleRight != null) return _caretDoubleRight!!
        _caretDoubleRight = phosphorFillIcon(
            name = "CaretDoubleRight",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(221.66f, 133.66f),
                    PathNode.LineTo(141.66f, 213.66f),
                    PathNode.CurveTo(139.3719f, 215.95064f, 135.92874f, 216.63632f, 132.93768f, 215.39697f),
                    PathNode.CurveTo(129.94662f, 214.15764f, 127.99745f, 211.23764f, 128.0f, 208.0f),
                    PathNode.LineTo(128.0f, 147.31f),
                    PathNode.LineTo(61.66f, 213.66f),
                    PathNode.CurveTo(59.371906f, 215.95064f, 55.928738f, 216.63632f, 52.93768f, 215.39697f),
                    PathNode.CurveTo(49.94662f, 214.15764f, 47.99745f, 211.23764f, 48.0f, 208.0f),
                    PathNode.LineTo(48.0f, 48.0f),
                    PathNode.CurveTo(47.99745f, 44.76235f, 49.94662f, 41.84236f, 52.93768f, 40.60302f),
                    PathNode.CurveTo(55.928738f, 39.363674f, 59.371906f, 40.04936f, 61.66f, 42.34f),
                    PathNode.LineTo(128.0f, 108.69f),
                    PathNode.LineTo(128.0f, 48.0f),
                    PathNode.CurveTo(127.99745f, 44.76235f, 129.94662f, 41.84236f, 132.93768f, 40.60302f),
                    PathNode.CurveTo(135.92874f, 39.363674f, 139.3719f, 40.04936f, 141.66f, 42.34f),
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
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 4f,
            )
        }
        return _caretDoubleRight!!
    }

private var _caretDoubleRight: ImageVector? = null
