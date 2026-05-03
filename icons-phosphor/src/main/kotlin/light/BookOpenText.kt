package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.BookOpenText: ImageVector
    get() {
        if (_bookOpenText != null) return _bookOpenText!!
        _bookOpenText = phosphorLightIcon(
            name = "BookOpenText",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 232.000 50.000 L 160.000 50.000 C 147.038 50.010 134.975 56.625 128.000 67.550 C 121.025 56.625 108.962 50.010 96.000 50.000 L 24.000 50.000 C 20.686 50.000 18.000 52.686 18.000 56.000 L 18.000 200.000 C 18.000 203.314 20.686 206.000 24.000 206.000 L 96.000 206.000 C 110.359 206.000 122.000 217.641 122.000 232.000 C 122.000 235.314 124.686 238.000 128.000 238.000 C 131.314 238.000 134.000 235.314 134.000 232.000 C 134.000 217.641 145.641 206.000 160.000 206.000 L 232.000 206.000 C 235.314 206.000 238.000 203.314 238.000 200.000 L 238.000 56.000 C 238.000 52.686 235.314 50.000 232.000 50.000 ZM 96.000 194.000 L 30.000 194.000 L 30.000 62.000 L 96.000 62.000 C 110.359 62.000 122.000 73.641 122.000 88.000 L 122.000 204.310 C 114.967 197.681 105.665 193.992 96.000 194.000 ZM 226.000 194.000 L 160.000 194.000 C 150.334 193.996 141.032 197.688 134.000 204.320 L 134.000 88.000 C 134.000 73.641 145.641 62.000 160.000 62.000 L 226.000 62.000 ZM 160.000 90.000 L 200.000 90.000 C 203.314 90.000 206.000 92.686 206.000 96.000 C 206.000 99.314 203.314 102.000 200.000 102.000 L 160.000 102.000 C 156.686 102.000 154.000 99.314 154.000 96.000 C 154.000 92.686 156.686 90.000 160.000 90.000 ZM 206.000 128.000 C 206.000 131.314 203.314 134.000 200.000 134.000 L 160.000 134.000 C 156.686 134.000 154.000 131.314 154.000 128.000 C 154.000 124.686 156.686 122.000 160.000 122.000 L 200.000 122.000 C 203.314 122.000 206.000 124.686 206.000 128.000 ZM 206.000 160.000 C 206.000 163.314 203.314 166.000 200.000 166.000 L 160.000 166.000 C 156.686 166.000 154.000 163.314 154.000 160.000 C 154.000 156.686 156.686 154.000 160.000 154.000 L 200.000 154.000 C 203.314 154.000 206.000 156.686 206.000 160.000 Z"),
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
        return _bookOpenText!!
    }

private var _bookOpenText: ImageVector? = null
