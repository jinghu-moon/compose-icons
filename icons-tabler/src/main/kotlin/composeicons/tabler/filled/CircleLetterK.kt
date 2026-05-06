package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.CircleLetterK: ImageVector
    get() {
        if (_circleLetterK != null) return _circleLetterK!!
        _circleLetterK = tablerFilledIcon(
            name = "CircleLetterK",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M12 2c5.523 0 10 4.477 10 10 0 5.523-4.477 10-10 10C6.477 22 2 17.523 2 12 2 6.477 6.477 2 12 2M14.53 7.152c-.225-.141-.496-.186-.755-.126-.258 .06-.483 .219-.623 .444L11 10.913v-2.913c-0-.507-.38-.934-.883-.993L10 7C9.448 7 9 7.448 9 8v8c0 .552 .448 1 1 1 .552 0 1-.448 1-1v-2.914l2.152 3.444c.269 .43 .817 .591 1.276 .374l.102-.056 .095-.068c.396-.317 .491-.88 .223-1.31L12.678 12 14.848 8.53c.141-.225 .186-.496 .126-.755-.06-.258-.219-.483-.444-.623"),
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
        return _circleLetterK!!
    }

private var _circleLetterK: ImageVector? = null
