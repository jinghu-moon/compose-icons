package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.ArrowsClockwise: ImageVector
    get() {
        if (_arrowsClockwise != null) return _arrowsClockwise!!
        _arrowsClockwise = phosphorLightIcon(
            name = "ArrowsClockwise",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(222.0f, 48.0f),
                    PathNode.LineTo(222.0f, 96.0f),
                    PathNode.CurveTo(222.0f, 99.313705f, 219.3137f, 102.0f, 216.0f, 102.0f),
                    PathNode.LineTo(168.0f, 102.0f),
                    PathNode.CurveTo(164.6863f, 102.0f, 162.0f, 99.313705f, 162.0f, 96.0f),
                    PathNode.CurveTo(162.0f, 92.686295f, 164.6863f, 90.0f, 168.0f, 90.0f),
                    PathNode.LineTo(201.52f, 90.0f),
                    PathNode.LineTo(183.47f, 72.0f),
                    PathNode.CurveTo(168.23062f, 56.693604f, 147.53908f, 48.061638f, 125.94f, 48.0f),
                    PathNode.LineTo(125.48f, 48.0f),
                    PathNode.CurveTo(104.06656f, 47.932396f, 83.486786f, 56.295063f, 68.19f, 71.28f),
                    PathNode.CurveTo(66.67421f, 72.862305f, 64.4164f, 73.49247f, 62.300274f, 72.92385f),
                    PathNode.CurveTo(60.184143f, 72.35523f, 58.546276f, 70.67828f, 58.027718f, 68.54933f),
                    PathNode.CurveTo(57.50916f, 66.42038f, 58.192394f, 64.17806f, 59.81f, 62.7f),
                    PathNode.CurveTo(77.32974f, 45.492012f, 100.922874f, 35.878f, 125.48f, 35.94f),
                    PathNode.LineTo(126.0f, 35.94f),
                    PathNode.CurveTo(150.7799f, 36.00316f, 174.52019f, 45.90573f, 192.0f, 63.47f),
                    PathNode.LineTo(210.0f, 81.47f),
                    PathNode.LineTo(210.0f, 48.0f),
                    PathNode.CurveTo(210.0f, 44.68629f, 212.6863f, 42.0f, 216.0f, 42.0f),
                    PathNode.CurveTo(219.3137f, 42.0f, 222.0f, 44.68629f, 222.0f, 48.0f),
                    PathNode.Close,
                    PathNode.MoveTo(187.81f, 184.72f),
                    PathNode.CurveTo(172.5229f, 199.7269f, 151.94196f, 208.11159f, 130.52f, 208.06f),
                    PathNode.LineTo(130.06f, 208.06f),
                    PathNode.CurveTo(108.460915f, 207.99837f, 87.76937f, 199.3664f, 72.53f, 184.06f),
                    PathNode.LineTo(54.48f, 166.0f),
                    PathNode.LineTo(88.0f, 166.0f),
                    PathNode.CurveTo(91.313705f, 166.0f, 94.0f, 163.3137f, 94.0f, 160.0f),
                    PathNode.CurveTo(94.0f, 156.6863f, 91.313705f, 154.0f, 88.0f, 154.0f),
                    PathNode.LineTo(40.0f, 154.0f),
                    PathNode.CurveTo(36.68629f, 154.0f, 34.0f, 156.6863f, 34.0f, 160.0f),
                    PathNode.LineTo(34.0f, 208.0f),
                    PathNode.CurveTo(34.0f, 211.3137f, 36.68629f, 214.0f, 40.0f, 214.0f),
                    PathNode.CurveTo(43.31371f, 214.0f, 46.0f, 211.3137f, 46.0f, 208.0f),
                    PathNode.LineTo(46.0f, 174.48f),
                    PathNode.LineTo(64.0f, 192.53f),
                    PathNode.CurveTo(81.47982f, 210.09427f, 105.22009f, 219.99684f, 130.0f, 220.06f),
                    PathNode.LineTo(130.52f, 220.06f),
                    PathNode.CurveTo(155.07712f, 220.122f, 178.67026f, 210.50798f, 196.19f, 193.3f),
                    PathNode.CurveTo(197.8076f, 191.82195f, 198.49084f, 189.57962f, 197.97229f, 187.45067f),
                    PathNode.CurveTo(197.45374f, 185.32173f, 195.81586f, 183.64478f, 193.69972f, 183.07616f),
                    PathNode.CurveTo(191.5836f, 182.50754f, 189.32579f, 183.1377f, 187.81f, 184.72f),
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
        return _arrowsClockwise!!
    }

private var _arrowsClockwise: ImageVector? = null
