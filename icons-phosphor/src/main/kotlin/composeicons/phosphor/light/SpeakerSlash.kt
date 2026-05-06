package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.SpeakerSlash: ImageVector
    get() {
        if (_speakerSlash != null) return _speakerSlash!!
        _speakerSlash = phosphorLightIcon(
            name = "SpeakerSlash",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M52.44 36c-2.277-2.113-5.79-2.139-8.098-.06-2.308 2.079-2.647 5.576-.782 8.06L78 81.94 77.92 82h-45.92C24.268 82 18 88.268 18 96v64c0 7.732 6.268 14 14 14h45.94l70.38 54.74c1.809 1.405 4.261 1.657 6.319 .65 2.058-1.008 3.362-3.099 3.361-5.39v-54.08L203.56 220c2.231 2.452 6.028 2.631 8.48 .4 2.452-2.231 2.631-6.028 .4-8.48ZM30 160v-64c0-1.105 .895-2 2-2h42v68h-42c-1.105 0-2-.895-2-2ZM146 211.73 86 165.07v-74.14l.11-.08L146 156.72ZM187.5 145.2c8.652-9.823 8.652-24.547 0-34.37-1.49-1.597-1.994-3.878-1.316-5.954 .678-2.076 2.43-3.62 4.575-4.031 2.145-.411 4.344 .376 5.741 2.055 12.649 14.358 12.649 35.882 0 50.24-2.193 2.485-5.985 2.723-8.47 .53-2.485-2.193-2.723-5.985-.53-8.47ZM107.41 66.68c-.976-1.257-1.413-2.85-1.214-4.43 .199-1.579 1.017-3.015 2.274-3.99L148.32 27.26c1.809-1.405 4.261-1.657 6.319-.65 2.058 1.008 3.362 3.099 3.361 5.39v74.83c0 3.314-2.686 6-6 6-3.314 0-6-2.686-6-6v-62.56L115.83 67.73c-2.615 2.035-6.385 1.565-8.42-1.05ZM246 128c.014 19.188-7.059 37.706-19.86 52-1.414 1.655-3.613 2.415-5.746 1.985-2.134-.43-3.867-1.981-4.531-4.054-.663-2.073-.151-4.343 1.337-5.931 22.409-25.054 22.409-62.946 0-88-1.488-1.588-2-3.858-1.337-5.931 .663-2.073 2.397-3.625 4.531-4.054 2.134-.43 4.333 .33 5.746 1.985 12.801 14.294 19.874 32.812 19.86 52Z"),
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
        return _speakerSlash!!
    }

private var _speakerSlash: ImageVector? = null
