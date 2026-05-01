package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.ArrowFatLinesRight: ImageVector
    get() {
        if (_arrowFatLinesRight != null) return _arrowFatLinesRight!!
        _arrowFatLinesRight = phosphorFillIcon(
            name = "ArrowFatLinesRight",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(48.0f, 80.0f),
                    PathNode.LineTo(48.0f, 176.0f),
                    PathNode.CurveTo(48.0f, 180.41827f, 44.418278f, 184.0f, 40.0f, 184.0f),
                    PathNode.CurveTo(35.581722f, 184.0f, 32.0f, 180.41827f, 32.0f, 176.0f),
                    PathNode.LineTo(32.0f, 80.0f),
                    PathNode.CurveTo(32.0f, 75.58172f, 35.581722f, 72.0f, 40.0f, 72.0f),
                    PathNode.CurveTo(44.418278f, 72.0f, 48.0f, 75.58172f, 48.0f, 80.0f),
                    PathNode.Close,
                    PathNode.MoveTo(72.0f, 72.0f),
                    PathNode.CurveTo(67.58172f, 72.0f, 64.0f, 75.58172f, 64.0f, 80.0f),
                    PathNode.LineTo(64.0f, 176.0f),
                    PathNode.CurveTo(64.0f, 180.41827f, 67.58172f, 184.0f, 72.0f, 184.0f),
                    PathNode.CurveTo(76.41828f, 184.0f, 80.0f, 180.41827f, 80.0f, 176.0f),
                    PathNode.LineTo(80.0f, 80.0f),
                    PathNode.CurveTo(80.0f, 75.58172f, 76.41828f, 72.0f, 72.0f, 72.0f),
                    PathNode.Close,
                    PathNode.MoveTo(237.66f, 122.34f),
                    PathNode.LineTo(141.66f, 26.34f),
                    PathNode.CurveTo(139.3719f, 24.049358f, 135.92874f, 23.36368f, 132.93768f, 24.60302f),
                    PathNode.CurveTo(129.94662f, 25.842361f, 127.99745f, 28.762346f, 128.0f, 32.0f),
                    PathNode.LineTo(128.0f, 72.0f),
                    PathNode.LineTo(104.0f, 72.0f),
                    PathNode.CurveTo(99.58172f, 72.0f, 96.0f, 75.58172f, 96.0f, 80.0f),
                    PathNode.LineTo(96.0f, 176.0f),
                    PathNode.CurveTo(96.0f, 180.41827f, 99.58172f, 184.0f, 104.0f, 184.0f),
                    PathNode.LineTo(128.0f, 184.0f),
                    PathNode.LineTo(128.0f, 224.0f),
                    PathNode.CurveTo(127.99745f, 227.23764f, 129.94662f, 230.15764f, 132.93768f, 231.39697f),
                    PathNode.CurveTo(135.92874f, 232.63632f, 139.3719f, 231.95064f, 141.66f, 229.66f),
                    PathNode.LineTo(237.66f, 133.66f),
                    PathNode.CurveTo(239.16223f, 132.15945f, 240.00629f, 130.12328f, 240.00629f, 128.0f),
                    PathNode.CurveTo(240.00629f, 125.876724f, 239.16223f, 123.840546f, 237.66f, 122.34f),
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
        return _arrowFatLinesRight!!
    }

private var _arrowFatLinesRight: ImageVector? = null
