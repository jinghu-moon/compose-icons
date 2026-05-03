package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Clipboard: ImageVector
    get() {
        if (_clipboard != null) return _clipboard!!
        _clipboard = phosphorLightIcon(
            name = "Clipboard",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 200.000 34.000 L 162.830 34.000 C 154.108 23.843 141.388 18.000 128.000 18.000 C 114.612 18.000 101.892 23.843 93.170 34.000 L 56.000 34.000 C 48.268 34.000 42.000 40.268 42.000 48.000 L 42.000 216.000 C 42.000 223.732 48.268 230.000 56.000 230.000 L 200.000 230.000 C 207.732 230.000 214.000 223.732 214.000 216.000 L 214.000 48.000 C 214.000 40.268 207.732 34.000 200.000 34.000 ZM 128.000 30.000 C 146.778 30.000 162.000 45.222 162.000 64.000 L 162.000 66.000 L 94.000 66.000 L 94.000 64.000 C 94.000 45.222 109.222 30.000 128.000 30.000 ZM 202.000 216.000 C 202.000 217.105 201.105 218.000 200.000 218.000 L 56.000 218.000 C 54.895 218.000 54.000 217.105 54.000 216.000 L 54.000 48.000 C 54.000 46.895 54.895 46.000 56.000 46.000 L 85.670 46.000 C 83.243 51.690 81.994 57.814 82.000 64.000 L 82.000 72.000 C 82.000 75.314 84.686 78.000 88.000 78.000 L 168.000 78.000 C 171.314 78.000 174.000 75.314 174.000 72.000 L 174.000 64.000 C 174.006 57.814 172.757 51.690 170.330 46.000 L 200.000 46.000 C 201.105 46.000 202.000 46.895 202.000 48.000 Z"),
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
