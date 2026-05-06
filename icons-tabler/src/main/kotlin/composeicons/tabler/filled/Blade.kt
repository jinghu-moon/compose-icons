package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.Blade: ImageVector
    get() {
        if (_blade != null) return _blade!!
        _blade = tablerFilledIcon(
            name = "Blade",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M11.586 3c.781-.781 2.047-.781 2.828 0L15 3.585 15.586 3c.734-.733 1.906-.784 2.7-.117L18.414 3 21 5.586c.781 .781 .781 2.047 0 2.828L20.414 9 21 9.586c.781 .781 .781 2.047 0 2.828L12.414 21c-.781 .781-2.047 .781-2.828 0L9 20.414 8.414 21c-.781 .781-2.047 .781-2.828 0L3 18.414c-.781-.781-.781-2.047 0-2.828l.585-.587L3 14.414c-.733-.734-.784-1.906-.117-2.7L3 11.585ZM14.613 7.21c-.417-.323-1.013-.266-1.362 .13-.349 .395-.33 .994 .042 1.367L13.585 9l-1.068 1.067c-.575-.153-1.189-.042-1.675 .303-.485 .345-.792 .888-.837 1.481L10 12l.005 .15c.01 .125 .03 .248 .062 .367L9 13.585l-.293-.292-.094-.083c-.417-.323-1.013-.266-1.362 .13-.349 .395-.33 .994 .042 1.367L7.585 15l-.292 .293-.083 .094c-.323 .417-.266 1.013 .13 1.362 .395 .349 .994 .33 1.367-.042L9 16.415l.293 .292 .094 .083c.417 .323 1.013 .266 1.362-.13 .349-.395 .33-.994-.042-1.367L10.415 15l1.069-1.067c.69 .183 1.425-.015 1.93-.52 .505-.505 .702-1.24 .519-1.93L15 10.415l.293 .292 .094 .083c.417 .323 1.013 .266 1.362-.13 .349-.395 .33-.994-.042-1.367L16.415 9l.292-.293 .083-.094c.323-.417 .266-1.013-.13-1.362-.395-.349-.994-.33-1.367 .042L15 7.585l-.293-.292Z"),
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
        return _blade!!
    }

private var _blade: ImageVector? = null
