package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.CodeSimple: ImageVector
    get() {
        if (_codeSimple != null) return _codeSimple!!
        _codeSimple = phosphorLightIcon(
            name = "CodeSimple",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(92.0f, 68.49f),
                    PathNode.LineTo(25.0f, 128.0f),
                    PathNode.LineTo(92.0f, 187.52f),
                    PathNode.CurveTo(94.48528f, 189.72914f, 94.70914f, 193.53471f, 92.5f, 196.02f),
                    PathNode.CurveTo(90.29086f, 198.50528f, 86.48528f, 198.72914f, 84.0f, 196.52f),
                    PathNode.LineTo(12.0f, 132.52f),
                    PathNode.CurveTo(10.708497f, 131.381f, 9.968627f, 129.742f, 9.968627f, 128.02f),
                    PathNode.CurveTo(9.968627f, 126.298f, 10.708497f, 124.659f, 12.0f, 123.52f),
                    PathNode.LineTo(84.0f, 59.52f),
                    PathNode.CurveTo(86.48528f, 57.31086f, 90.29086f, 57.534718f, 92.5f, 60.02f),
                    PathNode.CurveTo(94.70914f, 62.50528f, 94.48528f, 66.31086f, 92.0f, 68.52f),
                    PathNode.Close,
                    PathNode.MoveTo(244.0f, 123.49f),
                    PathNode.LineTo(172.0f, 59.49f),
                    PathNode.CurveTo(169.51472f, 57.28086f, 165.70914f, 57.50472f, 163.5f, 59.99f),
                    PathNode.CurveTo(161.29086f, 62.47528f, 161.51472f, 66.28086f, 164.0f, 68.49f),
                    PathNode.LineTo(231.0f, 128.0f),
                    PathNode.LineTo(164.0f, 187.52f),
                    PathNode.CurveTo(161.51472f, 189.72914f, 161.29086f, 193.53471f, 163.5f, 196.02f),
                    PathNode.CurveTo(165.70914f, 198.50528f, 169.51472f, 198.72914f, 172.0f, 196.52f),
                    PathNode.LineTo(244.0f, 132.52f),
                    PathNode.CurveTo(245.2915f, 131.381f, 246.03137f, 129.742f, 246.03137f, 128.02f),
                    PathNode.CurveTo(246.03137f, 126.298f, 245.2915f, 124.659f, 244.0f, 123.52f),
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
        return _codeSimple!!
    }

private var _codeSimple: ImageVector? = null
