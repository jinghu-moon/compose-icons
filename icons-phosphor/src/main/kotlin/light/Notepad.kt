package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Notepad: ImageVector
    get() {
        if (_notepad != null) return _notepad!!
        _notepad = phosphorLightIcon(
            name = "Notepad",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 166.000 128.000 C 166.000 131.314 163.314 134.000 160.000 134.000 L 96.000 134.000 C 92.686 134.000 90.000 131.314 90.000 128.000 C 90.000 124.686 92.686 122.000 96.000 122.000 L 160.000 122.000 C 163.314 122.000 166.000 124.686 166.000 128.000 ZM 160.000 154.000 L 96.000 154.000 C 92.686 154.000 90.000 156.686 90.000 160.000 C 90.000 163.314 92.686 166.000 96.000 166.000 L 160.000 166.000 C 163.314 166.000 166.000 163.314 166.000 160.000 C 166.000 156.686 163.314 154.000 160.000 154.000 ZM 214.000 40.000 L 214.000 200.000 C 214.000 216.569 200.569 230.000 184.000 230.000 L 72.000 230.000 C 55.431 230.000 42.000 216.569 42.000 200.000 L 42.000 40.000 C 42.000 36.686 44.686 34.000 48.000 34.000 L 74.000 34.000 L 74.000 24.000 C 74.000 20.686 76.686 18.000 80.000 18.000 C 83.314 18.000 86.000 20.686 86.000 24.000 L 86.000 34.000 L 122.000 34.000 L 122.000 24.000 C 122.000 20.686 124.686 18.000 128.000 18.000 C 131.314 18.000 134.000 20.686 134.000 24.000 L 134.000 34.000 L 170.000 34.000 L 170.000 24.000 C 170.000 20.686 172.686 18.000 176.000 18.000 C 179.314 18.000 182.000 20.686 182.000 24.000 L 182.000 34.000 L 208.000 34.000 C 211.314 34.000 214.000 36.686 214.000 40.000 ZM 202.000 46.000 L 182.000 46.000 L 182.000 56.000 C 182.000 59.314 179.314 62.000 176.000 62.000 C 172.686 62.000 170.000 59.314 170.000 56.000 L 170.000 46.000 L 134.000 46.000 L 134.000 56.000 C 134.000 59.314 131.314 62.000 128.000 62.000 C 124.686 62.000 122.000 59.314 122.000 56.000 L 122.000 46.000 L 86.000 46.000 L 86.000 56.000 C 86.000 59.314 83.314 62.000 80.000 62.000 C 76.686 62.000 74.000 59.314 74.000 56.000 L 74.000 46.000 L 54.000 46.000 L 54.000 200.000 C 54.000 209.941 62.059 218.000 72.000 218.000 L 184.000 218.000 C 193.941 218.000 202.000 209.941 202.000 200.000 Z"),
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
        return _notepad!!
    }

private var _notepad: ImageVector? = null
