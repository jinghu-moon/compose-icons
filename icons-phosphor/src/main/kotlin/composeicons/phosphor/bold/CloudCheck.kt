package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.CloudCheck: ImageVector
    get() {
        if (_cloudCheck != null) return _cloudCheck!!
        _cloudCheck = phosphorBoldIcon(
            name = "CloudCheck",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M160 36C126.166 36.016 95.066 54.584 79 84.36 54.005 81.778 29.623 93.19 15.595 114.038 1.567 134.886 .179 161.771 11.987 183.952 23.794 206.134 46.872 219.996 72 220h88c50.81 0 92-41.19 92-92C252 77.19 210.81 36 160 36ZM160 196h-88C47.699 196.503 27.593 177.211 27.09 152.91 26.587 128.609 45.879 108.503 70.18 108c-1.457 6.567-2.188 13.274-2.18 20 0 6.627 5.373 12 12 12 6.627 0 12-5.373 12-12C92 90.445 122.445 60 160 60c37.555 0 68 30.445 68 68 0 37.555-30.445 68-68 68ZM200.49 103.51c2.259 2.252 3.529 5.31 3.529 8.5 0 3.19-1.27 6.248-3.529 8.5l-48 48c-2.252 2.259-5.31 3.529-8.5 3.529-3.19 0-6.248-1.27-8.5-3.529l-24-24c-4.694-4.694-4.694-12.306 0-17 4.694-4.694 12.306-4.694 17 0L144 143l39.51-39.52c2.255-2.249 5.311-3.51 8.496-3.504 3.185 .006 6.237 1.277 8.484 3.534Z"),
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
        return _cloudCheck!!
    }

private var _cloudCheck: ImageVector? = null
