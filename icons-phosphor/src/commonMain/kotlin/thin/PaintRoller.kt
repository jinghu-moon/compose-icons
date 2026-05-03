package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.PaintRoller: ImageVector
    get() {
        if (_paintRoller != null) return _paintRoller!!
        _paintRoller = phosphorThinIcon(
            name = "PaintRoller",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(232.0f, 92.0f),
                    PathNode.LineTo(212.0f, 92.0f),
                    PathNode.LineTo(212.0f, 64.0f),
                    PathNode.CurveTo(212.0f, 57.37258f, 206.62741f, 52.0f, 200.0f, 52.0f),
                    PathNode.LineTo(48.0f, 52.0f),
                    PathNode.CurveTo(41.37258f, 52.0f, 36.0f, 57.37258f, 36.0f, 64.0f),
                    PathNode.LineTo(36.0f, 92.0f),
                    PathNode.LineTo(16.0f, 92.0f),
                    PathNode.CurveTo(13.790861f, 92.0f, 12.0f, 93.79086f, 12.0f, 96.0f),
                    PathNode.CurveTo(12.0f, 98.20914f, 13.790861f, 100.0f, 16.0f, 100.0f),
                    PathNode.LineTo(36.0f, 100.0f),
                    PathNode.LineTo(36.0f, 128.0f),
                    PathNode.CurveTo(36.0f, 134.62741f, 41.37258f, 140.0f, 48.0f, 140.0f),
                    PathNode.LineTo(200.0f, 140.0f),
                    PathNode.CurveTo(206.62741f, 140.0f, 212.0f, 134.62741f, 212.0f, 128.0f),
                    PathNode.LineTo(212.0f, 100.0f),
                    PathNode.LineTo(232.0f, 100.0f),
                    PathNode.CurveTo(234.20914f, 100.0f, 236.0f, 101.79086f, 236.0f, 104.0f),
                    PathNode.LineTo(236.0f, 154.0f),
                    PathNode.CurveTo(235.99742f, 155.78336f, 234.81459f, 157.34958f, 233.1f, 157.84f),
                    PathNode.LineTo(132.7f, 186.5f),
                    PathNode.CurveTo(127.56332f, 187.9692f, 124.016624f, 192.65736f, 124.0f, 198.0f),
                    PathNode.LineTo(124.0f, 232.0f),
                    PathNode.CurveTo(124.0f, 234.20914f, 125.79086f, 236.0f, 128.0f, 236.0f),
                    PathNode.CurveTo(130.20914f, 236.0f, 132.0f, 234.20914f, 132.0f, 232.0f),
                    PathNode.LineTo(132.0f, 198.0f),
                    PathNode.CurveTo(132.00258f, 196.21664f, 133.18541f, 194.65042f, 134.9f, 194.16f),
                    PathNode.LineTo(235.3f, 165.5f),
                    PathNode.CurveTo(240.43668f, 164.0308f, 243.98335f, 159.34264f, 244.0f, 154.0f),
                    PathNode.LineTo(244.0f, 104.0f),
                    PathNode.CurveTo(244.0f, 97.37258f, 238.62741f, 92.0f, 232.0f, 92.0f),
                    PathNode.Close,
                    PathNode.MoveTo(204.0f, 128.0f),
                    PathNode.CurveTo(204.0f, 130.20914f, 202.20914f, 132.0f, 200.0f, 132.0f),
                    PathNode.LineTo(48.0f, 132.0f),
                    PathNode.CurveTo(45.79086f, 132.0f, 44.0f, 130.20914f, 44.0f, 128.0f),
                    PathNode.LineTo(44.0f, 64.0f),
                    PathNode.CurveTo(44.0f, 61.79086f, 45.79086f, 60.0f, 48.0f, 60.0f),
                    PathNode.LineTo(200.0f, 60.0f),
                    PathNode.CurveTo(202.20914f, 60.0f, 204.0f, 61.79086f, 204.0f, 64.0f),
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
        return _paintRoller!!
    }

private var _paintRoller: ImageVector? = null
