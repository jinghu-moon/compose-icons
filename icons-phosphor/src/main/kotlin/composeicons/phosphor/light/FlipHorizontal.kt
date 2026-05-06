package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.FlipHorizontal: ImageVector
    get() {
        if (_flipHorizontal != null) return _flipHorizontal!!
        _flipHorizontal = phosphorLightIcon(
            name = "FlipHorizontal",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M106.78 26.29c-6.533-1.376-13.12 2.094-15.68 8.26 0 0 0 .08 0 .12L27.1 194.61c-1.801 4.318-1.327 9.25 1.265 13.145 2.591 3.895 6.957 6.238 11.635 6.245h64c7.732 0 14-6.268 14-14v-160c.046-6.674-4.668-12.435-11.22-13.71ZM106 200c0 1.105-.895 2-2 2h-64c-.672 .003-1.301-.332-1.673-.892-.372-.56-.439-1.269-.177-1.888l.05-.11L102.2 39.19c.401-.83 1.317-1.278 2.218-1.086 .901 .192 1.555 .975 1.582 1.896ZM228.92 194.61l-64-159.94c0 0 0-.08 0-.12-2.574-6.168-9.148-9.656-15.698-8.33C142.672 27.546 137.972 33.317 138 40v160c0 7.732 6.268 14 14 14h64c4.684 .003 9.058-2.336 11.657-6.233 2.598-3.897 3.076-8.835 1.273-13.157ZM217.66 201.1c-.361 .572-.994 .913-1.67 .9h-63.99c-1.105 0-2-.895-2-2v-160c-.105-.993 .608-1.885 1.6-2 .177-.039 .358-.059 .54-.06 .764-.009 1.447 .476 1.69 1.2l64 159.92 .05 .11c.265 .638 .182 1.368-.22 1.93Z"),
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
        return _flipHorizontal!!
    }

private var _flipHorizontal: ImageVector? = null
