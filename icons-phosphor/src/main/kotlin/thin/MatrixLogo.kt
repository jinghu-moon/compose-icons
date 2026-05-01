package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.MatrixLogo: ImageVector
    get() {
        if (_matrixLogo != null) return _matrixLogo!!
        _matrixLogo = phosphorThinIcon(
            name = "MatrixLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(44.0f, 44.0f),
                    PathNode.LineTo(44.0f, 212.0f),
                    PathNode.LineTo(64.0f, 212.0f),
                    PathNode.CurveTo(66.20914f, 212.0f, 68.0f, 213.79086f, 68.0f, 216.0f),
                    PathNode.CurveTo(68.0f, 218.20914f, 66.20914f, 220.0f, 64.0f, 220.0f),
                    PathNode.LineTo(40.0f, 220.0f),
                    PathNode.CurveTo(37.79086f, 220.0f, 36.0f, 218.20914f, 36.0f, 216.0f),
                    PathNode.LineTo(36.0f, 40.0f),
                    PathNode.CurveTo(36.0f, 37.79086f, 37.79086f, 36.0f, 40.0f, 36.0f),
                    PathNode.LineTo(64.0f, 36.0f),
                    PathNode.CurveTo(66.20914f, 36.0f, 68.0f, 37.79086f, 68.0f, 40.0f),
                    PathNode.CurveTo(68.0f, 42.20914f, 66.20914f, 44.0f, 64.0f, 44.0f),
                    PathNode.Close,
                    PathNode.MoveTo(216.0f, 36.0f),
                    PathNode.LineTo(192.0f, 36.0f),
                    PathNode.CurveTo(189.79086f, 36.0f, 188.0f, 37.79086f, 188.0f, 40.0f),
                    PathNode.CurveTo(188.0f, 42.20914f, 189.79086f, 44.0f, 192.0f, 44.0f),
                    PathNode.LineTo(212.0f, 44.0f),
                    PathNode.LineTo(212.0f, 212.0f),
                    PathNode.LineTo(192.0f, 212.0f),
                    PathNode.CurveTo(189.79086f, 212.0f, 188.0f, 213.79086f, 188.0f, 216.0f),
                    PathNode.CurveTo(188.0f, 218.20914f, 189.79086f, 220.0f, 192.0f, 220.0f),
                    PathNode.LineTo(216.0f, 220.0f),
                    PathNode.CurveTo(218.20914f, 220.0f, 220.0f, 218.20914f, 220.0f, 216.0f),
                    PathNode.LineTo(220.0f, 40.0f),
                    PathNode.CurveTo(220.0f, 37.79086f, 218.20914f, 36.0f, 216.0f, 36.0f),
                    PathNode.Close,
                    PathNode.MoveTo(152.0f, 92.0f),
                    PathNode.CurveTo(142.16695f, 92.004684f, 133.05699f, 97.166985f, 128.0f, 105.6f),
                    PathNode.CurveTo(123.53413f, 98.169945f, 115.87857f, 93.22745f, 107.268906f, 92.21581f),
                    PathNode.CurveTo(98.65924f, 91.20418f, 90.06653f, 94.2375f, 84.0f, 100.43f),
                    PathNode.LineTo(84.0f, 96.0f),
                    PathNode.CurveTo(84.0f, 93.79086f, 82.20914f, 92.0f, 80.0f, 92.0f),
                    PathNode.CurveTo(77.79086f, 92.0f, 76.0f, 93.79086f, 76.0f, 96.0f),
                    PathNode.LineTo(76.0f, 160.0f),
                    PathNode.CurveTo(76.0f, 162.20914f, 77.79086f, 164.0f, 80.0f, 164.0f),
                    PathNode.CurveTo(82.20914f, 164.0f, 84.0f, 162.20914f, 84.0f, 160.0f),
                    PathNode.LineTo(84.0f, 120.0f),
                    PathNode.CurveTo(84.0f, 108.95431f, 92.95431f, 100.0f, 104.0f, 100.0f),
                    PathNode.CurveTo(115.04569f, 100.0f, 124.0f, 108.95431f, 124.0f, 120.0f),
                    PathNode.LineTo(124.0f, 160.0f),
                    PathNode.CurveTo(124.0f, 162.20914f, 125.79086f, 164.0f, 128.0f, 164.0f),
                    PathNode.CurveTo(130.20914f, 164.0f, 132.0f, 162.20914f, 132.0f, 160.0f),
                    PathNode.LineTo(132.0f, 120.0f),
                    PathNode.CurveTo(132.0f, 108.95431f, 140.9543f, 100.0f, 152.0f, 100.0f),
                    PathNode.CurveTo(163.0457f, 100.0f, 172.0f, 108.95431f, 172.0f, 120.0f),
                    PathNode.LineTo(172.0f, 160.0f),
                    PathNode.CurveTo(172.0f, 162.20914f, 173.79086f, 164.0f, 176.0f, 164.0f),
                    PathNode.CurveTo(178.20914f, 164.0f, 180.0f, 162.20914f, 180.0f, 160.0f),
                    PathNode.LineTo(180.0f, 120.0f),
                    PathNode.CurveTo(180.0f, 104.536026f, 167.46397f, 92.0f, 152.0f, 92.0f),
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
        return _matrixLogo!!
    }

private var _matrixLogo: ImageVector? = null
