package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.CornersIn: ImageVector
    get() {
        if (_cornersIn != null) return _cornersIn!!
        _cornersIn = phosphorLightIcon(
            name = "CornersIn",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(154.0f, 96.0f),
                    PathNode.LineTo(154.0f, 48.0f),
                    PathNode.CurveTo(154.0f, 44.68629f, 156.6863f, 42.0f, 160.0f, 42.0f),
                    PathNode.CurveTo(163.3137f, 42.0f, 166.0f, 44.68629f, 166.0f, 48.0f),
                    PathNode.LineTo(166.0f, 90.0f),
                    PathNode.LineTo(208.0f, 90.0f),
                    PathNode.CurveTo(211.3137f, 90.0f, 214.0f, 92.686295f, 214.0f, 96.0f),
                    PathNode.CurveTo(214.0f, 99.313705f, 211.3137f, 102.0f, 208.0f, 102.0f),
                    PathNode.LineTo(160.0f, 102.0f),
                    PathNode.CurveTo(156.6863f, 102.0f, 154.0f, 99.313705f, 154.0f, 96.0f),
                    PathNode.Close,
                    PathNode.MoveTo(96.0f, 154.0f),
                    PathNode.LineTo(48.0f, 154.0f),
                    PathNode.CurveTo(44.68629f, 154.0f, 42.0f, 156.6863f, 42.0f, 160.0f),
                    PathNode.CurveTo(42.0f, 163.3137f, 44.68629f, 166.0f, 48.0f, 166.0f),
                    PathNode.LineTo(90.0f, 166.0f),
                    PathNode.LineTo(90.0f, 208.0f),
                    PathNode.CurveTo(90.0f, 211.3137f, 92.686295f, 214.0f, 96.0f, 214.0f),
                    PathNode.CurveTo(99.313705f, 214.0f, 102.0f, 211.3137f, 102.0f, 208.0f),
                    PathNode.LineTo(102.0f, 160.0f),
                    PathNode.CurveTo(102.0f, 156.6863f, 99.313705f, 154.0f, 96.0f, 154.0f),
                    PathNode.Close,
                    PathNode.MoveTo(208.0f, 154.0f),
                    PathNode.LineTo(160.0f, 154.0f),
                    PathNode.CurveTo(156.6863f, 154.0f, 154.0f, 156.6863f, 154.0f, 160.0f),
                    PathNode.LineTo(154.0f, 208.0f),
                    PathNode.CurveTo(154.0f, 211.3137f, 156.6863f, 214.0f, 160.0f, 214.0f),
                    PathNode.CurveTo(163.3137f, 214.0f, 166.0f, 211.3137f, 166.0f, 208.0f),
                    PathNode.LineTo(166.0f, 166.0f),
                    PathNode.LineTo(208.0f, 166.0f),
                    PathNode.CurveTo(211.3137f, 166.0f, 214.0f, 163.3137f, 214.0f, 160.0f),
                    PathNode.CurveTo(214.0f, 156.6863f, 211.3137f, 154.0f, 208.0f, 154.0f),
                    PathNode.Close,
                    PathNode.MoveTo(96.0f, 42.0f),
                    PathNode.CurveTo(92.686295f, 42.0f, 90.0f, 44.68629f, 90.0f, 48.0f),
                    PathNode.LineTo(90.0f, 90.0f),
                    PathNode.LineTo(48.0f, 90.0f),
                    PathNode.CurveTo(44.68629f, 90.0f, 42.0f, 92.686295f, 42.0f, 96.0f),
                    PathNode.CurveTo(42.0f, 99.313705f, 44.68629f, 102.0f, 48.0f, 102.0f),
                    PathNode.LineTo(96.0f, 102.0f),
                    PathNode.CurveTo(99.313705f, 102.0f, 102.0f, 99.313705f, 102.0f, 96.0f),
                    PathNode.LineTo(102.0f, 48.0f),
                    PathNode.CurveTo(102.0f, 44.68629f, 99.313705f, 42.0f, 96.0f, 42.0f),
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
        return _cornersIn!!
    }

private var _cornersIn: ImageVector? = null
