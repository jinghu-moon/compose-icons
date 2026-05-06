package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.NumberThree: ImageVector
    get() {
        if (_numberThree != null) return _numberThree!!
        _numberThree = phosphorLightIcon(
            name = "NumberThree",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M174 160c0 21.295-12.515 40.602-31.954 49.296C122.606 217.989 99.872 214.447 84 200.25c-1.655-1.414-2.415-3.613-1.985-5.746 .43-2.134 1.981-3.867 4.054-4.531 2.073-.663 4.343-.151 5.931 1.337 13.954 12.477 34.481 14.213 50.332 4.257 15.852-9.956 23.202-29.199 18.023-47.187C155.176 130.392 138.719 118.003 120 118c-2.273 0-4.35-1.284-5.367-3.317-1.016-2.033-.797-4.465 .567-6.283L156 54h-68c-3.314 0-6-2.686-6-6 0-3.314 2.686-6 6-6h80c2.273 0 4.35 1.284 5.367 3.317 1.016 2.033 .797 4.465-.567 6.283l-41.67 55.55c24.968 5.298 42.836 27.326 42.87 52.85Z"),
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
        return _numberThree!!
    }

private var _numberThree: ImageVector? = null
