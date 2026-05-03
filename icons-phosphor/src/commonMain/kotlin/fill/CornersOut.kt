package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.CornersOut: ImageVector
    get() {
        if (_cornersOut != null) return _cornersOut!!
        _cornersOut = phosphorFillIcon(
            name = "CornersOut",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(93.66f, 202.34f),
                    PathNode.CurveTo(95.95064f, 204.6281f, 96.63632f, 208.07126f, 95.39698f, 211.06232f),
                    PathNode.CurveTo(94.15764f, 214.05338f, 91.237656f, 216.00255f, 88.0f, 216.0f),
                    PathNode.LineTo(48.0f, 216.0f),
                    PathNode.CurveTo(43.581722f, 216.0f, 40.0f, 212.41827f, 40.0f, 208.0f),
                    PathNode.LineTo(40.0f, 168.0f),
                    PathNode.CurveTo(39.99745f, 164.76236f, 41.94662f, 161.84236f, 44.93768f, 160.60303f),
                    PathNode.CurveTo(47.928738f, 159.36368f, 51.371906f, 160.04936f, 53.66f, 162.34f),
                    PathNode.Close,
                    PathNode.MoveTo(88.0f, 40.0f),
                    PathNode.LineTo(48.0f, 40.0f),
                    PathNode.CurveTo(43.581722f, 40.0f, 40.0f, 43.581722f, 40.0f, 48.0f),
                    PathNode.LineTo(40.0f, 88.0f),
                    PathNode.CurveTo(39.99745f, 91.237656f, 41.94662f, 94.15764f, 44.93768f, 95.39698f),
                    PathNode.CurveTo(47.928738f, 96.63632f, 51.371906f, 95.95064f, 53.66f, 93.66f),
                    PathNode.LineTo(93.66f, 53.66f),
                    PathNode.CurveTo(95.95064f, 51.371906f, 96.63632f, 47.928738f, 95.39698f, 44.93768f),
                    PathNode.CurveTo(94.15764f, 41.94662f, 91.237656f, 39.99745f, 88.0f, 40.0f),
                    PathNode.Close,
                    PathNode.MoveTo(211.06f, 160.61f),
                    PathNode.CurveTo(208.07097f, 159.36993f, 204.62924f, 160.05275f, 202.34f, 162.34f),
                    PathNode.LineTo(162.34f, 202.34f),
                    PathNode.CurveTo(160.04936f, 204.6281f, 159.36368f, 208.07126f, 160.60303f, 211.06232f),
                    PathNode.CurveTo(161.84236f, 214.05338f, 164.76236f, 216.00255f, 168.0f, 216.0f),
                    PathNode.LineTo(208.0f, 216.0f),
                    PathNode.CurveTo(212.41827f, 216.0f, 216.0f, 212.41827f, 216.0f, 208.0f),
                    PathNode.LineTo(216.0f, 168.0f),
                    PathNode.CurveTo(215.99933f, 164.76434f, 214.04962f, 161.84764f, 211.06f, 160.61f),
                    PathNode.Close,
                    PathNode.MoveTo(208.0f, 40.0f),
                    PathNode.LineTo(168.0f, 40.0f),
                    PathNode.CurveTo(164.76236f, 39.99745f, 161.84236f, 41.94662f, 160.60303f, 44.93768f),
                    PathNode.CurveTo(159.36368f, 47.928738f, 160.04936f, 51.371906f, 162.34f, 53.66f),
                    PathNode.LineTo(202.34f, 93.66f),
                    PathNode.CurveTo(204.6281f, 95.95064f, 208.07126f, 96.63632f, 211.06232f, 95.39698f),
                    PathNode.CurveTo(214.05338f, 94.15764f, 216.00255f, 91.237656f, 216.0f, 88.0f),
                    PathNode.LineTo(216.0f, 48.0f),
                    PathNode.CurveTo(216.0f, 43.581722f, 212.41827f, 40.0f, 208.0f, 40.0f),
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
        return _cornersOut!!
    }

private var _cornersOut: ImageVector? = null
