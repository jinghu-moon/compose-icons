package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.SquareRoundedLetterV: ImageVector
    get() {
        if (_squareRoundedLetterV != null) return _squareRoundedLetterV!!
        _squareRoundedLetterV = tablerFilledIcon(
            name = "SquareRoundedLetterV",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M11.676 2.001 12 2c7.752 0 10 2.248 10 10l-.005 .642C21.869 19.877 19.534 22 12 22l-.642-.005C4.228 21.87 2.063 19.6 2 12.325v-.325C2 4.357 4.185 2.064 11.676 2.001M14.243 7.03c-.536-.134-1.079 .191-1.213 .727L12 11.875 10.97 7.757c-.085-.349-.35-.625-.695-.725-.345-.099-.717-.006-.974 .244-.257 .25-.361 .619-.271 .967l2 8c.252 1.01 1.688 1.01 1.94 0l2-8c.134-.536-.191-1.079-.727-1.213"),
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
        return _squareRoundedLetterV!!
    }

private var _squareRoundedLetterV: ImageVector? = null
