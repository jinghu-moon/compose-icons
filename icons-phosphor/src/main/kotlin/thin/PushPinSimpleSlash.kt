package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.PushPinSimpleSlash: ImageVector
    get() {
        if (_pushPinSimpleSlash != null) return _pushPinSimpleSlash!!
        _pushPinSimpleSlash = phosphorThinIcon(
            name = "PushPinSimpleSlash",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(87.25f, 40.0f),
                    PathNode.CurveTo(87.25f, 37.79086f, 89.04086f, 36.0f, 91.25f, 36.0f),
                    PathNode.LineTo(192.0f, 36.0f),
                    PathNode.CurveTo(194.20914f, 36.0f, 196.0f, 37.79086f, 196.0f, 40.0f),
                    PathNode.CurveTo(196.0f, 42.20914f, 194.20914f, 44.0f, 192.0f, 44.0f),
                    PathNode.LineTo(180.77f, 44.0f),
                    PathNode.LineTo(200.35f, 155.0f),
                    PathNode.CurveTo(200.73145f, 157.17271f, 199.28192f, 159.2441f, 197.11f, 159.63f),
                    PathNode.CurveTo(196.87979f, 159.67798f, 196.64516f, 159.70145f, 196.41f, 159.7f),
                    PathNode.CurveTo(194.47084f, 159.69513f, 192.8145f, 158.30008f, 192.48f, 156.39f),
                    PathNode.LineTo(172.64f, 44.0f),
                    PathNode.LineTo(91.25f, 44.0f),
                    PathNode.CurveTo(89.04086f, 44.0f, 87.25f, 42.20914f, 87.25f, 40.0f),
                    PathNode.Close,
                    PathNode.MoveTo(210.69f, 219.0f),
                    PathNode.CurveTo(209.05516f, 220.48549f, 206.52573f, 220.36461f, 205.04f, 218.73f),
                    PathNode.LineTo(169.87f, 180.0f),
                    PathNode.LineTo(132.0f, 180.0f),
                    PathNode.LineTo(132.0f, 240.0f),
                    PathNode.CurveTo(132.0f, 242.20914f, 130.20914f, 244.0f, 128.0f, 244.0f),
                    PathNode.CurveTo(125.79086f, 244.0f, 124.0f, 242.20914f, 124.0f, 240.0f),
                    PathNode.LineTo(124.0f, 180.0f),
                    PathNode.LineTo(40.0f, 180.0f),
                    PathNode.CurveTo(37.79086f, 180.0f, 36.0f, 178.20914f, 36.0f, 176.0f),
                    PathNode.CurveTo(36.0f, 173.79086f, 37.79086f, 172.0f, 40.0f, 172.0f),
                    PathNode.LineTo(52.64f, 172.0f),
                    PathNode.LineTo(70.52f, 70.72f),
                    PathNode.LineTo(45.0f, 42.69f),
                    PathNode.CurveTo(43.514355f, 41.033146f, 43.653145f, 38.485645f, 45.31f, 37.0f),
                    PathNode.CurveTo(46.966854f, 35.514355f, 49.514355f, 35.653145f, 51.0f, 37.31f),
                    PathNode.LineTo(211.0f, 213.31f),
                    PathNode.CurveTo(211.72092f, 214.10216f, 212.09402f, 215.15038f, 212.03575f, 216.21988f),
                    PathNode.CurveTo(211.97748f, 217.28938f, 211.49272f, 218.29085f, 210.69f, 219.0f),
                    PathNode.Close,
                    PathNode.MoveTo(162.59f, 172.0f),
                    PathNode.LineTo(77.32f, 78.2f),
                    PathNode.LineTo(60.77f, 172.0f),
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
        return _pushPinSimpleSlash!!
    }

private var _pushPinSimpleSlash: ImageVector? = null
