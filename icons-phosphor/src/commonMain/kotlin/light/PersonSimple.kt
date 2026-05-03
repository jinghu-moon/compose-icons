package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.PersonSimple: ImageVector
    get() {
        if (_personSimple != null) return _personSimple!!
        _personSimple = phosphorLightIcon(
            name = "PersonSimple",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(128.0f, 78.0f),
                    PathNode.CurveTo(144.56854f, 78.0f, 158.0f, 64.56854f, 158.0f, 48.0f),
                    PathNode.CurveTo(158.0f, 31.431458f, 144.56854f, 18.0f, 128.0f, 18.0f),
                    PathNode.CurveTo(111.43146f, 18.0f, 98.0f, 31.431458f, 98.0f, 48.0f),
                    PathNode.CurveTo(98.0f, 64.56854f, 111.43146f, 78.0f, 128.0f, 78.0f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 30.0f),
                    PathNode.CurveTo(137.94113f, 30.0f, 146.0f, 38.058876f, 146.0f, 48.0f),
                    PathNode.CurveTo(146.0f, 57.941124f, 137.94113f, 66.0f, 128.0f, 66.0f),
                    PathNode.CurveTo(118.05888f, 66.0f, 110.0f, 57.941124f, 110.0f, 48.0f),
                    PathNode.CurveTo(110.0f, 38.058876f, 118.05888f, 30.0f, 128.0f, 30.0f),
                    PathNode.Close,
                    PathNode.MoveTo(229.14f, 131.09f),
                    PathNode.CurveTo(227.41573f, 133.90958f, 223.73595f, 134.8038f, 220.91f, 133.09f),
                    PathNode.CurveTo(220.54f, 132.88f, 184.42f, 111.66f, 134.0f, 110.09f),
                    PathNode.LineTo(134.0f, 149.7f),
                    PathNode.LineTo(196.48f, 220.0f),
                    PathNode.CurveTo(198.68913f, 222.48528f, 198.46529f, 226.29086f, 195.98f, 228.5f),
                    PathNode.CurveTo(193.49472f, 230.70914f, 189.68913f, 230.48528f, 187.48f, 228.0f),
                    PathNode.LineTo(128.0f, 161.0f),
                    PathNode.LineTo(68.48f, 228.0f),
                    PathNode.CurveTo(66.27086f, 230.48528f, 62.465282f, 230.70914f, 59.98f, 228.5f),
                    PathNode.CurveTo(57.49472f, 226.29086f, 57.270863f, 222.48528f, 59.48f, 220.0f),
                    PathNode.LineTo(122.0f, 149.72f),
                    PathNode.LineTo(122.0f, 110.11f),
                    PathNode.CurveTo(71.58f, 111.71f, 35.45f, 132.93f, 35.08f, 133.11f),
                    PathNode.CurveTo(32.244335f, 134.74138f, 28.624474f, 133.80049f, 26.942125f, 130.99477f),
                    PathNode.CurveTo(25.259777f, 128.18903f, 26.135122f, 124.552765f, 28.91f, 122.82f),
                    PathNode.CurveTo(30.6f, 121.84f, 71.0f, 98.0f, 128.0f, 98.0f),
                    PathNode.CurveTo(185.0f, 98.0f, 225.39f, 121.84f, 227.09f, 122.86f),
                    PathNode.CurveTo(229.92744f, 124.56751f, 230.84497f, 128.25102f, 229.14f, 131.09f),
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
        return _personSimple!!
    }

private var _personSimple: ImageVector? = null
