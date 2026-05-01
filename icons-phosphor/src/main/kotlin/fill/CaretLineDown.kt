package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.CaretLineDown: ImageVector
    get() {
        if (_caretLineDown != null) return _caretLineDown!!
        _caretLineDown = phosphorFillIcon(
            name = "CaretLineDown",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(42.34f, 77.66f),
                    PathNode.CurveTo(40.04936f, 75.37191f, 39.363674f, 71.92874f, 40.60302f, 68.937675f),
                    PathNode.CurveTo(41.84236f, 65.94662f, 44.76235f, 63.99745f, 48.0f, 64.0f),
                    PathNode.LineTo(208.0f, 64.0f),
                    PathNode.CurveTo(211.23764f, 63.99745f, 214.15764f, 65.94662f, 215.39697f, 68.937675f),
                    PathNode.CurveTo(216.63632f, 71.92874f, 215.95064f, 75.37191f, 213.66f, 77.66f),
                    PathNode.LineTo(133.66f, 157.66f),
                    PathNode.CurveTo(132.15945f, 159.16223f, 130.12328f, 160.00629f, 128.0f, 160.00629f),
                    PathNode.CurveTo(125.876724f, 160.00629f, 123.840546f, 159.16223f, 122.34f, 157.66f),
                    PathNode.Close,
                    PathNode.MoveTo(208.0f, 184.0f),
                    PathNode.LineTo(48.0f, 184.0f),
                    PathNode.CurveTo(43.581722f, 184.0f, 40.0f, 187.58173f, 40.0f, 192.0f),
                    PathNode.CurveTo(40.0f, 196.41827f, 43.581722f, 200.0f, 48.0f, 200.0f),
                    PathNode.LineTo(208.0f, 200.0f),
                    PathNode.CurveTo(212.41827f, 200.0f, 216.0f, 196.41827f, 216.0f, 192.0f),
                    PathNode.CurveTo(216.0f, 187.58173f, 212.41827f, 184.0f, 208.0f, 184.0f),
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
        return _caretLineDown!!
    }

private var _caretLineDown: ImageVector? = null
