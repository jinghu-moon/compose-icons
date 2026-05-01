package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.LetterCircleP: ImageVector
    get() {
        if (_letterCircleP != null) return _letterCircleP!!
        _letterCircleP = phosphorLightIcon(
            name = "LetterCircleP",
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
                    PathNode.MoveTo(136.0f, 82.0f),
                    PathNode.LineTo(104.0f, 82.0f),
                    PathNode.CurveTo(100.686295f, 82.0f, 98.0f, 84.686295f, 98.0f, 88.0f),
                    PathNode.LineTo(98.0f, 168.0f),
                    PathNode.CurveTo(98.0f, 171.3137f, 100.686295f, 174.0f, 104.0f, 174.0f),
                    PathNode.CurveTo(107.313705f, 174.0f, 110.0f, 171.3137f, 110.0f, 168.0f),
                    PathNode.LineTo(110.0f, 150.0f),
                    PathNode.LineTo(136.0f, 150.0f),
                    PathNode.CurveTo(154.77768f, 150.0f, 170.0f, 134.77768f, 170.0f, 116.0f),
                    PathNode.CurveTo(170.0f, 97.22232f, 154.77768f, 82.0f, 136.0f, 82.0f),
                    PathNode.Close,
                    PathNode.MoveTo(136.0f, 138.0f),
                    PathNode.LineTo(110.0f, 138.0f),
                    PathNode.LineTo(110.0f, 94.0f),
                    PathNode.LineTo(136.0f, 94.0f),
                    PathNode.CurveTo(148.15027f, 94.0f, 158.0f, 103.84974f, 158.0f, 116.0f),
                    PathNode.CurveTo(158.0f, 128.15027f, 148.15027f, 138.0f, 136.0f, 138.0f),
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
        return _letterCircleP!!
    }

private var _letterCircleP: ImageVector? = null
