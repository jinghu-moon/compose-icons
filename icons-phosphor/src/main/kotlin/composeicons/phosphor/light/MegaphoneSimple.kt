package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.MegaphoneSimple: ImageVector
    get() {
        if (_megaphoneSimple != null) return _megaphoneSimple!!
        _megaphoneSimple = phosphorLightIcon(
            name = "MegaphoneSimple",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M228 88.59 51.92 34.59c-4.225-1.232-8.784-.406-12.308 2.231C36.088 39.458 34.009 43.599 34 48v144c0 7.732 6.268 14 14 14 1.354-.01 2.701-.209 4-.59L138 179v13c0 7.732 6.268 14 14 14h32c7.732 0 14-6.268 14-14v-31.38l30-9.19c5.924-1.79 9.983-7.241 10-13.43v-36c-.003-6.189-4.069-11.642-10-13.41ZM48.56 193.92c-.604 .176-1.256 .058-1.76-.32C46.296 193.222 46 192.63 46 192v-144c0-.63 .296-1.222 .8-1.6 .348-.256 .768-.396 1.2-.4 .166 .004 .331 .031 .49 .08L138 73.53v92.95ZM186 192c0 1.105-.895 2-2 2h-32c-1.105 0-2-.895-2-2v-16.65l36-11ZM226 138c0 .889-.587 1.671-1.44 1.92h-.08L150 162.8v-85.59l74.56 22.87c.853 .249 1.44 1.031 1.44 1.92Z"),
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
        return _megaphoneSimple!!
    }

private var _megaphoneSimple: ImageVector? = null
