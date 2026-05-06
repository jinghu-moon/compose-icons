package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Windmill: ImageVector
    get() {
        if (_windmill != null) return _windmill!!
        _windmill = phosphorThinIcon(
            name = "Windmill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M224 228h-44.53l-8-55.78 10.4 6.12c2.744 1.622 6.021 2.085 9.107 1.287 3.086-.797 5.728-2.79 7.343-5.537l12-20.34c1.614-2.744 2.072-6.016 1.274-9.097-.799-3.081-2.789-5.719-5.534-7.333L167.6 114.68 210.34 42.1c1.618-2.743 2.08-6.017 1.283-9.101-.797-3.084-2.788-5.724-5.533-7.339l-20.34-12c-2.743-1.618-6.017-2.08-9.101-1.283-3.084 .797-5.724 2.788-7.339 5.533L146.68 56.38 74.1 13.66C71.356 12.038 68.079 11.575 64.993 12.373c-3.086 .797-5.728 2.79-7.343 5.537l-12 20.34c-1.618 2.744-2.077 6.019-1.278 9.103 .799 3.084 2.792 5.723 5.538 7.337L88.38 77.33 45.66 149.91c-1.618 2.743-2.08 6.017-1.283 9.101 .797 3.084 2.788 5.724 5.533 7.339l20.34 12c4.258 2.504 9.616 2.143 13.5-.91L76.53 228h-44.53c-2.209 0-4 1.791-4 4 0 2.209 1.791 4 4 4h192c2.209 0 4-1.791 4-4 0-2.209-1.791-4-4-4ZM203.87 146.66c.264 1.017 .109 2.098-.43 3l-12 20.34c-.538 .918-1.42 1.584-2.45 1.851-1.03 .266-2.124 .111-3.04-.431L113.37 128.7l16-27.25L202 144.21c.926 .534 1.599 1.416 1.87 2.45ZM176.21 22c.538-.916 1.418-1.58 2.446-1.846 1.028-.266 2.12-.113 3.034 .426l20.34 12c1.867 1.121 2.494 3.531 1.41 5.42l-42.71 72.58-27.25-16ZM52.13 45.35c-.265-1.017-.11-2.098 .43-3L64.55 22C65.662 20.104 68.096 19.461 70 20.56l72.58 42.72-16 27.25L54 47.79c-.923-.532-1.597-1.41-1.87-2.44ZM77.34 171.87c-1.016 .259-2.094 .108-3-.42L54 159.46c-.919-.54-1.585-1.424-1.85-2.456-.265-1.033-.106-2.128 .44-3.044L95.27 81.38l27.25 16L79.79 170c-.534 .926-1.416 1.599-2.45 1.87ZM94.12 161.46l15.2-25.84L162.68 167l8.71 61h-86.78Z"),
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
        return _windmill!!
    }

private var _windmill: ImageVector? = null
