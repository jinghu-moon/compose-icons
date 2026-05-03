package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.SkipForwardCircle: ImageVector
    get() {
        if (_skipForwardCircle != null) return _skipForwardCircle!!
        _skipForwardCircle = phosphorRegularIcon(
            name = "SkipForwardCircle",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 128.000 24.000 C 70.562 24.000 24.000 70.562 24.000 128.000 C 24.000 185.438 70.562 232.000 128.000 232.000 C 185.438 232.000 232.000 185.438 232.000 128.000 C 231.939 70.588 185.412 24.061 128.000 24.000 ZM 128.000 216.000 C 79.399 216.000 40.000 176.601 40.000 128.000 C 40.000 79.399 79.399 40.000 128.000 40.000 C 176.601 40.000 216.000 79.399 216.000 128.000 C 215.945 176.578 176.578 215.945 128.000 216.000 ZM 160.000 80.000 C 155.582 80.000 152.000 83.582 152.000 88.000 L 152.000 113.570 L 100.240 81.220 C 97.774 79.679 94.667 79.597 92.124 81.006 C 89.580 82.415 88.001 85.093 88.000 88.000 L 88.000 168.000 C 88.001 170.907 89.580 173.585 92.124 174.994 C 94.667 176.403 97.774 176.321 100.240 174.780 L 152.000 142.430 L 152.000 168.000 C 152.000 172.418 155.582 176.000 160.000 176.000 C 164.418 176.000 168.000 172.418 168.000 168.000 L 168.000 88.000 C 168.000 83.582 164.418 80.000 160.000 80.000 ZM 104.000 153.570 L 104.000 102.430 L 144.910 128.000 Z"),
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
        return _skipForwardCircle!!
    }

private var _skipForwardCircle: ImageVector? = null
