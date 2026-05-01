package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.ArrowBendRightDown: ImageVector
    get() {
        if (_arrowBendRightDown != null) return _arrowBendRightDown!!
        _arrowBendRightDown = phosphorFillIcon(
            name = "ArrowBendRightDown",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(205.66f, 181.66f),
                    PathNode.LineTo(157.66f, 229.66f),
                    PathNode.CurveTo(156.15945f, 231.16223f, 154.12328f, 232.00629f, 152.0f, 232.00629f),
                    PathNode.CurveTo(149.87672f, 232.00629f, 147.84055f, 231.16223f, 146.34f, 229.66f),
                    PathNode.LineTo(98.34f, 181.66f),
                    PathNode.CurveTo(96.04936f, 179.3719f, 95.36368f, 175.92874f, 96.60302f, 172.93768f),
                    PathNode.CurveTo(97.84236f, 169.94662f, 100.762344f, 167.99745f, 104.0f, 168.0f),
                    PathNode.LineTo(144.0f, 168.0f),
                    PathNode.LineTo(144.0f, 128.0f),
                    PathNode.CurveTo(143.94489f, 79.42178f, 104.57822f, 40.055107f, 56.0f, 40.0f),
                    PathNode.CurveTo(51.581722f, 40.0f, 48.0f, 36.418278f, 48.0f, 32.0f),
                    PathNode.CurveTo(48.0f, 27.581722f, 51.581722f, 24.0f, 56.0f, 24.0f),
                    PathNode.CurveTo(113.41248f, 24.060629f, 159.93938f, 70.58752f, 160.0f, 128.0f),
                    PathNode.LineTo(160.0f, 168.0f),
                    PathNode.LineTo(200.0f, 168.0f),
                    PathNode.CurveTo(203.23764f, 167.99745f, 206.15764f, 169.94662f, 207.39697f, 172.93768f),
                    PathNode.CurveTo(208.63632f, 175.92874f, 207.95064f, 179.3719f, 205.66f, 181.66f),
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
        return _arrowBendRightDown!!
    }

private var _arrowBendRightDown: ImageVector? = null
