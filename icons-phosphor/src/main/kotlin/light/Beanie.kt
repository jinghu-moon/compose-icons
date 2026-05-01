package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Beanie: ImageVector
    get() {
        if (_beanie != null) return _beanie!!
        _beanie = phosphorLightIcon(
            name = "Beanie",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(222.0f, 163.37f),
                    PathNode.LineTo(222.0f, 144.0f),
                    PathNode.CurveTo(221.93996f, 99.926674f, 191.31952f, 61.79031f, 148.3f, 52.21f),
                    PathNode.CurveTo(156.80818f, 41.578255f, 155.67203f, 26.182962f, 145.6953f, 16.91538f),
                    PathNode.CurveTo(135.71858f, 7.647798f, 120.28142f, 7.647798f, 110.3047f, 16.91538f),
                    PathNode.CurveTo(100.32799f, 26.182962f, 99.191826f, 41.578255f, 107.7f, 52.21f),
                    PathNode.CurveTo(64.68048f, 61.79031f, 34.06004f, 99.926674f, 34.0f, 144.0f),
                    PathNode.LineTo(34.0f, 163.37f),
                    PathNode.CurveTo(29.120474f, 165.68456f, 26.007374f, 170.59937f, 26.0f, 176.0f),
                    PathNode.LineTo(26.0f, 208.0f),
                    PathNode.CurveTo(26.0f, 215.73198f, 32.268013f, 222.0f, 40.0f, 222.0f),
                    PathNode.LineTo(216.0f, 222.0f),
                    PathNode.CurveTo(223.73198f, 222.0f, 230.0f, 215.73198f, 230.0f, 208.0f),
                    PathNode.LineTo(230.0f, 176.0f),
                    PathNode.CurveTo(229.99263f, 170.59937f, 226.87953f, 165.68456f, 222.0f, 163.37f),
                    PathNode.Close,
                    PathNode.MoveTo(114.0f, 36.0f),
                    PathNode.CurveTo(114.0f, 28.268015f, 120.26801f, 22.0f, 128.0f, 22.0f),
                    PathNode.CurveTo(135.73198f, 22.0f, 142.0f, 28.268015f, 142.0f, 36.0f),
                    PathNode.CurveTo(142.0f, 43.731987f, 135.73198f, 50.0f, 128.0f, 50.0f),
                    PathNode.CurveTo(120.26801f, 50.0f, 114.0f, 43.731987f, 114.0f, 36.0f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 62.0f),
                    PathNode.CurveTo(173.26451f, 62.0551f, 209.9449f, 98.7355f, 210.0f, 144.0f),
                    PathNode.LineTo(210.0f, 162.0f),
                    PathNode.LineTo(46.0f, 162.0f),
                    PathNode.LineTo(46.0f, 144.0f),
                    PathNode.CurveTo(46.0551f, 98.7355f, 82.7355f, 62.0551f, 128.0f, 62.0f),
                    PathNode.Close,
                    PathNode.MoveTo(122.0f, 174.0f),
                    PathNode.LineTo(122.0f, 210.0f),
                    PathNode.LineTo(78.0f, 210.0f),
                    PathNode.LineTo(78.0f, 174.0f),
                    PathNode.Close,
                    PathNode.MoveTo(134.0f, 174.0f),
                    PathNode.LineTo(178.0f, 174.0f),
                    PathNode.LineTo(178.0f, 210.0f),
                    PathNode.LineTo(134.0f, 210.0f),
                    PathNode.Close,
                    PathNode.MoveTo(38.0f, 208.0f),
                    PathNode.LineTo(38.0f, 176.0f),
                    PathNode.CurveTo(38.0f, 174.89543f, 38.89543f, 174.0f, 40.0f, 174.0f),
                    PathNode.LineTo(66.0f, 174.0f),
                    PathNode.LineTo(66.0f, 210.0f),
                    PathNode.LineTo(40.0f, 210.0f),
                    PathNode.CurveTo(38.89543f, 210.0f, 38.0f, 209.10457f, 38.0f, 208.0f),
                    PathNode.Close,
                    PathNode.MoveTo(218.0f, 208.0f),
                    PathNode.CurveTo(218.0f, 209.10457f, 217.10457f, 210.0f, 216.0f, 210.0f),
                    PathNode.LineTo(190.0f, 210.0f),
                    PathNode.LineTo(190.0f, 174.0f),
                    PathNode.LineTo(216.0f, 174.0f),
                    PathNode.CurveTo(217.10457f, 174.0f, 218.0f, 174.89543f, 218.0f, 176.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 12.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _beanie!!
    }

private var _beanie: ImageVector? = null
