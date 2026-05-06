package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.ShuffleAngular: ImageVector
    get() {
        if (_shuffleAngular != null) return _shuffleAngular!!
        _shuffleAngular = phosphorRegularIcon(
            name = "ShuffleAngular",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M237.66 178.34c1.502 1.501 2.346 3.537 2.346 5.66 0 2.123-.844 4.159-2.346 5.66l-24 24c-3.126 3.126-8.194 3.126-11.32 0-3.126-3.126-3.126-8.194 0-11.32L212.69 192h-44.69c-2.584 0-5.008-1.248-6.51-3.35L83.88 80h-51.88c-4.418 0-8-3.582-8-8 0-4.418 3.582-8 8-8h56c2.584-0 5.008 1.248 6.51 3.35L172.12 176h40.57L202.34 165.66c-3.126-3.126-3.126-8.194 0-11.32 3.126-3.126 8.194-3.126 11.32 0ZM143 107c1.727 1.233 3.872 1.73 5.965 1.381 2.093-.349 3.962-1.515 5.195-3.241l18-25.12h40.57L202.34 90.34c-3.126 3.126-3.126 8.194 0 11.32 3.126 3.126 8.194 3.126 11.32 0l24-24c1.502-1.501 2.346-3.537 2.346-5.66 0-2.123-.844-4.159-2.346-5.66l-24-24c-3.126-3.126-8.194-3.126-11.32 0-3.126 3.126-3.126 8.194 0 11.32L212.69 64h-44.69c-2.584-0-5.008 1.248-6.51 3.35L141.15 95.82c-1.241 1.727-1.743 3.876-1.396 5.974 .347 2.098 1.515 3.971 3.246 5.206ZM113 149c-1.727-1.233-3.872-1.73-5.965-1.381-2.093 .349-3.962 1.515-5.195 3.241L83.88 176h-51.88c-4.418 0-8 3.582-8 8 0 4.418 3.582 8 8 8h56c2.584 0 5.008-1.248 6.51-3.35l20.34-28.47c1.241-1.727 1.743-3.876 1.396-5.974-.347-2.098-1.515-3.971-3.246-5.206Z"),
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
        return _shuffleAngular!!
    }

private var _shuffleAngular: ImageVector? = null
