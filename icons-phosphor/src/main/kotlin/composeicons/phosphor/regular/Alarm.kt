package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.Alarm: ImageVector
    get() {
        if (_alarm != null) return _alarm!!
        _alarm = phosphorRegularIcon(
            name = "Alarm",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M128 40C74.981 40 32 82.981 32 136c0 53.019 42.981 96 96 96 53.019 0 96-42.981 96-96C223.939 83.006 180.994 40.061 128 40ZM128 216C83.817 216 48 180.183 48 136 48 91.817 83.817 56 128 56c44.183 0 80 35.817 80 80-.05 44.162-35.838 79.95-80 80ZM61.66 37.66l-32 32c-3.126 3.126-8.194 3.126-11.32 0-3.126-3.126-3.126-8.194 0-11.32l32-32c3.126-3.126 8.194-3.126 11.32 0 3.126 3.126 3.126 8.194 0 11.32ZM237.66 69.66c-1.501 1.502-3.537 2.346-5.66 2.346-2.123 0-4.159-.844-5.66-2.346l-32-32c-3.126-3.126-3.126-8.194 0-11.32 3.126-3.126 8.194-3.126 11.32 0l32 32c1.502 1.501 2.346 3.537 2.346 5.66 0 2.123-.844 4.159-2.346 5.66ZM184 128c4.418 0 8 3.582 8 8 0 4.418-3.582 8-8 8h-56c-4.418 0-8-3.582-8-8v-56c0-4.418 3.582-8 8-8 4.418 0 8 3.582 8 8v48Z"),
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
        return _alarm!!
    }

private var _alarm: ImageVector? = null
