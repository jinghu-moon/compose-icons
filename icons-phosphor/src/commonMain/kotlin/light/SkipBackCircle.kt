package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.SkipBackCircle: ImageVector
    get() {
        if (_skipBackCircle != null) return _skipBackCircle!!
        _skipBackCircle = phosphorLightIcon(
            name = "SkipBackCircle",
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
                    PathNode.MoveTo(162.91f, 82.75f),
                    PathNode.CurveTo(161.00189f, 81.69214f, 158.66994f, 81.7534f, 156.82f, 82.91f),
                    PathNode.LineTo(102.0f, 117.17f),
                    PathNode.LineTo(102.0f, 88.0f),
                    PathNode.CurveTo(102.0f, 84.686295f, 99.313705f, 82.0f, 96.0f, 82.0f),
                    PathNode.CurveTo(92.686295f, 82.0f, 90.0f, 84.686295f, 90.0f, 88.0f),
                    PathNode.LineTo(90.0f, 168.0f),
                    PathNode.CurveTo(90.0f, 171.3137f, 92.686295f, 174.0f, 96.0f, 174.0f),
                    PathNode.CurveTo(99.313705f, 174.0f, 102.0f, 171.3137f, 102.0f, 168.0f),
                    PathNode.LineTo(102.0f, 138.83f),
                    PathNode.LineTo(156.82f, 173.09f),
                    PathNode.CurveTo(158.66992f, 174.2462f, 161.00162f, 174.30724f, 162.90948f, 173.24939f),
                    PathNode.CurveTo(164.81737f, 172.19154f, 166.00073f, 170.18152f, 166.0f, 168.0f),
                    PathNode.LineTo(166.0f, 88.0f),
                    PathNode.CurveTo(166.00105f, 85.818375f, 164.81787f, 83.80809f, 162.91f, 82.75f),
                    PathNode.Close,
                    PathNode.MoveTo(154.0f, 157.17f),
                    PathNode.LineTo(107.32f, 128.0f),
                    PathNode.LineTo(154.0f, 98.83f),
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
        return _skipBackCircle!!
    }

private var _skipBackCircle: ImageVector? = null
