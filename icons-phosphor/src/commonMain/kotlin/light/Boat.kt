package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Boat: ImageVector
    get() {
        if (_boat != null) return _boat!!
        _boat = phosphorLightIcon(
            name = "Boat",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(220.43f, 112.48f),
                    PathNode.LineTo(206.0f, 107.68f),
                    PathNode.LineTo(206.0f, 56.0f),
                    PathNode.CurveTo(206.0f, 48.268013f, 199.73198f, 42.0f, 192.0f, 42.0f),
                    PathNode.LineTo(134.0f, 42.0f),
                    PathNode.LineTo(134.0f, 24.0f),
                    PathNode.CurveTo(134.0f, 20.68629f, 131.3137f, 18.0f, 128.0f, 18.0f),
                    PathNode.CurveTo(124.686295f, 18.0f, 122.0f, 20.68629f, 122.0f, 24.0f),
                    PathNode.LineTo(122.0f, 42.0f),
                    PathNode.LineTo(64.0f, 42.0f),
                    PathNode.CurveTo(56.268013f, 42.0f, 50.0f, 48.268013f, 50.0f, 56.0f),
                    PathNode.LineTo(50.0f, 107.68f),
                    PathNode.LineTo(35.57f, 112.48f),
                    PathNode.CurveTo(29.851376f, 114.38755f, 25.995966f, 119.741615f, 26.0f, 125.77f),
                    PathNode.LineTo(26.0f, 152.0f),
                    PathNode.CurveTo(26.0f, 212.0f, 122.44f, 236.79f, 126.54f, 237.82f),
                    PathNode.CurveTo(127.49848f, 238.06046f, 128.50151f, 238.06046f, 129.46f, 237.82f),
                    PathNode.CurveTo(146.61111f, 233.19122f, 163.18324f, 226.63617f, 178.86f, 218.28f),
                    PathNode.CurveTo(212.32f, 200.15f, 230.0f, 177.24f, 230.0f, 152.0f),
                    PathNode.LineTo(230.0f, 125.77f),
                    PathNode.CurveTo(230.00403f, 119.741615f, 226.14862f, 114.38755f, 220.43f, 112.48f),
                    PathNode.Close,
                    PathNode.MoveTo(62.0f, 56.0f),
                    PathNode.CurveTo(62.0f, 54.89543f, 62.89543f, 54.0f, 64.0f, 54.0f),
                    PathNode.LineTo(192.0f, 54.0f),
                    PathNode.CurveTo(193.10457f, 54.0f, 194.0f, 54.89543f, 194.0f, 56.0f),
                    PathNode.LineTo(194.0f, 103.68f),
                    PathNode.LineTo(129.9f, 82.31f),
                    PathNode.CurveTo(128.6668f, 81.89829f, 127.33321f, 81.89829f, 126.1f, 82.31f),
                    PathNode.LineTo(62.0f, 103.68f),
                    PathNode.Close,
                    PathNode.MoveTo(218.0f, 152.0f),
                    PathNode.CurveTo(218.0f, 199.1f, 139.72f, 222.54f, 128.0f, 225.79f),
                    PathNode.CurveTo(116.27f, 222.54f, 38.0f, 199.1f, 38.0f, 152.0f),
                    PathNode.LineTo(38.0f, 125.77f),
                    PathNode.CurveTo(37.999214f, 124.90752f, 38.551422f, 124.14168f, 39.37f, 123.87f),
                    PathNode.LineTo(122.0f, 96.32f),
                    PathNode.LineTo(122.0f, 168.0f),
                    PathNode.CurveTo(122.0f, 171.3137f, 124.686295f, 174.0f, 128.0f, 174.0f),
                    PathNode.CurveTo(131.3137f, 174.0f, 134.0f, 171.3137f, 134.0f, 168.0f),
                    PathNode.LineTo(134.0f, 96.32f),
                    PathNode.LineTo(216.63f, 123.87f),
                    PathNode.CurveTo(217.44858f, 124.14168f, 218.00078f, 124.90752f, 218.0f, 125.77f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 12.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _boat!!
    }

private var _boat: ImageVector? = null
