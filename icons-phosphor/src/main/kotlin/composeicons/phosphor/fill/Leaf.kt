package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Leaf: ImageVector
    get() {
        if (_leaf != null) return _leaf!!
        _leaf = phosphorFillIcon(
            name = "Leaf",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M223.45 40.07c-.237-4.051-3.469-7.283-7.52-7.52C139.8 28.08 78.82 51 52.82 94c-9.012 14.709-13.453 31.763-12.76 49 .453 11.022 2.695 21.898 6.64 32.2 .471 1.289 1.57 2.246 2.911 2.536 1.341 .29 2.737-.127 3.699-1.106L138.31 90.33c3.126-3.126 8.194-3.126 11.32 0 3.126 3.126 3.126 8.194 0 11.32L56.74 195.94 42.55 210.13c-3.06 2.979-3.321 7.808-.6 11.1 1.453 1.682 3.54 2.684 5.761 2.766 2.221 .082 4.376-.765 5.949-2.336L70.45 204.87c14.14 6.84 28.41 10.57 42.56 11.07q1.67 .06 3.33 .06c16.114 .041 31.922-4.397 45.66-12.82 43-26 65.93-86.97 61.45-163.11Z"),
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
        return _leaf!!
    }

private var _leaf: ImageVector? = null
