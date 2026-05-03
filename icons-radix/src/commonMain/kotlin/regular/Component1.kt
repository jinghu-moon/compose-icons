package composeicons.radix.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.radix.RadixIcons
import composeicons.radix.radixIcon

val RadixIcons.Regular.Component1: ImageVector
    get() {
        if (_component1 != null) return _component1!!
        _component1 = radixIcon(
            name = "Component1",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 15f, height = 15f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 7.224 8.607 C 7.418 8.479 7.682 8.501 7.853 8.672 L 10.328 11.146 C 10.524 11.341 10.523 11.658 10.328 11.853 L 7.853 14.329 C 7.658 14.524 7.341 14.524 7.146 14.329 L 4.671 11.853 L 4.607 11.775 C 4.479 11.581 4.500 11.317 4.671 11.146 L 7.146 8.672 L 7.224 8.607 ZM 5.732 11.500 L 7.499 13.267 L 9.267 11.500 L 7.499 9.732 L 5.732 11.500 ZM 3.224 4.607 C 3.418 4.479 3.682 4.501 3.853 4.672 L 6.329 7.146 C 6.524 7.341 6.523 7.658 6.329 7.853 L 3.853 10.329 C 3.658 10.524 3.341 10.524 3.146 10.329 L 0.671 7.853 L 0.607 7.776 C 0.479 7.582 0.500 7.317 0.671 7.146 L 3.146 4.672 L 3.224 4.607 ZM 11.224 4.607 C 11.418 4.479 11.682 4.501 11.853 4.672 L 14.328 7.146 C 14.524 7.341 14.523 7.658 14.328 7.853 L 11.853 10.329 C 11.658 10.524 11.341 10.524 11.146 10.329 L 8.671 7.853 L 8.607 7.775 C 8.479 7.581 8.500 7.317 8.671 7.146 L 11.146 4.672 L 11.224 4.607 ZM 1.732 7.500 L 3.499 9.268 L 5.267 7.500 L 3.499 5.732 L 1.732 7.500 ZM 9.732 7.500 L 11.499 9.267 L 13.267 7.500 L 11.499 5.732 L 9.732 7.500 ZM 7.224 0.607 C 7.418 0.479 7.682 0.501 7.853 0.672 L 10.328 3.146 C 10.524 3.341 10.523 3.658 10.328 3.853 L 7.853 6.329 C 7.658 6.524 7.341 6.524 7.146 6.329 L 4.671 3.853 L 4.607 3.775 C 4.479 3.581 4.500 3.317 4.671 3.146 L 7.146 0.672 L 7.224 0.607 ZM 5.732 3.500 L 7.499 5.267 L 9.267 3.500 L 7.499 1.732 L 5.732 3.500 Z"),
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
        return _component1!!
    }

private var _component1: ImageVector? = null
