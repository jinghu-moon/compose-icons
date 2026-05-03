package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.CornersOut: ImageVector
    get() {
        if (_cornersOut != null) return _cornersOut!!
        _cornersOut = phosphorLightIcon(
            name = "CornersOut",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(214.0f, 48.0f),
                    PathNode.LineTo(214.0f, 88.0f),
                    PathNode.CurveTo(214.0f, 91.313705f, 211.3137f, 94.0f, 208.0f, 94.0f),
                    PathNode.CurveTo(204.6863f, 94.0f, 202.0f, 91.313705f, 202.0f, 88.0f),
                    PathNode.LineTo(202.0f, 54.0f),
                    PathNode.LineTo(168.0f, 54.0f),
                    PathNode.CurveTo(164.6863f, 54.0f, 162.0f, 51.31371f, 162.0f, 48.0f),
                    PathNode.CurveTo(162.0f, 44.68629f, 164.6863f, 42.0f, 168.0f, 42.0f),
                    PathNode.LineTo(208.0f, 42.0f),
                    PathNode.CurveTo(211.3137f, 42.0f, 214.0f, 44.68629f, 214.0f, 48.0f),
                    PathNode.Close,
                    PathNode.MoveTo(88.0f, 202.0f),
                    PathNode.LineTo(54.0f, 202.0f),
                    PathNode.LineTo(54.0f, 168.0f),
                    PathNode.CurveTo(54.0f, 164.6863f, 51.31371f, 162.0f, 48.0f, 162.0f),
                    PathNode.CurveTo(44.68629f, 162.0f, 42.0f, 164.6863f, 42.0f, 168.0f),
                    PathNode.LineTo(42.0f, 208.0f),
                    PathNode.CurveTo(42.0f, 211.3137f, 44.68629f, 214.0f, 48.0f, 214.0f),
                    PathNode.LineTo(88.0f, 214.0f),
                    PathNode.CurveTo(91.313705f, 214.0f, 94.0f, 211.3137f, 94.0f, 208.0f),
                    PathNode.CurveTo(94.0f, 204.6863f, 91.313705f, 202.0f, 88.0f, 202.0f),
                    PathNode.Close,
                    PathNode.MoveTo(208.0f, 162.0f),
                    PathNode.CurveTo(204.6863f, 162.0f, 202.0f, 164.6863f, 202.0f, 168.0f),
                    PathNode.LineTo(202.0f, 202.0f),
                    PathNode.LineTo(168.0f, 202.0f),
                    PathNode.CurveTo(164.6863f, 202.0f, 162.0f, 204.6863f, 162.0f, 208.0f),
                    PathNode.CurveTo(162.0f, 211.3137f, 164.6863f, 214.0f, 168.0f, 214.0f),
                    PathNode.LineTo(208.0f, 214.0f),
                    PathNode.CurveTo(211.3137f, 214.0f, 214.0f, 211.3137f, 214.0f, 208.0f),
                    PathNode.LineTo(214.0f, 168.0f),
                    PathNode.CurveTo(214.0f, 164.6863f, 211.3137f, 162.0f, 208.0f, 162.0f),
                    PathNode.Close,
                    PathNode.MoveTo(88.0f, 42.0f),
                    PathNode.LineTo(48.0f, 42.0f),
                    PathNode.CurveTo(44.68629f, 42.0f, 42.0f, 44.68629f, 42.0f, 48.0f),
                    PathNode.LineTo(42.0f, 88.0f),
                    PathNode.CurveTo(42.0f, 91.313705f, 44.68629f, 94.0f, 48.0f, 94.0f),
                    PathNode.CurveTo(51.31371f, 94.0f, 54.0f, 91.313705f, 54.0f, 88.0f),
                    PathNode.LineTo(54.0f, 54.0f),
                    PathNode.LineTo(88.0f, 54.0f),
                    PathNode.CurveTo(91.313705f, 54.0f, 94.0f, 51.31371f, 94.0f, 48.0f),
                    PathNode.CurveTo(94.0f, 44.68629f, 91.313705f, 42.0f, 88.0f, 42.0f),
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
        return _cornersOut!!
    }

private var _cornersOut: ImageVector? = null
