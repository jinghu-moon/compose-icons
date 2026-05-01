package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.ShuffleSimple: ImageVector
    get() {
        if (_shuffleSimple != null) return _shuffleSimple!!
        _shuffleSimple = phosphorFillIcon(
            name = "ShuffleSimple",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(216.0f, 48.0f),
                    PathNode.LineTo(216.0f, 88.0f),
                    PathNode.CurveTo(216.00255f, 91.237656f, 214.05338f, 94.15764f, 211.06232f, 95.39698f),
                    PathNode.CurveTo(208.07126f, 96.63632f, 204.6281f, 95.95064f, 202.34f, 93.66f),
                    PathNode.LineTo(188.0f, 79.31f),
                    PathNode.LineTo(156.28f, 111.0f),
                    PathNode.CurveTo(153.10591f, 113.718216f, 148.37445f, 113.53546f, 145.4195f, 110.580505f),
                    PathNode.CurveTo(142.46454f, 107.62556f, 142.2818f, 102.89408f, 145.0f, 99.72f),
                    PathNode.LineTo(176.69f, 68.0f),
                    PathNode.LineTo(162.34f, 53.66f),
                    PathNode.CurveTo(160.04936f, 51.371906f, 159.36368f, 47.928738f, 160.60303f, 44.93768f),
                    PathNode.CurveTo(161.84236f, 41.94662f, 164.76236f, 39.99745f, 168.0f, 40.0f),
                    PathNode.LineTo(208.0f, 40.0f),
                    PathNode.CurveTo(212.41827f, 40.0f, 216.0f, 43.581722f, 216.0f, 48.0f),
                    PathNode.Close,
                    PathNode.MoveTo(211.06f, 160.61f),
                    PathNode.CurveTo(208.07097f, 159.36993f, 204.62924f, 160.05275f, 202.34f, 162.34f),
                    PathNode.LineTo(188.0f, 176.69f),
                    PathNode.LineTo(53.66f, 42.34f),
                    PathNode.CurveTo(50.53407f, 39.21407f, 45.46593f, 39.21407f, 42.34f, 42.34f),
                    PathNode.CurveTo(39.21407f, 45.46593f, 39.21407f, 50.53407f, 42.34f, 53.66f),
                    PathNode.LineTo(176.69f, 188.0f),
                    PathNode.LineTo(162.34f, 202.34f),
                    PathNode.CurveTo(160.04936f, 204.6281f, 159.36368f, 208.07126f, 160.60303f, 211.06232f),
                    PathNode.CurveTo(161.84236f, 214.05338f, 164.76236f, 216.00255f, 168.0f, 216.0f),
                    PathNode.LineTo(208.0f, 216.0f),
                    PathNode.CurveTo(212.41827f, 216.0f, 216.0f, 212.41827f, 216.0f, 208.0f),
                    PathNode.LineTo(216.0f, 168.0f),
                    PathNode.CurveTo(215.99933f, 164.76434f, 214.04962f, 161.84764f, 211.06f, 160.61f),
                    PathNode.Close,
                    PathNode.MoveTo(99.72f, 145.0f),
                    PathNode.LineTo(42.34f, 202.34f),
                    PathNode.CurveTo(39.21407f, 205.46593f, 39.21407f, 210.53407f, 42.34f, 213.66f),
                    PathNode.CurveTo(45.46593f, 216.78593f, 50.53407f, 216.78593f, 53.66f, 213.66f),
                    PathNode.LineTo(111.0f, 156.28f),
                    PathNode.CurveTo(113.718216f, 153.10591f, 113.53546f, 148.37445f, 110.580505f, 145.4195f),
                    PathNode.CurveTo(107.62556f, 142.46454f, 102.89408f, 142.2818f, 99.72f, 145.0f),
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
        return _shuffleSimple!!
    }

private var _shuffleSimple: ImageVector? = null
