package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.Ballpen: ImageVector
    get() {
        if (_ballpen != null) return _ballpen!!
        _ballpen = tablerFilledIcon(
            name = "Ballpen",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M17.828 2c.727-0 1.43 .264 1.977 .743l.145 .136 1.171 1.17c1.119 1.117 1.178 2.911 .136 4.1l-.136 .144L19.415 10l2.292 2.293c.356 .356 .392 .922 .083 1.32l-.083 .094-4 4c-.373 .372-.972 .39-1.367 .042-.395-.349-.452-.945-.13-1.362l.083-.094L19.585 13 17.999 11.415l-7.464 7.464c-.661 .661-1.541 1.057-2.474 1.114l-.233 .008c-.674 0-1.33-.178-1.905-.508L4.707 20.707c-.373 .372-.972 .39-1.367 .042-.395-.349-.452-.945-.13-1.362l.083-.094L4.507 18.077c-.817-1.425-.635-3.212 .454-4.442l.16-.17L15.707 2.879c.514-.514 1.197-.825 1.923-.873L17.828 2ZM17.828 4c-.22-0-.433 .072-.608 .206l-.099 .087L15.414 6 18 8.585 19.707 6.879c.155-.156 .255-.358 .284-.576l.01-.131c-0-.22-.073-.434-.207-.609l-.087-.099L18.536 4.293C18.348 4.105 18.094 4 17.828 4Z"),
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
        return _ballpen!!
    }

private var _ballpen: ImageVector? = null
