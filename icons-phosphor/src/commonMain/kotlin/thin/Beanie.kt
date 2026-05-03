package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Beanie: ImageVector
    get() {
        if (_beanie != null) return _beanie!!
        _beanie = phosphorThinIcon(
            name = "Beanie",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(220.0f, 164.7f),
                    PathNode.LineTo(220.0f, 144.0f),
                    PathNode.CurveTo(219.94395f, 99.54567f, 188.15889f, 61.468372f, 144.43f, 53.47f),
                    PathNode.CurveTo(151.60583f, 46.730778f, 153.93855f, 36.292904f, 150.31442f, 27.140026f),
                    PathNode.CurveTo(146.69028f, 17.987146f, 137.84427f, 11.97557f, 128.0f, 11.97557f),
                    PathNode.CurveTo(118.15573f, 11.97557f, 109.30973f, 17.987146f, 105.685585f, 27.140026f),
                    PathNode.CurveTo(102.06144f, 36.292904f, 104.39417f, 46.730778f, 111.57f, 53.47f),
                    PathNode.CurveTo(67.8411f, 61.468372f, 36.05604f, 99.54567f, 36.0f, 144.0f),
                    PathNode.LineTo(36.0f, 164.7f),
                    PathNode.CurveTo(31.210182f, 166.39343f, 28.005804f, 170.91963f, 28.0f, 176.0f),
                    PathNode.LineTo(28.0f, 208.0f),
                    PathNode.CurveTo(28.0f, 214.62741f, 33.37258f, 220.0f, 40.0f, 220.0f),
                    PathNode.LineTo(216.0f, 220.0f),
                    PathNode.CurveTo(222.62741f, 220.0f, 228.0f, 214.62741f, 228.0f, 208.0f),
                    PathNode.LineTo(228.0f, 176.0f),
                    PathNode.CurveTo(227.9942f, 170.91963f, 224.78981f, 166.39343f, 220.0f, 164.7f),
                    PathNode.Close,
                    PathNode.MoveTo(112.0f, 36.0f),
                    PathNode.CurveTo(112.0f, 27.163445f, 119.163445f, 20.0f, 128.0f, 20.0f),
                    PathNode.CurveTo(136.83656f, 20.0f, 144.0f, 27.163445f, 144.0f, 36.0f),
                    PathNode.CurveTo(144.0f, 44.836555f, 136.83656f, 52.0f, 128.0f, 52.0f),
                    PathNode.CurveTo(119.163445f, 52.0f, 112.0f, 44.836555f, 112.0f, 36.0f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 60.0f),
                    PathNode.CurveTo(174.37135f, 60.049603f, 211.9504f, 97.62865f, 212.0f, 144.0f),
                    PathNode.LineTo(212.0f, 164.0f),
                    PathNode.LineTo(44.0f, 164.0f),
                    PathNode.LineTo(44.0f, 144.0f),
                    PathNode.CurveTo(44.049603f, 97.62865f, 81.62865f, 60.049603f, 128.0f, 60.0f),
                    PathNode.Close,
                    PathNode.MoveTo(124.0f, 172.0f),
                    PathNode.LineTo(124.0f, 212.0f),
                    PathNode.LineTo(76.0f, 212.0f),
                    PathNode.LineTo(76.0f, 172.0f),
                    PathNode.Close,
                    PathNode.MoveTo(132.0f, 172.0f),
                    PathNode.LineTo(180.0f, 172.0f),
                    PathNode.LineTo(180.0f, 212.0f),
                    PathNode.LineTo(132.0f, 212.0f),
                    PathNode.Close,
                    PathNode.MoveTo(36.0f, 208.0f),
                    PathNode.LineTo(36.0f, 176.0f),
                    PathNode.CurveTo(36.0f, 173.79086f, 37.79086f, 172.0f, 40.0f, 172.0f),
                    PathNode.LineTo(68.0f, 172.0f),
                    PathNode.LineTo(68.0f, 212.0f),
                    PathNode.LineTo(40.0f, 212.0f),
                    PathNode.CurveTo(37.79086f, 212.0f, 36.0f, 210.20914f, 36.0f, 208.0f),
                    PathNode.Close,
                    PathNode.MoveTo(220.0f, 208.0f),
                    PathNode.CurveTo(220.0f, 210.20914f, 218.20914f, 212.0f, 216.0f, 212.0f),
                    PathNode.LineTo(188.0f, 212.0f),
                    PathNode.LineTo(188.0f, 172.0f),
                    PathNode.LineTo(216.0f, 172.0f),
                    PathNode.CurveTo(218.20914f, 172.0f, 220.0f, 173.79086f, 220.0f, 176.0f),
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
        return _beanie!!
    }

private var _beanie: ImageVector? = null
