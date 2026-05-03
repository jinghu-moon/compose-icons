package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.CaretRight: ImageVector
    get() {
        if (_caretRight != null) return _caretRight!!
        _caretRight = phosphorFillIcon(
            name = "CaretRight",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(181.66f, 133.66f),
                    PathNode.LineTo(101.66f, 213.66f),
                    PathNode.CurveTo(99.37191f, 215.95064f, 95.92874f, 216.63632f, 92.937675f, 215.39697f),
                    PathNode.CurveTo(89.94662f, 214.15764f, 87.99745f, 211.23764f, 88.0f, 208.0f),
                    PathNode.LineTo(88.0f, 48.0f),
                    PathNode.CurveTo(87.99745f, 44.76235f, 89.94662f, 41.84236f, 92.937675f, 40.60302f),
                    PathNode.CurveTo(95.92874f, 39.363674f, 99.37191f, 40.04936f, 101.66f, 42.34f),
                    PathNode.LineTo(181.66f, 122.34f),
                    PathNode.CurveTo(183.16223f, 123.840546f, 184.00629f, 125.876724f, 184.00629f, 128.0f),
                    PathNode.CurveTo(184.00629f, 130.12328f, 183.16223f, 132.15945f, 181.66f, 133.66f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 4f,
            )
        }
        return _caretRight!!
    }

private var _caretRight: ImageVector? = null
