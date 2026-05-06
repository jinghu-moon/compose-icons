package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.WifiHigh: ImageVector
    get() {
        if (_wifiHigh != null) return _wifiHigh!!
        _wifiHigh = phosphorThinIcon(
            name = "WifiHigh",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M136 204c0 4.418-3.582 8-8 8-4.418 0-8-3.582-8-8 0-4.418 3.582-8 8-8 4.418 0 8 3.582 8 8ZM234.54 90.1C172.598 39.296 83.402 39.296 21.46 90.1c-1.111 .905-1.653 2.336-1.42 3.75 .233 1.414 1.204 2.596 2.546 3.098 1.342 .502 2.851 .247 3.954-.668 58.99-48.377 143.93-48.377 202.92 0 1.707 1.391 4.218 1.14 5.617-.561 1.399-1.701 1.159-4.213-.537-5.619ZM202.48 125.91C158.829 91.341 97.131 91.341 53.48 125.91c-1.731 1.381-2.016 3.904-.635 5.635 1.381 1.731 3.904 2.016 5.635 .635 40.729-32.229 98.271-32.229 139 0 1.731 1.381 4.254 1.096 5.635-.635 1.381-1.731 1.096-4.254-.635-5.635ZM170.35 161.77c-25.248-18.363-59.452-18.363-84.7 0-1.241 .806-1.935 2.231-1.805 3.705 .13 1.474 1.062 2.756 2.425 3.333 1.362 .577 2.932 .355 4.081-.578 22.452-16.306 52.848-16.306 75.3 0 1.782 1.297 4.277 .908 5.58-.87 .625-.858 .883-1.929 .718-2.977-.165-1.048-.74-1.988-1.598-2.613Z"),
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
        return _wifiHigh!!
    }

private var _wifiHigh: ImageVector? = null
