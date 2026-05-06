package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Avocado: ImageVector
    get() {
        if (_avocado != null) return _avocado!!
        _avocado = phosphorThinIcon(
            name = "Avocado",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M128 116c-24.301 0-44 19.699-44 44 0 24.301 19.699 44 44 44 24.301 0 44-19.699 44-44-.028-24.289-19.711-43.972-44-44ZM128 196C108.118 196 92 179.882 92 160c0-19.882 16.118-36 36-36 19.882 0 36 16.118 36 36 0 19.882-16.118 36-36 36ZM207.22 132 177.43 47.8C170.494 26.657 150.873 12.27 128.623 12.012 106.372 11.754 86.424 25.683 79 46.66h0L49.45 130.17c-13.161 34.735-1.947 73.989 27.577 96.529 29.524 22.54 70.346 23.014 100.384 1.164C207.45 206.014 219.572 167.03 207.22 132ZM128 236C103.012 235.968 79.634 223.664 65.46 203.085 51.285 182.506 48.123 156.278 57 132.92L86.5 49.33C92.772 31.538 109.688 19.724 128.552 19.961c18.864 .238 35.477 12.474 41.298 30.419l29.82 84.28c8.228 23.265 4.648 49.076-9.601 69.223C175.82 224.031 152.677 236.006 128 236Z"),
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
        return _avocado!!
    }

private var _avocado: ImageVector? = null
