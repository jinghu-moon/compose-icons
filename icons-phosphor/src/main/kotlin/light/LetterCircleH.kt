package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.LetterCircleH: ImageVector
    get() {
        if (_letterCircleH != null) return _letterCircleH!!
        _letterCircleH = phosphorLightIcon(
            name = "LetterCircleH",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(128.0f, 26.0f),
                    PathNode.CurveTo(71.666954f, 26.0f, 26.0f, 71.666954f, 26.0f, 128.0f),
                    PathNode.CurveTo(26.0f, 184.33304f, 71.666954f, 230.0f, 128.0f, 230.0f),
                    PathNode.CurveTo(184.33304f, 230.0f, 230.0f, 184.33304f, 230.0f, 128.0f),
                    PathNode.CurveTo(229.93387f, 71.69437f, 184.30563f, 26.066126f, 128.0f, 26.0f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 218.0f),
                    PathNode.CurveTo(78.29437f, 218.0f, 38.0f, 177.70563f, 38.0f, 128.0f),
                    PathNode.CurveTo(38.0f, 78.29437f, 78.29437f, 38.0f, 128.0f, 38.0f),
                    PathNode.CurveTo(177.70563f, 38.0f, 218.0f, 78.29437f, 218.0f, 128.0f),
                    PathNode.CurveTo(217.94489f, 177.68279f, 177.68279f, 217.94489f, 128.0f, 218.0f),
                    PathNode.Close,
                    PathNode.MoveTo(166.0f, 88.0f),
                    PathNode.LineTo(166.0f, 168.0f),
                    PathNode.CurveTo(166.0f, 171.3137f, 163.3137f, 174.0f, 160.0f, 174.0f),
                    PathNode.CurveTo(156.6863f, 174.0f, 154.0f, 171.3137f, 154.0f, 168.0f),
                    PathNode.LineTo(154.0f, 134.0f),
                    PathNode.LineTo(102.0f, 134.0f),
                    PathNode.LineTo(102.0f, 168.0f),
                    PathNode.CurveTo(102.0f, 171.3137f, 99.313705f, 174.0f, 96.0f, 174.0f),
                    PathNode.CurveTo(92.686295f, 174.0f, 90.0f, 171.3137f, 90.0f, 168.0f),
                    PathNode.LineTo(90.0f, 88.0f),
                    PathNode.CurveTo(90.0f, 84.686295f, 92.686295f, 82.0f, 96.0f, 82.0f),
                    PathNode.CurveTo(99.313705f, 82.0f, 102.0f, 84.686295f, 102.0f, 88.0f),
                    PathNode.LineTo(102.0f, 122.0f),
                    PathNode.LineTo(154.0f, 122.0f),
                    PathNode.LineTo(154.0f, 88.0f),
                    PathNode.CurveTo(154.0f, 84.686295f, 156.6863f, 82.0f, 160.0f, 82.0f),
                    PathNode.CurveTo(163.3137f, 82.0f, 166.0f, 84.686295f, 166.0f, 88.0f),
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
        return _letterCircleH!!
    }

private var _letterCircleH: ImageVector? = null
