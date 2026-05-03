package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.SkipBackCircle: ImageVector
    get() {
        if (_skipBackCircle != null) return _skipBackCircle!!
        _skipBackCircle = phosphorRegularIcon(
            name = "SkipBackCircle",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 128.000 24.000 C 70.562 24.000 24.000 70.562 24.000 128.000 C 24.000 185.438 70.562 232.000 128.000 232.000 C 185.438 232.000 232.000 185.438 232.000 128.000 C 231.939 70.588 185.412 24.061 128.000 24.000 ZM 128.000 216.000 C 79.399 216.000 40.000 176.601 40.000 128.000 C 40.000 79.399 79.399 40.000 128.000 40.000 C 176.601 40.000 216.000 79.399 216.000 128.000 C 215.945 176.578 176.578 215.945 128.000 216.000 ZM 163.880 81.000 C 161.335 79.592 158.225 79.676 155.760 81.220 L 104.000 113.570 L 104.000 88.000 C 104.000 83.582 100.418 80.000 96.000 80.000 C 91.582 80.000 88.000 83.582 88.000 88.000 L 88.000 168.000 C 88.000 172.418 91.582 176.000 96.000 176.000 C 100.418 176.000 104.000 172.418 104.000 168.000 L 104.000 142.430 L 155.760 174.780 C 158.226 176.321 161.333 176.403 163.876 174.994 C 166.420 173.585 167.999 170.907 168.000 168.000 L 168.000 88.000 C 168.001 85.091 166.424 82.411 163.880 81.000 ZM 152.000 153.570 L 111.090 128.000 L 152.000 102.430 Z"),
        pathFillType = PathFillType.NonZero,
        fill = SolidColor(Color(0xFF000000)),
        fillAlpha = 1.0f,
        stroke = null,
        strokeAlpha = 1.0f,
        strokeLineWidth = 0.0f,
        strokeLineCap = StrokeCap.Butt,
        strokeLineJoin = StrokeJoin.Miter,
    )
        }
        return _skipBackCircle!!
    }

private var _skipBackCircle: ImageVector? = null
