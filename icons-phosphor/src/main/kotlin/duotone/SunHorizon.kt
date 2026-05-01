package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.SunHorizon: ImageVector
    get() {
        if (_sunHorizon != null) return _sunHorizon!!
        _sunHorizon = phosphorDuotoneIcon(
            name = "SunHorizon",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(192.0f, 144.0f),
                    PathNode.CurveTo(192.00702f, 149.3961f, 191.33508f, 154.77165f, 190.0f, 160.0f),
                    PathNode.LineTo(66.0f, 160.0f),
                    PathNode.CurveTo(59.855957f, 136.00284f, 68.11164f, 110.61505f, 87.19498f, 94.82141f),
                    PathNode.CurveTo(106.27831f, 79.02778f, 132.76201f, 75.664764f, 155.1871f, 86.18749f),
                    PathNode.CurveTo(177.6122f, 96.71022f, 191.95125f, 119.22884f, 192.0f, 144.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 16.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(240.0f, 152.0f),
                    PathNode.LineTo(199.55f, 152.0f),
                    PathNode.CurveTo(199.84528f, 149.34349f, 199.9955f, 146.67287f, 200.0f, 144.0f),
                    PathNode.CurveTo(200.0f, 104.2355f, 167.7645f, 72.0f, 128.0f, 72.0f),
                    PathNode.CurveTo(88.2355f, 72.0f, 56.0f, 104.2355f, 56.0f, 144.0f),
                    PathNode.CurveTo(56.004505f, 146.67287f, 56.154728f, 149.34349f, 56.45f, 152.0f),
                    PathNode.LineTo(16.0f, 152.0f),
                    PathNode.CurveTo(11.581722f, 152.0f, 8.0f, 155.58173f, 8.0f, 160.0f),
                    PathNode.CurveTo(8.0f, 164.41827f, 11.581722f, 168.0f, 16.0f, 168.0f),
                    PathNode.LineTo(240.0f, 168.0f),
                    PathNode.CurveTo(244.41827f, 168.0f, 248.0f, 164.41827f, 248.0f, 160.0f),
                    PathNode.CurveTo(248.0f, 155.58173f, 244.41827f, 152.0f, 240.0f, 152.0f),
                    PathNode.Close,
                    PathNode.MoveTo(72.0f, 144.0f),
                    PathNode.CurveTo(71.95995f, 123.00832f, 83.66311f, 103.75715f, 102.316986f, 94.12985f),
                    PathNode.CurveTo(120.97087f, 84.50256f, 143.44237f, 86.11617f, 160.52934f, 98.3099f),
                    PathNode.CurveTo(177.61633f, 110.50363f, 186.44885f, 131.22942f, 183.41f, 152.0f),
                    PathNode.LineTo(72.59f, 152.0f),
                    PathNode.CurveTo(72.20279f, 149.35081f, 72.00562f, 146.67732f, 72.0f, 144.0f),
                    PathNode.Close,
                    PathNode.MoveTo(216.0f, 200.0f),
                    PathNode.CurveTo(216.0f, 204.41827f, 212.41827f, 208.0f, 208.0f, 208.0f),
                    PathNode.LineTo(48.0f, 208.0f),
                    PathNode.CurveTo(43.581722f, 208.0f, 40.0f, 204.41827f, 40.0f, 200.0f),
                    PathNode.CurveTo(40.0f, 195.58173f, 43.581722f, 192.0f, 48.0f, 192.0f),
                    PathNode.LineTo(208.0f, 192.0f),
                    PathNode.CurveTo(212.41827f, 192.0f, 216.0f, 195.58173f, 216.0f, 200.0f),
                    PathNode.Close,
                    PathNode.MoveTo(72.84f, 43.58f),
                    PathNode.CurveTo(70.86282f, 39.62564f, 72.465645f, 34.81718f, 76.42f, 32.84f),
                    PathNode.CurveTo(80.37436f, 30.86282f, 85.18282f, 32.46564f, 87.16f, 36.42f),
                    PathNode.LineTo(95.16f, 52.42f),
                    PathNode.CurveTo(97.13718f, 56.37436f, 95.534355f, 61.18282f, 91.58f, 63.16f),
                    PathNode.CurveTo(87.62564f, 65.13718f, 82.81718f, 63.53436f, 80.84f, 59.58f),
                    PathNode.Close,
                    PathNode.MoveTo(16.84f, 92.42f),
                    PathNode.CurveTo(17.79022f, 90.52183f, 19.455887f, 89.07912f, 21.470251f, 88.40954f),
                    PathNode.CurveTo(23.484615f, 87.73996f, 25.68251f, 87.89841f, 27.58f, 88.85f),
                    PathNode.LineTo(43.58f, 96.85f),
                    PathNode.CurveTo(47.531597f, 98.82718f, 49.13218f, 103.6334f, 47.155f, 107.585f),
                    PathNode.CurveTo(45.177822f, 111.5366f, 40.371597f, 113.13718f, 36.42f, 111.16f),
                    PathNode.LineTo(20.42f, 103.16f),
                    PathNode.CurveTo(18.52007f, 102.211555f, 17.07517f, 100.54665f, 16.403658f, 98.53211f),
                    PathNode.CurveTo(15.732145f, 96.51758f, 15.889122f, 94.31872f, 16.84f, 92.42f),
                    PathNode.Close,
                    PathNode.MoveTo(208.84f, 107.58f),
                    PathNode.CurveTo(206.86653f, 103.628334f, 208.46912f, 98.825035f, 212.42f, 96.85f),
                    PathNode.LineTo(228.42f, 88.85f),
                    PathNode.CurveTo(232.3716f, 86.87282f, 237.17783f, 88.4734f, 239.155f, 92.425f),
                    PathNode.CurveTo(241.13219f, 96.376595f, 239.5316f, 101.18282f, 235.58f, 103.16f),
                    PathNode.LineTo(219.58f, 111.16f),
                    PathNode.CurveTo(217.68129f, 112.11088f, 215.48242f, 112.26785f, 213.4679f, 111.596344f),
                    PathNode.CurveTo(211.45335f, 110.92483f, 209.78845f, 109.479935f, 208.84f, 107.58f),
                    PathNode.Close,
                    PathNode.MoveTo(160.84f, 52.42f),
                    PathNode.LineTo(168.84f, 36.42f),
                    PathNode.CurveTo(170.81718f, 32.46564f, 175.62564f, 30.86282f, 179.58f, 32.84f),
                    PathNode.CurveTo(183.53436f, 34.81718f, 185.13718f, 39.62564f, 183.16f, 43.58f),
                    PathNode.LineTo(175.16f, 59.58f),
                    PathNode.CurveTo(173.18282f, 63.53436f, 168.37436f, 65.13718f, 164.42f, 63.16f),
                    PathNode.CurveTo(160.46564f, 61.18282f, 158.86282f, 56.37436f, 160.84f, 52.42f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 16.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _sunHorizon!!
    }

private var _sunHorizon: ImageVector? = null
