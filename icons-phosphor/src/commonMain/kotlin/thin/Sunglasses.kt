package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Sunglasses: ImageVector
    get() {
        if (_sunglasses != null) return _sunglasses!!
        _sunglasses = phosphorThinIcon(
            name = "Sunglasses",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(200.0f, 44.0f),
                    PathNode.CurveTo(197.79086f, 44.0f, 196.0f, 45.79086f, 196.0f, 48.0f),
                    PathNode.CurveTo(196.0f, 50.20914f, 197.79086f, 52.0f, 200.0f, 52.0f),
                    PathNode.CurveTo(211.0457f, 52.0f, 220.0f, 60.954304f, 220.0f, 72.0f),
                    PathNode.LineTo(220.0f, 132.0f),
                    PathNode.LineTo(36.0f, 132.0f),
                    PathNode.LineTo(36.0f, 72.0f),
                    PathNode.CurveTo(36.0f, 60.954304f, 44.954304f, 52.0f, 56.0f, 52.0f),
                    PathNode.CurveTo(58.20914f, 52.0f, 60.0f, 50.20914f, 60.0f, 48.0f),
                    PathNode.CurveTo(60.0f, 45.79086f, 58.20914f, 44.0f, 56.0f, 44.0f),
                    PathNode.CurveTo(40.53603f, 44.0f, 28.0f, 56.53603f, 28.0f, 72.0f),
                    PathNode.LineTo(28.0f, 164.0f),
                    PathNode.CurveTo(28.0f, 186.09138f, 45.90861f, 204.0f, 68.0f, 204.0f),
                    PathNode.CurveTo(90.09139f, 204.0f, 108.0f, 186.09138f, 108.0f, 164.0f),
                    PathNode.LineTo(108.0f, 140.0f),
                    PathNode.LineTo(148.0f, 140.0f),
                    PathNode.LineTo(148.0f, 164.0f),
                    PathNode.CurveTo(148.0f, 186.09138f, 165.90862f, 204.0f, 188.0f, 204.0f),
                    PathNode.CurveTo(210.09138f, 204.0f, 228.0f, 186.09138f, 228.0f, 164.0f),
                    PathNode.LineTo(228.0f, 72.0f),
                    PathNode.CurveTo(228.0f, 56.53603f, 215.46397f, 44.0f, 200.0f, 44.0f),
                    PathNode.Close,
                    PathNode.MoveTo(36.0f, 164.0f),
                    PathNode.LineTo(36.0f, 140.0f),
                    PathNode.LineTo(38.34f, 140.0f),
                    PathNode.LineTo(87.61f, 189.26f),
                    PathNode.CurveTo(77.96233f, 196.74165f, 64.89822f, 198.08182f, 53.93248f, 192.71475f),
                    PathNode.CurveTo(42.966747f, 187.34769f, 36.010414f, 176.20871f, 36.0f, 164.0f),
                    PathNode.Close,
                    PathNode.MoveTo(100.0f, 164.0f),
                    PathNode.CurveTo(100.00518f, 171.10574f, 97.63256f, 178.0089f, 93.26f, 183.61f),
                    PathNode.LineTo(49.66f, 140.0f),
                    PathNode.LineTo(100.0f, 140.0f),
                    PathNode.Close,
                    PathNode.MoveTo(156.0f, 164.0f),
                    PathNode.LineTo(156.0f, 140.0f),
                    PathNode.LineTo(158.34f, 140.0f),
                    PathNode.LineTo(207.61f, 189.26f),
                    PathNode.CurveTo(197.96233f, 196.74165f, 184.89821f, 198.08182f, 173.93248f, 192.71475f),
                    PathNode.CurveTo(162.96675f, 187.34769f, 156.01042f, 176.20871f, 156.0f, 164.0f),
                    PathNode.Close,
                    PathNode.MoveTo(213.26f, 183.61f),
                    PathNode.LineTo(169.66f, 140.0f),
                    PathNode.LineTo(220.0f, 140.0f),
                    PathNode.LineTo(220.0f, 164.0f),
                    PathNode.CurveTo(220.00519f, 171.10574f, 217.63255f, 178.0089f, 213.26f, 183.61f),
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
        return _sunglasses!!
    }

private var _sunglasses: ImageVector? = null
