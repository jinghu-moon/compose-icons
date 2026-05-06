package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.FlowArrow: ImageVector
    get() {
        if (_flowArrow != null) return _flowArrow!!
        _flowArrow = phosphorFillIcon(
            name = "FlowArrow",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M245.66 85.66l-32 32c-3.126 3.126-8.194 3.126-11.32 0-3.126-3.126-3.126-8.194 0-11.32L220.69 88h-12.69c-38.67 0-46.59 19-56.62 43.08C141.05 155.88 129.33 184 80 184h-1c-4.029 15.602-19.03 25.775-35.016 23.745C27.998 205.714 16.016 192.114 16.016 176c0-16.114 11.982-29.714 27.968-31.745C59.97 142.225 74.971 152.398 79 168h1c38.67 0 46.59-19 56.62-43.08C147 100.12 158.67 72 208 72h12.69L202.34 53.66c-3.126-3.126-3.126-8.194 0-11.32 3.126-3.126 8.194-3.126 11.32 0l32 32c1.502 1.501 2.346 3.537 2.346 5.66 0 2.123-.844 4.159-2.346 5.66Z"),
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
        return _flowArrow!!
    }

private var _flowArrow: ImageVector? = null
