package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.FileDownload: ImageVector
    get() {
        if (_fileDownload != null) return _fileDownload!!
        _fileDownload = tablerFilledIcon(
            name = "FileDownload",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M12 2l.117 .007c.459 .054 .822 .417 .876 .876L13 3v4l.005 .15c.074 .984 .854 1.767 1.838 1.844L15 9h4l.117 .007c.459 .054 .822 .417 .876 .876L20 10v9c0 1.589-1.238 2.902-2.824 2.995L17 22h-10C5.411 22 4.098 20.762 4.005 19.176L4 19v-14C4 3.411 5.238 2.098 6.824 2.005L7 2ZM12 10c-.552 0-1 .448-1 1v3.585l-.793-.792c-.356-.356-.922-.392-1.32-.083l-.094 .083c-.39 .391-.39 1.023 0 1.414l2.5 2.5 .044 .042 .068 .055 .11 .071 .114 .054 .105 .035 .15 .03L12 18l.117-.007 .117-.02 .108-.033 .081-.034 .098-.052 .092-.064 .094-.083 2.5-2.5c.39-.391 .39-1.023 0-1.414l-.094-.083c-.398-.309-.964-.273-1.32 .083L13 14.584v-3.584c-0-.507-.38-.934-.883-.993ZM14.999 2.999 19 7h-4Z"),
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
        return _fileDownload!!
    }

private var _fileDownload: ImageVector? = null
