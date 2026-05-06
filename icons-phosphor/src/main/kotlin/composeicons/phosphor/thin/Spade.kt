package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Spade: ImageVector
    get() {
        if (_spade != null) return _spade!!
        _spade = phosphorThinIcon(
            name = "Spade",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M178.56 52.93C163.481 40.423 147.135 29.527 129.79 20.42c-1.127-.564-2.453-.564-3.58 0C108.865 29.527 92.519 40.423 77.44 52.93 45.1 79.88 28 108.61 28 136c-.001 18.264 9.58 35.189 25.24 44.588 15.66 9.399 35.103 9.893 51.22 1.302l-12.29 41c-.348 1.206-.11 2.505 .642 3.509 .753 1.004 1.933 1.597 3.188 1.601h64c1.264-0 2.454-.598 3.209-1.613 .755-1.015 .985-2.326 .621-3.537l-12.29-41c16.111 8.588 35.545 8.097 51.203-1.292C218.4 171.169 227.987 154.257 228 136 228 108.61 210.9 79.88 178.56 52.93ZM176 180c-10.633-0-20.906-3.851-28.92-10.84-1.344-1.173-3.302-1.315-4.8-.348-1.499 .967-2.176 2.81-1.66 4.518l14 46.67h-53.24l14-46.67c.516-1.708-.161-3.55-1.66-4.518-1.499-.967-3.457-.826-4.8 .348-13.002 11.339-31.43 14.034-47.134 6.892C46.082 168.911 36 153.251 36 136 36 79.94 115 35.44 128 28.51c13 6.93 92 51.38 92 107.49-.028 24.289-19.711 43.972-44 44Z"),
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
        return _spade!!
    }

private var _spade: ImageVector? = null
