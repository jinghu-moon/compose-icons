package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.FileDoc: ImageVector
    get() {
        if (_fileDoc != null) return _fileDoc!!
        _fileDoc = phosphorLightIcon(
            name = "FileDoc",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M52 146h-16c-3.314 0-6 2.686-6 6v56c0 3.314 2.686 6 6 6h16c18.778 0 34-15.222 34-34C86 161.222 70.778 146 52 146ZM52 202h-10v-44h10c12.15 0 22 9.85 22 22 0 12.15-9.85 22-22 22ZM220.15 196.54c2.39 2.293 2.471 6.088 .18 8.48-5.252 5.664-12.606 8.912-20.33 8.98-16.54 0-30-15.25-30-34 0-18.75 13.46-34 30-34 7.727 .073 15.082 3.329 20.33 9 2.18 2.407 2.049 6.112-.295 8.36-2.345 2.247-6.052 2.221-8.365-.06C208.672 160.007 204.452 158.091 200 158c-9.93 0-18 9.87-18 22 0 12.13 8.07 22 18 22 4.449-.086 8.668-1.995 11.67-5.28 2.293-2.39 6.088-2.471 8.48-.18ZM128 146c-16.54 0-30 15.25-30 34 0 18.75 13.46 34 30 34 16.54 0 30-15.25 30-34 0-18.75-13.46-34-30-34ZM128 202c-9.93 0-18-9.87-18-22 0-12.13 8.07-22 18-22 9.93 0 18 9.87 18 22 0 12.13-8.07 22-18 22ZM48 118c3.314 0 6-2.686 6-6v-72c0-1.105 .895-2 2-2h90v50c0 3.314 2.686 6 6 6h50v18c0 3.314 2.686 6 6 6 3.314 0 6-2.686 6-6v-24c-.001-1.591-.634-3.116-1.76-4.24l-56-56C155.116 26.634 153.591 26.001 152 26h-96C48.268 26 42 32.268 42 40v72c0 3.314 2.686 6 6 6ZM158 46.48 193.52 82h-35.52Z"),
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
        return _fileDoc!!
    }

private var _fileDoc: ImageVector? = null
