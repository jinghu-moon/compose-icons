package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Onigiri: ImageVector
    get() {
        if (_onigiri != null) return _onigiri!!
        _onigiri = phosphorBoldIcon(
            name = "Onigiri",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M235 144.51 179.13 48.65c-.051-.1-.107-.197-.17-.29C168.016 30.725 148.735 19.999 127.98 19.999 107.225 19.999 87.944 30.725 77 48.36c-.063 .093-.119 .19-.17 .29L21 144.51C9.584 163.025 9.083 186.268 19.689 205.258 30.296 224.248 50.349 236.01 72.1 236h111.8c21.751 .01 41.804-11.752 52.411-30.742C246.917 186.268 246.416 163.025 235 144.51ZM156 212h-56v-40h56ZM215.36 193.5c-6.279 11.49-18.367 18.598-31.46 18.5h-3.9v-44c0-11.046-8.954-20-20-20h-64c-11.046 0-20 8.954-20 20v44h-3.9c-13.07 .001-25.115-7.083-31.466-18.506C34.283 182.07 34.622 168.102 41.52 157l.17-.28L97.51 60.88c6.584-10.5 18.106-16.875 30.5-16.875 12.394 0 23.916 6.375 30.5 16.875l55.82 95.85 .17 .28c6.976 11.08 7.302 25.097 .85 36.49Z"),
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
        return _onigiri!!
    }

private var _onigiri: ImageVector? = null
