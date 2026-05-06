package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Keyhole: ImageVector
    get() {
        if (_keyhole != null) return _keyhole!!
        _keyhole = phosphorLightIcon(
            name = "Keyhole",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M128 26C71.667 26 26 71.667 26 128c0 56.333 45.667 102 102 102 56.333 0 102-45.667 102-102C229.934 71.694 184.306 26.066 128 26ZM128 218C78.294 218 38 177.706 38 128 38 78.294 78.294 38 128 38c49.706 0 90 40.294 90 90-.055 49.683-40.317 89.945-90 90ZM166 112C166.001 94.24 153.7 78.848 136.377 74.933 119.054 71.017 101.33 79.623 93.693 95.657c-7.637 16.034-3.149 35.22 10.807 46.203l-14 31.72c-.819 1.857-.643 4.002 .467 5.701 1.11 1.699 3.003 2.722 5.033 2.719h64c2.028-0 3.918-1.024 5.026-2.723 1.107-1.699 1.282-3.842 .464-5.697l-14-31.72C160.63 134.642 165.973 123.646 166 112ZM141 134.53c-2.649 1.531-3.721 4.809-2.49 7.61L150.8 170h-45.6l12.29-27.86c1.231-2.801 .159-6.079-2.49-7.61C104.809 128.646 99.84 116.651 102.886 105.284 105.932 93.917 116.232 86.013 128 86.013c11.768 0 22.068 7.904 25.114 19.271 3.046 11.367-1.923 23.362-12.114 29.246Z"),
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
        return _keyhole!!
    }

private var _keyhole: ImageVector? = null
