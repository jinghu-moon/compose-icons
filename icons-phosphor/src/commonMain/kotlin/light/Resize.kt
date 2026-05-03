package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Resize: ImageVector
    get() {
        if (_resize != null) return _resize!!
        _resize = phosphorLightIcon(
            name = "Resize",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(136.0f, 114.0f),
                    PathNode.LineTo(48.0f, 114.0f),
                    PathNode.CurveTo(44.68629f, 114.0f, 42.0f, 116.686295f, 42.0f, 120.0f),
                    PathNode.LineTo(42.0f, 208.0f),
                    PathNode.CurveTo(42.0f, 211.3137f, 44.68629f, 214.0f, 48.0f, 214.0f),
                    PathNode.LineTo(136.0f, 214.0f),
                    PathNode.CurveTo(139.3137f, 214.0f, 142.0f, 211.3137f, 142.0f, 208.0f),
                    PathNode.LineTo(142.0f, 120.0f),
                    PathNode.CurveTo(142.0f, 116.686295f, 139.3137f, 114.0f, 136.0f, 114.0f),
                    PathNode.Close,
                    PathNode.MoveTo(130.0f, 202.0f),
                    PathNode.LineTo(54.0f, 202.0f),
                    PathNode.LineTo(54.0f, 126.0f),
                    PathNode.LineTo(130.0f, 126.0f),
                    PathNode.Close,
                    PathNode.MoveTo(214.0f, 184.0f),
                    PathNode.LineTo(214.0f, 200.0f),
                    PathNode.CurveTo(214.0f, 207.73198f, 207.73198f, 214.0f, 200.0f, 214.0f),
                    PathNode.LineTo(176.0f, 214.0f),
                    PathNode.CurveTo(172.6863f, 214.0f, 170.0f, 211.3137f, 170.0f, 208.0f),
                    PathNode.CurveTo(170.0f, 204.6863f, 172.6863f, 202.0f, 176.0f, 202.0f),
                    PathNode.LineTo(200.0f, 202.0f),
                    PathNode.CurveTo(201.10457f, 202.0f, 202.0f, 201.10457f, 202.0f, 200.0f),
                    PathNode.LineTo(202.0f, 184.0f),
                    PathNode.CurveTo(202.0f, 180.6863f, 204.6863f, 178.0f, 208.0f, 178.0f),
                    PathNode.CurveTo(211.3137f, 178.0f, 214.0f, 180.6863f, 214.0f, 184.0f),
                    PathNode.Close,
                    PathNode.MoveTo(214.0f, 112.0f),
                    PathNode.LineTo(214.0f, 144.0f),
                    PathNode.CurveTo(214.0f, 147.3137f, 211.3137f, 150.0f, 208.0f, 150.0f),
                    PathNode.CurveTo(204.6863f, 150.0f, 202.0f, 147.3137f, 202.0f, 144.0f),
                    PathNode.LineTo(202.0f, 112.0f),
                    PathNode.CurveTo(202.0f, 108.686295f, 204.6863f, 106.0f, 208.0f, 106.0f),
                    PathNode.CurveTo(211.3137f, 106.0f, 214.0f, 108.686295f, 214.0f, 112.0f),
                    PathNode.Close,
                    PathNode.MoveTo(214.0f, 56.0f),
                    PathNode.LineTo(214.0f, 72.0f),
                    PathNode.CurveTo(214.0f, 75.313705f, 211.3137f, 78.0f, 208.0f, 78.0f),
                    PathNode.CurveTo(204.6863f, 78.0f, 202.0f, 75.313705f, 202.0f, 72.0f),
                    PathNode.LineTo(202.0f, 56.0f),
                    PathNode.CurveTo(202.0f, 54.89543f, 201.10457f, 54.0f, 200.0f, 54.0f),
                    PathNode.LineTo(184.0f, 54.0f),
                    PathNode.CurveTo(180.6863f, 54.0f, 178.0f, 51.31371f, 178.0f, 48.0f),
                    PathNode.CurveTo(178.0f, 44.68629f, 180.6863f, 42.0f, 184.0f, 42.0f),
                    PathNode.LineTo(200.0f, 42.0f),
                    PathNode.CurveTo(207.73198f, 42.0f, 214.0f, 48.268013f, 214.0f, 56.0f),
                    PathNode.Close,
                    PathNode.MoveTo(150.0f, 48.0f),
                    PathNode.CurveTo(150.0f, 51.31371f, 147.3137f, 54.0f, 144.0f, 54.0f),
                    PathNode.LineTo(112.0f, 54.0f),
                    PathNode.CurveTo(108.686295f, 54.0f, 106.0f, 51.31371f, 106.0f, 48.0f),
                    PathNode.CurveTo(106.0f, 44.68629f, 108.686295f, 42.0f, 112.0f, 42.0f),
                    PathNode.LineTo(144.0f, 42.0f),
                    PathNode.CurveTo(147.3137f, 42.0f, 150.0f, 44.68629f, 150.0f, 48.0f),
                    PathNode.Close,
                    PathNode.MoveTo(42.0f, 80.0f),
                    PathNode.LineTo(42.0f, 56.0f),
                    PathNode.CurveTo(42.0f, 48.268013f, 48.268013f, 42.0f, 56.0f, 42.0f),
                    PathNode.LineTo(72.0f, 42.0f),
                    PathNode.CurveTo(75.313705f, 42.0f, 78.0f, 44.68629f, 78.0f, 48.0f),
                    PathNode.CurveTo(78.0f, 51.31371f, 75.313705f, 54.0f, 72.0f, 54.0f),
                    PathNode.LineTo(56.0f, 54.0f),
                    PathNode.CurveTo(54.89543f, 54.0f, 54.0f, 54.89543f, 54.0f, 56.0f),
                    PathNode.LineTo(54.0f, 80.0f),
                    PathNode.CurveTo(54.0f, 83.313705f, 51.31371f, 86.0f, 48.0f, 86.0f),
                    PathNode.CurveTo(44.68629f, 86.0f, 42.0f, 83.313705f, 42.0f, 80.0f),
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
        return _resize!!
    }

private var _resize: ImageVector? = null
