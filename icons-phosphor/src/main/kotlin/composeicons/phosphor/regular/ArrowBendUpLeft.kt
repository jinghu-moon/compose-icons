package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.ArrowBendUpLeft: ImageVector
    get() {
        if (_arrowBendUpLeft != null) return _arrowBendUpLeft!!
        _arrowBendUpLeft = phosphorRegularIcon(
            name = "ArrowBendUpLeft",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M232 200c0 4.418-3.582 8-8 8-4.418 0-8-3.582-8-8-.055-48.578-39.422-87.945-88-88h-76.69l34.35 34.34c3.126 3.126 3.126 8.194 0 11.32-3.126 3.126-8.194 3.126-11.32 0l-48-48C24.838 108.159 23.994 106.123 23.994 104c0-2.123 .844-4.159 2.346-5.66L74.34 50.34c3.126-3.126 8.194-3.126 11.32 0 3.126 3.126 3.126 8.194 0 11.32L51.31 96h76.69c57.412 .061 103.939 46.588 104 104Z"),
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
        return _arrowBendUpLeft!!
    }

private var _arrowBendUpLeft: ImageVector? = null
