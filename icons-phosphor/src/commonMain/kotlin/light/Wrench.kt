package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Wrench: ImageVector
    get() {
        if (_wrench != null) return _wrench!!
        _wrench = phosphorLightIcon(
            name = "Wrench",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(224.91f, 69.75f),
                    PathNode.CurveTo(224.1712f, 67.924f, 222.5832f, 66.57694f, 220.66116f, 66.145836f),
                    PathNode.CurveTo(218.73914f, 65.71472f, 216.72792f, 66.25448f, 215.28f, 67.59f),
                    PathNode.LineTo(174.21f, 105.49f),
                    PathNode.LineTo(154.7f, 101.3f),
                    PathNode.LineTo(150.51f, 81.79f),
                    PathNode.LineTo(188.41f, 40.72f),
                    PathNode.CurveTo(189.74551f, 39.272083f, 190.28528f, 37.260868f, 189.85417f, 35.338833f),
                    PathNode.CurveTo(189.42305f, 33.416798f, 188.07599f, 31.828793f, 186.25f, 31.09f),
                    PathNode.CurveTo(159.59738f, 20.285582f, 129.04836f, 26.88227f, 109.22885f, 47.721783f),
                    PathNode.CurveTo(89.40935f, 68.56129f, 84.35275f, 99.402664f, 96.48f, 125.48f),
                    PathNode.LineTo(35.09f, 178.48f),
                    PathNode.CurveTo(34.98f, 178.57f, 34.88f, 178.67f, 34.77f, 178.78f),
                    PathNode.CurveTo(23.047756f, 190.49672f, 23.04328f, 209.49776f, 34.760002f, 221.22f),
                    PathNode.CurveTo(46.476723f, 232.94225f, 65.47775f, 232.94672f, 77.2f, 221.23f),
                    PathNode.CurveTo(77.31f, 221.12f, 77.41f, 221.02f, 77.5f, 220.91f),
                    PathNode.LineTo(130.5f, 159.52f),
                    PathNode.CurveTo(156.57735f, 171.64725f, 187.41872f, 166.59065f, 208.25822f, 146.77115f),
                    PathNode.CurveTo(229.09773f, 126.951645f, 235.69441f, 96.402626f, 224.89f, 69.75f),
                    PathNode.Close,
                    PathNode.MoveTo(160.0f, 154.0f),
                    PathNode.CurveTo(150.2068f, 153.9958f, 140.57411f, 151.51195f, 132.0f, 146.78f),
                    PathNode.CurveTo(129.51494f, 145.40387f, 126.40538f, 145.95898f, 124.55f, 148.11f),
                    PathNode.LineTo(68.57f, 212.88f),
                    PathNode.CurveTo(61.500088f, 219.65323f, 50.312958f, 219.53337f, 43.389797f, 212.6102f),
                    PathNode.CurveTo(36.466637f, 205.68704f, 36.346767f, 194.49991f, 43.12f, 187.43f),
                    PathNode.LineTo(107.88f, 131.49f),
                    PathNode.CurveTo(110.04824f, 129.62666f, 110.600624f, 126.4923f, 109.2f, 124.0f),
                    PathNode.CurveTo(98.10547f, 103.931335f, 99.87648f, 79.21019f, 113.71847f, 60.927963f),
                    PathNode.CurveTo(127.56043f, 42.645744f, 150.87428f, 34.23527f, 173.2f, 39.47f),
                    PathNode.LineTo(139.58f, 75.93f),
                    PathNode.CurveTo(138.25896f, 77.36532f, 137.71815f, 79.35326f, 138.13f, 81.26f),
                    PathNode.LineTo(143.78f, 107.61f),
                    PathNode.CurveTo(144.27495f, 109.92031f, 146.07968f, 111.725044f, 148.39f, 112.22f),
                    PathNode.LineTo(174.74f, 117.87f),
                    PathNode.CurveTo(176.64673f, 118.281845f, 178.63467f, 117.741035f, 180.07f, 116.42f),
                    PathNode.LineTo(216.49f, 82.8f),
                    PathNode.CurveTo(220.4953f, 100.03843f, 216.41951f, 118.16241f, 205.41978f, 132.02646f),
                    PathNode.CurveTo(194.42007f, 145.8905f, 177.6976f, 153.98064f, 160.0f, 154.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 12.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _wrench!!
    }

private var _wrench: ImageVector? = null
