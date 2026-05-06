package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.LineSegments: ImageVector
    get() {
        if (_lineSegments != null) return _lineSegments!!
        _lineSegments = phosphorLightIcon(
            name = "LineSegments",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M237.23 34.77c-11.731-11.692-30.709-11.692-42.44 0h0c-11.692 11.731-11.692 30.709 0 42.44 .65 .64 1.32 1.24 2 1.81l-28.14 52.26c-8.534-2.546-17.757-1.184-25.19 3.72L121 112.54c8.455-12.843 5.831-30.001-6.077-39.729C103.015 63.082 85.679 63.933 74.78 74.78h0c-5.627 5.626-8.789 13.258-8.789 21.215 0 7.957 3.161 15.589 8.789 21.215 .635 .641 1.303 1.248 2 1.82L48.64 171.29c-10.578-3.191-22.054-.31-29.87 7.5h0c-11.71 11.718-11.706 30.709 .009 42.422 11.715 11.713 30.707 11.713 42.422 0 11.715-11.713 11.719-30.704 .009-42.422-.65-.64-1.32-1.24-2-1.81L87.35 124.72c8.533 2.552 17.759 1.189 25.19-3.72L135 143.46c-8.702 13.171-5.708 30.832 6.848 40.399 12.556 9.567 30.378 7.768 40.768-4.116 10.39-11.884 9.793-29.787-1.366-40.953-.635-.641-1.303-1.248-2-1.82L207.39 84.71c13.167 3.97 27.348-1.521 34.407-13.323 7.059-11.803 5.189-26.894-4.537-36.617ZM52.72 212.77c-7.03 7.028-18.426 7.027-25.454-.003-7.029-7.029-7.029-18.425 0-25.454 7.029-7.029 18.424-7.031 25.454-.003 7.012 7.026 7.012 18.404 0 25.43ZM83.27 108.77c-7.028-7.03-7.027-18.426 .003-25.454 7.029-7.029 18.425-7.029 25.454 0 7.029 7.029 7.031 18.424 .003 25.454-3.381 3.372-7.963 5.262-12.738 5.254-4.775-.007-9.351-1.912-12.722-5.294ZM172.73 172.77c-7.03 7.028-18.426 7.027-25.454-.003-7.029-7.029-7.029-18.425 0-25.454 7.029-7.029 18.424-7.031 25.454-.003 7.006 7.025 7.006 18.395 0 25.42ZM228.73 68.77c-7.03 7.028-18.426 7.027-25.454-.003-7.029-7.029-7.029-18.425 0-25.454 7.029-7.029 18.424-7.031 25.454-.003 7.002 7.021 7.006 18.383 .01 25.41Z"),
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
        return _lineSegments!!
    }

private var _lineSegments: ImageVector? = null
