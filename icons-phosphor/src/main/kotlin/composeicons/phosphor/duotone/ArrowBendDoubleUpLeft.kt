package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.ArrowBendDoubleUpLeft: ImageVector
    get() {
        if (_arrowBendDoubleUpLeft != null) return _arrowBendDoubleUpLeft!!
        _arrowBendDoubleUpLeft = phosphorDuotoneIcon(
            name = "ArrowBendDoubleUpLeft",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M128 56v96L80 104Z"),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color(0xFF000000)),
                fillAlpha = 0.2f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
            )
            addPath(
                pathData = parseSvgPathData("M85.66 146.34c3.126 3.126 3.126 8.194 0 11.32-3.126 3.126-8.194 3.126-11.32 0l-48-48C24.838 108.159 23.994 106.123 23.994 104c0-2.123 .844-4.159 2.346-5.66L74.34 50.34c3.126-3.126 8.194-3.126 11.32 0 3.126 3.126 3.126 8.194 0 11.32L43.31 104ZM232 200c0 4.418-3.582 8-8 8-4.418 0-8-3.582-8-8-.055-45.479-34.714-83.444-80-87.63v39.63c.003 3.238-1.947 6.158-4.938 7.397-2.991 1.239-6.434 .554-8.722-1.737l-48-48C72.838 108.159 71.994 106.123 71.994 104c0-2.123 .844-4.159 2.346-5.66l48-48c2.288-2.291 5.731-2.976 8.722-1.737 2.991 1.239 4.94 4.159 4.938 7.397v40.3c54.143 4.25 95.932 49.391 96 103.7ZM120 75.31 91.31 104 120 132.69Z"),
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
        return _arrowBendDoubleUpLeft!!
    }

private var _arrowBendDoubleUpLeft: ImageVector? = null
