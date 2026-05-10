package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.HandPalm: ImageVector
    get() {
        if (_handPalm != null) return _handPalm!!
        _handPalm = phosphorFillIcon(
            name = "HandPalm",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M216 104v48c0 48.601-39.399 88-88 88C79.399 240 40 200.601 40 152v-88C40 55.163 47.163 48 56 48c8.837 0 16 7.163 16 16v56c0 4.418 3.582 8 8 8 4.418 0 8-3.582 8-8v-88c0-8.837 7.163-16 16-16 8.837 0 16 7.163 16 16v80c0 4.418 3.582 8 8 8 4.418 0 8-3.582 8-8v-64c0-8.837 7.163-16 16-16 8.837 0 16 7.163 16 16v80.67c-23.078 3.934-39.968 23.919-40 47.33 0 4.418 3.582 8 8 8 4.418 0 8-3.582 8-8 0-17.673 14.327-32 32-32 4.418 0 8-3.582 8-8v-32c0-8.837 7.163-16 16-16 8.837 0 16 7.163 16 16Z"),
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
        return _handPalm!!
    }

private var _handPalm: ImageVector? = null
