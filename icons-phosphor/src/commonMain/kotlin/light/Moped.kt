package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Moped: ImageVector
    get() {
        if (_moped != null) return _moped!!
        _moped = phosphorLightIcon(
            name = "Moped",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(216.0f, 130.0f),
                    PathNode.CurveTo(213.46085f, 129.99823f, 210.928f, 130.25285f, 208.44f, 130.76f),
                    PathNode.LineTo(173.62f, 37.89f),
                    PathNode.CurveTo(172.7405f, 35.548767f, 170.50098f, 33.998646f, 168.0f, 34.0f),
                    PathNode.LineTo(136.0f, 34.0f),
                    PathNode.CurveTo(132.6863f, 34.0f, 130.0f, 36.68629f, 130.0f, 40.0f),
                    PathNode.CurveTo(130.0f, 43.31371f, 132.6863f, 46.0f, 136.0f, 46.0f),
                    PathNode.LineTo(163.84f, 46.0f),
                    PathNode.LineTo(197.21f, 135.0f),
                    PathNode.CurveTo(187.20491f, 140.70453f, 180.31909f, 150.63069f, 178.48f, 162.0f),
                    PathNode.LineTo(135.16f, 162.0f),
                    PathNode.LineTo(109.62f, 93.89f),
                    PathNode.CurveTo(108.740486f, 91.54877f, 106.500984f, 89.99865f, 104.0f, 90.0f),
                    PathNode.LineTo(24.0f, 90.0f),
                    PathNode.CurveTo(20.68629f, 90.0f, 18.0f, 92.686295f, 18.0f, 96.0f),
                    PathNode.CurveTo(18.0f, 99.313705f, 20.68629f, 102.0f, 24.0f, 102.0f),
                    PathNode.LineTo(34.0f, 102.0f),
                    PathNode.LineTo(34.0f, 118.67f),
                    PathNode.CurveTo(14.551907f, 127.379524f, 2.024858f, 146.69077f, 2.0f, 168.0f),
                    PathNode.CurveTo(2.0f, 171.3137f, 4.686292f, 174.0f, 8.0f, 174.0f),
                    PathNode.LineTo(18.48f, 174.0f),
                    PathNode.CurveTo(21.489866f, 192.37045f, 37.364605f, 205.85588f, 55.98f, 205.85588f),
                    PathNode.CurveTo(74.5954f, 205.85588f, 90.47013f, 192.37045f, 93.48f, 174.0f),
                    PathNode.LineTo(178.48f, 174.0f),
                    PathNode.CurveTo(181.67061f, 193.95366f, 199.91948f, 207.9204f, 220.01376f, 205.78778f),
                    PathNode.CurveTo(240.10805f, 203.65517f, 255.01883f, 186.16917f, 253.95015f, 165.99031f),
                    PathNode.CurveTo(252.88147f, 145.81145f, 236.20714f, 129.99823f, 216.0f, 130.0f),
                    PathNode.Close,
                    PathNode.MoveTo(42.0f, 128.39f),
                    PathNode.CurveTo(44.39837f, 127.54205f, 46.001335f, 125.27385f, 46.0f, 122.73f),
                    PathNode.LineTo(46.0f, 102.0f),
                    PathNode.LineTo(99.84f, 102.0f),
                    PathNode.LineTo(122.34f, 162.0f),
                    PathNode.LineTo(14.43f, 162.0f),
                    PathNode.CurveTo(16.67137f, 146.54874f, 27.28532f, 133.6095f, 42.0f, 128.39f),
                    PathNode.Close,
                    PathNode.MoveTo(56.0f, 194.0f),
                    PathNode.CurveTo(43.955f, 193.99619f, 33.489616f, 185.7199f, 30.71f, 174.0f),
                    PathNode.LineTo(81.29f, 174.0f),
                    PathNode.CurveTo(78.51038f, 185.7199f, 68.045f, 193.99619f, 56.0f, 194.0f),
                    PathNode.Close,
                    PathNode.MoveTo(216.0f, 194.0f),
                    PathNode.CurveTo(204.56677f, 193.99265f, 194.48001f, 186.51727f, 191.14642f, 175.58081f),
                    PathNode.CurveTo(187.81284f, 164.64436f, 192.01482f, 152.81357f, 201.5f, 146.43f),
                    PathNode.LineTo(210.38f, 170.11f),
                    PathNode.CurveTo(211.54532f, 173.21384f, 215.00616f, 174.78532f, 218.11f, 173.62f),
                    PathNode.CurveTo(221.21384f, 172.45468f, 222.78532f, 168.99384f, 221.62f, 165.89f),
                    PathNode.LineTo(212.74f, 142.21f),
                    PathNode.CurveTo(213.82141f, 142.07405f, 214.91008f, 142.00392f, 216.0f, 142.0f),
                    PathNode.CurveTo(230.3594f, 142.0f, 242.0f, 153.6406f, 242.0f, 168.0f),
                    PathNode.CurveTo(242.0f, 182.3594f, 230.3594f, 194.0f, 216.0f, 194.0f),
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
        return _moped!!
    }

private var _moped: ImageVector? = null
