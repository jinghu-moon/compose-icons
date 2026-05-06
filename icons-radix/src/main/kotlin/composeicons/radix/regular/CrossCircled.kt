package composeicons.radix.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.radix.RadixIcons
import composeicons.radix.radixIcon

val RadixIcons.Regular.CrossCircled: ImageVector
    get() {
        if (_crossCircled != null) return _crossCircled!!
        _crossCircled = radixIcon(
            name = "CrossCircled",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 15f, height = 15f),
        ) {
            addPath(
                pathData = parseSvgPathData("M7.499 .877c3.657 0 6.623 2.965 6.623 6.622 0 3.658-2.965 6.623-6.623 6.623C3.842 14.122 .877 11.156 .877 7.499 .877 3.842 3.842 .877 7.499 .877ZM7.499 1.826C4.367 1.827 1.827 4.367 1.826 7.499c0 3.133 2.54 5.672 5.673 5.673 3.133 0 5.673-2.54 5.673-5.673C13.172 4.366 10.632 1.826 7.499 1.826ZM9.147 5.147c.195-.195 .512-.195 .707 0 .195 .195 .195 .512 0 .707L8.207 7.5 9.854 9.147l.064 .078c.128 .194 .106 .458-.064 .629-.171 .171-.435 .192-.629 .064L9.147 9.854 7.5 8.207 5.854 9.854c-.195 .195-.512 .195-.707 0-.195-.195-.195-.512 0-.707L6.793 7.5 5.147 5.854 5.082 5.775c-.128-.194-.106-.458 .064-.629 .171-.171 .435-.193 .629-.064l.078 .064L7.5 6.793 9.147 5.147Z"),
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
        return _crossCircled!!
    }

private var _crossCircled: ImageVector? = null
