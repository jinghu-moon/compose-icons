package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.LinkedinLogo: ImageVector
    get() {
        if (_linkedinLogo != null) return _linkedinLogo!!
        _linkedinLogo = phosphorLightIcon(
            name = "LinkedinLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M216 26h-176C32.268 26 26 32.268 26 40v176c0 7.732 6.268 14 14 14h176c7.732 0 14-6.268 14-14v-176c0-7.732-6.268-14-14-14ZM218 216c0 1.105-.895 2-2 2h-176c-1.105 0-2-.895-2-2v-176c0-1.105 .895-2 2-2h176c1.105 0 2 .895 2 2ZM94 112v64c0 3.314-2.686 6-6 6-3.314 0-6-2.686-6-6v-64c0-3.314 2.686-6 6-6 3.314 0 6 2.686 6 6ZM182 140v36c0 3.314-2.686 6-6 6-3.314 0-6-2.686-6-6v-36c0-12.15-9.85-22-22-22-12.15 0-22 9.85-22 22v36c0 3.314-2.686 6-6 6-3.314 0-6-2.686-6-6v-64c0-3.314 2.686-6 6-6 3.314 0 6 2.686 6 6v2.11c10.096-8.568 24.248-10.495 36.268-4.938 12.02 5.557 19.719 17.587 19.732 30.828ZM98 84c0 5.523-4.477 10-10 10C82.477 94 78 89.523 78 84 78 78.477 82.477 74 88 74c5.523 0 10 4.477 10 10Z"),
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
        return _linkedinLogo!!
    }

private var _linkedinLogo: ImageVector? = null
