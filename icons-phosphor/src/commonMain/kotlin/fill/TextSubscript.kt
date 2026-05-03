package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.TextSubscript: ImageVector
    get() {
        if (_textSubscript != null) return _textSubscript!!
        _textSubscript = phosphorFillIcon(
            name = "TextSubscript",
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
                    PathNode.MoveTo(126.55f, 147.41f),
                    PathNode.CurveTo(128.26419f, 149.74791f, 128.57947f, 152.83023f, 127.37408f, 155.46677f),
                    PathNode.CurveTo(126.168686f, 158.10329f, 123.63128f, 159.88141f, 120.74166f, 160.11452f),
                    PathNode.CurveTo(117.85204f, 160.34761f, 115.06242f, 158.99922f, 113.45f, 156.59f),
                    PathNode.LineTo(92.0f, 126.0f),
                    PathNode.LineTo(70.55f, 156.59f),
                    PathNode.CurveTo(68.93758f, 158.99922f, 66.14796f, 160.34761f, 63.25834f, 160.11452f),
                    PathNode.CurveTo(60.36872f, 159.88141f, 57.83131f, 158.10329f, 56.625927f, 155.46677f),
                    PathNode.CurveTo(55.42054f, 152.83023f, 55.73581f, 149.74791f, 57.45f, 147.41f),
                    PathNode.LineTo(82.23f, 112.0f),
                    PathNode.LineTo(57.45f, 76.59f),
                    PathNode.CurveTo(55.029728f, 72.97372f, 55.94377f, 68.086136f, 59.507347f, 65.58891f),
                    PathNode.CurveTo(63.070923f, 63.091694f, 67.976974f, 63.900764f, 70.55f, 67.41f),
                    PathNode.LineTo(92.0f, 98.05f),
                    PathNode.LineTo(113.45f, 67.41f),
                    PathNode.CurveTo(116.023026f, 63.900764f, 120.92908f, 63.091694f, 124.49265f, 65.58891f),
                    PathNode.CurveTo(128.05623f, 68.086136f, 128.97028f, 72.97372f, 126.55f, 76.59f),
                    PathNode.LineTo(101.77f, 112.0f),
                    PathNode.Close,
                    PathNode.MoveTo(192.0f, 192.0f),
                    PathNode.LineTo(152.0f, 192.0f),
                    PathNode.CurveTo(148.96982f, 192.0f, 146.19972f, 190.28798f, 144.84459f, 187.57771f),
                    PathNode.CurveTo(143.48944f, 184.86742f, 143.78189f, 181.62415f, 145.6f, 179.2f),
                    PathNode.LineTo(181.6f, 131.2f),
                    PathNode.CurveTo(184.2762f, 127.78514f, 184.90071f, 123.191666f, 183.23335f, 119.18627f),
                    PathNode.CurveTo(181.56602f, 115.18087f, 177.8665f, 112.38739f, 173.55766f, 111.880226f),
                    PathNode.CurveTo(169.24883f, 111.37306f, 165.00179f, 113.23121f, 162.45f, 116.74f),
                    PathNode.CurveTo(161.26082f, 118.143715f, 160.38162f, 119.782845f, 159.87f, 121.55f),
                    PathNode.CurveTo(159.32616f, 124.37517f, 157.30719f, 126.69074f, 154.58244f, 127.61435f),
                    PathNode.CurveTo(151.85768f, 128.53795f, 148.84683f, 127.92734f, 146.69719f, 126.015175f),
                    PathNode.CurveTo(144.54755f, 124.103004f, 143.59021f, 121.18382f, 144.19f, 118.37f),
                    PathNode.CurveTo(146.49406f, 107.04939f, 155.47652f, 98.28312f, 166.84988f, 96.25548f),
                    PathNode.CurveTo(178.22327f, 94.22784f, 189.68173f, 99.349915f, 195.75597f, 109.17684f),
                    PathNode.CurveTo(201.83022f, 119.00377f, 201.28873f, 131.54326f, 194.39f, 140.81f),
                    PathNode.LineTo(168.0f, 176.0f),
                    PathNode.LineTo(192.0f, 176.0f),
                    PathNode.CurveTo(196.41827f, 176.0f, 200.0f, 179.58173f, 200.0f, 184.0f),
                    PathNode.CurveTo(200.0f, 188.41827f, 196.41827f, 192.0f, 192.0f, 192.0f),
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
        return _textSubscript!!
    }

private var _textSubscript: ImageVector? = null
