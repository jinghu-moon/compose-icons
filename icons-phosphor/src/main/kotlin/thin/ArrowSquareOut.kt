package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.ArrowSquareOut: ImageVector
    get() {
        if (_arrowSquareOut != null) return _arrowSquareOut!!
        _arrowSquareOut = phosphorThinIcon(
            name = "ArrowSquareOut",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(220.0f, 104.0f),
                    PathNode.CurveTo(220.0f, 106.20914f, 218.20914f, 108.0f, 216.0f, 108.0f),
                    PathNode.CurveTo(213.79086f, 108.0f, 212.0f, 106.20914f, 212.0f, 104.0f),
                    PathNode.LineTo(212.0f, 49.66f),
                    PathNode.LineTo(138.84f, 122.83f),
                    PathNode.CurveTo(137.27704f, 124.39297f, 134.74297f, 124.39297f, 133.18f, 122.83f),
                    PathNode.CurveTo(131.61703f, 121.26704f, 131.61703f, 118.73296f, 133.18f, 117.17f),
                    PathNode.LineTo(206.34f, 44.0f),
                    PathNode.LineTo(152.0f, 44.0f),
                    PathNode.CurveTo(149.79086f, 44.0f, 148.0f, 42.20914f, 148.0f, 40.0f),
                    PathNode.CurveTo(148.0f, 37.79086f, 149.79086f, 36.0f, 152.0f, 36.0f),
                    PathNode.LineTo(216.0f, 36.0f),
                    PathNode.CurveTo(218.20914f, 36.0f, 220.0f, 37.79086f, 220.0f, 40.0f),
                    PathNode.Close,
                    PathNode.MoveTo(184.0f, 132.0f),
                    PathNode.CurveTo(181.79086f, 132.0f, 180.0f, 133.79086f, 180.0f, 136.0f),
                    PathNode.LineTo(180.0f, 208.0f),
                    PathNode.CurveTo(180.0f, 210.20914f, 178.20914f, 212.0f, 176.0f, 212.0f),
                    PathNode.LineTo(48.0f, 212.0f),
                    PathNode.CurveTo(45.79086f, 212.0f, 44.0f, 210.20914f, 44.0f, 208.0f),
                    PathNode.LineTo(44.0f, 80.0f),
                    PathNode.CurveTo(44.0f, 77.79086f, 45.79086f, 76.0f, 48.0f, 76.0f),
                    PathNode.LineTo(120.0f, 76.0f),
                    PathNode.CurveTo(122.20914f, 76.0f, 124.0f, 74.20914f, 124.0f, 72.0f),
                    PathNode.CurveTo(124.0f, 69.79086f, 122.20914f, 68.0f, 120.0f, 68.0f),
                    PathNode.LineTo(48.0f, 68.0f),
                    PathNode.CurveTo(41.37258f, 68.0f, 36.0f, 73.37258f, 36.0f, 80.0f),
                    PathNode.LineTo(36.0f, 208.0f),
                    PathNode.CurveTo(36.0f, 214.62741f, 41.37258f, 220.0f, 48.0f, 220.0f),
                    PathNode.LineTo(176.0f, 220.0f),
                    PathNode.CurveTo(182.62741f, 220.0f, 188.0f, 214.62741f, 188.0f, 208.0f),
                    PathNode.LineTo(188.0f, 136.0f),
                    PathNode.CurveTo(188.0f, 133.79086f, 186.20914f, 132.0f, 184.0f, 132.0f),
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
        return _arrowSquareOut!!
    }

private var _arrowSquareOut: ImageVector? = null
