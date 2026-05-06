package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.TrayArrowUp: ImageVector
    get() {
        if (_trayArrowUp != null) return _trayArrowUp!!
        _trayArrowUp = phosphorLightIcon(
            name = "TrayArrowUp",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M208 34h-160C40.268 34 34 40.268 34 48v160c0 7.732 6.268 14 14 14h160c7.732 0 14-6.268 14-14v-160c0-7.732-6.268-14-14-14ZM48 46h160c1.105 0 2 .895 2 2v106h-30.69c-3.712-.009-7.273 1.468-9.89 4.1l-19.32 19.31c-.373 .376-.88 .588-1.41 .59h-41.38c-.53-.002-1.037-.214-1.41-.59L86.59 158.1C83.968 155.469 80.404 153.993 76.69 154h-30.69v-106c0-1.105 .895-2 2-2ZM208 210h-160c-1.105 0-2-.895-2-2v-42h30.69c.53 .002 1.037 .214 1.41 .59l19.31 19.31c2.622 2.631 6.186 4.107 9.9 4.1h41.38c3.712 .009 7.273-1.468 9.89-4.1l19.32-19.31c.373-.376 .88-.588 1.41-.59h30.69v42c0 1.105-.895 2-2 2ZM91.76 108.24c-2.34-2.343-2.34-6.137 0-8.48l32-32c2.343-2.34 6.137-2.34 8.48 0l32 32c1.605 1.496 2.266 3.748 1.723 5.874-.543 2.126-2.203 3.786-4.329 4.329-2.126 .543-4.379-.118-5.874-1.723L134 86.49v65.51c0 3.314-2.686 6-6 6-3.314 0-6-2.686-6-6v-65.51l-21.76 21.75c-2.343 2.34-6.137 2.34-8.48 0Z"),
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
        return _trayArrowUp!!
    }

private var _trayArrowUp: ImageVector? = null
