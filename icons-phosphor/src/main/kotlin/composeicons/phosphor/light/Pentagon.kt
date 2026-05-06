package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Pentagon: ImageVector
    get() {
        if (_pentagon != null) return _pentagon!!
        _pentagon = phosphorLightIcon(
            name = "Pentagon",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M224.35 89.15 136.41 20.82l-.13-.1c-4.928-3.615-11.632-3.615-16.56 0l-.13 .1L31.65 89.15c-4.788 3.559-6.795 9.761-5 15.45L58.65 212.16c0 .05 0 .09 0 .13 1.865 5.795 7.262 9.72 13.35 9.71h112c6.08 .002 11.467-3.922 13.33-9.71 0 0 0-.08 0-.13l32-107.56c1.8-5.685-.199-11.886-4.98-15.45ZM217.9 101c0 0 0 .08 0 .12l-32 107.54c-.282 .807-1.045 1.345-1.9 1.34h-112c-.851 .001-1.609-.537-1.89-1.34l-32-107.54c0 0 0-.08 0-.12-.266-.821 .024-1.72 .72-2.23l.13-.1L126.87 30.37c.686-.476 1.594-.476 2.28 0l87.91 68.3 .13 .1c.692 .513 .978 1.411 .71 2.23Z"),
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
        return _pentagon!!
    }

private var _pentagon: ImageVector? = null
