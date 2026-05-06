package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.TextStrikethrough: ImageVector
    get() {
        if (_textStrikethrough != null) return _textStrikethrough!!
        _textStrikethrough = phosphorLightIcon(
            name = "TextStrikethrough",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M222 128c0 3.314-2.686 6-6 6h-46.55c11.28 6.92 20.55 17.38 20.55 34 0 25.36-27.81 46-62 46C93.81 214 66 193.36 66 168c0-3.314 2.686-6 6-6 3.314 0 6 2.686 6 6 0 18.75 22.43 34 50 34 27.57 0 50-15.25 50-34 0-18.23-15.46-26.59-40.47-34h-97.53c-3.314 0-6-2.686-6-6 0-3.314 2.686-6 6-6h176c3.314 0 6 2.686 6 6ZM76.33 102c.638-.003 1.273-.104 1.88-.3 3.132-1.05 4.826-4.434 3.79-7.57C81.383 92.146 81.082 90.077 81.11 88 81.11 68.62 101.27 54 128 54c19.58 0 35.56 7.81 42.74 20.89 1.596 2.905 5.245 3.966 8.15 2.37 2.905-1.596 3.966-5.245 2.37-8.15C171.94 52.13 152 42 128 42 94.43 42 69.11 61.77 69.11 88c-.019 3.35 .494 6.681 1.52 9.87 .808 2.464 3.107 4.13 5.7 4.13Z"),
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
        return _textStrikethrough!!
    }

private var _textStrikethrough: ImageVector? = null
