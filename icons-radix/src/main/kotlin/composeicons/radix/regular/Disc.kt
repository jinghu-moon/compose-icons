package composeicons.radix.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.radix.RadixIcons
import composeicons.radix.radixIcon

val RadixIcons.Regular.Disc: ImageVector
    get() {
        if (_disc != null) return _disc!!
        _disc = radixIcon(
            name = "Disc",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 15f, height = 15f),
        ) {
            addPath(
                pathData = parseSvgPathData("M7.499 .877c3.657 0 6.623 2.965 6.623 6.622 0 3.658-2.965 6.623-6.623 6.623C3.842 14.122 .877 11.156 .877 7.499 .877 3.842 3.842 .877 7.499 .877ZM7.499 1.826C4.367 1.827 1.827 4.367 1.826 7.499c0 3.133 2.54 5.672 5.673 5.673 3.133 0 5.673-2.54 5.673-5.673C13.172 4.366 10.632 1.826 7.499 1.826ZM7.687 5.688c.919 .093 1.637 .869 1.637 1.812l-.01 .187C9.22 8.606 8.444 9.323 7.5 9.323L7.314 9.314C6.456 9.226 5.775 8.544 5.688 7.687L5.678 7.5C5.678 6.494 6.494 5.678 7.5 5.678l.187 .01ZM7.5 6.628c-.482 0-.872 .39-.872 .872 0 .482 .39 .873 .872 .873 .482-0 .873-.391 .873-.873C8.373 7.018 7.982 6.628 7.5 6.628Z"),
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
        return _disc!!
    }

private var _disc: ImageVector? = null
