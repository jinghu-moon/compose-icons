package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Beanie: ImageVector
    get() {
        if (_beanie != null) return _beanie!!
        _beanie = phosphorThinIcon(
            name = "Beanie",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M220 164.7v-20.7C219.944 99.546 188.159 61.468 144.43 53.47c7.176-6.739 9.509-17.177 5.884-26.33C146.69 17.987 137.844 11.976 128 11.976c-9.844 0-18.69 6.012-22.314 15.164-3.624 9.153-1.291 19.591 5.884 26.33C67.841 61.468 36.056 99.546 36 144v20.7c-4.79 1.693-7.994 6.22-8 11.3v32c0 6.627 5.373 12 12 12h176c6.627 0 12-5.373 12-12v-32c-.006-5.08-3.21-9.607-8-11.3ZM112 36c0-8.837 7.163-16 16-16 8.837 0 16 7.163 16 16 0 8.837-7.163 16-16 16-8.837 0-16-7.163-16-16ZM128 60c46.371 .05 83.95 37.629 84 84v20h-168v-20C44.05 97.629 81.629 60.05 128 60ZM124 172v40h-48v-40ZM132 172h48v40h-48ZM36 208v-32c0-2.209 1.791-4 4-4h28v40h-28c-2.209 0-4-1.791-4-4ZM220 208c0 2.209-1.791 4-4 4h-28v-40h28c2.209 0 4 1.791 4 4Z"),
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
        return _beanie!!
    }

private var _beanie: ImageVector? = null
