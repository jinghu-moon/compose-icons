package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.SquareRoundedLetterY: ImageVector
    get() {
        if (_squareRoundedLetterY != null) return _squareRoundedLetterY!!
        _squareRoundedLetterY = tablerFilledIcon(
            name = "SquareRoundedLetterY",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M11.676 2.001 12 2c7.752 0 10 2.248 10 10l-.005 .642C21.869 19.877 19.534 22 12 22l-.642-.005C4.228 21.87 2.063 19.6 2 12.325v-.325C2 4.357 4.185 2.064 11.676 2.001M14.371 7.071c-.246-.098-.522-.095-.766 .01-.244 .105-.436 .302-.534 .548L12 10.307 10.928 7.629c-.217-.493-.786-.726-1.286-.526-.5 .2-.752 .761-.57 1.268L11 13.194v2.806c0 .507 .38 .934 .883 .993L12 17c.552 0 1-.448 1-1v-2.809L14.928 8.371c.188-.47-.005-1.008-.45-1.25Z"),
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
        return _squareRoundedLetterY!!
    }

private var _squareRoundedLetterY: ImageVector? = null
