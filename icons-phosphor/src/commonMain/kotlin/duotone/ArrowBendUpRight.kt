package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.ArrowBendUpRight: ImageVector
    get() {
        if (_arrowBendUpRight != null) return _arrowBendUpRight!!
        _arrowBendUpRight = phosphorDuotoneIcon(
            name = "ArrowBendUpRight",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(224.0f, 104.0f),
                    PathNode.LineTo(176.0f, 152.0f),
                    PathNode.LineTo(176.0f, 56.0f),
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
                    PathNode.MoveTo(229.66f, 98.34f),
                    PathNode.LineTo(181.66f, 50.34f),
                    PathNode.CurveTo(179.3719f, 48.04936f, 175.92874f, 47.363674f, 172.93768f, 48.60302f),
                    PathNode.CurveTo(169.94662f, 49.84236f, 167.99745f, 52.76235f, 168.0f, 56.0f),
                    PathNode.LineTo(168.0f, 96.0f),
                    PathNode.LineTo(128.0f, 96.0f),
                    PathNode.CurveTo(70.58752f, 96.06063f, 24.060629f, 142.58752f, 24.0f, 200.0f),
                    PathNode.CurveTo(24.0f, 204.41827f, 27.581722f, 208.0f, 32.0f, 208.0f),
                    PathNode.CurveTo(36.418278f, 208.0f, 40.0f, 204.41827f, 40.0f, 200.0f),
                    PathNode.CurveTo(40.055107f, 151.42178f, 79.42178f, 112.05511f, 128.0f, 112.0f),
                    PathNode.LineTo(168.0f, 112.0f),
                    PathNode.LineTo(168.0f, 152.0f),
                    PathNode.CurveTo(167.99745f, 155.23764f, 169.94662f, 158.15764f, 172.93768f, 159.39697f),
                    PathNode.CurveTo(175.92874f, 160.63632f, 179.3719f, 159.95064f, 181.66f, 157.66f),
                    PathNode.LineTo(229.66f, 109.66f),
                    PathNode.CurveTo(231.16223f, 108.159454f, 232.00629f, 106.123276f, 232.00629f, 104.0f),
                    PathNode.CurveTo(232.00629f, 101.876724f, 231.16223f, 99.840546f, 229.66f, 98.34f),
                    PathNode.Close,
                    PathNode.MoveTo(184.0f, 132.69f),
                    PathNode.LineTo(184.0f, 75.31f),
                    PathNode.LineTo(212.69f, 104.0f),
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
        return _arrowBendUpRight!!
    }

private var _arrowBendUpRight: ImageVector? = null
