package composeicons.radix.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.radix.RadixIcons
import composeicons.radix.radixIcon

val RadixIcons.Regular.Download: ImageVector
    get() {
        if (_download != null) return _download!!
        _download = radixIcon(
            name = "Download",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 15f, height = 15f),
        ) {
            addPath(
                pathData = parseSvgPathData("M12.5 10c.276 0 .5 .224 .5 .5v1.5c-0 1.104-.894 2-1.999 2h-7.005C2.89 14 2 13.103 2 12v-1.5c0-.276 .224-.5 .5-.5 .276 0 .5 .224 .5 .5v1.5c0 .554 .446 1 .996 1h7.005c.552 0 .999-.447 .999-1v-1.5c0-.276 .224-.5 .5-.5ZM7.5 1.05c.249 0 .45 .202 .45 .45v6.913L10.182 6.182c.176-.176 .461-.176 .637 0 .176 .176 .176 .461 0 .637L7.818 9.819c-.176 .176-.461 .176-.637 0l-3-3c-.176-.176-.176-.461 0-.637 .176-.176 .461-.176 .637 0L7.05 8.413v-6.913c0-.249 .202-.45 .45-.45Z"),
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
        return _download!!
    }

private var _download: ImageVector? = null
