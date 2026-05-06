package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Crane: ImageVector
    get() {
        if (_crane != null) return _crane!!
        _crane = phosphorFillIcon(
            name = "Crane",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M228.12 17.14c-2.409-1.446-5.4-1.522-7.88-.2L102 80h-70C23.163 80 16 87.163 16 96v104c0 8.837 7.163 16 16 16h88c8.837 0 16-7.163 16-16v-32c-.001-.351-.028-.702-.08-1.05v-.24c-.055-.337-.129-.671-.22-1 .005-.016 .005-.034 0-.05h0c-.001-.023-.001-.047 0-.07L113.54 92 216 37.33v122.67h-16v-8c0-4.418-3.582-8-8-8-4.418 0-8 3.582-8 8v8c0 8.837 7.163 16 16 16h16c8.837 0 16-7.163 16-16v-136c.001-2.809-1.472-5.413-3.88-6.86ZM48 96v64h-16v-64ZM32 200h0v-24h88v24Z"),
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
        return _crane!!
    }

private var _crane: ImageVector? = null
