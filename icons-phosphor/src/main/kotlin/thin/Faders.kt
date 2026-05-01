package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Faders: ImageVector
    get() {
        if (_faders != null) return _faders!!
        _faders = phosphorThinIcon(
            name = "Faders",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(132.0f, 120.0f),
                    PathNode.LineTo(132.0f, 216.0f),
                    PathNode.CurveTo(132.0f, 218.20914f, 130.20914f, 220.0f, 128.0f, 220.0f),
                    PathNode.CurveTo(125.79086f, 220.0f, 124.0f, 218.20914f, 124.0f, 216.0f),
                    PathNode.LineTo(124.0f, 120.0f),
                    PathNode.CurveTo(124.0f, 117.79086f, 125.79086f, 116.0f, 128.0f, 116.0f),
                    PathNode.CurveTo(130.20914f, 116.0f, 132.0f, 117.79086f, 132.0f, 120.0f),
                    PathNode.Close,
                    PathNode.MoveTo(200.0f, 196.0f),
                    PathNode.CurveTo(197.79086f, 196.0f, 196.0f, 197.79086f, 196.0f, 200.0f),
                    PathNode.LineTo(196.0f, 216.0f),
                    PathNode.CurveTo(196.0f, 218.20914f, 197.79086f, 220.0f, 200.0f, 220.0f),
                    PathNode.CurveTo(202.20914f, 220.0f, 204.0f, 218.20914f, 204.0f, 216.0f),
                    PathNode.LineTo(204.0f, 200.0f),
                    PathNode.CurveTo(204.0f, 197.79086f, 202.20914f, 196.0f, 200.0f, 196.0f),
                    PathNode.Close,
                    PathNode.MoveTo(224.0f, 164.0f),
                    PathNode.LineTo(204.0f, 164.0f),
                    PathNode.LineTo(204.0f, 40.0f),
                    PathNode.CurveTo(204.0f, 37.79086f, 202.20914f, 36.0f, 200.0f, 36.0f),
                    PathNode.CurveTo(197.79086f, 36.0f, 196.0f, 37.79086f, 196.0f, 40.0f),
                    PathNode.LineTo(196.0f, 164.0f),
                    PathNode.LineTo(176.0f, 164.0f),
                    PathNode.CurveTo(173.79086f, 164.0f, 172.0f, 165.79086f, 172.0f, 168.0f),
                    PathNode.CurveTo(172.0f, 170.20914f, 173.79086f, 172.0f, 176.0f, 172.0f),
                    PathNode.LineTo(224.0f, 172.0f),
                    PathNode.CurveTo(226.20914f, 172.0f, 228.0f, 170.20914f, 228.0f, 168.0f),
                    PathNode.CurveTo(228.0f, 165.79086f, 226.20914f, 164.0f, 224.0f, 164.0f),
                    PathNode.Close,
                    PathNode.MoveTo(56.0f, 164.0f),
                    PathNode.CurveTo(53.79086f, 164.0f, 52.0f, 165.79086f, 52.0f, 168.0f),
                    PathNode.LineTo(52.0f, 216.0f),
                    PathNode.CurveTo(52.0f, 218.20914f, 53.79086f, 220.0f, 56.0f, 220.0f),
                    PathNode.CurveTo(58.20914f, 220.0f, 60.0f, 218.20914f, 60.0f, 216.0f),
                    PathNode.LineTo(60.0f, 168.0f),
                    PathNode.CurveTo(60.0f, 165.79086f, 58.20914f, 164.0f, 56.0f, 164.0f),
                    PathNode.Close,
                    PathNode.MoveTo(80.0f, 132.0f),
                    PathNode.LineTo(60.0f, 132.0f),
                    PathNode.LineTo(60.0f, 40.0f),
                    PathNode.CurveTo(60.0f, 37.79086f, 58.20914f, 36.0f, 56.0f, 36.0f),
                    PathNode.CurveTo(53.79086f, 36.0f, 52.0f, 37.79086f, 52.0f, 40.0f),
                    PathNode.LineTo(52.0f, 132.0f),
                    PathNode.LineTo(32.0f, 132.0f),
                    PathNode.CurveTo(29.790861f, 132.0f, 28.0f, 133.79086f, 28.0f, 136.0f),
                    PathNode.CurveTo(28.0f, 138.20914f, 29.790861f, 140.0f, 32.0f, 140.0f),
                    PathNode.LineTo(80.0f, 140.0f),
                    PathNode.CurveTo(82.20914f, 140.0f, 84.0f, 138.20914f, 84.0f, 136.0f),
                    PathNode.CurveTo(84.0f, 133.79086f, 82.20914f, 132.0f, 80.0f, 132.0f),
                    PathNode.Close,
                    PathNode.MoveTo(152.0f, 84.0f),
                    PathNode.LineTo(132.0f, 84.0f),
                    PathNode.LineTo(132.0f, 40.0f),
                    PathNode.CurveTo(132.0f, 37.79086f, 130.20914f, 36.0f, 128.0f, 36.0f),
                    PathNode.CurveTo(125.79086f, 36.0f, 124.0f, 37.79086f, 124.0f, 40.0f),
                    PathNode.LineTo(124.0f, 84.0f),
                    PathNode.LineTo(104.0f, 84.0f),
                    PathNode.CurveTo(101.79086f, 84.0f, 100.0f, 85.79086f, 100.0f, 88.0f),
                    PathNode.CurveTo(100.0f, 90.20914f, 101.79086f, 92.0f, 104.0f, 92.0f),
                    PathNode.LineTo(152.0f, 92.0f),
                    PathNode.CurveTo(154.20914f, 92.0f, 156.0f, 90.20914f, 156.0f, 88.0f),
                    PathNode.CurveTo(156.0f, 85.79086f, 154.20914f, 84.0f, 152.0f, 84.0f),
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
        return _faders!!
    }

private var _faders: ImageVector? = null
