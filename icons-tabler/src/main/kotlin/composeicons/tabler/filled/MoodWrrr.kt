package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.MoodWrrr: ImageVector
    get() {
        if (_moodWrrr != null) return _moodWrrr!!
        _moodWrrr = tablerFilledIcon(
            name = "MoodWrrr",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M12 2c5.523 0 10 4.477 10 10 0 5.523-4.477 10-10 10C6.477 22 2 17.523 2 12 2 6.477 6.477 2 12 2M15.707 14.293c-.337-.337-.865-.39-1.262-.125l-.945 .63-.945-.63-.116-.066c-.319-.156-.698-.131-.994 .066l-.945 .63-.945-.63c-.397-.265-.925-.212-1.262 .125l-1 1c-.39 .391-.39 1.023 0 1.414l.094 .083c.398 .309 .964 .273 1.32-.083l.42-.42 .818 .545 .116 .066c.319 .156 .698 .131 .994-.066L12 16.202l.945 .63 .116 .066c.319 .156 .698 .131 .994-.066l.817-.545 .42 .42c.39 .391 1.024 .391 1.414 0 .391-.39 .391-1.024 .001-1.415ZM9.207 7.793c-.391-.39-1.023-.39-1.414 0l-.083 .094c-.309 .398-.273 .964 .083 1.32L8.585 10l-.792 .793c-.379 .392-.374 1.016 .012 1.402 .386 .386 1.009 .391 1.402 .012l1.5-1.5c.39-.391 .39-1.023 0-1.414ZM16.207 7.793c-.391-.39-1.024-.39-1.414 0L13.293 9.293c-.39 .391-.39 1.023 0 1.414l1.5 1.5c.391 .39 1.023 .39 1.414 0l.083-.094c.309-.398 .273-.964-.083-1.32L15.415 10l.792-.793c.39-.391 .39-1.023 0-1.414"),
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
        return _moodWrrr!!
    }

private var _moodWrrr: ImageVector? = null
