package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Dress: ImageVector
    get() {
        if (_dress != null) return _dress!!
        _dress = phosphorLightIcon(
            name = "Dress",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M212.86 210.49c-.021-.066-.047-.129-.08-.19L166.84 112.44 187.92 79.34l.09-.14c2.658-4.432 2.658-9.968 0-14.4-.07-.12-.15-.24-.23-.36L166 33.33v-25.33c0-3.314-2.686-6-6-6-3.314 0-6 2.686-6 6v25.12l-5.7 7.12c-4.934 6.166-12.403 9.755-20.3 9.755-7.897 0-15.366-3.589-20.3-9.755L102 33.12v-25.12C102 4.686 99.314 2 96 2 92.686 2 90 4.686 90 8v25.33L68.22 64.44c-.08 .12-.16 .24-.23 .36-2.658 4.432-2.658 9.968 0 14.4l.09 .14 21.08 33.1L43.22 210.3c-.033 .061-.059 .124-.08 .19-1.851 4.324-1.407 9.288 1.181 13.215 2.588 3.927 6.976 6.292 11.679 6.295h144c4.705-0 9.095-2.363 11.686-6.291 2.591-3.927 3.036-8.894 1.184-13.219ZM78.26 73c-.332-.582-.351-1.291-.05-1.89L96.32 45.23l2 2.51c7.211 9.012 18.128 14.258 29.67 14.258 11.542 0 22.459-5.246 29.67-14.258l2-2.51 18.11 25.86c.316 .59 .316 1.3 0 1.89l-21 33h-57.48ZM201.66 217.1c-.361 .572-.994 .913-1.67 .9h-143.99c-.66 .001-1.278-.323-1.652-.867-.374-.544-.455-1.237-.218-1.853L99.81 118h56.38l45.67 97.28c.246 .601 .17 1.286-.2 1.82Z"),
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
        return _dress!!
    }

private var _dress: ImageVector? = null
