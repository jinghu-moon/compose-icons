package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.LetterCircleP: ImageVector
    get() {
        if (_letterCircleP != null) return _letterCircleP!!
        _letterCircleP = phosphorFillIcon(
            name = "LetterCircleP",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 156.000 116.000 C 156.000 127.046 147.046 136.000 136.000 136.000 L 112.000 136.000 L 112.000 96.000 L 136.000 96.000 C 147.046 96.000 156.000 104.954 156.000 116.000 ZM 232.000 128.000 C 232.000 185.438 185.438 232.000 128.000 232.000 C 70.562 232.000 24.000 185.438 24.000 128.000 C 24.000 70.562 70.562 24.000 128.000 24.000 C 185.412 24.061 231.939 70.588 232.000 128.000 ZM 172.000 116.000 C 172.000 96.118 155.882 80.000 136.000 80.000 L 104.000 80.000 C 99.582 80.000 96.000 83.582 96.000 88.000 L 96.000 168.000 C 96.000 172.418 99.582 176.000 104.000 176.000 C 108.418 176.000 112.000 172.418 112.000 168.000 L 112.000 152.000 L 136.000 152.000 C 155.882 152.000 172.000 135.882 172.000 116.000 Z"),
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
        return _letterCircleP!!
    }

private var _letterCircleP: ImageVector? = null
