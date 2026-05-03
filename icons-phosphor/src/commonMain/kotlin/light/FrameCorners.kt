package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.FrameCorners: ImageVector
    get() {
        if (_frameCorners != null) return _frameCorners!!
        _frameCorners = phosphorLightIcon(
            name = "FrameCorners",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(198.0f, 80.0f),
                    PathNode.LineTo(198.0f, 112.0f),
                    PathNode.CurveTo(198.0f, 115.313705f, 195.3137f, 118.0f, 192.0f, 118.0f),
                    PathNode.CurveTo(188.6863f, 118.0f, 186.0f, 115.313705f, 186.0f, 112.0f),
                    PathNode.LineTo(186.0f, 86.0f),
                    PathNode.LineTo(160.0f, 86.0f),
                    PathNode.CurveTo(156.6863f, 86.0f, 154.0f, 83.313705f, 154.0f, 80.0f),
                    PathNode.CurveTo(154.0f, 76.686295f, 156.6863f, 74.0f, 160.0f, 74.0f),
                    PathNode.LineTo(192.0f, 74.0f),
                    PathNode.CurveTo(195.3137f, 74.0f, 198.0f, 76.686295f, 198.0f, 80.0f),
                    PathNode.Close,
                    PathNode.MoveTo(96.0f, 170.0f),
                    PathNode.LineTo(70.0f, 170.0f),
                    PathNode.LineTo(70.0f, 144.0f),
                    PathNode.CurveTo(70.0f, 140.6863f, 67.313705f, 138.0f, 64.0f, 138.0f),
                    PathNode.CurveTo(60.68629f, 138.0f, 58.0f, 140.6863f, 58.0f, 144.0f),
                    PathNode.LineTo(58.0f, 176.0f),
                    PathNode.CurveTo(58.0f, 179.3137f, 60.68629f, 182.0f, 64.0f, 182.0f),
                    PathNode.LineTo(96.0f, 182.0f),
                    PathNode.CurveTo(99.313705f, 182.0f, 102.0f, 179.3137f, 102.0f, 176.0f),
                    PathNode.CurveTo(102.0f, 172.6863f, 99.313705f, 170.0f, 96.0f, 170.0f),
                    PathNode.Close,
                    PathNode.MoveTo(230.0f, 56.0f),
                    PathNode.LineTo(230.0f, 200.0f),
                    PathNode.CurveTo(230.0f, 207.73198f, 223.73198f, 214.0f, 216.0f, 214.0f),
                    PathNode.LineTo(40.0f, 214.0f),
                    PathNode.CurveTo(32.268013f, 214.0f, 26.0f, 207.73198f, 26.0f, 200.0f),
                    PathNode.LineTo(26.0f, 56.0f),
                    PathNode.CurveTo(26.0f, 48.268013f, 32.268013f, 42.0f, 40.0f, 42.0f),
                    PathNode.LineTo(216.0f, 42.0f),
                    PathNode.CurveTo(223.73198f, 42.0f, 230.0f, 48.268013f, 230.0f, 56.0f),
                    PathNode.Close,
                    PathNode.MoveTo(218.0f, 56.0f),
                    PathNode.CurveTo(218.0f, 54.89543f, 217.10457f, 54.0f, 216.0f, 54.0f),
                    PathNode.LineTo(40.0f, 54.0f),
                    PathNode.CurveTo(38.89543f, 54.0f, 38.0f, 54.89543f, 38.0f, 56.0f),
                    PathNode.LineTo(38.0f, 200.0f),
                    PathNode.CurveTo(38.0f, 201.10457f, 38.89543f, 202.0f, 40.0f, 202.0f),
                    PathNode.LineTo(216.0f, 202.0f),
                    PathNode.CurveTo(217.10457f, 202.0f, 218.0f, 201.10457f, 218.0f, 200.0f),
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
        return _frameCorners!!
    }

private var _frameCorners: ImageVector? = null
