package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.SquareLetterK: ImageVector
    get() {
        if (_squareLetterK != null) return _squareLetterK!!
        _squareLetterK = tablerFilledIcon(
            name = "SquareLetterK",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M19 2c1.657 0 3 1.343 3 3v14c0 1.657-1.343 3-3 3h-14C3.343 22 2 20.657 2 19v-14C2 3.343 3.343 2 5 2ZM14.53 7.152c-.225-.141-.496-.186-.755-.126-.258 .06-.483 .219-.623 .444L11 10.913v-2.913c-0-.507-.38-.934-.883-.993L10 7C9.448 7 9 7.448 9 8v8c0 .552 .448 1 1 1 .552 0 1-.448 1-1v-2.914l2.152 3.444c.269 .43 .817 .591 1.276 .374l.102-.056 .095-.068c.396-.317 .491-.88 .223-1.31L12.678 12 14.848 8.53c.141-.225 .186-.496 .126-.755-.06-.258-.219-.483-.444-.623"),
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
        return _squareLetterK!!
    }

private var _squareLetterK: ImageVector? = null
