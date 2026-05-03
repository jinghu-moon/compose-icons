package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.NotSupersetOf: ImageVector
    get() {
        if (_notSupersetOf != null) return _notSupersetOf!!
        _notSupersetOf = phosphorThinIcon(
            name = "NotSupersetOf",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(208.0f, 196.0f),
                    PathNode.LineTo(71.59f, 196.0f),
                    PathNode.LineTo(100.68f, 164.0f),
                    PathNode.LineTo(152.0f, 164.0f),
                    PathNode.CurveTo(176.33696f, 163.97948f, 198.25081f, 149.26003f, 207.47386f, 126.7384f),
                    PathNode.CurveTo(216.69691f, 104.21678f, 211.402f, 78.3548f, 194.07f, 61.27f),
                    PathNode.LineTo(211.0f, 42.69f),
                    PathNode.CurveTo(212.48564f, 41.033146f, 212.34685f, 38.485645f, 210.69f, 37.0f),
                    PathNode.CurveTo(209.03314f, 35.514355f, 206.48564f, 35.653145f, 205.0f, 37.31f),
                    PathNode.LineTo(188.0f, 56.0f),
                    PathNode.CurveTo(177.62344f, 48.193115f, 164.98538f, 43.98043f, 152.0f, 44.0f),
                    PathNode.LineTo(56.0f, 44.0f),
                    PathNode.CurveTo(53.79086f, 44.0f, 52.0f, 45.79086f, 52.0f, 48.0f),
                    PathNode.CurveTo(52.0f, 50.20914f, 53.79086f, 52.0f, 56.0f, 52.0f),
                    PathNode.LineTo(152.0f, 52.0f),
                    PathNode.CurveTo(163.00375f, 51.995274f, 173.72258f, 55.498158f, 182.6f, 62.0f),
                    PathNode.LineTo(97.14f, 156.0f),
                    PathNode.LineTo(56.0f, 156.0f),
                    PathNode.CurveTo(53.79086f, 156.0f, 52.0f, 157.79086f, 52.0f, 160.0f),
                    PathNode.CurveTo(52.0f, 162.20914f, 53.79086f, 164.0f, 56.0f, 164.0f),
                    PathNode.LineTo(89.87f, 164.0f),
                    PathNode.LineTo(45.0f, 213.31f),
                    PathNode.CurveTo(43.514355f, 214.96686f, 43.653145f, 217.51436f, 45.31f, 219.0f),
                    PathNode.CurveTo(46.966854f, 220.48564f, 49.514355f, 220.34685f, 51.0f, 218.69f),
                    PathNode.LineTo(64.31f, 204.0f),
                    PathNode.LineTo(208.0f, 204.0f),
                    PathNode.CurveTo(210.20914f, 204.0f, 212.0f, 202.20914f, 212.0f, 200.0f),
                    PathNode.CurveTo(212.0f, 197.79086f, 210.20914f, 196.0f, 208.0f, 196.0f),
                    PathNode.Close,
                    PathNode.MoveTo(188.69f, 67.19f),
                    PathNode.CurveTo(203.58061f, 82.04785f, 208.05298f, 104.41348f, 200.02109f, 123.85506f),
                    PathNode.CurveTo(191.98921f, 143.29663f, 173.03534f, 155.9842f, 152.0f, 156.0f),
                    PathNode.LineTo(108.0f, 156.0f),
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
        return _notSupersetOf!!
    }

private var _notSupersetOf: ImageVector? = null
