package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Checks: ImageVector
    get() {
        if (_checks != null) return _checks!!
        _checks = phosphorLightIcon(
            name = "Checks",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M148.2 84.28l-89.6 88c-2.333 2.287-6.067 2.287-8.4 0L11.8 134.57c-2.367-2.32-2.405-6.118-.085-8.485 2.32-2.367 6.118-2.405 8.485-.085l34.2 33.58L139.8 75.71c1.512-1.588 3.769-2.225 5.887-1.661 2.119 .563 3.761 2.237 4.285 4.366 .523 2.129-.156 4.374-1.772 5.855ZM244.28 75.8c-2.32-2.362-6.115-2.398-8.48-.08l-85.4 83.87L130.17 139.72c-2.364-2.322-6.163-2.289-8.485 .075-2.322 2.364-2.289 6.163 .075 8.485l24.44 24c2.333 2.287 6.067 2.287 8.4 0l89.6-88c2.362-2.32 2.398-6.115 .08-8.48Z"),
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
        return _checks!!
    }

private var _checks: ImageVector? = null
