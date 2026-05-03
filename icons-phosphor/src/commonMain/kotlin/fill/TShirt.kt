package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.TShirt: ImageVector
    get() {
        if (_tShirt != null) return _tShirt!!
        _tShirt = phosphorFillIcon(
            name = "TShirt",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(247.59f, 61.22f),
                    PathNode.LineTo(195.83f, 33.0f),
                    PathNode.CurveTo(194.65726f, 32.351097f, 193.34027f, 32.007236f, 192.0f, 32.0f),
                    PathNode.LineTo(160.0f, 32.0f),
                    PathNode.CurveTo(155.58173f, 32.0f, 152.0f, 35.581722f, 152.0f, 40.0f),
                    PathNode.CurveTo(152.0f, 53.254833f, 141.25484f, 64.0f, 128.0f, 64.0f),
                    PathNode.CurveTo(114.74516f, 64.0f, 104.0f, 53.254833f, 104.0f, 40.0f),
                    PathNode.CurveTo(104.0f, 35.581722f, 100.41828f, 32.0f, 96.0f, 32.0f),
                    PathNode.LineTo(64.0f, 32.0f),
                    PathNode.CurveTo(62.65633f, 32.00556f, 61.33571f, 32.349472f, 60.16f, 33.0f),
                    PathNode.LineTo(8.41f, 61.22f),
                    PathNode.CurveTo(0.72919f, 65.279106f, -2.218382f, 74.78827f, 1.82f, 82.48f),
                    PathNode.LineTo(21.09f, 119.29f),
                    PathNode.CurveTo(23.946058f, 124.68451f, 29.566225f, 128.04196f, 35.67f, 128.0f),
                    PathNode.LineTo(56.0f, 128.0f),
                    PathNode.LineTo(56.0f, 208.0f),
                    PathNode.CurveTo(56.0f, 216.83656f, 63.163445f, 224.0f, 72.0f, 224.0f),
                    PathNode.LineTo(184.0f, 224.0f),
                    PathNode.CurveTo(192.83656f, 224.0f, 200.0f, 216.83656f, 200.0f, 208.0f),
                    PathNode.LineTo(200.0f, 128.0f),
                    PathNode.LineTo(220.34f, 128.0f),
                    PathNode.CurveTo(226.44377f, 128.04196f, 232.06395f, 124.68451f, 234.92f, 119.29f),
                    PathNode.LineTo(254.19f, 82.48f),
                    PathNode.CurveTo(258.22687f, 74.78563f, 255.27455f, 65.27556f, 247.59f, 61.22f),
                    PathNode.Close,
                    PathNode.MoveTo(35.67f, 112.0f),
                    PathNode.CurveTo(35.522198f, 112.00698f, 35.376774f, 111.96087f, 35.26f, 111.87f),
                    PathNode.LineTo(16.09f, 75.26f),
                    PathNode.LineTo(56.0f, 53.48f),
                    PathNode.LineTo(56.0f, 112.0f),
                    PathNode.Close,
                    PathNode.MoveTo(220.74f, 111.86f),
                    PathNode.CurveTo(220.62825f, 111.96079f, 220.48009f, 112.01139f, 220.33f, 112.0f),
                    PathNode.LineTo(200.0f, 112.0f),
                    PathNode.LineTo(200.0f, 53.48f),
                    PathNode.LineTo(239.92f, 75.26f),
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
        return _tShirt!!
    }

private var _tShirt: ImageVector? = null
