package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Article: ImageVector
    get() {
        if (_article != null) return _article!!
        _article = phosphorLightIcon(
            name = "Article",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(216.0f, 42.0f),
                    PathNode.LineTo(40.0f, 42.0f),
                    PathNode.CurveTo(32.268013f, 42.0f, 26.0f, 48.268013f, 26.0f, 56.0f),
                    PathNode.LineTo(26.0f, 200.0f),
                    PathNode.CurveTo(26.0f, 207.73198f, 32.268013f, 214.0f, 40.0f, 214.0f),
                    PathNode.LineTo(216.0f, 214.0f),
                    PathNode.CurveTo(223.73198f, 214.0f, 230.0f, 207.73198f, 230.0f, 200.0f),
                    PathNode.LineTo(230.0f, 56.0f),
                    PathNode.CurveTo(230.0f, 48.268013f, 223.73198f, 42.0f, 216.0f, 42.0f),
                    PathNode.Close,
                    PathNode.MoveTo(218.0f, 200.0f),
                    PathNode.CurveTo(218.0f, 201.10457f, 217.10457f, 202.0f, 216.0f, 202.0f),
                    PathNode.LineTo(40.0f, 202.0f),
                    PathNode.CurveTo(38.89543f, 202.0f, 38.0f, 201.10457f, 38.0f, 200.0f),
                    PathNode.LineTo(38.0f, 56.0f),
                    PathNode.CurveTo(38.0f, 54.89543f, 38.89543f, 54.0f, 40.0f, 54.0f),
                    PathNode.LineTo(216.0f, 54.0f),
                    PathNode.CurveTo(217.10457f, 54.0f, 218.0f, 54.89543f, 218.0f, 56.0f),
                    PathNode.Close,
                    PathNode.MoveTo(182.0f, 96.0f),
                    PathNode.CurveTo(182.0f, 99.313705f, 179.3137f, 102.0f, 176.0f, 102.0f),
                    PathNode.LineTo(80.0f, 102.0f),
                    PathNode.CurveTo(76.686295f, 102.0f, 74.0f, 99.313705f, 74.0f, 96.0f),
                    PathNode.CurveTo(74.0f, 92.686295f, 76.686295f, 90.0f, 80.0f, 90.0f),
                    PathNode.LineTo(176.0f, 90.0f),
                    PathNode.CurveTo(179.3137f, 90.0f, 182.0f, 92.686295f, 182.0f, 96.0f),
                    PathNode.Close,
                    PathNode.MoveTo(182.0f, 128.0f),
                    PathNode.CurveTo(182.0f, 131.3137f, 179.3137f, 134.0f, 176.0f, 134.0f),
                    PathNode.LineTo(80.0f, 134.0f),
                    PathNode.CurveTo(76.686295f, 134.0f, 74.0f, 131.3137f, 74.0f, 128.0f),
                    PathNode.CurveTo(74.0f, 124.686295f, 76.686295f, 122.0f, 80.0f, 122.0f),
                    PathNode.LineTo(176.0f, 122.0f),
                    PathNode.CurveTo(179.3137f, 122.0f, 182.0f, 124.686295f, 182.0f, 128.0f),
                    PathNode.Close,
                    PathNode.MoveTo(182.0f, 160.0f),
                    PathNode.CurveTo(182.0f, 163.3137f, 179.3137f, 166.0f, 176.0f, 166.0f),
                    PathNode.LineTo(80.0f, 166.0f),
                    PathNode.CurveTo(76.686295f, 166.0f, 74.0f, 163.3137f, 74.0f, 160.0f),
                    PathNode.CurveTo(74.0f, 156.6863f, 76.686295f, 154.0f, 80.0f, 154.0f),
                    PathNode.LineTo(176.0f, 154.0f),
                    PathNode.CurveTo(179.3137f, 154.0f, 182.0f, 156.6863f, 182.0f, 160.0f),
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
        return _article!!
    }

private var _article: ImageVector? = null
