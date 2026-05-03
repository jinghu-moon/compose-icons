package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.FigmaLogo: ImageVector
    get() {
        if (_figmaLogo != null) return _figmaLogo!!
        _figmaLogo = phosphorDuotoneIcon(
            name = "FigmaLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(200.0f, 128.0f),
                    PathNode.CurveTo(200.0f, 145.67311f, 185.67311f, 160.0f, 168.0f, 160.0f),
                    PathNode.CurveTo(150.32689f, 160.0f, 136.0f, 145.67311f, 136.0f, 128.0f),
                    PathNode.CurveTo(136.0f, 110.32689f, 150.32689f, 96.0f, 168.0f, 96.0f),
                    PathNode.CurveTo(185.67311f, 96.0f, 200.0f, 110.32689f, 200.0f, 128.0f),
                    PathNode.Close,
                    PathNode.MoveTo(96.0f, 96.0f),
                    PathNode.LineTo(136.0f, 96.0f),
                    PathNode.LineTo(136.0f, 32.0f),
                    PathNode.LineTo(96.0f, 32.0f),
                    PathNode.CurveTo(78.32689f, 32.0f, 64.0f, 46.32689f, 64.0f, 64.0f),
                    PathNode.CurveTo(64.0f, 81.67311f, 78.32689f, 96.0f, 96.0f, 96.0f),
                    PathNode.Close,
                    PathNode.MoveTo(64.0f, 196.0f),
                    PathNode.CurveTo(64.0f, 215.88223f, 80.11775f, 232.0f, 100.0f, 232.0f),
                    PathNode.CurveTo(119.88225f, 232.0f, 136.0f, 215.88223f, 136.0f, 196.0f),
                    PathNode.LineTo(136.0f, 160.0f),
                    PathNode.LineTo(100.0f, 160.0f),
                    PathNode.CurveTo(80.11775f, 160.0f, 64.0f, 176.11777f, 64.0f, 196.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 0.2f,
                stroke = null,
                strokeAlpha = 0.2f,
                strokeLineWidth = 16.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(192.0f, 96.0f),
                    PathNode.CurveTo(205.77377f, 85.66967f, 211.39189f, 67.68458f, 205.94733f, 51.35089f),
                    PathNode.CurveTo(200.50278f, 35.017204f, 185.21721f, 24.0f, 168.0f, 24.0f),
                    PathNode.LineTo(96.0f, 24.0f),
                    PathNode.CurveTo(78.78278f, 24.0f, 63.49723f, 35.017204f, 58.05267f, 51.35089f),
                    PathNode.CurveTo(52.608105f, 67.68458f, 58.226227f, 85.66967f, 72.0f, 96.0f),
                    PathNode.CurveTo(61.683147f, 103.731705f, 55.72542f, 115.96209f, 55.99709f, 128.85173f),
                    PathNode.CurveTo(56.268764f, 141.74138f, 62.73653f, 153.70987f, 73.37f, 161.0f),
                    PathNode.CurveTo(56.924553f, 173.50323f, 51.392242f, 195.76392f, 60.071198f, 214.51117f),
                    PathNode.CurveTo(68.75015f, 233.25842f, 89.30291f, 243.44315f, 109.4768f, 238.99364f),
                    PathNode.CurveTo(129.65068f, 234.54411f, 144.01236f, 216.65874f, 144.0f, 196.0f),
                    PathNode.LineTo(144.0f, 160.0f),
                    PathNode.CurveTo(161.67311f, 173.25484f, 186.74516f, 169.67311f, 200.0f, 152.0f),
                    PathNode.CurveTo(213.25484f, 134.32689f, 209.67311f, 109.25484f, 192.0f, 96.0f),
                    PathNode.Close,
                    PathNode.MoveTo(192.0f, 64.0f),
                    PathNode.CurveTo(192.0f, 77.25484f, 181.25484f, 88.0f, 168.0f, 88.0f),
                    PathNode.LineTo(144.0f, 88.0f),
                    PathNode.LineTo(144.0f, 40.0f),
                    PathNode.LineTo(168.0f, 40.0f),
                    PathNode.CurveTo(181.25484f, 40.0f, 192.0f, 50.745167f, 192.0f, 64.0f),
                    PathNode.Close,
                    PathNode.MoveTo(72.0f, 64.0f),
                    PathNode.CurveTo(72.0f, 50.745167f, 82.74516f, 40.0f, 96.0f, 40.0f),
                    PathNode.LineTo(128.0f, 40.0f),
                    PathNode.LineTo(128.0f, 88.0f),
                    PathNode.LineTo(96.0f, 88.0f),
                    PathNode.CurveTo(82.74516f, 88.0f, 72.0f, 77.25484f, 72.0f, 64.0f),
                    PathNode.Close,
                    PathNode.MoveTo(96.0f, 152.0f),
                    PathNode.CurveTo(82.74516f, 152.0f, 72.0f, 141.25484f, 72.0f, 128.0f),
                    PathNode.CurveTo(72.0f, 114.74516f, 82.74516f, 104.0f, 96.0f, 104.0f),
                    PathNode.LineTo(128.0f, 104.0f),
                    PathNode.LineTo(128.0f, 152.0f),
                    PathNode.LineTo(96.0f, 152.0f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 196.0f),
                    PathNode.CurveTo(128.0f, 211.46397f, 115.463974f, 224.0f, 100.0f, 224.0f),
                    PathNode.CurveTo(84.536026f, 224.0f, 72.0f, 211.46397f, 72.0f, 196.0f),
                    PathNode.CurveTo(72.0f, 180.53603f, 84.536026f, 168.0f, 100.0f, 168.0f),
                    PathNode.LineTo(128.0f, 168.0f),
                    PathNode.Close,
                    PathNode.MoveTo(168.0f, 152.0f),
                    PathNode.CurveTo(154.74516f, 152.0f, 144.0f, 141.25484f, 144.0f, 128.0f),
                    PathNode.CurveTo(144.0f, 114.74516f, 154.74516f, 104.0f, 168.0f, 104.0f),
                    PathNode.CurveTo(181.25484f, 104.0f, 192.0f, 114.74516f, 192.0f, 128.0f),
                    PathNode.CurveTo(192.0f, 141.25484f, 181.25484f, 152.0f, 168.0f, 152.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 16.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _figmaLogo!!
    }

private var _figmaLogo: ImageVector? = null
