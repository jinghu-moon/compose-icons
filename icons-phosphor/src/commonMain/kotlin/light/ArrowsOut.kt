package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.ArrowsOut: ImageVector
    get() {
        if (_arrowsOut != null) return _arrowsOut!!
        _arrowsOut = phosphorLightIcon(
            name = "ArrowsOut",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(214.0f, 48.0f),
                    PathNode.LineTo(214.0f, 96.0f),
                    PathNode.CurveTo(214.0f, 99.313705f, 211.3137f, 102.0f, 208.0f, 102.0f),
                    PathNode.CurveTo(204.6863f, 102.0f, 202.0f, 99.313705f, 202.0f, 96.0f),
                    PathNode.LineTo(202.0f, 62.48f),
                    PathNode.LineTo(156.24f, 108.24f),
                    PathNode.CurveTo(153.87592f, 110.44287f, 150.19193f, 110.37787f, 147.90703f, 108.09297f),
                    PathNode.CurveTo(145.62213f, 105.808075f, 145.55713f, 102.12408f, 147.76f, 99.76f),
                    PathNode.LineTo(193.52f, 54.0f),
                    PathNode.LineTo(160.0f, 54.0f),
                    PathNode.CurveTo(156.6863f, 54.0f, 154.0f, 51.31371f, 154.0f, 48.0f),
                    PathNode.CurveTo(154.0f, 44.68629f, 156.6863f, 42.0f, 160.0f, 42.0f),
                    PathNode.LineTo(208.0f, 42.0f),
                    PathNode.CurveTo(211.3137f, 42.0f, 214.0f, 44.68629f, 214.0f, 48.0f),
                    PathNode.Close,
                    PathNode.MoveTo(99.76f, 147.76f),
                    PathNode.LineTo(54.0f, 193.52f),
                    PathNode.LineTo(54.0f, 160.0f),
                    PathNode.CurveTo(54.0f, 156.6863f, 51.31371f, 154.0f, 48.0f, 154.0f),
                    PathNode.CurveTo(44.68629f, 154.0f, 42.0f, 156.6863f, 42.0f, 160.0f),
                    PathNode.LineTo(42.0f, 208.0f),
                    PathNode.CurveTo(42.0f, 211.3137f, 44.68629f, 214.0f, 48.0f, 214.0f),
                    PathNode.LineTo(96.0f, 214.0f),
                    PathNode.CurveTo(99.313705f, 214.0f, 102.0f, 211.3137f, 102.0f, 208.0f),
                    PathNode.CurveTo(102.0f, 204.6863f, 99.313705f, 202.0f, 96.0f, 202.0f),
                    PathNode.LineTo(62.48f, 202.0f),
                    PathNode.LineTo(108.24f, 156.24f),
                    PathNode.CurveTo(110.44287f, 153.87592f, 110.37787f, 150.19193f, 108.09297f, 147.90703f),
                    PathNode.CurveTo(105.808075f, 145.62213f, 102.12408f, 145.55713f, 99.76f, 147.76f),
                    PathNode.Close,
                    PathNode.MoveTo(208.0f, 154.0f),
                    PathNode.CurveTo(204.6863f, 154.0f, 202.0f, 156.6863f, 202.0f, 160.0f),
                    PathNode.LineTo(202.0f, 193.52f),
                    PathNode.LineTo(156.24f, 147.76f),
                    PathNode.CurveTo(153.87592f, 145.55713f, 150.19193f, 145.62213f, 147.90703f, 147.90703f),
                    PathNode.CurveTo(145.62213f, 150.19193f, 145.55713f, 153.87592f, 147.76f, 156.24f),
                    PathNode.LineTo(193.52f, 202.0f),
                    PathNode.LineTo(160.0f, 202.0f),
                    PathNode.CurveTo(156.6863f, 202.0f, 154.0f, 204.6863f, 154.0f, 208.0f),
                    PathNode.CurveTo(154.0f, 211.3137f, 156.6863f, 214.0f, 160.0f, 214.0f),
                    PathNode.LineTo(208.0f, 214.0f),
                    PathNode.CurveTo(211.3137f, 214.0f, 214.0f, 211.3137f, 214.0f, 208.0f),
                    PathNode.LineTo(214.0f, 160.0f),
                    PathNode.CurveTo(214.0f, 156.6863f, 211.3137f, 154.0f, 208.0f, 154.0f),
                    PathNode.Close,
                    PathNode.MoveTo(62.48f, 54.0f),
                    PathNode.LineTo(96.0f, 54.0f),
                    PathNode.CurveTo(99.313705f, 54.0f, 102.0f, 51.31371f, 102.0f, 48.0f),
                    PathNode.CurveTo(102.0f, 44.68629f, 99.313705f, 42.0f, 96.0f, 42.0f),
                    PathNode.LineTo(48.0f, 42.0f),
                    PathNode.CurveTo(44.68629f, 42.0f, 42.0f, 44.68629f, 42.0f, 48.0f),
                    PathNode.LineTo(42.0f, 96.0f),
                    PathNode.CurveTo(42.0f, 99.313705f, 44.68629f, 102.0f, 48.0f, 102.0f),
                    PathNode.CurveTo(51.31371f, 102.0f, 54.0f, 99.313705f, 54.0f, 96.0f),
                    PathNode.LineTo(54.0f, 62.48f),
                    PathNode.LineTo(99.76f, 108.24f),
                    PathNode.CurveTo(102.12408f, 110.44287f, 105.808075f, 110.37787f, 108.09297f, 108.09297f),
                    PathNode.CurveTo(110.37787f, 105.808075f, 110.44287f, 102.12408f, 108.24f, 99.76f),
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
        return _arrowsOut!!
    }

private var _arrowsOut: ImageVector? = null
