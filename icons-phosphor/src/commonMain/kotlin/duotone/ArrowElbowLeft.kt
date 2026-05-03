package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.ArrowElbowLeft: ImageVector
    get() {
        if (_arrowElbowLeft != null) return _arrowElbowLeft!!
        _arrowElbowLeft = phosphorDuotoneIcon(
            name = "ArrowElbowLeft",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(96.0f, 80.0f),
                    PathNode.LineTo(24.0f, 152.0f),
                    PathNode.LineTo(24.0f, 80.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 0.2f,
                stroke = null,
                strokeAlpha = 0.2f,
                strokeLineWidth = 16.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(237.66f, 90.34f),
                    PathNode.CurveTo(236.15945f, 88.83778f, 234.12328f, 87.993706f, 232.0f, 87.993706f),
                    PathNode.CurveTo(229.87672f, 87.993706f, 227.84055f, 88.83778f, 226.34f, 90.34f),
                    PathNode.LineTo(136.0f, 180.69f),
                    PathNode.LineTo(71.31f, 116.0f),
                    PathNode.LineTo(101.66f, 85.66f),
                    PathNode.CurveTo(103.95064f, 83.37191f, 104.63632f, 79.92874f, 103.39698f, 76.937675f),
                    PathNode.CurveTo(102.15764f, 73.94662f, 99.237656f, 71.99745f, 96.0f, 72.0f),
                    PathNode.LineTo(24.0f, 72.0f),
                    PathNode.CurveTo(19.581722f, 72.0f, 16.0f, 75.58172f, 16.0f, 80.0f),
                    PathNode.LineTo(16.0f, 152.0f),
                    PathNode.CurveTo(15.997452f, 155.23764f, 17.94662f, 158.15764f, 20.93768f, 159.39697f),
                    PathNode.CurveTo(23.92874f, 160.63632f, 27.371908f, 159.95064f, 29.66f, 157.66f),
                    PathNode.LineTo(60.0f, 127.31f),
                    PathNode.LineTo(130.34f, 197.66f),
                    PathNode.CurveTo(131.84055f, 199.16223f, 133.87672f, 200.00629f, 136.0f, 200.00629f),
                    PathNode.CurveTo(138.12328f, 200.00629f, 140.15945f, 199.16223f, 141.66f, 197.66f),
                    PathNode.LineTo(237.66f, 101.66f),
                    PathNode.CurveTo(239.16223f, 100.159454f, 240.00629f, 98.123276f, 240.00629f, 96.0f),
                    PathNode.CurveTo(240.00629f, 93.876724f, 239.16223f, 91.840546f, 237.66f, 90.34f),
                    PathNode.Close,
                    PathNode.MoveTo(32.0f, 132.69f),
                    PathNode.LineTo(32.0f, 88.0f),
                    PathNode.LineTo(76.69f, 88.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 16.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _arrowElbowLeft!!
    }

private var _arrowElbowLeft: ImageVector? = null
