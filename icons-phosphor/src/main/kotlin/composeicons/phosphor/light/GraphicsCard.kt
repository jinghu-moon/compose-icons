package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.GraphicsCard: ImageVector
    get() {
        if (_graphicsCard != null) return _graphicsCard!!
        _graphicsCard = phosphorLightIcon(
            name = "GraphicsCard",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M232 50h-216c-3.314 0-6 2.686-6 6v152c0 3.314 2.686 6 6 6 3.314 0 6-2.686 6-6v-18h20v18c0 3.314 2.686 6 6 6 3.314 0 6-2.686 6-6v-18h20v18c0 3.314 2.686 6 6 6 3.314 0 6-2.686 6-6v-18h20v18c0 3.314 2.686 6 6 6 3.314 0 6-2.686 6-6v-18h114c7.732 0 14-6.268 14-14v-112c0-7.732-6.268-14-14-14ZM234 176c0 1.105-.895 2-2 2h-210v-116h210c1.105 0 2 .895 2 2ZM176 82c-20.987 0-38 17.013-38 38 0 20.987 17.013 38 38 38 20.987 0 38-17.013 38-38C214 99.013 196.987 82 176 82ZM202 120c.006 4.82-1.338 9.545-3.88 13.64L162.36 97.88c8.019-4.942 18.084-5.159 26.309-.569 8.226 4.59 13.325 13.27 13.331 22.689ZM150 120c-.006-4.82 1.338-9.545 3.88-13.64l35.76 35.76c-8.019 4.942-18.084 5.159-26.309 .569C155.105 138.099 150.005 129.42 150 120ZM80 82C59.013 82 42 99.013 42 120c0 20.987 17.013 38 38 38 20.987 0 38-17.013 38-38C118 99.013 100.987 82 80 82ZM106 120c.006 4.82-1.338 9.545-3.88 13.64L66.36 97.88c8.019-4.942 18.084-5.159 26.309-.569 8.226 4.59 13.325 13.27 13.331 22.689ZM54 120c-.006-4.82 1.338-9.545 3.88-13.64l35.76 35.76c-8.019 4.942-18.084 5.159-26.309 .569C59.105 138.099 54.005 129.42 54 120Z"),
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
        return _graphicsCard!!
    }

private var _graphicsCard: ImageVector? = null
