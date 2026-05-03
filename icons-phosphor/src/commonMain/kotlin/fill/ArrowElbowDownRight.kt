package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.ArrowElbowDownRight: ImageVector
    get() {
        if (_arrowElbowDownRight != null) return _arrowElbowDownRight!!
        _arrowElbowDownRight = phosphorFillIcon(
            name = "ArrowElbowDownRight",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(221.66f, 181.66f),
                    PathNode.LineTo(173.66f, 229.66f),
                    PathNode.CurveTo(171.3719f, 231.95064f, 167.92874f, 232.63632f, 164.93768f, 231.39697f),
                    PathNode.CurveTo(161.94662f, 230.15764f, 159.99745f, 227.23764f, 160.0f, 224.0f),
                    PathNode.LineTo(160.0f, 184.0f),
                    PathNode.LineTo(72.0f, 184.0f),
                    PathNode.CurveTo(67.58172f, 184.0f, 64.0f, 180.41827f, 64.0f, 176.0f),
                    PathNode.LineTo(64.0f, 32.0f),
                    PathNode.CurveTo(64.0f, 27.581722f, 67.58172f, 24.0f, 72.0f, 24.0f),
                    PathNode.CurveTo(76.41828f, 24.0f, 80.0f, 27.581722f, 80.0f, 32.0f),
                    PathNode.LineTo(80.0f, 168.0f),
                    PathNode.LineTo(160.0f, 168.0f),
                    PathNode.LineTo(160.0f, 128.0f),
                    PathNode.CurveTo(159.99745f, 124.762344f, 161.94662f, 121.84236f, 164.93768f, 120.60302f),
                    PathNode.CurveTo(167.92874f, 119.36368f, 171.3719f, 120.04936f, 173.66f, 122.34f),
                    PathNode.LineTo(221.66f, 170.34f),
                    PathNode.CurveTo(223.16223f, 171.84055f, 224.00629f, 173.87672f, 224.00629f, 176.0f),
                    PathNode.CurveTo(224.00629f, 178.12328f, 223.16223f, 180.15945f, 221.66f, 181.66f),
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
        return _arrowElbowDownRight!!
    }

private var _arrowElbowDownRight: ImageVector? = null
