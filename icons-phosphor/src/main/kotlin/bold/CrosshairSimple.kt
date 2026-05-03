package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.CrosshairSimple: ImageVector
    get() {
        if (_crosshairSimple != null) return _crosshairSimple!!
        _crosshairSimple = phosphorBoldIcon(
            name = "CrosshairSimple",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 128.000 20.000 C 68.353 20.000 20.000 68.353 20.000 128.000 C 20.000 187.647 68.353 236.000 128.000 236.000 C 187.647 236.000 236.000 187.647 236.000 128.000 C 235.934 68.381 187.619 20.066 128.000 20.000 ZM 140.000 211.130 L 140.000 184.000 C 140.000 177.373 134.627 172.000 128.000 172.000 C 121.373 172.000 116.000 177.373 116.000 184.000 L 116.000 211.130 C 79.173 205.751 50.249 176.827 44.870 140.000 L 72.000 140.000 C 78.627 140.000 84.000 134.627 84.000 128.000 C 84.000 121.373 78.627 116.000 72.000 116.000 L 44.870 116.000 C 50.249 79.173 79.173 50.249 116.000 44.870 L 116.000 72.000 C 116.000 78.627 121.373 84.000 128.000 84.000 C 134.627 84.000 140.000 78.627 140.000 72.000 L 140.000 44.870 C 176.827 50.249 205.751 79.173 211.130 116.000 L 184.000 116.000 C 177.373 116.000 172.000 121.373 172.000 128.000 C 172.000 134.627 177.373 140.000 184.000 140.000 L 211.130 140.000 C 205.751 176.827 176.827 205.751 140.000 211.130 Z"),
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
        return _crosshairSimple!!
    }

private var _crosshairSimple: ImageVector? = null
