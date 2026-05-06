package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Clipboard: ImageVector
    get() {
        if (_clipboard != null) return _clipboard!!
        _clipboard = phosphorBoldIcon(
            name = "Clipboard",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M200 28h-34.53C155.684 17.781 142.149 12.002 128 12.002c-14.149 0-27.684 5.779-37.47 15.998h-34.53C44.954 28 36 36.954 36 48v168c0 11.046 8.954 20 20 20h144c11.046 0 20-8.954 20-20v-168C220 36.954 211.046 28 200 28ZM155.71 60h-55.42C102.287 46.233 114.089 36.019 128 36.019c13.911 0 25.713 10.213 27.71 23.981ZM196 212h-136v-160h17.41C76.476 55.932 76.003 59.959 76 64v8c0 6.627 5.373 12 12 12h80c6.627 0 12-5.373 12-12v-8c-.003-4.041-.476-8.068-1.41-12h17.41Z"),
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
        return _clipboard!!
    }

private var _clipboard: ImageVector? = null
