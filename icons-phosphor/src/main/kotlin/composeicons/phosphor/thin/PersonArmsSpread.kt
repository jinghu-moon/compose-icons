package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.PersonArmsSpread: ImageVector
    get() {
        if (_personArmsSpread != null) return _personArmsSpread!!
        _personArmsSpread = phosphorThinIcon(
            name = "PersonArmsSpread",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M128 68c15.464 0 28-12.536 28-28C156 24.536 143.464 12 128 12c-15.464 0-28 12.536-28 28 0 15.464 12.536 28 28 28ZM128 20c11.046 0 20 8.954 20 20 0 11.046-8.954 20-20 20C116.954 60 108 51.046 108 40c0-11.046 8.954-20 20-20ZM227.6 88.57C226.096 81.176 219.545 75.897 212 76h-168c-7.507 .01-13.997 5.237-15.607 12.569-1.61 7.332 2.095 14.798 8.907 17.951h.06l53.89 23.73L69.33 213.55c-3.479 7.959 .027 17.24 7.9 20.91 2.115 1.008 4.427 1.534 6.77 1.54 6.15-.001 11.756-3.526 14.42-9.07L128 176l29.58 51c3.826 7.783 13.155 11.101 21.036 7.481 7.881-3.619 11.444-12.858 8.034-20.831L164.73 130.35l54-23.76c6.918-3.079 10.649-10.66 8.87-18.02ZM215.39 99.23l-57 25.11c-1.802 .791-2.761 2.776-2.26 4.68L179 215.94c.061 .23 .141 .454 .24 .67 1.866 4.004 .134 8.763-3.87 10.63-4.004 1.866-8.763 .134-10.63-3.87-.047-.106-.101-.21-.16-.31L131.46 166c-.716-1.234-2.034-1.993-3.46-1.993-1.426 0-2.744 .759-3.46 1.993L91.42 223.06c-.059 .1-.113 .204-.16 .31-1.182 2.632-3.689 4.424-6.562 4.69-2.873 .265-5.667-1.037-7.311-3.408-1.644-2.371-1.883-5.444-.627-8.042 .099-.216 .179-.44 .24-.67L99.87 129c.501-1.904-.458-3.889-2.26-4.68l-57-25.09C37.234 97.631 35.414 93.908 36.225 90.262 37.037 86.615 40.264 84.016 44 84h168c3.739 .007 6.975 2.603 7.792 6.252 .817 3.649-1.003 7.377-4.382 8.978Z"),
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
        return _personArmsSpread!!
    }

private var _personArmsSpread: ImageVector? = null
