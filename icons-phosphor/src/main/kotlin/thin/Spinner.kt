package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Spinner: ImageVector
    get() {
        if (_spinner != null) return _spinner!!
        _spinner = phosphorThinIcon(
            name = "Spinner",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(132.0f, 32.0f),
                    PathNode.LineTo(132.0f, 64.0f),
                    PathNode.CurveTo(132.0f, 66.20914f, 130.20914f, 68.0f, 128.0f, 68.0f),
                    PathNode.CurveTo(125.79086f, 68.0f, 124.0f, 66.20914f, 124.0f, 64.0f),
                    PathNode.LineTo(124.0f, 32.0f),
                    PathNode.CurveTo(124.0f, 29.790861f, 125.79086f, 28.0f, 128.0f, 28.0f),
                    PathNode.CurveTo(130.20914f, 28.0f, 132.0f, 29.790861f, 132.0f, 32.0f),
                    PathNode.Close,
                    PathNode.MoveTo(173.25f, 86.75f),
                    PathNode.CurveTo(174.31262f, 86.748184f, 175.33087f, 86.32362f, 176.08f, 85.57f),
                    PathNode.LineTo(198.71f, 63.0f),
                    PathNode.CurveTo(200.27296f, 61.437035f, 200.27296f, 58.902966f, 198.71f, 57.34f),
                    PathNode.CurveTo(197.14703f, 55.777035f, 194.61296f, 55.777035f, 193.05f, 57.34f),
                    PathNode.LineTo(170.43f, 79.92f),
                    PathNode.CurveTo(169.28596f, 81.06276f, 168.94249f, 82.78192f, 169.5596f, 84.27654f),
                    PathNode.CurveTo(170.1767f, 85.77116f, 171.633f, 86.74723f, 173.25f, 86.75f),
                    PathNode.Close,
                    PathNode.MoveTo(224.0f, 124.0f),
                    PathNode.LineTo(192.0f, 124.0f),
                    PathNode.CurveTo(189.79086f, 124.0f, 188.0f, 125.79086f, 188.0f, 128.0f),
                    PathNode.CurveTo(188.0f, 130.20914f, 189.79086f, 132.0f, 192.0f, 132.0f),
                    PathNode.LineTo(224.0f, 132.0f),
                    PathNode.CurveTo(226.20914f, 132.0f, 228.0f, 130.20914f, 228.0f, 128.0f),
                    PathNode.CurveTo(228.0f, 125.79086f, 226.20914f, 124.0f, 224.0f, 124.0f),
                    PathNode.Close,
                    PathNode.MoveTo(176.08f, 170.43f),
                    PathNode.CurveTo(175.08888f, 169.33617f, 173.57591f, 168.87704f, 172.14407f, 169.23564f),
                    PathNode.CurveTo(170.71222f, 169.59422f, 169.59422f, 170.71222f, 169.23564f, 172.14407f),
                    PathNode.CurveTo(168.87704f, 173.57591f, 169.33617f, 175.08888f, 170.43f, 176.08f),
                    PathNode.LineTo(193.05f, 198.71f),
                    PathNode.CurveTo(194.61296f, 200.27296f, 197.14703f, 200.27296f, 198.71f, 198.71f),
                    PathNode.CurveTo(200.27296f, 197.14703f, 200.27296f, 194.61296f, 198.71f, 193.05f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 188.0f),
                    PathNode.CurveTo(125.79086f, 188.0f, 124.0f, 189.79086f, 124.0f, 192.0f),
                    PathNode.LineTo(124.0f, 224.0f),
                    PathNode.CurveTo(124.0f, 226.20914f, 125.79086f, 228.0f, 128.0f, 228.0f),
                    PathNode.CurveTo(130.20914f, 228.0f, 132.0f, 226.20914f, 132.0f, 224.0f),
                    PathNode.LineTo(132.0f, 192.0f),
                    PathNode.CurveTo(132.0f, 189.79086f, 130.20914f, 188.0f, 128.0f, 188.0f),
                    PathNode.Close,
                    PathNode.MoveTo(79.92f, 170.43f),
                    PathNode.LineTo(57.29f, 193.05f),
                    PathNode.CurveTo(55.727036f, 194.62677f, 55.738228f, 197.17203f, 57.315f, 198.735f),
                    PathNode.CurveTo(58.891773f, 200.29796f, 61.437035f, 200.28677f, 63.0f, 198.71f),
                    PathNode.LineTo(85.62f, 176.08f),
                    PathNode.CurveTo(86.71384f, 175.08888f, 87.17295f, 173.57591f, 86.81437f, 172.14407f),
                    PathNode.CurveTo(86.45579f, 170.71222f, 85.337776f, 169.59422f, 83.90593f, 169.23564f),
                    PathNode.CurveTo(82.474075f, 168.87704f, 80.96111f, 169.33617f, 79.97f, 170.43f),
                    PathNode.Close,
                    PathNode.MoveTo(68.0f, 128.0f),
                    PathNode.CurveTo(68.0f, 125.79086f, 66.20914f, 124.0f, 64.0f, 124.0f),
                    PathNode.LineTo(32.0f, 124.0f),
                    PathNode.CurveTo(29.790861f, 124.0f, 28.0f, 125.79086f, 28.0f, 128.0f),
                    PathNode.CurveTo(28.0f, 130.20914f, 29.790861f, 132.0f, 32.0f, 132.0f),
                    PathNode.LineTo(64.0f, 132.0f),
                    PathNode.CurveTo(66.20914f, 132.0f, 68.0f, 130.20914f, 68.0f, 128.0f),
                    PathNode.Close,
                    PathNode.MoveTo(63.0f, 57.29f),
                    PathNode.CurveTo(61.423225f, 55.713226f, 58.86677f, 55.713226f, 57.29f, 57.29f),
                    PathNode.CurveTo(55.713226f, 58.86677f, 55.713226f, 61.423225f, 57.29f, 63.0f),
                    PathNode.LineTo(79.92f, 85.57f),
                    PathNode.CurveTo(80.91111f, 86.66384f, 82.42407f, 87.122955f, 83.85593f, 86.764366f),
                    PathNode.CurveTo(85.28778f, 86.40578f, 86.40578f, 85.28778f, 86.764366f, 83.85593f),
                    PathNode.CurveTo(87.122955f, 82.42407f, 86.66384f, 80.91111f, 85.57f, 79.92f),
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
        return _spinner!!
    }

private var _spinner: ImageVector? = null
