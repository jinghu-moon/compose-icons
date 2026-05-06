package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.SkipForward: ImageVector
    get() {
        if (_skipForward != null) return _skipForward!!
        _skipForward = phosphorBoldIcon(
            name = "SkipForward",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M200 28c-6.627 0-12 5.373-12 12v62L74.55 31C68.399 27.181 60.664 26.984 54.327 30.485 47.99 33.987 44.04 40.64 44 47.88v160.24c.04 7.24 3.99 13.893 10.327 17.395 6.337 3.502 14.072 3.305 20.223-.515L188 154v62c0 6.627 5.373 12 12 12 6.627 0 12-5.373 12-12v-176c0-6.627-5.373-12-12-12ZM68 200.73v-145.46L184.3 128Z"),
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
        return _skipForward!!
    }

private var _skipForward: ImageVector? = null
