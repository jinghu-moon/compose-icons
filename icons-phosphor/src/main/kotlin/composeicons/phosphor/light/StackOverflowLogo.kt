package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.StackOverflowLogo: ImageVector
    get() {
        if (_stackOverflowLogo != null) return _stackOverflowLogo!!
        _stackOverflowLogo = phosphorLightIcon(
            name = "StackOverflowLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M214 152.09v63.91c0 3.314-2.686 6-6 6h-160c-3.314 0-6-2.686-6-6v-63.91c0-3.314 2.686-6 6-6 3.314 0 6 2.686 6 6v57.91h148v-57.91c0-3.314 2.686-6 6-6 3.314 0 6 2.686 6 6ZM88 182.09h80c3.314 0 6-2.686 6-6 0-3.314-2.686-6-6-6h-80c-3.314 0-6 2.686-6 6 0 3.314 2.686 6 6 6ZM93.4 129.16l77.27 20.67c2.112 .698 4.438 .171 6.042-1.371 1.604-1.542 2.223-3.845 1.608-5.983-.615-2.138-2.362-3.761-4.54-4.216L96.5 117.54c-2.105-.667-4.407-.123-5.991 1.415-1.584 1.538-2.196 3.822-1.592 5.946 .604 2.124 2.326 3.745 4.483 4.219ZM112.33 79.42l69.28 40c.913 .523 1.947 .799 3 .8 2.705-.012 5.066-1.833 5.767-4.445 .701-2.612-.432-5.37-2.767-6.735L118.33 69c-1.86-1.182-4.218-1.25-6.143-.176-1.925 1.074-3.105 3.117-3.075 5.32 .03 2.204 1.265 4.214 3.218 5.235ZM200.08 92.77c2.364 2.203 6.048 2.138 8.333-.147 2.285-2.285 2.35-5.969 .147-8.333L152 27.76c-1.486-1.642-3.755-2.332-5.903-1.795-2.148 .537-3.826 2.213-4.365 4.36-.539 2.147 .148 4.417 1.788 5.905Z"),
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
        return _stackOverflowLogo!!
    }

private var _stackOverflowLogo: ImageVector? = null
