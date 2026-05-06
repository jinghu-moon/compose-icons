package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.CloudX: ImageVector
    get() {
        if (_cloudX != null) return _cloudX!!
        _cloudX = phosphorBoldIcon(
            name = "CloudX",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M160 36C126.166 36.016 95.066 54.584 79 84.36 54.005 81.778 29.623 93.19 15.595 114.038 1.567 134.886 .179 161.771 11.987 183.952 23.794 206.134 46.872 219.996 72 220h88c50.81 0 92-41.19 92-92C252 77.19 210.81 36 160 36ZM160 196h-88C47.699 196.503 27.593 177.211 27.09 152.91 26.587 128.609 45.879 108.503 70.18 108c-1.457 6.567-2.188 13.274-2.18 20 0 6.627 5.373 12 12 12 6.627 0 12-5.373 12-12C92 90.445 122.445 60 160 60c37.555 0 68 30.445 68 68 0 37.555-30.445 68-68 68ZM192.49 116.49 177 132l15.52 15.51c4.694 4.694 4.694 12.306 0 17-4.694 4.694-12.306 4.694-17 0L160 149l-15.51 15.52c-4.694 4.694-12.306 4.694-17 0-4.694-4.694-4.694-12.306 0-17L143 132 127.48 116.49c-4.694-4.694-4.694-12.306 0-17 4.694-4.694 12.306-4.694 17 0L160 115 175.51 99.48c4.694-4.694 12.306-4.694 17 0 4.694 4.694 4.694 12.306 0 17Z"),
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
        return _cloudX!!
    }

private var _cloudX: ImageVector? = null
