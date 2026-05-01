package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.PersonSimpleCircle: ImageVector
    get() {
        if (_personSimpleCircle != null) return _personSimpleCircle!!
        _personSimpleCircle = phosphorLightIcon(
            name = "PersonSimpleCircle",
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
                    PathNode.MoveTo(114.0f, 80.0f),
                    PathNode.CurveTo(114.0f, 72.26801f, 120.26801f, 66.0f, 128.0f, 66.0f),
                    PathNode.CurveTo(135.73198f, 66.0f, 142.0f, 72.26801f, 142.0f, 80.0f),
                    PathNode.CurveTo(142.0f, 87.73199f, 135.73198f, 94.0f, 128.0f, 94.0f),
                    PathNode.CurveTo(120.26801f, 94.0f, 114.0f, 87.73199f, 114.0f, 80.0f),
                    PathNode.Close,
                    PathNode.MoveTo(182.0f, 112.0f),
                    PathNode.CurveTo(182.0f, 115.313705f, 179.3137f, 118.0f, 176.0f, 118.0f),
                    PathNode.LineTo(134.0f, 118.0f),
                    PathNode.LineTo(134.0f, 134.18f),
                    PathNode.LineTo(165.0f, 180.67f),
                    PathNode.CurveTo(166.83911f, 183.43143f, 166.09143f, 187.16089f, 163.33f, 189.0f),
                    PathNode.CurveTo(160.56857f, 190.83911f, 156.83911f, 190.09143f, 155.0f, 187.33f),
                    PathNode.LineTo(128.0f, 146.82f),
                    PathNode.LineTo(101.0f, 187.33f),
                    PathNode.CurveTo(99.16089f, 190.09143f, 95.43143f, 190.83911f, 92.67f, 189.0f),
                    PathNode.CurveTo(89.90858f, 187.16089f, 89.16089f, 183.43143f, 91.0f, 180.67f),
                    PathNode.LineTo(122.0f, 134.18f),
                    PathNode.LineTo(122.0f, 118.0f),
                    PathNode.LineTo(80.0f, 118.0f),
                    PathNode.CurveTo(76.686295f, 118.0f, 74.0f, 115.313705f, 74.0f, 112.0f),
                    PathNode.CurveTo(74.0f, 108.686295f, 76.686295f, 106.0f, 80.0f, 106.0f),
                    PathNode.LineTo(176.0f, 106.0f),
                    PathNode.CurveTo(179.3137f, 106.0f, 182.0f, 108.686295f, 182.0f, 112.0f),
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
        return _personSimpleCircle!!
    }

private var _personSimpleCircle: ImageVector? = null
