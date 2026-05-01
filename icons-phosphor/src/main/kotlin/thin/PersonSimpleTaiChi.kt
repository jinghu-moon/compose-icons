package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.PersonSimpleTaiChi: ImageVector
    get() {
        if (_personSimpleTaiChi != null) return _personSimpleTaiChi!!
        _personSimpleTaiChi = phosphorThinIcon(
            name = "PersonSimpleTaiChi",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(128.0f, 76.0f),
                    PathNode.CurveTo(143.46397f, 76.0f, 156.0f, 63.46397f, 156.0f, 48.0f),
                    PathNode.CurveTo(156.0f, 32.536026f, 143.46397f, 20.0f, 128.0f, 20.0f),
                    PathNode.CurveTo(112.536026f, 20.0f, 100.0f, 32.536026f, 100.0f, 48.0f),
                    PathNode.CurveTo(100.0f, 63.46397f, 112.536026f, 76.0f, 128.0f, 76.0f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 28.0f),
                    PathNode.CurveTo(139.0457f, 28.0f, 148.0f, 36.954304f, 148.0f, 48.0f),
                    PathNode.CurveTo(148.0f, 59.045696f, 139.0457f, 68.0f, 128.0f, 68.0f),
                    PathNode.CurveTo(116.95431f, 68.0f, 108.0f, 59.045696f, 108.0f, 48.0f),
                    PathNode.CurveTo(108.0f, 36.954304f, 116.95431f, 28.0f, 128.0f, 28.0f),
                    PathNode.Close,
                    PathNode.MoveTo(220.0f, 104.0f),
                    PathNode.CurveTo(220.0f, 106.20914f, 218.20914f, 108.0f, 216.0f, 108.0f),
                    PathNode.LineTo(132.0f, 108.0f),
                    PathNode.LineTo(132.0f, 141.36f),
                    PathNode.LineTo(185.58f, 164.36f),
                    PathNode.CurveTo(187.0369f, 164.98634f, 187.9862f, 166.41423f, 188.0f, 168.0f),
                    PathNode.LineTo(188.0f, 216.0f),
                    PathNode.CurveTo(188.0f, 218.20914f, 186.20914f, 220.0f, 184.0f, 220.0f),
                    PathNode.CurveTo(181.79086f, 220.0f, 180.0f, 218.20914f, 180.0f, 216.0f),
                    PathNode.LineTo(180.0f, 170.64f),
                    PathNode.LineTo(128.78f, 148.64f),
                    PathNode.LineTo(50.68f, 219.0f),
                    PathNode.CurveTo(49.023148f, 220.48012f, 46.48012f, 220.33685f, 45.0f, 218.68f),
                    PathNode.CurveTo(43.51988f, 217.02315f, 43.663147f, 214.48012f, 45.32f, 213.0f),
                    PathNode.LineTo(124.0f, 142.22f),
                    PathNode.LineTo(124.0f, 108.0f),
                    PathNode.LineTo(40.0f, 108.0f),
                    PathNode.CurveTo(37.79086f, 108.0f, 36.0f, 106.20914f, 36.0f, 104.0f),
                    PathNode.CurveTo(36.0f, 101.79086f, 37.79086f, 100.0f, 40.0f, 100.0f),
                    PathNode.LineTo(216.0f, 100.0f),
                    PathNode.CurveTo(218.20914f, 100.0f, 220.0f, 101.79086f, 220.0f, 104.0f),
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
        return _personSimpleTaiChi!!
    }

private var _personSimpleTaiChi: ImageVector? = null
