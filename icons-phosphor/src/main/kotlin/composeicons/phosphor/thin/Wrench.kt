package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Wrench: ImageVector
    get() {
        if (_wrench != null) return _wrench!!
        _wrench = phosphorThinIcon(
            name = "Wrench",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M223.05 70.5c-.493-1.217-1.551-2.115-2.833-2.403-1.281-.287-2.622 .072-3.587 .963l-41.82 38.6L153 103 148.32 81.21 186.92 39.39c.895-.965 1.257-2.309 .97-3.593-.288-1.284-1.189-2.345-2.41-2.837C159.339 22.375 129.376 29.026 110.168 49.677 90.96 70.328 86.493 100.692 98.94 126L36.4 180l-.21 .2c-10.935 10.935-10.935 28.665 0 39.6 10.935 10.935 28.665 10.935 39.6 0l.2-.21 54-62.54c21.082 10.368 46.022 9.12 65.963-3.301C215.894 141.328 228.01 119.493 228 96c.016-8.74-1.665-17.401-4.95-25.5ZM160 156c-10.143 .001-20.12-2.569-29-7.47-1.665-.935-3.76-.562-5 .89L70 214.25c-7.902 7.16-20.031 6.861-27.571-.679C34.889 206.031 34.59 193.902 41.75 186l64.82-56c1.452-1.24 1.825-3.335 .89-5C95.684 103.704 97.937 77.404 113.164 58.421 128.392 39.439 153.576 31.534 176.92 38.41L141.05 77.29c-.892 .95-1.265 2.274-1 3.55l5.66 26.35c.331 1.538 1.532 2.739 3.07 3.07l26.35 5.66c1.276 .265 2.6-.108 3.55-1L217.55 79.05c5.32 18.14 1.788 37.726-9.534 52.865C196.694 147.054 178.904 155.977 160 156Z"),
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
        return _wrench!!
    }

private var _wrench: ImageVector? = null
