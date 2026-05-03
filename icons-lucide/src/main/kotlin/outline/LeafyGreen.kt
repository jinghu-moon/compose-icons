package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.LeafyGreen: ImageVector
    get() {
        if (_leafyGreen != null) return _leafyGreen!!
        _leafyGreen = lucideOutlineIcon(
            name = "LeafyGreen",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 2.000 22.000 C 3.250 21.013 4.270 20.025 5.900 19.800 C 7.311 19.800 8.670 20.336 9.700 21.300 C 10.786 22.061 12.178 22.234 13.417 21.763 C 14.656 21.291 15.581 20.237 15.887 18.947 C 17.211 19.183 18.553 18.640 19.340 17.549 C 20.127 16.458 20.219 15.013 19.577 13.831 C 20.743 13.454 21.627 12.495 21.908 11.303 C 22.189 10.110 21.825 8.857 20.950 8.000 C 22.317 6.633 22.317 4.417 20.950 3.050 C 19.583 1.683 17.367 1.683 16.000 3.050 C 15.143 2.175 13.890 1.811 12.697 2.092 C 11.505 2.373 10.546 3.257 10.169 4.423 C 8.987 3.781 7.542 3.873 6.451 4.660 C 5.360 5.447 4.817 6.789 5.053 8.113 C 3.775 8.424 2.731 9.344 2.262 10.574 C 1.793 11.803 1.959 13.184 2.705 14.268 C 3.499 15.420 4.409 16.712 4.200 18.100 C 3.926 19.743 3.014 20.732 2.000 22.000"),
        pathFillType = PathFillType.NonZero,
        fill = null,
        fillAlpha = 1.0f,
        stroke = SolidColor(Color(0xFF000000)),
        strokeAlpha = 1.0f,
        strokeLineWidth = 2.0f,
        strokeLineCap = StrokeCap.Round,
        strokeLineJoin = StrokeJoin.Round,
    )
    addPath(
        pathData = parseSvgPathData("M 2.000 22.000 L 17.000 7.000"),
        pathFillType = PathFillType.NonZero,
        fill = null,
        fillAlpha = 1.0f,
        stroke = SolidColor(Color(0xFF000000)),
        strokeAlpha = 1.0f,
        strokeLineWidth = 2.0f,
        strokeLineCap = StrokeCap.Round,
        strokeLineJoin = StrokeJoin.Round,
    )
        }
        return _leafyGreen!!
    }

private var _leafyGreen: ImageVector? = null
