package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.SimCard: ImageVector
    get() {
        if (_simCard != null) return _simCard!!
        _simCard = phosphorThinIcon(
            name = "SimCard",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(210.83f, 85.17f),
                    PathNode.LineTo(154.83f, 29.17f),
                    PathNode.CurveTo(154.07921f, 28.420046f, 153.06119f, 27.999166f, 152.0f, 28.0f),
                    PathNode.LineTo(56.0f, 28.0f),
                    PathNode.CurveTo(49.37258f, 28.0f, 44.0f, 33.37258f, 44.0f, 40.0f),
                    PathNode.LineTo(44.0f, 216.0f),
                    PathNode.CurveTo(44.0f, 222.62741f, 49.37258f, 228.0f, 56.0f, 228.0f),
                    PathNode.LineTo(200.0f, 228.0f),
                    PathNode.CurveTo(206.62741f, 228.0f, 212.0f, 222.62741f, 212.0f, 216.0f),
                    PathNode.LineTo(212.0f, 88.0f),
                    PathNode.CurveTo(212.00084f, 86.93881f, 211.57996f, 85.92079f, 210.83f, 85.17f),
                    PathNode.Close,
                    PathNode.MoveTo(204.0f, 216.0f),
                    PathNode.CurveTo(204.0f, 218.20914f, 202.20914f, 220.0f, 200.0f, 220.0f),
                    PathNode.LineTo(56.0f, 220.0f),
                    PathNode.CurveTo(53.79086f, 220.0f, 52.0f, 218.20914f, 52.0f, 216.0f),
                    PathNode.LineTo(52.0f, 40.0f),
                    PathNode.CurveTo(52.0f, 37.79086f, 53.79086f, 36.0f, 56.0f, 36.0f),
                    PathNode.LineTo(150.35f, 36.0f),
                    PathNode.LineTo(204.0f, 89.66f),
                    PathNode.Close,
                    PathNode.MoveTo(76.0f, 120.0f),
                    PathNode.LineTo(76.0f, 192.0f),
                    PathNode.CurveTo(76.0f, 194.20914f, 77.79086f, 196.0f, 80.0f, 196.0f),
                    PathNode.LineTo(176.0f, 196.0f),
                    PathNode.CurveTo(178.20914f, 196.0f, 180.0f, 194.20914f, 180.0f, 192.0f),
                    PathNode.LineTo(180.0f, 120.0f),
                    PathNode.CurveTo(180.0f, 117.79086f, 178.20914f, 116.0f, 176.0f, 116.0f),
                    PathNode.LineTo(80.0f, 116.0f),
                    PathNode.CurveTo(77.79086f, 116.0f, 76.0f, 117.79086f, 76.0f, 120.0f),
                    PathNode.Close,
                    PathNode.MoveTo(84.0f, 124.0f),
                    PathNode.LineTo(172.0f, 124.0f),
                    PathNode.LineTo(172.0f, 188.0f),
                    PathNode.LineTo(148.0f, 188.0f),
                    PathNode.LineTo(148.0f, 152.0f),
                    PathNode.CurveTo(148.0f, 149.79086f, 146.20914f, 148.0f, 144.0f, 148.0f),
                    PathNode.CurveTo(141.79086f, 148.0f, 140.0f, 149.79086f, 140.0f, 152.0f),
                    PathNode.LineTo(140.0f, 188.0f),
                    PathNode.LineTo(116.0f, 188.0f),
                    PathNode.LineTo(116.0f, 152.0f),
                    PathNode.CurveTo(116.0f, 149.79086f, 114.20914f, 148.0f, 112.0f, 148.0f),
                    PathNode.CurveTo(109.79086f, 148.0f, 108.0f, 149.79086f, 108.0f, 152.0f),
                    PathNode.LineTo(108.0f, 188.0f),
                    PathNode.LineTo(84.0f, 188.0f),
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
        return _simCard!!
    }

private var _simCard: ImageVector? = null
