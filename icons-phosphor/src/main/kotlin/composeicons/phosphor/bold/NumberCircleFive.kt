package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.NumberCircleFive: ImageVector
    get() {
        if (_numberCircleFive != null) return _numberCircleFive!!
        _numberCircleFive = phosphorBoldIcon(
            name = "NumberCircleFive",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M128 20C68.353 20 20 68.353 20 128c0 59.647 48.353 108 108 108 59.647 0 108-48.353 108-108C235.934 68.381 187.619 20.066 128 20ZM128 212C81.608 212 44 174.392 44 128 44 81.608 81.608 44 128 44c46.392 0 84 37.608 84 84-.05 46.371-37.629 83.95-84 84ZM122.17 92l-2.71 16.23c1.509-.152 3.024-.229 4.54-.23 22.091 0 40 17.909 40 40 0 22.091-17.909 40-40 40-10.701 .16-21.01-4.025-28.57-11.6-4.639-4.733-4.563-12.331 .17-16.97 4.733-4.639 12.331-4.563 16.97 .17 3.047 2.97 7.178 4.56 11.43 4.4 8.837 0 16-7.163 16-16 0-8.837-7.163-16-16-16-4.252-.16-8.383 1.43-11.43 4.4-3.669 3.752-9.351 4.685-14.028 2.302C93.866 136.319 91.281 131.174 92.16 126l8-48c.976-5.777 5.981-10.004 11.84-10h40c6.627 0 12 5.373 12 12 0 6.627-5.373 12-12 12Z"),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color(0xFF000000)),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
            )
        }
        return _numberCircleFive!!
    }

private var _numberCircleFive: ImageVector? = null
