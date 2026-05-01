package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.GraduationCap: ImageVector
    get() {
        if (_graduationCap != null) return _graduationCap!!
        _graduationCap = phosphorThinIcon(
            name = "GraduationCap",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(249.88f, 92.47f),
                    PathNode.LineTo(129.88f, 28.47f),
                    PathNode.CurveTo(128.70477f, 27.844221f, 127.29522f, 27.844221f, 126.12f, 28.47f),
                    PathNode.LineTo(6.12f, 92.47f),
                    PathNode.CurveTo(4.815933f, 93.16498f, 4.00125f, 94.5223f, 4.00125f, 96.0f),
                    PathNode.CurveTo(4.00125f, 97.4777f, 4.815933f, 98.83502f, 6.12f, 99.53f),
                    PathNode.LineTo(36.0f, 115.47f),
                    PathNode.LineTo(36.0f, 166.29f),
                    PathNode.CurveTo(35.977108f, 169.23575f, 37.04582f, 172.08565f, 39.0f, 174.29f),
                    PathNode.CurveTo(51.65f, 188.38f, 80.0f, 212.02f, 128.0f, 212.02f),
                    PathNode.CurveTo(149.0f, 212.02f, 166.2f, 207.5f, 180.0f, 201.23f),
                    PathNode.LineTo(180.0f, 240.0f),
                    PathNode.CurveTo(180.0f, 242.20914f, 181.79086f, 244.0f, 184.0f, 244.0f),
                    PathNode.CurveTo(186.20914f, 244.0f, 188.0f, 242.20914f, 188.0f, 240.0f),
                    PathNode.LineTo(188.0f, 197.18f),
                    PathNode.CurveTo(198.87234f, 191.20752f, 208.67328f, 183.46478f, 217.0f, 174.27f),
                    PathNode.CurveTo(218.95253f, 172.06465f, 220.021f, 169.21542f, 220.0f, 166.27f),
                    PathNode.LineTo(220.0f, 115.47f),
                    PathNode.LineTo(249.88f, 99.53f),
                    PathNode.CurveTo(251.18407f, 98.83502f, 251.99875f, 97.4777f, 251.99875f, 96.0f),
                    PathNode.CurveTo(251.99875f, 94.5223f, 251.18407f, 93.16498f, 249.88f, 92.47f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 204.0f),
                    PathNode.CurveTo(83.17f, 204.0f, 56.75f, 182.0f, 45.0f, 168.92f),
                    PathNode.CurveTo(44.352684f, 168.1973f, 43.99638f, 167.26021f, 44.0f, 166.29f),
                    PathNode.LineTo(44.0f, 119.73f),
                    PathNode.LineTo(126.12f, 163.53f),
                    PathNode.CurveTo(127.29522f, 164.15578f, 128.70477f, 164.15578f, 129.88f, 163.53f),
                    PathNode.LineTo(180.0f, 136.8f),
                    PathNode.LineTo(180.0f, 192.33f),
                    PathNode.CurveTo(166.58f, 199.0f, 149.39f, 204.0f, 128.0f, 204.0f),
                    PathNode.Close,
                    PathNode.MoveTo(212.0f, 166.29f),
                    PathNode.CurveTo(211.9986f, 167.26228f, 211.64313f, 168.20079f, 211.0f, 168.93f),
                    PathNode.CurveTo(204.29288f, 176.34265f, 196.54546f, 182.74269f, 188.0f, 187.93f),
                    PathNode.LineTo(188.0f, 132.53f),
                    PathNode.LineTo(212.0f, 119.73f),
                    PathNode.Close,
                    PathNode.MoveTo(187.41f, 123.78f),
                    PathNode.CurveTo(187.03743f, 123.17224f, 186.5092f, 122.67509f, 185.88f, 122.34f),
                    PathNode.LineTo(129.88f, 92.47f),
                    PathNode.CurveTo(127.93644f, 91.47728f, 125.55588f, 92.225685f, 124.52999f, 94.15195f),
                    PathNode.CurveTo(123.504105f, 96.07821f, 124.2116f, 98.47125f, 126.12f, 99.53f),
                    PathNode.LineTo(179.5f, 128.0f),
                    PathNode.LineTo(128.0f, 155.47f),
                    PathNode.LineTo(16.5f, 96.0f),
                    PathNode.LineTo(128.0f, 36.53f),
                    PathNode.LineTo(239.5f, 96.0f),
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
        return _graduationCap!!
    }

private var _graduationCap: ImageVector? = null
