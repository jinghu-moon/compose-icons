package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.At: ImageVector
    get() {
        if (_at != null) return _at!!
        _at = phosphorThinIcon(
            name = "At",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(128.0f, 28.0f),
                    PathNode.CurveTo(72.77152f, 28.0f, 28.0f, 72.77152f, 28.0f, 128.0f),
                    PathNode.CurveTo(28.0f, 183.22847f, 72.77152f, 228.0f, 128.0f, 228.0f),
                    PathNode.CurveTo(148.76f, 228.0f, 170.52f, 221.77f, 186.21f, 211.34f),
                    PathNode.CurveTo(188.05186f, 210.11668f, 188.55331f, 207.63187f, 187.33f, 205.79f),
                    PathNode.CurveTo(186.10669f, 203.94814f, 183.62187f, 203.44669f, 181.78f, 204.67f),
                    PathNode.CurveTo(167.35f, 214.27f, 147.24f, 220.0f, 128.0f, 220.0f),
                    PathNode.CurveTo(77.18981f, 220.0f, 36.0f, 178.8102f, 36.0f, 128.0f),
                    PathNode.CurveTo(36.0f, 77.18981f, 77.18981f, 36.0f, 128.0f, 36.0f),
                    PathNode.CurveTo(178.8102f, 36.0f, 220.0f, 77.18981f, 220.0f, 128.0f),
                    PathNode.CurveTo(220.0f, 159.32f, 205.0f, 164.0f, 196.0f, 164.0f),
                    PathNode.CurveTo(187.0f, 164.0f, 172.0f, 159.32f, 172.0f, 128.0f),
                    PathNode.LineTo(172.0f, 88.0f),
                    PathNode.CurveTo(172.0f, 85.79086f, 170.20914f, 84.0f, 168.0f, 84.0f),
                    PathNode.CurveTo(165.79086f, 84.0f, 164.0f, 85.79086f, 164.0f, 88.0f),
                    PathNode.LineTo(164.0f, 102.75f),
                    PathNode.CurveTo(152.68942f, 86.62575f, 132.04115f, 79.982124f, 113.45011f, 86.485504f),
                    PathNode.CurveTo(94.85906f, 92.98888f, 82.85449f, 111.05484f, 84.06124f, 130.71355f),
                    PathNode.CurveTo(85.267975f, 150.37225f, 99.39202f, 166.83432f, 118.63891f, 171.01505f),
                    PathNode.CurveTo(137.88579f, 175.19576f, 157.56647f, 166.07657f, 166.82f, 148.69f),
                    PathNode.CurveTo(171.46f, 163.58f, 181.66f, 172.0f, 196.0f, 172.0f),
                    PathNode.CurveTo(216.0f, 172.0f, 228.0f, 155.55f, 228.0f, 128.0f),
                    PathNode.CurveTo(227.93938f, 72.79665f, 183.20334f, 28.060623f, 128.0f, 28.0f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 164.0f),
                    PathNode.CurveTo(108.11775f, 164.0f, 92.0f, 147.88223f, 92.0f, 128.0f),
                    PathNode.CurveTo(92.0f, 108.11775f, 108.11775f, 92.0f, 128.0f, 92.0f),
                    PathNode.CurveTo(147.88223f, 92.0f, 164.0f, 108.11775f, 164.0f, 128.0f),
                    PathNode.CurveTo(164.0f, 147.88223f, 147.88223f, 164.0f, 128.0f, 164.0f),
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
        return _at!!
    }

private var _at: ImageVector? = null
