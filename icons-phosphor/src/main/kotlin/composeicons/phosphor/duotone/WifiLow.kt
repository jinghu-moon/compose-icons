package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.WifiLow: ImageVector
    get() {
        if (_wifiLow != null) return _wifiLow!!
        _wifiLow = phosphorDuotoneIcon(
            name = "WifiLow",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M171.68 167.88l-37.53 45.24c-1.52 1.827-3.773 2.884-6.15 2.884-2.377 0-4.63-1.057-6.15-2.884L84.32 167.88c25.269-21.179 62.091-21.179 87.36 0Z"),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color(0xFF000000)),
                fillAlpha = 0.2f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
            )
            addPath(
                pathData = parseSvgPathData("M247.89 80.91c-.506-4.291-2.732-8.193-6.17-10.81C209.036 45.237 169.066 31.846 128 32 86.934 31.846 46.964 45.237 14.28 70.1 10.842 72.717 8.616 76.619 8.11 80.91c-.508 4.282 .772 8.584 3.54 11.89L115.65 218.23c3.044 3.676 7.577 5.794 12.35 5.77h0c4.759 .012 9.275-2.104 12.31-5.77h0l104-125.43c2.782-3.3 4.077-7.603 3.58-11.89ZM128 208 95.9 169.3c19.6-12.412 44.6-12.412 64.2 0ZM170.37 156.92c-25.616-17.239-59.124-17.239-84.74 0L24.09 82.74C53.971 60.061 90.488 47.852 128 48c37.512-.148 74.029 12.061 103.91 34.74Z"),
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
        return _wifiLow!!
    }

private var _wifiLow: ImageVector? = null
