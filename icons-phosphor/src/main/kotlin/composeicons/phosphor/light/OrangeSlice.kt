package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.OrangeSlice: ImageVector
    get() {
        if (_orangeSlice != null) return _orangeSlice!!
        _orangeSlice = phosphorLightIcon(
            name = "OrangeSlice",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M248 82h-240C4.686 82 2 84.686 2 88c0 69.588 56.412 126 126 126 69.588 0 126-56.412 126-126 0-3.314-2.686-6-6-6ZM74.46 150 122 102.48v67.28C104.437 168.472 87.762 161.54 74.46 150ZM66 141.54C54.46 128.238 47.528 111.563 46.24 94h67.28ZM134 102.48 181.54 150C168.238 161.54 151.563 168.472 134 169.76ZM190 141.54 142.48 94h67.28c-1.288 17.563-8.22 34.238-19.76 47.54ZM128 202C67.4 201.928 17.42 154.512 14.16 94h20c3.23 49.43 44.264 87.871 93.8 87.871 49.536 0 90.57-38.441 93.8-87.871h20C238.502 154.481 188.569 201.886 128 202Z"),
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
        return _orangeSlice!!
    }

private var _orangeSlice: ImageVector? = null
