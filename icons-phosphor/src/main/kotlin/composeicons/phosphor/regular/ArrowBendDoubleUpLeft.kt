package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.ArrowBendDoubleUpLeft: ImageVector
    get() {
        if (_arrowBendDoubleUpLeft != null) return _arrowBendDoubleUpLeft!!
        _arrowBendDoubleUpLeft = phosphorRegularIcon(
            name = "ArrowBendDoubleUpLeft",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M85.66 146.34c3.126 3.126 3.126 8.194 0 11.32-3.126 3.126-8.194 3.126-11.32 0l-48-48C24.838 108.159 23.994 106.123 23.994 104c0-2.123 .844-4.159 2.346-5.66L74.34 50.34c3.126-3.126 8.194-3.126 11.32 0 3.126 3.126 3.126 8.194 0 11.32L43.31 104ZM128 96h-28.69L133.66 61.66c3.126-3.126 3.126-8.194 0-11.32-3.126-3.126-8.194-3.126-11.32 0l-48 48c-1.502 1.501-2.346 3.537-2.346 5.66 0 2.123 .844 4.159 2.346 5.66l48 48c3.126 3.126 8.194 3.126 11.32 0 3.126-3.126 3.126-8.194 0-11.32L99.31 112h28.69c48.578 .055 87.945 39.422 88 88 0 4.418 3.582 8 8 8 4.418 0 8-3.582 8-8C231.939 142.588 185.412 96.061 128 96Z"),
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
