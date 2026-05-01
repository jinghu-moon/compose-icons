package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.GenderMale: ImageVector
    get() {
        if (_genderMale != null) return _genderMale!!
        _genderMale = phosphorThinIcon(
            name = "GenderMale",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(216.0f, 36.0f),
                    PathNode.LineTo(168.0f, 36.0f),
                    PathNode.CurveTo(165.79086f, 36.0f, 164.0f, 37.79086f, 164.0f, 40.0f),
                    PathNode.CurveTo(164.0f, 42.20914f, 165.79086f, 44.0f, 168.0f, 44.0f),
                    PathNode.LineTo(206.35f, 44.0f),
                    PathNode.LineTo(154.82f, 95.52f),
                    PathNode.CurveTo(124.19799f, 67.96585f, 77.19865f, 69.82395f, 48.84749f, 99.709564f),
                    PathNode.CurveTo(20.496334f, 129.59518f, 21.11584f, 176.62717f, 50.244335f, 205.75566f),
                    PathNode.CurveTo(79.37283f, 234.88416f, 126.40481f, 235.50366f, 156.29044f, 207.15251f),
                    PathNode.CurveTo(186.17604f, 178.80135f, 188.03415f, 131.802f, 160.48f, 101.18f),
                    PathNode.LineTo(212.0f, 49.66f),
                    PathNode.LineTo(212.0f, 88.0f),
                    PathNode.CurveTo(212.0f, 90.20914f, 213.79086f, 92.0f, 216.0f, 92.0f),
                    PathNode.CurveTo(218.20914f, 92.0f, 220.0f, 90.20914f, 220.0f, 88.0f),
                    PathNode.LineTo(220.0f, 40.0f),
                    PathNode.CurveTo(220.0f, 37.79086f, 218.20914f, 36.0f, 216.0f, 36.0f),
                    PathNode.Close,
                    PathNode.MoveTo(152.07f, 200.11f),
                    PathNode.CurveTo(125.51238f, 226.66017f, 82.460625f, 226.65616f, 55.90797f, 200.10101f),
                    PathNode.CurveTo(29.355314f, 173.54588f, 29.355314f, 130.49413f, 55.90797f, 103.93899f),
                    PathNode.CurveTo(82.460625f, 77.38385f, 125.51238f, 77.37982f, 152.07f, 103.93f),
                    PathNode.CurveTo(178.59053f, 130.50545f, 178.59053f, 173.53455f, 152.07f, 200.11f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 8.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _genderMale!!
    }

private var _genderMale: ImageVector? = null
