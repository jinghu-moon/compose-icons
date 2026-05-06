package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.SkipForward: ImageVector
    get() {
        if (_skipForward != null) return _skipForward!!
        _skipForward = phosphorLightIcon(
            name = "SkipForward",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M200 34c-3.314 0-6 2.686-6 6v72.84L71.37 36.14C67.053 33.442 61.612 33.301 57.16 35.77 52.723 38.178 49.971 42.832 50 47.88v160.24c-.029 5.048 2.723 9.702 7.16 12.11 4.452 2.469 9.893 2.328 14.21-.37L194 143.17v72.83c0 3.314 2.686 6 6 6 3.314 0 6-2.686 6-6v-176c0-3.314-2.686-6-6-6ZM193.12 129.56 65 209.69c-.61 .373-1.372 .392-2 .05-.617-.303-1.005-.933-1-1.62v-160.24c-.005-.687 .383-1.317 1-1.62 .306-.169 .65-.258 1-.26 .355 .013 .7 .12 1 .31l128.12 80.13c.548 .329 .883 .921 .883 1.56 0 .639-.335 1.231-.883 1.56Z"),
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
