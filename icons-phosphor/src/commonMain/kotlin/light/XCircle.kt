package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.XCircle: ImageVector
    get() {
        if (_xCircle != null) return _xCircle!!
        _xCircle = phosphorLightIcon(
            name = "XCircle",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(164.24f, 100.24f),
                    PathNode.LineTo(136.48f, 128.0f),
                    PathNode.LineTo(164.24f, 155.76f),
                    PathNode.CurveTo(165.84523f, 157.25575f, 166.506f, 159.50844f, 165.96309f, 161.63431f),
                    PathNode.CurveTo(165.42018f, 163.76018f, 163.76018f, 165.42018f, 161.63431f, 165.96309f),
                    PathNode.CurveTo(159.50844f, 166.506f, 157.25575f, 165.84523f, 155.76f, 164.24f),
                    PathNode.LineTo(128.0f, 136.48f),
                    PathNode.LineTo(100.24f, 164.24f),
                    PathNode.CurveTo(97.87592f, 166.44287f, 94.191925f, 166.37787f, 91.90703f, 164.09297f),
                    PathNode.CurveTo(89.62213f, 161.80807f, 89.55713f, 158.12408f, 91.76f, 155.76f),
                    PathNode.LineTo(119.52f, 128.0f),
                    PathNode.LineTo(91.76f, 100.24f),
                    PathNode.CurveTo(89.55713f, 97.87592f, 89.62213f, 94.191925f, 91.90703f, 91.90703f),
                    PathNode.CurveTo(94.191925f, 89.62213f, 97.87592f, 89.55713f, 100.24f, 91.76f),
                    PathNode.LineTo(128.0f, 119.52f),
                    PathNode.LineTo(155.76f, 91.76f),
                    PathNode.CurveTo(158.12408f, 89.55713f, 161.80807f, 89.62213f, 164.09297f, 91.90703f),
                    PathNode.CurveTo(166.37787f, 94.191925f, 166.44287f, 97.87592f, 164.24f, 100.24f),
                    PathNode.Close,
                    PathNode.MoveTo(230.0f, 128.0f),
                    PathNode.CurveTo(230.0f, 184.33304f, 184.33304f, 230.0f, 128.0f, 230.0f),
                    PathNode.CurveTo(71.666954f, 230.0f, 26.0f, 184.33304f, 26.0f, 128.0f),
                    PathNode.CurveTo(26.0f, 71.666954f, 71.666954f, 26.0f, 128.0f, 26.0f),
                    PathNode.CurveTo(184.30563f, 26.066126f, 229.93387f, 71.69437f, 230.0f, 128.0f),
                    PathNode.Close,
                    PathNode.MoveTo(218.0f, 128.0f),
                    PathNode.CurveTo(218.0f, 78.29437f, 177.70563f, 38.0f, 128.0f, 38.0f),
                    PathNode.CurveTo(78.29437f, 38.0f, 38.0f, 78.29437f, 38.0f, 128.0f),
                    PathNode.CurveTo(38.0f, 177.70563f, 78.29437f, 218.0f, 128.0f, 218.0f),
                    PathNode.CurveTo(177.68279f, 217.94489f, 217.94489f, 177.68279f, 218.0f, 128.0f),
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
        return _xCircle!!
    }

private var _xCircle: ImageVector? = null
