package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.ArrowClockwise: ImageVector
    get() {
        if (_arrowClockwise != null) return _arrowClockwise!!
        _arrowClockwise = phosphorThinIcon(
            name = "ArrowClockwise",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(236.0f, 56.0f),
                    PathNode.LineTo(236.0f, 104.0f),
                    PathNode.CurveTo(236.0f, 106.20914f, 234.20914f, 108.0f, 232.0f, 108.0f),
                    PathNode.LineTo(184.0f, 108.0f),
                    PathNode.CurveTo(181.79086f, 108.0f, 180.0f, 106.20914f, 180.0f, 104.0f),
                    PathNode.CurveTo(180.0f, 101.79086f, 181.79086f, 100.0f, 184.0f, 100.0f),
                    PathNode.LineTo(221.7f, 100.0f),
                    PathNode.LineTo(187.53f, 68.69f),
                    PathNode.LineTo(187.4f, 68.57f),
                    PathNode.CurveTo(154.81789f, 35.997005f, 102.07922f, 35.746662f, 69.18934f, 68.008865f),
                    PathNode.CurveTo(36.299458f, 100.27108f, 35.53368f, 153.00476f, 67.47289f, 186.2084f),
                    PathNode.CurveTo(99.41211f, 219.41203f, 152.13579f, 220.69319f, 185.65f, 189.08f),
                    PathNode.CurveTo(187.25714f, 187.56122f, 189.79121f, 187.63286f, 191.31f, 189.24f),
                    PathNode.CurveTo(192.82878f, 190.84715f, 192.75714f, 193.38121f, 191.15f, 194.9f),
                    PathNode.CurveTo(174.1065f, 211.06917f, 151.49297f, 220.0573f, 128.0f, 220.0f),
                    PathNode.LineTo(126.74f, 220.0f),
                    PathNode.CurveTo(85.28859f, 219.40427f, 49.355694f, 191.15918f, 38.986477f, 151.02126f),
                    PathNode.CurveTo(28.617258f, 110.88332f, 46.373337f, 68.76824f, 82.34948f, 48.169907f),
                    PathNode.CurveTo(118.32562f, 27.571577f, 163.63428f, 33.578617f, 193.0f, 62.84f),
                    PathNode.LineTo(228.0f, 94.89f),
                    PathNode.LineTo(228.0f, 56.0f),
                    PathNode.CurveTo(228.0f, 53.79086f, 229.79086f, 52.0f, 232.0f, 52.0f),
                    PathNode.CurveTo(234.20914f, 52.0f, 236.0f, 53.79086f, 236.0f, 56.0f),
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
        return _arrowClockwise!!
    }

private var _arrowClockwise: ImageVector? = null
