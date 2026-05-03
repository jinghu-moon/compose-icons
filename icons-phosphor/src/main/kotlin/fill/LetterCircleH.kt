package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.LetterCircleH: ImageVector
    get() {
        if (_letterCircleH != null) return _letterCircleH!!
        _letterCircleH = phosphorFillIcon(
            name = "LetterCircleH",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 128.000 24.000 C 70.562 24.000 24.000 70.562 24.000 128.000 C 24.000 185.438 70.562 232.000 128.000 232.000 C 185.438 232.000 232.000 185.438 232.000 128.000 C 231.939 70.588 185.412 24.061 128.000 24.000 ZM 168.000 168.000 C 168.000 172.418 164.418 176.000 160.000 176.000 C 155.582 176.000 152.000 172.418 152.000 168.000 L 152.000 136.000 L 104.000 136.000 L 104.000 168.000 C 104.000 172.418 100.418 176.000 96.000 176.000 C 91.582 176.000 88.000 172.418 88.000 168.000 L 88.000 88.000 C 88.000 83.582 91.582 80.000 96.000 80.000 C 100.418 80.000 104.000 83.582 104.000 88.000 L 104.000 120.000 L 152.000 120.000 L 152.000 88.000 C 152.000 83.582 155.582 80.000 160.000 80.000 C 164.418 80.000 168.000 83.582 168.000 88.000 Z"),
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
        return _letterCircleH!!
    }

private var _letterCircleH: ImageVector? = null
