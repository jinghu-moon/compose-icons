package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Option: ImageVector
    get() {
        if (_option != null) return _option!!
        _option = phosphorThinIcon(
            name = "Option",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(228.0f, 192.0f),
                    PathNode.CurveTo(228.0f, 194.20914f, 226.20914f, 196.0f, 224.0f, 196.0f),
                    PathNode.LineTo(160.94f, 196.0f),
                    PathNode.CurveTo(156.39262f, 196.0136f, 152.23232f, 193.44296f, 150.21f, 189.37f),
                    PathNode.LineTo(98.63f, 86.21f),
                    PathNode.CurveTo(97.953354f, 84.857796f, 96.57206f, 84.0027f, 95.06f, 84.0f),
                    PathNode.LineTo(32.0f, 84.0f),
                    PathNode.CurveTo(29.790861f, 84.0f, 28.0f, 82.20914f, 28.0f, 80.0f),
                    PathNode.CurveTo(28.0f, 77.79086f, 29.790861f, 76.0f, 32.0f, 76.0f),
                    PathNode.LineTo(95.06f, 76.0f),
                    PathNode.CurveTo(99.607376f, 75.986404f, 103.767685f, 78.55704f, 105.79f, 82.63f),
                    PathNode.LineTo(157.37f, 185.79f),
                    PathNode.CurveTo(158.04665f, 187.14221f, 159.42795f, 187.9973f, 160.94f, 188.0f),
                    PathNode.LineTo(224.0f, 188.0f),
                    PathNode.CurveTo(226.20914f, 188.0f, 228.0f, 189.79086f, 228.0f, 192.0f),
                    PathNode.Close,
                    PathNode.MoveTo(152.0f, 84.0f),
                    PathNode.LineTo(224.0f, 84.0f),
                    PathNode.CurveTo(226.20914f, 84.0f, 228.0f, 82.20914f, 228.0f, 80.0f),
                    PathNode.CurveTo(228.0f, 77.79086f, 226.20914f, 76.0f, 224.0f, 76.0f),
                    PathNode.LineTo(152.0f, 76.0f),
                    PathNode.CurveTo(149.79086f, 76.0f, 148.0f, 77.79086f, 148.0f, 80.0f),
                    PathNode.CurveTo(148.0f, 82.20914f, 149.79086f, 84.0f, 152.0f, 84.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 8.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _option!!
    }

private var _option: ImageVector? = null
