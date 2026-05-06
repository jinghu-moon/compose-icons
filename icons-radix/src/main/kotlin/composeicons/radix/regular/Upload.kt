package composeicons.radix.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.radix.RadixIcons
import composeicons.radix.radixIcon

val RadixIcons.Regular.Upload: ImageVector
    get() {
        if (_upload != null) return _upload!!
        _upload = radixIcon(
            name = "Upload",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 15f, height = 15f),
        ) {
            addPath(
                pathData = parseSvgPathData("M12.5 10c.276 0 .5 .224 .5 .5v1.5c-0 1.104-.894 2-1.999 2h-7.005C2.89 14 2 13.103 2 12v-1.5c0-.276 .224-.5 .5-.5 .276 0 .5 .224 .5 .5v1.5c0 .554 .446 1 .996 1h7.005c.552 0 .999-.447 .999-1v-1.5c0-.276 .224-.5 .5-.5ZM7.182 1.182c.176-.176 .461-.176 .637 0l3 3c.176 .176 .176 .461 0 .637-.176 .176-.461 .176-.637 0L7.95 2.586v6.914c-0 .248-.202 .449-.45 .449C7.252 9.949 7.05 9.749 7.05 9.5v-6.914L4.818 4.819c-.176 .176-.461 .176-.637 0-.176-.176-.176-.461 0-.637l3-3Z"),
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
        return _upload!!
    }

private var _upload: ImageVector? = null
