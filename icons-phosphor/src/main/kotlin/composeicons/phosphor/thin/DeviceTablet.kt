package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.DeviceTablet: ImageVector
    get() {
        if (_deviceTablet != null) return _deviceTablet!!
        _deviceTablet = phosphorThinIcon(
            name = "DeviceTablet",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M192 28h-128C52.954 28 44 36.954 44 48v160c0 11.046 8.954 20 20 20h128c11.046 0 20-8.954 20-20v-160C212 36.954 203.046 28 192 28ZM52 68h152v120h-152ZM64 36h128c6.627 0 12 5.373 12 12v12h-152v-12C52 41.373 57.373 36 64 36ZM192 220h-128c-6.627 0-12-5.373-12-12v-12h152v12c0 6.627-5.373 12-12 12Z"),
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
        return _deviceTablet!!
    }

private var _deviceTablet: ImageVector? = null
