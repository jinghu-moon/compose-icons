package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.TextSuperscript: ImageVector
    get() {
        if (_textSuperscript != null) return _textSuperscript!!
        _textSuperscript = phosphorThinIcon(
            name = "TextSuperscript",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(244.0f, 144.0f),
                    PathNode.CurveTo(244.0f, 146.20914f, 242.20914f, 148.0f, 240.0f, 148.0f),
                    PathNode.LineTo(192.0f, 148.0f),
                    PathNode.CurveTo(190.48491f, 148.0f, 189.09985f, 147.144f, 188.42229f, 145.78885f),
                    PathNode.CurveTo(187.74472f, 144.43372f, 187.89095f, 142.81207f, 188.8f, 141.6f),
                    PathNode.LineTo(232.0f, 84.05f),
                    PathNode.CurveTo(236.87906f, 77.58631f, 237.37863f, 68.81826f, 233.26527f, 61.84223f),
                    PathNode.CurveTo(229.15195f, 54.8662f, 221.23769f, 51.059265f, 213.22f, 52.2f),
                    PathNode.CurveTo(205.82793f, 53.236156f, 199.628f, 58.302513f, 197.14f, 65.34f),
                    PathNode.CurveTo(196.4027f, 67.42487f, 194.11487f, 68.5173f, 192.03f, 67.78f),
                    PathNode.CurveTo(189.94513f, 67.0427f, 188.8527f, 64.754875f, 189.59f, 62.67f),
                    PathNode.CurveTo(190.53688f, 59.976135f, 191.88544f, 57.44084f, 193.59f, 55.15f),
                    PathNode.CurveTo(199.56258f, 47.02785f, 209.44046f, 42.74363f, 219.45174f, 43.933292f),
                    PathNode.CurveTo(229.46303f, 45.122955f, 238.0618f, 51.6028f, 241.96457f, 60.89846f),
                    PathNode.CurveTo(245.86736f, 70.19412f, 244.4715f, 80.87021f, 238.31f, 88.85f),
                    PathNode.LineTo(200.0f, 140.0f),
                    PathNode.LineTo(240.0f, 140.0f),
                    PathNode.CurveTo(242.20914f, 140.0f, 244.0f, 141.79086f, 244.0f, 144.0f),
                    PathNode.Close,
                    PathNode.MoveTo(146.62f, 77.0f),
                    PathNode.CurveTo(144.95174f, 75.55409f, 142.42749f, 75.73312f, 140.98f, 77.4f),
                    PathNode.LineTo(92.0f, 133.89f),
                    PathNode.LineTo(43.0f, 77.38f),
                    PathNode.CurveTo(41.503178f, 75.95529f, 39.16751f, 75.90526f, 37.611053f, 77.264565f),
                    PathNode.CurveTo(36.054592f, 78.62387f, 35.789753f, 80.945015f, 37.0f, 82.62f),
                    PathNode.LineTo(86.71f, 140.0f),
                    PathNode.LineTo(37.0f, 197.38f),
                    PathNode.CurveTo(35.900986f, 198.42607f, 35.488434f, 200.00389f, 35.934757f, 201.45403f),
                    PathNode.CurveTo(36.381084f, 202.90414f, 37.609447f, 203.97693f, 39.10646f, 204.22397f),
                    PathNode.CurveTo(40.603477f, 204.47102f, 42.1114f, 203.84982f, 43.0f, 202.62f),
                    PathNode.LineTo(92.0f, 146.11f),
                    PathNode.LineTo(141.0f, 202.62f),
                    PathNode.CurveTo(142.49683f, 204.04471f, 144.83249f, 204.09474f, 146.38895f, 202.73544f),
                    PathNode.CurveTo(147.9454f, 201.37613f, 148.21025f, 199.055f, 147.0f, 197.38f),
                    PathNode.LineTo(97.29f, 140.0f),
                    PathNode.LineTo(147.0f, 82.62f),
                    PathNode.CurveTo(148.43744f, 80.95994f, 148.26782f, 78.451454f, 146.62f, 77.0f),
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
        return _textSuperscript!!
    }

private var _textSuperscript: ImageVector? = null
