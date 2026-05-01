package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.ArrowBendDoubleUpRight: ImageVector
    get() {
        if (_arrowBendDoubleUpRight != null) return _arrowBendDoubleUpRight!!
        _arrowBendDoubleUpRight = phosphorDuotoneIcon(
            name = "ArrowBendDoubleUpRight",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(176.0f, 104.0f),
                    PathNode.LineTo(128.0f, 152.0f),
                    PathNode.LineTo(128.0f, 56.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 16.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(229.66f, 109.66f),
                    PathNode.LineTo(181.66f, 157.66f),
                    PathNode.CurveTo(178.53407f, 160.78593f, 173.46593f, 160.78593f, 170.34f, 157.66f),
                    PathNode.CurveTo(167.21407f, 154.53407f, 167.21407f, 149.46593f, 170.34f, 146.34f),
                    PathNode.LineTo(212.69f, 104.0f),
                    PathNode.LineTo(170.34f, 61.66f),
                    PathNode.CurveTo(167.21407f, 58.53407f, 167.21407f, 53.46593f, 170.34f, 50.34f),
                    PathNode.CurveTo(173.46593f, 47.21407f, 178.53407f, 47.21407f, 181.66f, 50.34f),
                    PathNode.LineTo(229.66f, 98.34f),
                    PathNode.CurveTo(231.16223f, 99.840546f, 232.00629f, 101.876724f, 232.00629f, 104.0f),
                    PathNode.CurveTo(232.00629f, 106.123276f, 231.16223f, 108.159454f, 229.66f, 109.66f),
                    PathNode.Close,
                    PathNode.MoveTo(181.66f, 109.66f),
                    PathNode.LineTo(133.66f, 157.66f),
                    PathNode.CurveTo(131.3719f, 159.95064f, 127.92874f, 160.63632f, 124.937675f, 159.39697f),
                    PathNode.CurveTo(121.94662f, 158.15764f, 119.99745f, 155.23764f, 120.0f, 152.0f),
                    PathNode.LineTo(120.0f, 112.37f),
                    PathNode.CurveTo(74.71405f, 116.55604f, 40.0547f, 154.52103f, 40.0f, 200.0f),
                    PathNode.CurveTo(40.0f, 204.41827f, 36.418278f, 208.0f, 32.0f, 208.0f),
                    PathNode.CurveTo(27.581722f, 208.0f, 24.0f, 204.41827f, 24.0f, 200.0f),
                    PathNode.CurveTo(24.06812f, 145.69057f, 65.857056f, 100.54981f, 120.0f, 96.3f),
                    PathNode.LineTo(120.0f, 56.0f),
                    PathNode.CurveTo(119.99745f, 52.76235f, 121.94662f, 49.84236f, 124.937675f, 48.60302f),
                    PathNode.CurveTo(127.92874f, 47.363674f, 131.3719f, 48.04936f, 133.66f, 50.34f),
                    PathNode.LineTo(181.66f, 98.34f),
                    PathNode.CurveTo(183.16223f, 99.840546f, 184.00629f, 101.876724f, 184.00629f, 104.0f),
                    PathNode.CurveTo(184.00629f, 106.123276f, 183.16223f, 108.159454f, 181.66f, 109.66f),
                    PathNode.Close,
                    PathNode.MoveTo(164.66f, 104.0f),
                    PathNode.LineTo(136.0f, 75.31f),
                    PathNode.LineTo(136.0f, 132.69f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 16.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _arrowBendDoubleUpRight!!
    }

private var _arrowBendDoubleUpRight: ImageVector? = null
