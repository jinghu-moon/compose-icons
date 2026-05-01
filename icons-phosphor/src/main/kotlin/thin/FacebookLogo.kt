package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.FacebookLogo: ImageVector
    get() {
        if (_facebookLogo != null) return _facebookLogo!!
        _facebookLogo = phosphorThinIcon(
            name = "FacebookLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(128.0f, 28.0f),
                    PathNode.CurveTo(72.77152f, 28.0f, 28.0f, 72.77152f, 28.0f, 128.0f),
                    PathNode.CurveTo(28.0f, 183.22847f, 72.77152f, 228.0f, 128.0f, 228.0f),
                    PathNode.CurveTo(183.22847f, 228.0f, 228.0f, 183.22847f, 228.0f, 128.0f),
                    PathNode.CurveTo(227.93938f, 72.79665f, 183.20334f, 28.060623f, 128.0f, 28.0f),
                    PathNode.Close,
                    PathNode.MoveTo(132.0f, 219.91f),
                    PathNode.LineTo(132.0f, 148.0f),
                    PathNode.LineTo(160.0f, 148.0f),
                    PathNode.CurveTo(162.20914f, 148.0f, 164.0f, 146.20914f, 164.0f, 144.0f),
                    PathNode.CurveTo(164.0f, 141.79086f, 162.20914f, 140.0f, 160.0f, 140.0f),
                    PathNode.LineTo(132.0f, 140.0f),
                    PathNode.LineTo(132.0f, 112.0f),
                    PathNode.CurveTo(132.0f, 100.95431f, 140.9543f, 92.0f, 152.0f, 92.0f),
                    PathNode.LineTo(168.0f, 92.0f),
                    PathNode.CurveTo(170.20914f, 92.0f, 172.0f, 90.20914f, 172.0f, 88.0f),
                    PathNode.CurveTo(172.0f, 85.79086f, 170.20914f, 84.0f, 168.0f, 84.0f),
                    PathNode.LineTo(152.0f, 84.0f),
                    PathNode.CurveTo(136.53603f, 84.0f, 124.0f, 96.536026f, 124.0f, 112.0f),
                    PathNode.LineTo(124.0f, 140.0f),
                    PathNode.LineTo(96.0f, 140.0f),
                    PathNode.CurveTo(93.79086f, 140.0f, 92.0f, 141.79086f, 92.0f, 144.0f),
                    PathNode.CurveTo(92.0f, 146.20914f, 93.79086f, 148.0f, 96.0f, 148.0f),
                    PathNode.LineTo(124.0f, 148.0f),
                    PathNode.LineTo(124.0f, 219.91f),
                    PathNode.CurveTo(74.01666f, 217.73476f, 34.933872f, 176.01535f, 36.02175f, 125.99652f),
                    PathNode.CurveTo(37.10963f, 75.97771f, 77.96935f, 35.996998f, 128.0f, 35.996998f),
                    PathNode.CurveTo(178.03065f, 35.996998f, 218.89037f, 75.97771f, 219.97824f, 125.99652f),
                    PathNode.CurveTo(221.06613f, 176.01535f, 181.98334f, 217.73476f, 132.0f, 219.91f),
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
        return _facebookLogo!!
    }

private var _facebookLogo: ImageVector? = null
