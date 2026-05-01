package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Cross: ImageVector
    get() {
        if (_cross != null) return _cross!!
        _cross = phosphorLightIcon(
            name = "Cross",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(200.0f, 74.0f),
                    PathNode.LineTo(158.0f, 74.0f),
                    PathNode.LineTo(158.0f, 32.0f),
                    PathNode.CurveTo(158.0f, 24.268015f, 151.73198f, 18.0f, 144.0f, 18.0f),
                    PathNode.LineTo(112.0f, 18.0f),
                    PathNode.CurveTo(104.26801f, 18.0f, 98.0f, 24.268015f, 98.0f, 32.0f),
                    PathNode.LineTo(98.0f, 74.0f),
                    PathNode.LineTo(56.0f, 74.0f),
                    PathNode.CurveTo(48.268013f, 74.0f, 42.0f, 80.26801f, 42.0f, 88.0f),
                    PathNode.LineTo(42.0f, 120.0f),
                    PathNode.CurveTo(42.0f, 127.73199f, 48.268013f, 134.0f, 56.0f, 134.0f),
                    PathNode.LineTo(98.0f, 134.0f),
                    PathNode.LineTo(98.0f, 224.0f),
                    PathNode.CurveTo(98.0f, 231.73198f, 104.26801f, 238.0f, 112.0f, 238.0f),
                    PathNode.LineTo(144.0f, 238.0f),
                    PathNode.CurveTo(151.73198f, 238.0f, 158.0f, 231.73198f, 158.0f, 224.0f),
                    PathNode.LineTo(158.0f, 134.0f),
                    PathNode.LineTo(200.0f, 134.0f),
                    PathNode.CurveTo(207.73198f, 134.0f, 214.0f, 127.73199f, 214.0f, 120.0f),
                    PathNode.LineTo(214.0f, 88.0f),
                    PathNode.CurveTo(214.0f, 80.26801f, 207.73198f, 74.0f, 200.0f, 74.0f),
                    PathNode.Close,
                    PathNode.MoveTo(202.0f, 120.0f),
                    PathNode.CurveTo(202.0f, 121.10457f, 201.10457f, 122.0f, 200.0f, 122.0f),
                    PathNode.LineTo(152.0f, 122.0f),
                    PathNode.CurveTo(148.6863f, 122.0f, 146.0f, 124.686295f, 146.0f, 128.0f),
                    PathNode.LineTo(146.0f, 224.0f),
                    PathNode.CurveTo(146.0f, 225.10457f, 145.10457f, 226.0f, 144.0f, 226.0f),
                    PathNode.LineTo(112.0f, 226.0f),
                    PathNode.CurveTo(110.89543f, 226.0f, 110.0f, 225.10457f, 110.0f, 224.0f),
                    PathNode.LineTo(110.0f, 128.0f),
                    PathNode.CurveTo(110.0f, 124.686295f, 107.313705f, 122.0f, 104.0f, 122.0f),
                    PathNode.LineTo(56.0f, 122.0f),
                    PathNode.CurveTo(54.89543f, 122.0f, 54.0f, 121.10457f, 54.0f, 120.0f),
                    PathNode.LineTo(54.0f, 88.0f),
                    PathNode.CurveTo(54.0f, 86.89543f, 54.89543f, 86.0f, 56.0f, 86.0f),
                    PathNode.LineTo(104.0f, 86.0f),
                    PathNode.CurveTo(107.313705f, 86.0f, 110.0f, 83.313705f, 110.0f, 80.0f),
                    PathNode.LineTo(110.0f, 32.0f),
                    PathNode.CurveTo(110.0f, 30.89543f, 110.89543f, 30.0f, 112.0f, 30.0f),
                    PathNode.LineTo(144.0f, 30.0f),
                    PathNode.CurveTo(145.10457f, 30.0f, 146.0f, 30.89543f, 146.0f, 32.0f),
                    PathNode.LineTo(146.0f, 80.0f),
                    PathNode.CurveTo(146.0f, 83.313705f, 148.6863f, 86.0f, 152.0f, 86.0f),
                    PathNode.LineTo(200.0f, 86.0f),
                    PathNode.CurveTo(201.10457f, 86.0f, 202.0f, 86.89543f, 202.0f, 88.0f),
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
        return _cross!!
    }

private var _cross: ImageVector? = null
