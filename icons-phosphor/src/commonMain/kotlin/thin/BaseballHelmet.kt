package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.BaseballHelmet: ImageVector
    get() {
        if (_baseballHelmet != null) return _baseballHelmet!!
        _baseballHelmet = phosphorThinIcon(
            name = "BaseballHelmet",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(88.0f, 132.0f),
                    PathNode.CurveTo(74.74516f, 132.0f, 64.0f, 142.74516f, 64.0f, 156.0f),
                    PathNode.CurveTo(64.0f, 169.25484f, 74.74516f, 180.0f, 88.0f, 180.0f),
                    PathNode.CurveTo(101.25484f, 180.0f, 112.0f, 169.25484f, 112.0f, 156.0f),
                    PathNode.CurveTo(112.0f, 142.74516f, 101.25484f, 132.0f, 88.0f, 132.0f),
                    PathNode.Close,
                    PathNode.MoveTo(88.0f, 172.0f),
                    PathNode.CurveTo(79.163445f, 172.0f, 72.0f, 164.83656f, 72.0f, 156.0f),
                    PathNode.CurveTo(72.0f, 147.16344f, 79.163445f, 140.0f, 88.0f, 140.0f),
                    PathNode.CurveTo(96.836555f, 140.0f, 104.0f, 147.16344f, 104.0f, 156.0f),
                    PathNode.CurveTo(104.0f, 164.83656f, 96.836555f, 172.0f, 88.0f, 172.0f),
                    PathNode.Close,
                    PathNode.MoveTo(248.0f, 124.0f),
                    PathNode.LineTo(219.92f, 124.0f),
                    PathNode.CurveTo(217.74248f, 69.59442f, 172.43784f, 26.93001f, 117.9996f, 28.019209f),
                    PathNode.CurveTo(63.561356f, 29.10841f, 19.999565f, 73.550865f, 20.0f, 128.0f),
                    PathNode.LineTo(20.0f, 152.0f),
                    PathNode.CurveTo(20.038584f, 189.53935f, 50.460632f, 219.96141f, 88.0f, 220.0f),
                    PathNode.LineTo(128.0f, 220.0f),
                    PathNode.CurveTo(165.53935f, 219.96141f, 195.96141f, 189.53935f, 196.0f, 152.0f),
                    PathNode.LineTo(196.0f, 132.0f),
                    PathNode.LineTo(248.0f, 132.0f),
                    PathNode.CurveTo(250.20914f, 132.0f, 252.0f, 130.20914f, 252.0f, 128.0f),
                    PathNode.CurveTo(252.0f, 125.79086f, 250.20914f, 124.0f, 248.0f, 124.0f),
                    PathNode.Close,
                    PathNode.MoveTo(188.0f, 152.0f),
                    PathNode.CurveTo(187.96143f, 185.1211f, 161.1211f, 211.96143f, 128.0f, 212.0f),
                    PathNode.LineTo(120.0f, 212.0f),
                    PathNode.CurveTo(142.14764f, 200.17036f, 155.98451f, 177.10892f, 156.0f, 152.0f),
                    PathNode.LineTo(156.0f, 132.0f),
                    PathNode.LineTo(188.0f, 132.0f),
                    PathNode.Close,
                    PathNode.MoveTo(152.0f, 124.0f),
                    PathNode.CurveTo(149.79086f, 124.0f, 148.0f, 125.79086f, 148.0f, 128.0f),
                    PathNode.LineTo(148.0f, 152.0f),
                    PathNode.CurveTo(148.0f, 185.13708f, 121.137085f, 212.0f, 88.0f, 212.0f),
                    PathNode.CurveTo(54.862915f, 212.0f, 28.0f, 185.13708f, 28.0f, 152.0f),
                    PathNode.LineTo(28.0f, 128.0f),
                    PathNode.CurveTo(28.03687f, 77.99575f, 68.00703f, 37.176914f, 117.999466f, 36.089592f),
                    PathNode.CurveTo(167.99191f, 35.002262f, 209.69904f, 74.04464f, 211.91f, 124.0f),
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
        return _baseballHelmet!!
    }

private var _baseballHelmet: ImageVector? = null
