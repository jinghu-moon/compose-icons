package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.ArrowElbowLeft: ImageVector
    get() {
        if (_arrowElbowLeft != null) return _arrowElbowLeft!!
        _arrowElbowLeft = phosphorFillIcon(
            name = "ArrowElbowLeft",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(237.66f, 101.66f),
                    PathNode.LineTo(141.66f, 197.66f),
                    PathNode.CurveTo(140.15945f, 199.16223f, 138.12328f, 200.00629f, 136.0f, 200.00629f),
                    PathNode.CurveTo(133.87672f, 200.00629f, 131.84055f, 199.16223f, 130.34f, 197.66f),
                    PathNode.LineTo(60.0f, 127.31f),
                    PathNode.LineTo(29.66f, 157.66f),
                    PathNode.CurveTo(27.371908f, 159.95064f, 23.92874f, 160.63632f, 20.93768f, 159.39697f),
                    PathNode.CurveTo(17.94662f, 158.15764f, 15.997452f, 155.23764f, 16.0f, 152.0f),
                    PathNode.LineTo(16.0f, 80.0f),
                    PathNode.CurveTo(16.0f, 75.58172f, 19.581722f, 72.0f, 24.0f, 72.0f),
                    PathNode.LineTo(96.0f, 72.0f),
                    PathNode.CurveTo(99.237656f, 71.99745f, 102.15764f, 73.94662f, 103.39698f, 76.937675f),
                    PathNode.CurveTo(104.63632f, 79.92874f, 103.95064f, 83.37191f, 101.66f, 85.66f),
                    PathNode.LineTo(71.31f, 116.0f),
                    PathNode.LineTo(136.0f, 180.69f),
                    PathNode.LineTo(226.34f, 90.34f),
                    PathNode.CurveTo(229.46593f, 87.214066f, 234.53407f, 87.214066f, 237.66f, 90.34f),
                    PathNode.CurveTo(240.78593f, 93.465935f, 240.78593f, 98.534065f, 237.66f, 101.66f),
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
        return _arrowElbowLeft!!
    }

private var _arrowElbowLeft: ImageVector? = null
