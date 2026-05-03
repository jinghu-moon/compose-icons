package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.FilmStrip: ImageVector
    get() {
        if (_filmStrip != null) return _filmStrip!!
        _filmStrip = phosphorLightIcon(
            name = "FilmStrip",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 216.000 42.000 L 40.000 42.000 C 32.268 42.000 26.000 48.268 26.000 56.000 L 26.000 200.000 C 26.000 207.732 32.268 214.000 40.000 214.000 L 216.000 214.000 C 223.732 214.000 230.000 207.732 230.000 200.000 L 230.000 56.000 C 230.000 48.268 223.732 42.000 216.000 42.000 ZM 38.000 86.000 L 122.000 86.000 L 122.000 170.000 L 38.000 170.000 ZM 134.000 74.000 L 134.000 54.000 L 170.000 54.000 L 170.000 74.000 ZM 122.000 74.000 L 86.000 74.000 L 86.000 54.000 L 122.000 54.000 ZM 122.000 182.000 L 122.000 202.000 L 86.000 202.000 L 86.000 182.000 ZM 134.000 182.000 L 170.000 182.000 L 170.000 202.000 L 134.000 202.000 ZM 134.000 170.000 L 134.000 86.000 L 218.000 86.000 L 218.000 170.000 ZM 218.000 56.000 L 218.000 74.000 L 182.000 74.000 L 182.000 54.000 L 216.000 54.000 C 217.105 54.000 218.000 54.895 218.000 56.000 ZM 40.000 54.000 L 74.000 54.000 L 74.000 74.000 L 38.000 74.000 L 38.000 56.000 C 38.000 54.895 38.895 54.000 40.000 54.000 ZM 38.000 200.000 L 38.000 182.000 L 74.000 182.000 L 74.000 202.000 L 40.000 202.000 C 38.895 202.000 38.000 201.105 38.000 200.000 ZM 216.000 202.000 L 182.000 202.000 L 182.000 182.000 L 218.000 182.000 L 218.000 200.000 C 218.000 201.105 217.105 202.000 216.000 202.000 Z"),
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
        return _filmStrip!!
    }

private var _filmStrip: ImageVector? = null
