package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Subtract: ImageVector
    get() {
        if (_subtract != null) return _subtract!!
        _subtract = phosphorFillIcon(
            name = "Subtract",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M174.63 81.35C167.243 41.632 131.402 13.654 91.078 16.129 50.755 18.604 18.604 50.755 16.129 91.078c-2.475 40.324 25.503 76.164 65.221 83.552 7.387 39.718 43.228 67.696 83.552 65.221 40.324-2.475 72.474-34.625 74.949-74.949C242.326 124.578 214.348 88.737 174.63 81.35ZM96 160C60.654 160 32 131.346 32 96 32 60.654 60.654 32 96 32c35.346 0 64 28.654 64 64-.039 35.33-28.67 63.961-64 64Z"),
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
        return _subtract!!
    }

private var _subtract: ImageVector? = null
