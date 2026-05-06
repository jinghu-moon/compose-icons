package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.ClosedCaptioning: ImageVector
    get() {
        if (_closedCaptioning != null) return _closedCaptioning!!
        _closedCaptioning = phosphorLightIcon(
            name = "ClosedCaptioning",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M224 50h-192C24.268 50 18 56.268 18 64v128c0 7.732 6.268 14 14 14h192c7.732 0 14-6.268 14-14v-128c0-7.732-6.268-14-14-14ZM226 192c0 1.105-.895 2-2 2h-192c-1.105 0-2-.895-2-2v-128c0-1.105 .895-2 2-2h192c1.105 0 2 .895 2 2ZM117.19 152.71c.797 1.378 1.015 3.016 .604 4.554-.411 1.538-1.416 2.85-2.794 3.646-15.971 9.219-36.255 5.642-48.108-8.485-11.853-14.127-11.853-34.724 0-48.851C78.745 89.448 99.029 85.871 115 95.09c1.953 1.022 3.188 3.032 3.218 5.235 .03 2.204-1.151 4.246-3.075 5.32-1.925 1.074-4.283 1.007-6.143-.176C98.072 99.17 84.199 101.623 76.094 111.287c-8.106 9.664-8.106 23.752 0 33.416 8.106 9.664 21.979 12.116 32.906 5.817 2.867-1.654 6.531-.674 8.19 2.19ZM197.19 152.71c.797 1.378 1.015 3.016 .604 4.554-.411 1.538-1.416 2.85-2.794 3.646-15.971 9.219-36.255 5.642-48.108-8.485-11.853-14.127-11.853-34.724 0-48.851C158.745 89.448 179.029 85.871 195 95.09c1.953 1.022 3.188 3.032 3.218 5.235 .03 2.204-1.151 4.246-3.075 5.32-1.925 1.074-4.283 1.007-6.143-.176-10.928-6.3-24.801-3.847-32.906 5.817-8.106 9.664-8.106 23.752 0 33.416 8.106 9.664 21.979 12.116 32.906 5.817 2.867-1.654 6.531-.674 8.19 2.19Z"),
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
        return _closedCaptioning!!
    }

private var _closedCaptioning: ImageVector? = null
