package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.ContactlessPayment: ImageVector
    get() {
        if (_contactlessPayment != null) return _contactlessPayment!!
        _contactlessPayment = phosphorLightIcon(
            name = "ContactlessPayment",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M95.31 101.2c8.859 16.768 8.859 36.832 0 53.6-1.546 2.933-5.177 4.056-8.11 2.51-2.933-1.546-4.056-5.177-2.51-8.11 7.12-13.237 7.12-29.163 0-42.4-1.546-2.933-.423-6.564 2.51-8.11 2.933-1.546 6.564-.423 8.11 2.51ZM143.17 66.71c-2.921 1.563-4.023 5.198-2.46 8.12 17.78 33.217 17.78 73.123 0 106.34-1.047 1.893-.994 4.204 .14 6.047 1.133 1.843 3.171 2.933 5.333 2.853 2.162-.08 4.114-1.318 5.107-3.24 19.675-36.753 19.675-80.908 0-117.66-1.563-2.921-5.198-4.023-8.12-2.46ZM115.17 82.71c-1.406 .747-2.458 2.023-2.923 3.546-.465 1.523-.306 3.169 .443 4.574 12.395 23.237 12.395 51.123 0 74.36-1.557 2.927-.447 6.563 2.48 8.12 2.927 1.557 6.563 .447 8.12-2.48 14.272-26.763 14.272-58.877 0-85.64-1.552-2.927-5.183-4.041-8.11-2.49ZM230 128c0 56.333-45.667 102-102 102C71.667 230 26 184.333 26 128 26 71.667 71.667 26 128 26c56.306 .066 101.934 45.694 102 102ZM218 128C218 78.294 177.706 38 128 38 78.294 38 38 78.294 38 128c0 49.706 40.294 90 90 90 49.683-.055 89.945-40.317 90-90Z"),
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
        return _contactlessPayment!!
    }

private var _contactlessPayment: ImageVector? = null
