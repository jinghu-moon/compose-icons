package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Radical: ImageVector
    get() {
        if (_radical != null) return _radical!!
        _radical = phosphorThinIcon(
            name = "Radical",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(244.0f, 80.0f),
                    PathNode.LineTo(244.0f, 104.0f),
                    PathNode.CurveTo(244.0f, 106.20914f, 242.20914f, 108.0f, 240.0f, 108.0f),
                    PathNode.CurveTo(237.79086f, 108.0f, 236.0f, 106.20914f, 236.0f, 104.0f),
                    PathNode.LineTo(236.0f, 84.0f),
                    PathNode.LineTo(130.77f, 84.0f),
                    PathNode.LineTo(83.77f, 209.4f),
                    PathNode.CurveTo(83.18431f, 210.96077f, 81.69205f, 211.99466f, 80.025f, 211.99466f),
                    PathNode.CurveTo(78.35795f, 211.99466f, 76.8657f, 210.96077f, 76.28f, 209.4f),
                    PathNode.LineTo(28.28f, 81.4f),
                    PathNode.CurveTo(27.765099f, 80.05905f, 28.008734f, 78.544975f, 28.9183f, 77.43324f),
                    PathNode.CurveTo(29.827868f, 76.32151f, 31.263697f, 75.78284f, 32.68006f, 76.02196f),
                    PathNode.CurveTo(34.096424f, 76.26108f, 35.275826f, 77.24128f, 35.77f, 78.59f),
                    PathNode.LineTo(80.0f, 196.61f),
                    PathNode.LineTo(124.26f, 78.61f),
                    PathNode.CurveTo(124.84001f, 77.0449f, 126.33089f, 76.00448f, 128.0f, 76.0f),
                    PathNode.LineTo(240.0f, 76.0f),
                    PathNode.CurveTo(242.20914f, 76.0f, 244.0f, 77.79086f, 244.0f, 80.0f),
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
        return _radical!!
    }

private var _radical: ImageVector? = null
