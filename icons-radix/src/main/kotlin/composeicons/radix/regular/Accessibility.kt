package composeicons.radix.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.radix.RadixIcons
import composeicons.radix.radixIcon

val RadixIcons.Regular.Accessibility: ImageVector
    get() {
        if (_accessibility != null) return _accessibility!!
        _accessibility = radixIcon(
            name = "Accessibility",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 15f, height = 15f),
        ) {
            addPath(
                pathData = parseSvgPathData("M7.499 .877c3.657 0 6.623 2.965 6.623 6.622 0 3.658-2.965 6.623-6.623 6.623C3.842 14.122 .877 11.156 .877 7.499 .878 3.842 3.842 .877 7.499 .877ZM7.499 1.826C4.367 1.827 1.827 4.367 1.826 7.499c0 3.133 2.54 5.672 5.673 5.673 3.133 0 5.673-2.54 5.673-5.673C13.172 4.366 10.632 1.826 7.499 1.826ZM10.453 5.311c.267-.071 .541 .087 .612 .354 .071 .267-.087 .541-.353 .612L8.746 6.803c0 0 0 .864 0 1.467 0 .603 .88 3.428 .88 3.428 .071 .267-.087 .541-.354 .612-.267 .071-.541-.087-.612-.353 0 0-.741-2.829-.792-2.956C7.82 8.873 7.65 8.873 7.65 8.873h-.307c-.006 0-.174 .002-.219 .127-.055 .129-.788 2.94-.793 2.959-.071 .267-.346 .425-.612 .354-.267-.072-.425-.346-.354-.612 .005-.017 .881-2.83 .881-3.431v-1.469L4.287 6.276C4.021 6.205 3.863 5.931 3.934 5.664c.071-.267 .346-.425 .612-.354 0 0 1.654 .562 2.3 .562h1.31c.643-0 2.283-.557 2.298-.562ZM7.5 2.87c.621 0 1.125 .504 1.125 1.125C8.625 4.616 8.122 5.12 7.5 5.12 6.879 5.12 6.375 4.616 6.375 3.995c0-.621 .504-1.125 1.125-1.125Z"),
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
        return _accessibility!!
    }

private var _accessibility: ImageVector? = null
