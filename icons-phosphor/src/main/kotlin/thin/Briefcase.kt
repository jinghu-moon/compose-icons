package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Briefcase: ImageVector
    get() {
        if (_briefcase != null) return _briefcase!!
        _briefcase = phosphorThinIcon(
            name = "Briefcase",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(108.0f, 112.0f),
                    PathNode.CurveTo(108.0f, 109.79086f, 109.79086f, 108.0f, 112.0f, 108.0f),
                    PathNode.LineTo(144.0f, 108.0f),
                    PathNode.CurveTo(146.20914f, 108.0f, 148.0f, 109.79086f, 148.0f, 112.0f),
                    PathNode.CurveTo(148.0f, 114.20914f, 146.20914f, 116.0f, 144.0f, 116.0f),
                    PathNode.LineTo(112.0f, 116.0f),
                    PathNode.CurveTo(109.79086f, 116.0f, 108.0f, 114.20914f, 108.0f, 112.0f),
                    PathNode.Close,
                    PathNode.MoveTo(228.0f, 72.0f),
                    PathNode.LineTo(228.0f, 200.0f),
                    PathNode.CurveTo(228.0f, 206.62741f, 222.62741f, 212.0f, 216.0f, 212.0f),
                    PathNode.LineTo(40.0f, 212.0f),
                    PathNode.CurveTo(33.37258f, 212.0f, 28.0f, 206.62741f, 28.0f, 200.0f),
                    PathNode.LineTo(28.0f, 72.0f),
                    PathNode.CurveTo(28.0f, 65.37258f, 33.37258f, 60.0f, 40.0f, 60.0f),
                    PathNode.LineTo(84.0f, 60.0f),
                    PathNode.LineTo(84.0f, 48.0f),
                    PathNode.CurveTo(84.0f, 36.954304f, 92.95431f, 28.0f, 104.0f, 28.0f),
                    PathNode.LineTo(152.0f, 28.0f),
                    PathNode.CurveTo(163.0457f, 28.0f, 172.0f, 36.954304f, 172.0f, 48.0f),
                    PathNode.LineTo(172.0f, 60.0f),
                    PathNode.LineTo(216.0f, 60.0f),
                    PathNode.CurveTo(222.62741f, 60.0f, 228.0f, 65.37258f, 228.0f, 72.0f),
                    PathNode.Close,
                    PathNode.MoveTo(92.0f, 60.0f),
                    PathNode.LineTo(164.0f, 60.0f),
                    PathNode.LineTo(164.0f, 48.0f),
                    PathNode.CurveTo(164.0f, 41.37258f, 158.62741f, 36.0f, 152.0f, 36.0f),
                    PathNode.LineTo(104.0f, 36.0f),
                    PathNode.CurveTo(97.37258f, 36.0f, 92.0f, 41.37258f, 92.0f, 48.0f),
                    PathNode.Close,
                    PathNode.MoveTo(36.0f, 72.0f),
                    PathNode.LineTo(36.0f, 116.0f),
                    PathNode.CurveTo(64.10374f, 131.75061f, 95.78352f, 140.01491f, 128.0f, 140.0f),
                    PathNode.CurveTo(160.21648f, 140.01491f, 191.89627f, 131.75061f, 220.0f, 116.0f),
                    PathNode.LineTo(220.0f, 72.0f),
                    PathNode.CurveTo(220.0f, 69.79086f, 218.20914f, 68.0f, 216.0f, 68.0f),
                    PathNode.LineTo(40.0f, 68.0f),
                    PathNode.CurveTo(37.79086f, 68.0f, 36.0f, 69.79086f, 36.0f, 72.0f),
                    PathNode.Close,
                    PathNode.MoveTo(220.0f, 200.0f),
                    PathNode.LineTo(220.0f, 125.1f),
                    PathNode.CurveTo(191.6685f, 140.14467f, 160.07828f, 148.00787f, 128.0f, 148.0f),
                    PathNode.CurveTo(95.921425f, 148.01033f, 64.33062f, 140.14696f, 36.0f, 125.1f),
                    PathNode.LineTo(36.0f, 200.0f),
                    PathNode.CurveTo(36.0f, 202.20914f, 37.79086f, 204.0f, 40.0f, 204.0f),
                    PathNode.LineTo(216.0f, 204.0f),
                    PathNode.CurveTo(218.20914f, 204.0f, 220.0f, 202.20914f, 220.0f, 200.0f),
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
        return _briefcase!!
    }

private var _briefcase: ImageVector? = null
