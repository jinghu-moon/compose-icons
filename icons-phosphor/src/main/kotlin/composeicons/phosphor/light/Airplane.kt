package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Airplane: ImageVector
    get() {
        if (_airplane != null) return _airplane!!
        _airplane = phosphorLightIcon(
            name = "Airplane",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M234.68 130.63 158 92.29v-44.29C158 31.431 144.569 18 128 18 111.431 18 98 31.431 98 48v44.29L21.32 130.63C19.285 131.646 17.999 133.725 18 136v32c.001 1.798 .808 3.5 2.198 4.639 1.391 1.139 3.219 1.594 4.982 1.241L98 159.32v22.19L83.76 195.76C82.634 196.884 82.001 198.409 82 200v32c0 1.991 .988 3.853 2.637 4.969 1.649 1.116 3.744 1.341 5.593 .601L128 222.46l37.77 15.11c1.849 .74 3.944 .515 5.593-.601 1.649-1.116 2.637-2.978 2.637-4.969v-32c-.001-1.591-.634-3.116-1.76-4.24L158 181.51v-22.19l72.82 14.56c1.763 .354 3.591-.102 4.982-1.241 1.391-1.139 2.198-2.842 2.198-4.639v-32c.001-2.275-1.285-4.354-3.32-5.37ZM226 160.68 153.18 146.12c-1.763-.354-3.591 .102-4.982 1.241-1.391 1.139-2.198 2.842-2.198 4.639v32c.001 1.591 .634 3.116 1.76 4.24L162 202.49v20.65L130.23 210.43c-1.431-.573-3.029-.573-4.46 0L94 223.14v-20.65l14.24-14.25c1.126-1.124 1.759-2.649 1.76-4.24v-32c-.001-1.798-.808-3.5-2.198-4.639-1.391-1.139-3.219-1.594-4.982-1.241L30 160.68v-21l76.68-38.34c2.025-1.011 3.309-3.076 3.32-5.34v-48c0-9.941 8.059-18 18-18 9.941 0 18 8.059 18 18v48c-.001 2.275 1.285 4.354 3.32 5.37L226 139.71Z"),
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
        return _airplane!!
    }

private var _airplane: ImageVector? = null
