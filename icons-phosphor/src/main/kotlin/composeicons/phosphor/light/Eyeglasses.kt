package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Eyeglasses: ImageVector
    get() {
        if (_eyeglasses != null) return _eyeglasses!!
        _eyeglasses = phosphorLightIcon(
            name = "Eyeglasses",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M200 42c-3.314 0-6 2.686-6 6 0 3.314 2.686 6 6 6 9.941 0 18 8.059 18 18v62.65C207.339 123.764 191.617 119.505 176.919 123.523c-14.698 4.018-26.068 15.681-29.709 30.477h-38.42C105.149 139.204 93.779 127.541 79.081 123.523 64.383 119.505 48.661 123.764 38 134.65v-62.65C38 62.059 46.059 54 56 54c3.314 0 6-2.686 6-6 0-3.314-2.686-6-6-6C39.431 42 26 55.431 26 72v92c-.552 23.196 17.804 42.448 41 43 23.196 .552 42.448-17.804 43-41h36.1c1.493 22.451 20.414 39.737 42.908 39.2C211.502 204.664 229.578 186.497 230 164v-92C230 55.431 216.569 42 200 42ZM68 194C51.431 194 38 180.569 38 164c0-16.569 13.431-30 30-30 16.569 0 30 13.431 30 30 0 16.569-13.431 30-30 30ZM188 194c-16.569 0-30-13.431-30-30 0-16.569 13.431-30 30-30 16.569 0 30 13.431 30 30 0 16.569-13.431 30-30 30Z"),
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
        return _eyeglasses!!
    }

private var _eyeglasses: ImageVector? = null
