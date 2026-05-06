package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Tooth: ImageVector
    get() {
        if (_tooth != null) return _tooth!!
        _tooth = phosphorFillIcon(
            name = "Tooth",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M168 24h-80C57.169 24 32.138 48.92 32 79.75c0 42.72 8 75.4 14.7 95.28 8.72 25.8 20.62 45.49 32.64 54 2.658 1.921 5.851 2.96 9.13 2.97 8.407-.024 15.378-6.516 16-14.9 .85-11.52 5-49.11 23.53-49.11 18.53 0 22.68 37.59 23.53 49.11 .429 5.782 3.936 10.886 9.18 13.36 5.174 2.482 11.291 1.942 15.95-1.41 12-8.53 23.92-28.22 32.64-54C216 155.15 224 122.47 224 79.75 223.862 48.92 198.831 24 168 24ZM171 80.57c4.101 1.657 6.082 6.324 4.425 10.425-1.657 4.101-6.324 6.082-10.425 4.425L128 80.61 91 95.42c-4.101 1.657-8.768-.324-10.425-4.425C78.918 86.894 80.899 82.227 85 80.57L106.46 72 85 63.42C80.899 61.763 78.918 57.096 80.575 52.995 82.232 48.894 86.899 46.913 91 48.57l37 14.81L165 48.57c4.101-1.657 8.768 .324 10.425 4.425 1.657 4.101-.324 8.768-4.425 10.425L149.54 72Z"),
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
        return _tooth!!
    }

private var _tooth: ImageVector? = null
