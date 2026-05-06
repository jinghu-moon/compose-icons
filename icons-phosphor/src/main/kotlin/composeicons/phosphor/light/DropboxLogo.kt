package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.DropboxLogo: ImageVector
    get() {
        if (_dropboxLogo != null) return _dropboxLogo!!
        _dropboxLogo = phosphorLightIcon(
            name = "DropboxLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M235.42 151.07 190.54 120 235.42 88.93c1.616-1.121 2.58-2.963 2.58-4.93 0-1.967-.964-3.809-2.58-4.93l-52-36c-2.057-1.427-4.783-1.427-6.84 0L128 76.7 79.42 43.07c-2.057-1.427-4.783-1.427-6.84 0l-52 36C18.964 80.191 18 82.033 18 84c0 1.967 .964 3.809 2.58 4.93L65.46 120 20.58 151.07c-1.616 1.121-2.58 2.963-2.58 4.93 0 1.967 .964 3.809 2.58 4.93l52 36c2.057 1.427 4.783 1.427 6.84 0L128 163.3l48.58 33.63c2.057 1.427 4.783 1.427 6.84 0l52-36c1.616-1.121 2.58-2.963 2.58-4.93 0-1.967-.964-3.809-2.58-4.93ZM128 148.7 86.54 120 128 91.3 169.46 120ZM180 55.3 221.46 84 180 112.7 138.54 84ZM76 55.3 117.46 84 76 112.7 34.54 84ZM76 184.7 34.54 156 76 127.3 117.46 156ZM180 184.7 138.54 156 180 127.3 221.46 156ZM156.82 208c.907 1.308 1.258 2.922 .974 4.488-.283 1.566-1.177 2.955-2.484 3.862l-23.89 16.54c-2.057 1.427-4.783 1.427-6.84 0L100.69 216.35c-2.609-1.926-3.215-5.577-1.368-8.243 1.847-2.666 5.478-3.382 8.198-1.617L128 220.7l20.48-14.17c2.71-1.89 6.439-1.233 8.34 1.47Z"),
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
        return _dropboxLogo!!
    }

private var _dropboxLogo: ImageVector? = null
