package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.StarOff: ImageVector
    get() {
        if (_starOff != null) return _starOff!!
        _starOff = lucideOutlineIcon(
            name = "StarOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 10.344 4.688 L 11.525 2.295 C 11.614 2.114 11.798 2.000 12.000 2.000 C 12.202 2.000 12.386 2.114 12.475 2.295 L 14.785 6.974 C 15.093 7.599 15.690 8.033 16.380 8.134 L 21.546 8.890 C 21.746 8.919 21.912 9.059 21.974 9.251 C 22.036 9.442 21.984 9.653 21.840 9.794 L 18.603 12.946"),
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
        pathData = parseSvgPathData("M 17.945 17.945 L 18.375 20.450 C 18.410 20.650 18.329 20.852 18.165 20.971 C 18.001 21.090 17.783 21.105 17.604 21.010 L 12.986 18.582 C 12.368 18.257 11.631 18.257 11.013 18.582 L 6.396 21.010 C 6.217 21.105 6.000 21.089 5.836 20.970 C 5.673 20.851 5.591 20.649 5.626 20.450 L 6.507 15.311 C 6.625 14.622 6.397 13.919 5.896 13.432 L 2.160 9.795 C 2.014 9.654 1.962 9.443 2.024 9.250 C 2.087 9.058 2.253 8.917 2.454 8.889 L 7.619 8.134 C 7.753 8.104 7.887 8.071 8.019 8.035"),
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
        pathData = parseSvgPathData("M 2.000 2.000 L 22.000 22.000"),
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
        return _starOff!!
    }

private var _starOff: ImageVector? = null
