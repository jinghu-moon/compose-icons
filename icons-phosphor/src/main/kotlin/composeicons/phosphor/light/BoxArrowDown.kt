package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.BoxArrowDown: ImageVector
    get() {
        if (_boxArrowDown != null) return _boxArrowDown!!
        _boxArrowDown = phosphorLightIcon(
            name = "BoxArrowDown",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M221.37 69.32l-16-32C204.354 35.285 202.275 33.999 200 34h-144c-2.275-.001-4.354 1.285-5.37 3.32l-16 32c-.412 .833-.628 1.75-.63 2.68v136c0 7.732 6.268 14 14 14h160c7.732 0 14-6.268 14-14v-136c-.002-.93-.218-1.847-.63-2.68ZM59.71 46h136.58l10 20h-156.58ZM208 210h-160c-1.105 0-2-.895-2-2v-130h164v130c0 1.105-.895 2-2 2ZM164.24 147.76c2.34 2.343 2.34 6.137 0 8.48l-32 32c-2.343 2.34-6.137 2.34-8.48 0l-32-32c-2.203-2.364-2.138-6.048 .147-8.333 2.285-2.285 5.969-2.35 8.333-.147L122 169.51v-65.51c0-3.314 2.686-6 6-6 3.314 0 6 2.686 6 6v65.51l21.76-21.75c2.343-2.34 6.137-2.34 8.48 0Z"),
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
        return _boxArrowDown!!
    }

private var _boxArrowDown: ImageVector? = null
