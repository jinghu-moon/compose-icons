package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.TextSuperscript: ImageVector
    get() {
        if (_textSuperscript != null) return _textSuperscript!!
        _textSuperscript = phosphorFillIcon(
            name = "TextSuperscript",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(208.0f, 32.0f),
                    PathNode.LineTo(48.0f, 32.0f),
                    PathNode.CurveTo(39.163445f, 32.0f, 32.0f, 39.163445f, 32.0f, 48.0f),
                    PathNode.LineTo(32.0f, 208.0f),
                    PathNode.CurveTo(32.0f, 216.83656f, 39.163445f, 224.0f, 48.0f, 224.0f),
                    PathNode.LineTo(208.0f, 224.0f),
                    PathNode.CurveTo(216.83656f, 224.0f, 224.0f, 216.83656f, 224.0f, 208.0f),
                    PathNode.LineTo(224.0f, 48.0f),
                    PathNode.CurveTo(224.0f, 39.163445f, 216.83656f, 32.0f, 208.0f, 32.0f),
                    PathNode.Close,
                    PathNode.MoveTo(126.55f, 179.41f),
                    PathNode.CurveTo(128.26419f, 181.74791f, 128.57947f, 184.83023f, 127.37408f, 187.46677f),
                    PathNode.CurveTo(126.168686f, 190.10329f, 123.63128f, 191.88141f, 120.74166f, 192.11452f),
                    PathNode.CurveTo(117.85204f, 192.34761f, 115.06242f, 190.99922f, 113.45f, 188.59f),
                    PathNode.LineTo(92.0f, 158.0f),
                    PathNode.LineTo(70.55f, 188.59f),
                    PathNode.CurveTo(68.93758f, 190.99922f, 66.14796f, 192.34761f, 63.25834f, 192.11452f),
                    PathNode.CurveTo(60.36872f, 191.88141f, 57.83131f, 190.10329f, 56.625927f, 187.46677f),
                    PathNode.CurveTo(55.42054f, 184.83023f, 55.73581f, 181.74791f, 57.45f, 179.41f),
                    PathNode.LineTo(82.23f, 144.0f),
                    PathNode.LineTo(57.45f, 108.59f),
                    PathNode.CurveTo(55.73581f, 106.2521f, 55.42054f, 103.16976f, 56.625927f, 100.53324f),
                    PathNode.CurveTo(57.83131f, 97.89671f, 60.36872f, 96.11858f, 63.25834f, 95.88548f),
                    PathNode.CurveTo(66.14796f, 95.65238f, 68.93758f, 97.00078f, 70.55f, 99.41f),
                    PathNode.LineTo(92.0f, 130.05f),
                    PathNode.LineTo(113.45f, 99.41f),
                    PathNode.CurveTo(116.023026f, 95.900764f, 120.92908f, 95.09169f, 124.49265f, 97.58891f),
                    PathNode.CurveTo(128.05623f, 100.086136f, 128.97028f, 104.97372f, 126.55f, 108.59f),
                    PathNode.LineTo(101.77f, 144.0f),
                    PathNode.Close,
                    PathNode.MoveTo(192.0f, 160.0f),
                    PathNode.LineTo(152.0f, 160.0f),
                    PathNode.CurveTo(148.96982f, 160.0f, 146.19972f, 158.28798f, 144.84459f, 155.57771f),
                    PathNode.CurveTo(143.48944f, 152.86742f, 143.78189f, 149.62415f, 145.6f, 147.2f),
                    PathNode.LineTo(181.6f, 99.2f),
                    PathNode.CurveTo(184.2762f, 95.78514f, 184.90071f, 91.191666f, 183.23335f, 87.18627f),
                    PathNode.CurveTo(181.56602f, 83.18087f, 177.8665f, 80.38739f, 173.55766f, 79.880226f),
                    PathNode.CurveTo(169.24883f, 79.37306f, 165.00179f, 81.23121f, 162.45f, 84.74f),
                    PathNode.CurveTo(161.26082f, 86.143715f, 160.38162f, 87.782845f, 159.87f, 89.55f),
                    PathNode.CurveTo(159.32616f, 92.37517f, 157.30719f, 94.69074f, 154.58244f, 95.61435f),
                    PathNode.CurveTo(151.85768f, 96.53796f, 148.84683f, 95.92734f, 146.69719f, 94.015175f),
                    PathNode.CurveTo(144.54755f, 92.103004f, 143.59021f, 89.18382f, 144.19f, 86.37f),
                    PathNode.CurveTo(146.49406f, 75.04939f, 155.47652f, 66.28312f, 166.84988f, 64.25548f),
                    PathNode.CurveTo(178.22327f, 62.22784f, 189.68173f, 67.349915f, 195.75597f, 77.17684f),
                    PathNode.CurveTo(201.83022f, 87.00377f, 201.28873f, 99.54327f, 194.39f, 108.81f),
                    PathNode.LineTo(168.0f, 144.0f),
                    PathNode.LineTo(192.0f, 144.0f),
                    PathNode.CurveTo(196.41827f, 144.0f, 200.0f, 147.58173f, 200.0f, 152.0f),
                    PathNode.CurveTo(200.0f, 156.41827f, 196.41827f, 160.0f, 192.0f, 160.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 4f,
            )
        }
        return _textSuperscript!!
    }

private var _textSuperscript: ImageVector? = null
