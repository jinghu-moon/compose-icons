package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.CaretDoubleDown: ImageVector
    get() {
        if (_caretDoubleDown != null) return _caretDoubleDown!!
        _caretDoubleDown = phosphorFillIcon(
            name = "CaretDoubleDown",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(215.39f, 132.94f),
                    PathNode.CurveTo(216.63007f, 135.92903f, 215.94725f, 139.37076f, 213.66f, 141.66f),
                    PathNode.LineTo(133.66f, 221.66f),
                    PathNode.CurveTo(132.15945f, 223.16223f, 130.12328f, 224.00629f, 128.0f, 224.00629f),
                    PathNode.CurveTo(125.876724f, 224.00629f, 123.840546f, 223.16223f, 122.34f, 221.66f),
                    PathNode.LineTo(42.34f, 141.66f),
                    PathNode.CurveTo(40.04936f, 139.3719f, 39.363674f, 135.92874f, 40.60302f, 132.93768f),
                    PathNode.CurveTo(41.84236f, 129.94662f, 44.76235f, 127.99745f, 48.0f, 128.0f),
                    PathNode.LineTo(108.69f, 128.0f),
                    PathNode.LineTo(42.34f, 61.66f),
                    PathNode.CurveTo(40.04936f, 59.371906f, 39.363674f, 55.928738f, 40.60302f, 52.93768f),
                    PathNode.CurveTo(41.84236f, 49.94662f, 44.76235f, 47.99745f, 48.0f, 48.0f),
                    PathNode.LineTo(208.0f, 48.0f),
                    PathNode.CurveTo(211.23764f, 47.99745f, 214.15764f, 49.94662f, 215.39697f, 52.93768f),
                    PathNode.CurveTo(216.63632f, 55.928738f, 215.95064f, 59.371906f, 213.66f, 61.66f),
                    PathNode.LineTo(147.31f, 128.0f),
                    PathNode.LineTo(208.0f, 128.0f),
                    PathNode.CurveTo(211.23566f, 128.00067f, 214.15236f, 129.95038f, 215.39f, 132.94f),
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
        return _caretDoubleDown!!
    }

private var _caretDoubleDown: ImageVector? = null
