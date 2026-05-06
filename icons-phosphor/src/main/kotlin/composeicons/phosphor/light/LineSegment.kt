package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.LineSegment: ImageVector
    get() {
        if (_lineSegment != null) return _lineSegment!!
        _lineSegment = phosphorLightIcon(
            name = "LineSegment",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M213.23 42.77C202.337 31.879 184.966 31.007 173.038 40.753 161.11 50.499 158.5 67.694 167 80.54L80.54 167c-11.902-7.842-27.674-6.251-37.77 3.81h0c-11.164 11.166-11.762 29.075-1.366 40.961 10.395 11.886 28.224 13.679 40.778 4.102C94.736 206.295 97.717 188.626 89 175.46L175.46 89c12.85 8.547 30.089 5.951 39.851-6.003 9.762-11.954 8.862-29.364-2.081-40.247ZM76.72 204.77c-7.03 7.028-18.426 7.027-25.454-.003-7.029-7.029-7.029-18.425 0-25.454 7.029-7.029 18.424-7.031 25.454-.003 7.012 7.026 7.012 18.404 0 25.43ZM204.72 76.77c-3.376 3.377-7.955 5.274-12.73 5.274-4.775 0-9.354-1.897-12.73-5.274h0c-7.028-7.03-7.027-18.426 .003-25.454 7.029-7.029 18.425-7.029 25.454 0 7.029 7.029 7.031 18.424 .003 25.454Z"),
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
        return _lineSegment!!
    }

private var _lineSegment: ImageVector? = null
