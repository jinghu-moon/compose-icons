package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Webcam: ImageVector
    get() {
        if (_webcam != null) return _webcam!!
        _webcam = phosphorBoldIcon(
            name = "Webcam",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 168.000 104.000 C 168.000 81.909 150.091 64.000 128.000 64.000 C 105.909 64.000 88.000 81.909 88.000 104.000 C 88.000 126.091 105.909 144.000 128.000 144.000 C 150.091 144.000 168.000 126.091 168.000 104.000 ZM 112.000 104.000 C 112.000 95.163 119.163 88.000 128.000 88.000 C 136.837 88.000 144.000 95.163 144.000 104.000 C 144.000 112.837 136.837 120.000 128.000 120.000 C 119.163 120.000 112.000 112.837 112.000 104.000 ZM 224.000 196.000 L 140.000 196.000 L 140.000 187.130 C 183.606 180.836 214.939 141.921 211.784 97.976 C 208.629 54.031 172.058 19.992 128.000 19.992 C 83.942 19.992 47.371 54.031 44.216 97.976 C 41.061 141.921 72.394 180.836 116.000 187.130 L 116.000 196.000 L 32.000 196.000 C 25.373 196.000 20.000 201.373 20.000 208.000 C 20.000 214.627 25.373 220.000 32.000 220.000 L 224.000 220.000 C 230.627 220.000 236.000 214.627 236.000 208.000 C 236.000 201.373 230.627 196.000 224.000 196.000 ZM 68.000 104.000 C 68.000 70.863 94.863 44.000 128.000 44.000 C 161.137 44.000 188.000 70.863 188.000 104.000 C 188.000 137.137 161.137 164.000 128.000 164.000 C 94.879 163.961 68.039 137.121 68.000 104.000 Z"),
        pathFillType = PathFillType.NonZero,
        fill = SolidColor(Color(0xFF000000)),
        fillAlpha = 1.0f,
        stroke = null,
        strokeAlpha = 1.0f,
        strokeLineWidth = 0.0f,
        strokeLineCap = StrokeCap.Butt,
        strokeLineJoin = StrokeJoin.Miter,
    )
        }
        return _webcam!!
    }

private var _webcam: ImageVector? = null
