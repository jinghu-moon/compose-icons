package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.Rainbow: ImageVector
    get() {
        if (_rainbow != null) return _rainbow!!
        _rainbow = phosphorRegularIcon(
            name = "Rainbow",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 184.000 168.000 L 184.000 184.000 C 184.000 188.418 180.418 192.000 176.000 192.000 C 171.582 192.000 168.000 188.418 168.000 184.000 L 168.000 168.000 C 168.000 145.909 150.091 128.000 128.000 128.000 C 105.909 128.000 88.000 145.909 88.000 168.000 L 88.000 184.000 C 88.000 188.418 84.418 192.000 80.000 192.000 C 75.582 192.000 72.000 188.418 72.000 184.000 L 72.000 168.000 C 72.000 137.072 97.072 112.000 128.000 112.000 C 158.928 112.000 184.000 137.072 184.000 168.000 ZM 128.000 80.000 C 79.422 80.055 40.055 119.422 40.000 168.000 L 40.000 184.000 C 40.000 188.418 43.582 192.000 48.000 192.000 C 52.418 192.000 56.000 188.418 56.000 184.000 L 56.000 168.000 C 56.000 128.236 88.235 96.000 128.000 96.000 C 167.764 96.000 200.000 128.236 200.000 168.000 L 200.000 184.000 C 200.000 188.418 203.582 192.000 208.000 192.000 C 212.418 192.000 216.000 188.418 216.000 184.000 L 216.000 168.000 C 215.945 119.422 176.578 80.055 128.000 80.000 ZM 128.000 48.000 C 61.756 48.072 8.072 101.756 8.000 168.000 L 8.000 184.000 C 8.000 188.418 11.582 192.000 16.000 192.000 C 20.418 192.000 24.000 188.418 24.000 184.000 L 24.000 168.000 C 24.000 110.562 70.562 64.000 128.000 64.000 C 185.438 64.000 232.000 110.562 232.000 168.000 L 232.000 184.000 C 232.000 188.418 235.582 192.000 240.000 192.000 C 244.418 192.000 248.000 188.418 248.000 184.000 L 248.000 168.000 C 247.928 101.756 194.244 48.072 128.000 48.000 Z"),
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
        return _rainbow!!
    }

private var _rainbow: ImageVector? = null
