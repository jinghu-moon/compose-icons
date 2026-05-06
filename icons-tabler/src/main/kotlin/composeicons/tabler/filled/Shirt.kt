package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.Shirt: ImageVector
    get() {
        if (_shirt != null) return _shirt!!
        _shirt = tablerFilledIcon(
            name = "Shirt",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M14.883 3.007 14.978 3l.112 .004 .113 .017 .113 .03 6 2c.368 .123 .632 .447 .677 .833L22 6v5c-0 .507-.38 .934-.883 .993L21 12h-2v7c0 1.047-.806 1.917-1.85 1.995L17 21h-10C5.953 21 5.083 20.194 5.005 19.15L5 19v-7h-2c-.507-0-.934-.38-.993-.883L2 11v-5c-0-.388 .224-.741 .576-.906l.108-.043 6-2c.305-.102 .64-.05 .901 .138 .261 .188 .415 .49 .415 .811-.005 1.079 .847 1.967 1.925 2.008 1.078 .04 1.994-.781 2.07-1.858l.009-.24 .017-.113 .037-.134 .044-.103 .05-.092 .068-.093 .069-.08c.056-.054 .113-.1 .175-.14l.096-.053 .103-.044 .108-.032 .112-.02Z"),
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
        return _shirt!!
    }

private var _shirt: ImageVector? = null
