package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.ArrowCounterClockwise: ImageVector
    get() {
        if (_arrowCounterClockwise != null) return _arrowCounterClockwise!!
        _arrowCounterClockwise = phosphorThinIcon(
            name = "ArrowCounterClockwise",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(220.0f, 128.0f),
                    PathNode.CurveTo(220.0045f, 178.33371f, 179.5592f, 219.32706f, 129.23f, 220.0f),
                    PathNode.LineTo(128.0f, 220.0f),
                    PathNode.CurveTo(104.51472f, 220.04803f, 81.91074f, 211.06087f, 64.87f, 194.9f),
                    PathNode.CurveTo(63.26285f, 193.38121f, 63.191216f, 190.84715f, 64.71f, 189.24f),
                    PathNode.CurveTo(66.22878f, 187.63286f, 68.76285f, 187.56122f, 70.37f, 189.08f),
                    PathNode.CurveTo(103.88949f, 220.68748f, 156.61288f, 219.3975f, 188.54652f, 186.1886f),
                    PathNode.CurveTo(220.48016f, 152.97968f, 219.70564f, 100.24619f, 186.81047f, 67.98945f),
                    PathNode.CurveTo(153.9153f, 35.73271f, 101.17676f, 35.99172f, 68.6f, 68.57f),
                    PathNode.LineTo(68.47f, 68.69f),
                    PathNode.LineTo(34.3f, 100.0f),
                    PathNode.LineTo(72.0f, 100.0f),
                    PathNode.CurveTo(74.20914f, 100.0f, 76.0f, 101.79086f, 76.0f, 104.0f),
                    PathNode.CurveTo(76.0f, 106.20914f, 74.20914f, 108.0f, 72.0f, 108.0f),
                    PathNode.LineTo(24.0f, 108.0f),
                    PathNode.CurveTo(21.790861f, 108.0f, 20.0f, 106.20914f, 20.0f, 104.0f),
                    PathNode.LineTo(20.0f, 56.0f),
                    PathNode.CurveTo(20.0f, 53.79086f, 21.790861f, 52.0f, 24.0f, 52.0f),
                    PathNode.CurveTo(26.209139f, 52.0f, 28.0f, 53.79086f, 28.0f, 56.0f),
                    PathNode.LineTo(28.0f, 94.89f),
                    PathNode.LineTo(63.0f, 62.89f),
                    PathNode.CurveTo(89.32407f, 36.60943f, 128.88354f, 28.766335f, 163.24313f, 43.015713f),
                    PathNode.CurveTo(197.6027f, 57.265087f, 220.00098f, 90.80289f, 220.0f, 128.0f),
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
        return _arrowCounterClockwise!!
    }

private var _arrowCounterClockwise: ImageVector? = null
