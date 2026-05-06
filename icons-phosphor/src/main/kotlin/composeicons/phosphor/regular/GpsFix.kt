package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.GpsFix: ImageVector
    get() {
        if (_gpsFix != null) return _gpsFix!!
        _gpsFix = phosphorRegularIcon(
            name = "GpsFix",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M240 120h-24.37C211.718 77.748 178.252 44.282 136 40.37v-24.37c0-4.418-3.582-8-8-8-4.418 0-8 3.582-8 8v24.37C77.748 44.282 44.282 77.748 40.37 120h-24.37c-4.418 0-8 3.582-8 8 0 4.418 3.582 8 8 8h24.37c3.912 42.252 37.378 75.718 79.63 79.63v24.37c0 4.418 3.582 8 8 8 4.418 0 8-3.582 8-8v-24.37c42.252-3.912 75.718-37.378 79.63-79.63h24.37c4.418 0 8-3.582 8-8 0-4.418-3.582-8-8-8ZM128 200C88.235 200 56 167.764 56 128 56 88.235 88.235 56 128 56c39.764 0 72 32.235 72 72-.044 39.746-32.254 71.956-72 72ZM128 88c-22.091 0-40 17.909-40 40 0 22.091 17.909 40 40 40 22.091 0 40-17.909 40-40C168 105.909 150.091 88 128 88ZM128 152c-13.255 0-24-10.745-24-24 0-13.255 10.745-24 24-24 13.255 0 24 10.745 24 24 0 13.255-10.745 24-24 24Z"),
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
        return _gpsFix!!
    }

private var _gpsFix: ImageVector? = null
