package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.LetterCircleV: ImageVector
    get() {
        if (_letterCircleV != null) return _letterCircleV!!
        _letterCircleV = phosphorFillIcon(
            name = "LetterCircleV",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M128 24C70.562 24 24 70.562 24 128c0 57.438 46.562 104 104 104 57.438 0 104-46.562 104-104C231.939 70.588 185.412 24.061 128 24ZM167.43 99l-32 80c-1.213 3.04-4.157 5.034-7.43 5.034-3.273 0-6.217-1.994-7.43-5.034l-32-80C86.913 94.897 88.897 90.227 93 88.57c4.103-1.657 8.773 .327 10.43 4.43L128 154.46 152.57 93c1.657-4.103 6.327-6.087 10.43-4.43 4.103 1.657 6.087 6.327 4.43 10.43Z"),
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
        return _letterCircleV!!
    }

private var _letterCircleV: ImageVector? = null
