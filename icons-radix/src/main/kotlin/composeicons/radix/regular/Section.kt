package composeicons.radix.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.radix.RadixIcons
import composeicons.radix.radixIcon

val RadixIcons.Regular.Section: ImageVector
    get() {
        if (_section != null) return _section!!
        _section = radixIcon(
            name = "Section",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 15f, height = 15f),
        ) {
            addPath(
                pathData = parseSvgPathData("M1.5 13c.276 0 .5 .224 .5 .5C2 13.776 1.776 14 1.5 14 1.224 14 1 13.776 1 13.5 1 13.224 1.224 13 1.5 13ZM3.5 13c.276 0 .5 .224 .5 .5C4 13.776 3.776 14 3.5 14 3.224 14 3 13.776 3 13.5 3 13.224 3.224 13 3.5 13ZM5.5 13c.276 0 .5 .224 .5 .5C6 13.776 5.776 14 5.5 14 5.224 14 5 13.776 5 13.5 5 13.224 5.224 13 5.5 13ZM7.5 13c.276 0 .5 .224 .5 .5C8 13.776 7.776 14 7.5 14 7.224 14 7 13.776 7 13.5 7 13.224 7.224 13 7.5 13ZM9.5 13c.276 0 .5 .224 .5 .5 0 .276-.224 .5-.5 .5C9.224 14 9 13.776 9 13.5 9 13.224 9.224 13 9.5 13ZM11.5 13c.276 0 .5 .224 .5 .5 0 .276-.224 .5-.5 .5C11.224 14 11 13.776 11 13.5c0-.276 .224-.5 .5-.5ZM13.5 13c.276 0 .5 .224 .5 .5 0 .276-.224 .5-.5 .5C13.224 14 13 13.776 13 13.5c0-.276 .224-.5 .5-.5ZM13.102 4.005C13.607 4.056 14 4.482 14 5v5l-.005 .102c-.048 .47-.422 .845-.893 .893L13 11h-11l-.103-.005c-.47-.048-.845-.422-.893-.893L1 10v-5c0-.518 .393-.944 .897-.995L2 4h11l.102 .005ZM2 10h11v-5h-11v5ZM1.5 1C1.776 1 2 1.224 2 1.5 2 1.776 1.776 2 1.5 2 1.224 2 1 1.776 1 1.5 1 1.224 1.224 1 1.5 1ZM3.5 1C3.776 1 4 1.224 4 1.5 4 1.776 3.776 2 3.5 2 3.224 2 3 1.776 3 1.5 3 1.224 3.224 1 3.5 1ZM5.5 1C5.776 1 6 1.224 6 1.5 6 1.776 5.776 2 5.5 2 5.224 2 5 1.776 5 1.5 5 1.224 5.224 1 5.5 1ZM7.5 1C7.776 1 8 1.224 8 1.5 8 1.776 7.776 2 7.5 2 7.224 2 7 1.776 7 1.5 7 1.224 7.224 1 7.5 1ZM9.5 1c.276 0 .5 .224 .5 .5C10 1.776 9.776 2 9.5 2 9.224 2 9 1.776 9 1.5 9 1.224 9.224 1 9.5 1ZM11.5 1c.276 0 .5 .224 .5 .5C12 1.776 11.776 2 11.5 2 11.224 2 11 1.776 11 1.5 11 1.224 11.224 1 11.5 1ZM13.5 1c.276 0 .5 .224 .5 .5C14 1.776 13.776 2 13.5 2 13.224 2 13 1.776 13 1.5 13 1.224 13.224 1 13.5 1Z"),
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
        return _section!!
    }

private var _section: ImageVector? = null
