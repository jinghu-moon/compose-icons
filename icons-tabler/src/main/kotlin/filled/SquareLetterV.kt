package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.SquareLetterV: ImageVector
    get() {
        if (_squareLetterV != null) return _squareLetterV!!
        _squareLetterV = tablerFilledIcon(
            name = "SquareLetterV",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 19.000 2.000 C 20.657 2.000 22.000 3.343 22.000 5.000 L 22.000 19.000 C 22.000 20.657 20.657 22.000 19.000 22.000 L 5.000 22.000 C 3.343 22.000 2.000 20.657 2.000 19.000 L 2.000 5.000 C 2.000 3.343 3.343 2.000 5.000 2.000 ZM 14.243 7.030 C 13.707 6.896 13.164 7.221 13.030 7.757 L 12.000 11.875 L 10.970 7.757 C 10.885 7.408 10.620 7.132 10.275 7.032 C 9.930 6.933 9.558 7.026 9.301 7.276 C 9.044 7.526 8.940 7.895 9.030 8.243 L 11.030 16.243 C 11.282 17.253 12.718 17.253 12.970 16.243 L 14.970 8.243 C 15.104 7.707 14.779 7.164 14.243 7.030"),
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
        return _squareLetterV!!
    }

private var _squareLetterV: ImageVector? = null
