package composeicons.radix.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.radix.RadixIcons
import composeicons.radix.radixIcon

val RadixIcons.Regular.Container: ImageVector
    get() {
        if (_container != null) return _container!!
        _container = radixIcon(
            name = "Container",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 15f, height = 15f),
        ) {
            addPath(
                pathData = parseSvgPathData("M1.5 13c.276 0 .5 .224 .5 .5C2 13.776 1.776 14 1.5 14 1.224 14 1 13.776 1 13.5 1 13.224 1.224 13 1.5 13ZM10.102 1.005c.47 .048 .845 .422 .893 .893L11 2v11l-.005 .102c-.048 .47-.422 .845-.893 .893L10 14h-5c-.518 0-.944-.393-.995-.898L4 13v-11l.005-.103C4.056 1.393 4.482 1 5 1h5l.102 .005ZM13.5 13c.276 0 .5 .224 .5 .5 0 .276-.224 .5-.5 .5C13.224 14 13 13.776 13 13.5c0-.276 .224-.5 .5-.5ZM5 13h5v-11h-5v11ZM1.5 11c.276 0 .5 .224 .5 .5C2 11.776 1.776 12 1.5 12 1.224 12 1 11.776 1 11.5 1 11.224 1.224 11 1.5 11ZM13.5 11c.276 0 .5 .224 .5 .5 0 .276-.224 .5-.5 .5C13.224 12 13 11.776 13 11.5c0-.276 .224-.5 .5-.5ZM1.5 9C1.776 9 2 9.224 2 9.5 2 9.776 1.776 10 1.5 10 1.224 10 1 9.776 1 9.5 1 9.224 1.224 9 1.5 9ZM13.5 9c.276 0 .5 .224 .5 .5 0 .276-.224 .5-.5 .5C13.224 10 13 9.776 13 9.5 13 9.224 13.224 9 13.5 9ZM1.5 7C1.776 7 2 7.224 2 7.5 2 7.776 1.776 8 1.5 8 1.224 8 1 7.776 1 7.5 1 7.224 1.224 7 1.5 7ZM13.5 7c.276 0 .5 .224 .5 .5C14 7.776 13.776 8 13.5 8 13.224 8 13 7.776 13 7.5 13 7.224 13.224 7 13.5 7ZM1.5 5C1.776 5 2 5.224 2 5.5 2 5.776 1.776 6 1.5 6 1.224 6 1 5.776 1 5.5 1 5.224 1.224 5 1.5 5ZM13.5 5c.276 0 .5 .224 .5 .5C14 5.776 13.776 6 13.5 6 13.224 6 13 5.776 13 5.5 13 5.224 13.224 5 13.5 5ZM1.5 3C1.776 3 2 3.224 2 3.5 2 3.776 1.776 4 1.5 4 1.224 4 1 3.776 1 3.5 1 3.224 1.224 3 1.5 3ZM13.5 3c.276 0 .5 .224 .5 .5C14 3.776 13.776 4 13.5 4 13.224 4 13 3.776 13 3.5 13 3.224 13.224 3 13.5 3ZM1.5 1C1.776 1 2 1.224 2 1.5 2 1.776 1.776 2 1.5 2 1.224 2 1 1.776 1 1.5 1 1.224 1.224 1 1.5 1ZM13.5 1c.276 0 .5 .224 .5 .5C14 1.776 13.776 2 13.5 2 13.224 2 13 1.776 13 1.5 13 1.224 13.224 1 13.5 1Z"),
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
        return _container!!
    }

private var _container: ImageVector? = null
