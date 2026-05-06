package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.Subtract: ImageVector
    get() {
        if (_subtract != null) return _subtract!!
        _subtract = phosphorDuotoneIcon(
            name = "Subtract",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M232 160c.011 38.294-29.954 69.897-68.195 71.92C125.565 233.944 92.431 205.681 88.4 167.6h0c2.525 .265 5.061 .398 7.6 .4 39.764 0 72-32.236 72-72-.002-2.539-.135-5.075-.4-7.6h0C204.218 92.287 232.001 123.177 232 160Z"),
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
                pathData = parseSvgPathData("M174.63 81.35C167.243 41.632 131.402 13.654 91.078 16.129 50.755 18.604 18.604 50.755 16.129 91.078c-2.475 40.324 25.503 76.164 65.221 83.552 7.387 39.718 43.228 67.696 83.552 65.221 40.324-2.475 72.474-34.625 74.949-74.949C242.326 124.578 214.348 88.737 174.63 81.35ZM32 96C32 60.654 60.654 32 96 32c35.346 0 64 28.654 64 64 0 35.346-28.654 64-64 64C60.67 159.961 32.039 131.33 32 96ZM160 224c-29.219 .082-54.761-19.692-62-48 42.619-1.088 76.912-35.381 78-78 31.268 8.006 51.682 38.042 47.616 70.062C219.55 200.082 192.277 224.064 160 224Z"),
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
