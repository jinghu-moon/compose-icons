package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.BoxArrowUp: ImageVector
    get() {
        if (_boxArrowUp != null) return _boxArrowUp!!
        _boxArrowUp = phosphorLightIcon(
            name = "BoxArrowUp",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M221.37 69.32l-16-32C204.354 35.285 202.275 33.999 200 34h-144c-2.275-.001-4.354 1.285-5.37 3.32l-16 32c-.412 .833-.628 1.75-.63 2.68v136c0 7.732 6.268 14 14 14h160c7.732 0 14-6.268 14-14v-136c-.002-.93-.218-1.847-.63-2.68ZM59.71 46h136.58l10 20h-156.58ZM208 210h-160c-1.105 0-2-.895-2-2v-130h164v130c0 1.105-.895 2-2 2ZM164.24 131.76c1.605 1.496 2.266 3.748 1.723 5.874-.543 2.126-2.203 3.786-4.329 4.329-2.126 .543-4.379-.118-5.874-1.723L134 118.49v65.51c0 3.314-2.686 6-6 6-3.314 0-6-2.686-6-6v-65.51l-21.76 21.75c-2.364 2.203-6.048 2.138-8.333-.147-2.285-2.285-2.35-5.969-.147-8.333l32-32c2.343-2.34 6.137-2.34 8.48 0Z"),
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
        return _boxArrowUp!!
    }

private var _boxArrowUp: ImageVector? = null
