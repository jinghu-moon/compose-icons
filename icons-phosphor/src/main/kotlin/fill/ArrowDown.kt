package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.ArrowDown: ImageVector
    get() {
        if (_arrowDown != null) return _arrowDown!!
        _arrowDown = phosphorFillIcon(
            name = "ArrowDown",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(205.66f, 149.66f),
                    PathNode.LineTo(133.66f, 221.66f),
                    PathNode.CurveTo(132.15945f, 223.16223f, 130.12328f, 224.00629f, 128.0f, 224.00629f),
                    PathNode.CurveTo(125.876724f, 224.00629f, 123.840546f, 223.16223f, 122.34f, 221.66f),
                    PathNode.LineTo(50.34f, 149.66f),
                    PathNode.CurveTo(48.04936f, 147.3719f, 47.363674f, 143.92874f, 48.60302f, 140.93768f),
                    PathNode.CurveTo(49.84236f, 137.94662f, 52.76235f, 135.99745f, 56.0f, 136.0f),
                    PathNode.LineTo(120.0f, 136.0f),
                    PathNode.LineTo(120.0f, 40.0f),
                    PathNode.CurveTo(120.0f, 35.581722f, 123.58172f, 32.0f, 128.0f, 32.0f),
                    PathNode.CurveTo(132.41827f, 32.0f, 136.0f, 35.581722f, 136.0f, 40.0f),
                    PathNode.LineTo(136.0f, 136.0f),
                    PathNode.LineTo(200.0f, 136.0f),
                    PathNode.CurveTo(203.23764f, 135.99745f, 206.15764f, 137.94662f, 207.39697f, 140.93768f),
                    PathNode.CurveTo(208.63632f, 143.92874f, 207.95064f, 147.3719f, 205.66f, 149.66f),
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
        return _arrowDown!!
    }

private var _arrowDown: ImageVector? = null
