package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.SquareRoundedLetterW: ImageVector
    get() {
        if (_squareRoundedLetterW != null) return _squareRoundedLetterW!!
        _squareRoundedLetterW = tablerFilledIcon(
            name = "SquareRoundedLetterW",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M11.676 2.001 12 2c7.752 0 10 2.248 10 10l-.005 .642C21.869 19.877 19.534 22 12 22l-.642-.005C4.228 21.87 2.063 19.6 2 12.325v-.325C2 4.357 4.185 2.064 11.676 2.001M14.008 7.876l-.52 4.153-.56-1.4c-.319-.799-1.41-.837-1.803-.114l-.053 .114-.561 1.4L9.992 7.876C9.929 7.373 9.499 6.996 8.992 7l-.116 .008c-.548 .069-.936 .568-.868 1.116l1 8c.128 1.025 1.537 1.207 1.92 .247L12 13.693l1.072 2.678c.383 .96 1.792 .778 1.92-.247l1-8c.055-.54-.332-1.025-.871-1.093-.539-.067-1.033 .308-1.113 .845"),
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
        return _squareRoundedLetterW!!
    }

private var _squareRoundedLetterW: ImageVector? = null
