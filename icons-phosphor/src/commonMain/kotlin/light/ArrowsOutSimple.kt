package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.ArrowsOutSimple: ImageVector
    get() {
        if (_arrowsOutSimple != null) return _arrowsOutSimple!!
        _arrowsOutSimple = phosphorLightIcon(
            name = "ArrowsOutSimple",
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
                    PathNode.LineTo(148.24f, 116.24f),
                    PathNode.CurveTo(145.87592f, 118.44287f, 142.19193f, 118.37787f, 139.90703f, 116.09297f),
                    PathNode.CurveTo(137.62213f, 113.808075f, 137.55713f, 110.12408f, 139.76f, 107.76f),
                    PathNode.LineTo(193.52f, 54.0f),
                    PathNode.LineTo(160.0f, 54.0f),
                    PathNode.CurveTo(156.6863f, 54.0f, 154.0f, 51.31371f, 154.0f, 48.0f),
                    PathNode.CurveTo(154.0f, 44.68629f, 156.6863f, 42.0f, 160.0f, 42.0f),
                    PathNode.LineTo(208.0f, 42.0f),
                    PathNode.CurveTo(211.3137f, 42.0f, 214.0f, 44.68629f, 214.0f, 48.0f),
                    PathNode.Close,
                    PathNode.MoveTo(107.76f, 139.76f),
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
                    PathNode.LineTo(116.24f, 148.24f),
                    PathNode.CurveTo(118.44287f, 145.87592f, 118.37787f, 142.19193f, 116.09297f, 139.90703f),
                    PathNode.CurveTo(113.808075f, 137.62213f, 110.12408f, 137.55713f, 107.76f, 139.76f),
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
        return _arrowsOutSimple!!
    }

private var _arrowsOutSimple: ImageVector? = null
