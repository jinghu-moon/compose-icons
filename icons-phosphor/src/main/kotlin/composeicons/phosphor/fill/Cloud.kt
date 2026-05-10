package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Cloud: ImageVector
    get() {
        if (_cloud != null) return _cloud!!
        _cloud = phosphorFillIcon(
            name = "Cloud",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M160.06 40C126.707 40.005 96.217 58.844 81.29 88.67h0C75.207 100.794 72.027 114.166 72 127.73c.065 4.275-3.173 7.879-7.43 8.27-2.219 .158-4.403-.614-6.029-2.132C56.915 132.351 55.994 130.224 56 128c-.008-11.19 1.795-22.307 5.34-32.92 .476-1.386 .155-2.922-.835-4.002-.991-1.08-2.493-1.532-3.915-1.178C28.069 97.009 8.04 122.607 8 152c0 35.19 29.75 64 65 64h87c23.935-.026 46.828-9.79 63.414-27.045 16.586-17.256 25.437-40.518 24.516-64.435C246.11 77.54 207.07 40 160.06 40Z"),
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
        return _cloud!!
    }

private var _cloud: ImageVector? = null
