package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.FastForward: ImageVector
    get() {
        if (_fastForward != null) return _fastForward!!
        _fastForward = phosphorBoldIcon(
            name = "FastForward",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M246.81 111.29 158.63 55.12c-6.12-3.911-13.885-4.178-20.26-.698C131.995 57.902 128.021 64.577 128 71.84v30L54.63 55.12C48.51 51.209 40.745 50.942 34.37 54.422 27.995 57.902 24.021 64.577 24 71.84v112.32c.034 7.257 4.011 13.922 10.381 17.399 6.37 3.477 14.127 3.217 20.249-.679L128 154.15v30c.034 7.257 4.011 13.922 10.381 17.399 6.37 3.477 14.127 3.217 20.249-.679l88.18-56.17c5.721-3.63 9.187-9.935 9.187-16.71 0-6.775-3.466-13.08-9.187-16.71ZM48 176.64v-97.28L124.38 128ZM152 176.64v-97.28L228.38 128Z"),
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
        return _fastForward!!
    }

private var _fastForward: ImageVector? = null
