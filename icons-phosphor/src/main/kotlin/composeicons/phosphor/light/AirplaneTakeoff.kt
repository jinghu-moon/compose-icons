package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.AirplaneTakeoff: ImageVector
    get() {
        if (_airplaneTakeoff != null) return _airplaneTakeoff!!
        _airplaneTakeoff = phosphorLightIcon(
            name = "AirplaneTakeoff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M174 216c0 3.314-2.686 6-6 6h-144c-3.314 0-6-2.686-6-6 0-3.314 2.686-6 6-6h144c3.314 0 6 2.686 6 6ZM245.9 92.78c-.329 1.674-1.354 3.128-2.82 4l-147.41 88c-5.835 3.413-12.47 5.218-19.23 5.23-9.641-.012-18.914-3.707-25.92-10.33l-.1-.09L14.37 144.36c-3.413-3.225-4.982-7.948-4.177-12.574 .805-4.627 3.876-8.542 8.177-10.426l3-1.49c1.422-.694 3.061-.799 4.56-.29l29.15 9.83 23.17-14-23.7-23C51.053 89.19 49.429 84.415 50.237 79.731c.808-4.684 3.939-8.639 8.312-10.501l.24-.1 7.15-2.71c1.351-.504 2.839-.504 4.19 0l54.84 20.18L177.35 55.33C193.473 45.757 214.177 49.446 226 64l.09 .11L244.73 88c1.056 1.353 1.481 3.093 1.17 4.78ZM231.09 90 216.67 71.53C208.574 61.597 194.425 59.092 183.41 65.64L128.6 98.36c-1.556 .93-3.449 1.106-5.15 .48L68 78.45l-4.9 1.85c-.594 .27-1.008 .824-1.1 1.47-.115 .674 .122 1.361 .63 1.82l.17 .15 29.35 28.49c1.335 1.295 1.994 3.135 1.785 4.983-.209 1.848-1.264 3.494-2.855 4.457L58.89 141.16c-1.506 .907-3.333 1.108-5 .55L24.44 131.77l-.93 .46-.28 .13c-.618 .267-1.06 .826-1.176 1.489-.117 .663 .107 1.339 .596 1.801l.1 .09 36 35.28c8.358 7.874 20.91 9.288 30.81 3.47Z"),
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
        return _airplaneTakeoff!!
    }

private var _airplaneTakeoff: ImageVector? = null
