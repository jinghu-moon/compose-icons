package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.CaretDown: ImageVector
    get() {
        if (_caretDown != null) return _caretDown!!
        _caretDown = phosphorFillIcon(
            name = "CaretDown",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(213.66f, 101.66f),
                    PathNode.LineTo(133.66f, 181.66f),
                    PathNode.CurveTo(132.15945f, 183.16223f, 130.12328f, 184.00629f, 128.0f, 184.00629f),
                    PathNode.CurveTo(125.876724f, 184.00629f, 123.840546f, 183.16223f, 122.34f, 181.66f),
                    PathNode.LineTo(42.34f, 101.66f),
                    PathNode.CurveTo(40.04936f, 99.37191f, 39.363674f, 95.92874f, 40.60302f, 92.937675f),
                    PathNode.CurveTo(41.84236f, 89.94662f, 44.76235f, 87.99745f, 48.0f, 88.0f),
                    PathNode.LineTo(208.0f, 88.0f),
                    PathNode.CurveTo(211.23764f, 87.99745f, 214.15764f, 89.94662f, 215.39697f, 92.937675f),
                    PathNode.CurveTo(216.63632f, 95.92874f, 215.95064f, 99.37191f, 213.66f, 101.66f),
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
        return _caretDown!!
    }

private var _caretDown: ImageVector? = null
