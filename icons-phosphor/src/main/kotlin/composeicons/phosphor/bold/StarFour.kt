package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.StarFour: ImageVector
    get() {
        if (_starFour != null) return _starFour!!
        _starFour = phosphorBoldIcon(
            name = "StarFour",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M230.86 109.25 169.18 86.82 146.75 25.14C143.884 17.254 136.39 12.005 128 12.005c-8.39 0-15.884 5.25-18.75 13.135L86.82 86.82 25.14 109.25C17.254 112.116 12.005 119.61 12.005 128c0 8.39 5.25 15.884 13.135 18.75l61.68 22.43 22.43 61.68c2.866 7.886 10.36 13.135 18.75 13.135 8.39 0 15.884-5.25 18.75-13.135l22.43-61.68 61.68-22.43c7.886-2.866 13.135-10.36 13.135-18.75 0-8.39-5.25-15.884-13.135-18.75ZM155.72 148.54c-3.338 1.213-5.967 3.842-7.18 7.18L128 212.21 107.46 155.72c-1.213-3.338-3.842-5.967-7.18-7.18L43.79 128l56.49-20.54c3.338-1.213 5.967-3.842 7.18-7.18L128 43.79l20.54 56.49c1.213 3.338 3.842 5.967 7.18 7.18L212.21 128Z"),
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
        return _starFour!!
    }

private var _starFour: ImageVector? = null
