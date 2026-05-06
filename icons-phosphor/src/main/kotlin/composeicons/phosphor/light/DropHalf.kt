package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.DropHalf: ImageVector
    get() {
        if (_dropHalf != null) return _dropHalf!!
        _dropHalf = phosphorLightIcon(
            name = "DropHalf",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M172.53 49.06C160.29 34.904 146.508 22.158 131.44 11.06c-2.066-1.445-4.814-1.445-6.88 0C109.492 22.158 95.71 34.904 83.47 49.06 56.34 80.26 42 113.09 42 144c0 47.496 38.504 86 86 86 47.496 0 86-38.504 86-86C214 113.09 199.66 80.26 172.53 49.06ZM202 144c-.007 3.345-.237 6.686-.69 10h-67.31v-20h67.44c.368 3.321 .555 6.659 .56 10ZM186.8 90h-52.8v-20h39.89c4.75 6.368 9.063 13.05 12.91 20ZM134 198h44.52C166.343 209.431 150.647 216.39 134 217.74ZM134 186v-20h64.66c-2.233 7.121-5.531 13.864-9.78 20ZM134 122v-20h58.7c2.825 6.453 5.064 13.146 6.69 20ZM164.29 58h-30.29v-29.7c10.898 9.049 21.029 18.982 30.29 29.7ZM54 144C54 90.58 101.35 45.44 122 28.3v189.44C83.611 214.574 54.052 182.519 54 144Z"),
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
        return _dropHalf!!
    }

private var _dropHalf: ImageVector? = null
