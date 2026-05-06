package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Highlighter: ImageVector
    get() {
        if (_highlighter != null) return _highlighter!!
        _highlighter = phosphorLightIcon(
            name = "Highlighter",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M252.24 107.76c-2.343-2.34-6.137-2.34-8.48 0l-50.35 50.34c-.78 .775-2.04 .775-2.82 0L105.9 73.41c-.775-.78-.775-2.04 0-2.82L156.24 20.24c2.203-2.364 2.138-6.048-.147-8.333-2.285-2.285-5.969-2.35-8.333-.147L97.41 62.1c-4.73 4.736-5.447 12.157-1.71 17.71L73.41 102.1c-2.626 2.626-4.101 6.187-4.101 9.9 0 3.713 1.475 7.274 4.101 9.9L79.51 128 19.76 187.76c-1.468 1.47-2.072 3.595-1.595 5.617 .477 2.022 1.965 3.654 3.935 4.313l72 24c2.156 .719 4.533 .157 6.14-1.45L136 184.49l6.1 6.1c2.626 2.626 6.187 4.101 9.9 4.101 3.713 0 7.274-1.475 9.9-4.101l22.28-22.29c5.555 3.742 12.983 3.026 17.72-1.71l50.34-50.35c2.34-2.343 2.34-6.137 0-8.48ZM94.38 209.14 35.11 189.38 88 136.49 127.51 176ZM153.38 182.14c-.78 .775-2.04 .775-2.82 0L140.21 171.8h0l-48-48h0L81.9 113.41c-.775-.78-.775-2.04 0-2.82L104 88.49 175.51 160Z"),
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
        return _highlighter!!
    }

private var _highlighter: ImageVector? = null
