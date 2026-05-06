package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.DropHalfBottom: ImageVector
    get() {
        if (_dropHalfBottom != null) return _dropHalfBottom!!
        _dropHalfBottom = phosphorLightIcon(
            name = "DropHalfBottom",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M172.53 49.06C160.29 34.904 146.508 22.158 131.44 11.06c-2.066-1.445-4.814-1.445-6.88 0C109.492 22.158 95.71 34.904 83.47 49.06 56.34 80.26 42 113.09 42 144c0 47.496 38.504 86 86 86 47.496 0 86-38.504 86-86C214 113.09 199.66 80.26 172.53 49.06ZM188.88 186h-121.76c-4.249-6.136-7.547-12.879-9.78-20h141.32c-2.233 7.121-5.531 13.864-9.78 20ZM54.69 154c-.453-3.314-.683-6.655-.69-10 .005-3.341 .192-6.679 .56-10h146.88c.368 3.321 .555 6.659 .56 10-.007 3.345-.237 6.686-.69 10ZM128 23.49c13.13 10.12 59.83 49.06 71.39 98.51h-142.78C68.17 72.55 114.87 33.61 128 23.49ZM77.48 198h101c-28.397 26.64-72.603 26.64-101 0Z"),
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
        return _dropHalfBottom!!
    }

private var _dropHalfBottom: ImageVector? = null
