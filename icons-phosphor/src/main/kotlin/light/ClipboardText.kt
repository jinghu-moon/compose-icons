package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.ClipboardText: ImageVector
    get() {
        if (_clipboardText != null) return _clipboardText!!
        _clipboardText = phosphorLightIcon(
            name = "ClipboardText",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 166.000 152.000 C 166.000 155.314 163.314 158.000 160.000 158.000 L 96.000 158.000 C 92.686 158.000 90.000 155.314 90.000 152.000 C 90.000 148.686 92.686 146.000 96.000 146.000 L 160.000 146.000 C 163.314 146.000 166.000 148.686 166.000 152.000 ZM 160.000 114.000 L 96.000 114.000 C 92.686 114.000 90.000 116.686 90.000 120.000 C 90.000 123.314 92.686 126.000 96.000 126.000 L 160.000 126.000 C 163.314 126.000 166.000 123.314 166.000 120.000 C 166.000 116.686 163.314 114.000 160.000 114.000 ZM 214.000 48.000 L 214.000 216.000 C 214.000 223.732 207.732 230.000 200.000 230.000 L 56.000 230.000 C 48.268 230.000 42.000 223.732 42.000 216.000 L 42.000 48.000 C 42.000 40.268 48.268 34.000 56.000 34.000 L 93.170 34.000 C 101.892 23.843 114.612 18.000 128.000 18.000 C 141.388 18.000 154.108 23.843 162.830 34.000 L 200.000 34.000 C 207.732 34.000 214.000 40.268 214.000 48.000 ZM 94.000 64.000 L 94.000 66.000 L 162.000 66.000 L 162.000 64.000 C 162.000 45.222 146.778 30.000 128.000 30.000 C 109.222 30.000 94.000 45.222 94.000 64.000 ZM 202.000 48.000 C 202.000 46.895 201.105 46.000 200.000 46.000 L 170.330 46.000 C 172.757 51.690 174.006 57.814 174.000 64.000 L 174.000 72.000 C 174.000 75.314 171.314 78.000 168.000 78.000 L 88.000 78.000 C 84.686 78.000 82.000 75.314 82.000 72.000 L 82.000 64.000 C 81.994 57.814 83.243 51.690 85.670 46.000 L 56.000 46.000 C 54.895 46.000 54.000 46.895 54.000 48.000 L 54.000 216.000 C 54.000 217.105 54.895 218.000 56.000 218.000 L 200.000 218.000 C 201.105 218.000 202.000 217.105 202.000 216.000 Z"),
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
        return _clipboardText!!
    }

private var _clipboardText: ImageVector? = null
