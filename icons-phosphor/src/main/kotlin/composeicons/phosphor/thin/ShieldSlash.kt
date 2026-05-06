package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.ShieldSlash: ImageVector
    get() {
        if (_shieldSlash != null) return _shieldSlash!!
        _shieldSlash = phosphorThinIcon(
            name = "ShieldSlash",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M51 37.31C49.514 35.653 46.967 35.514 45.31 37c-1.657 1.486-1.796 4.033-.31 5.69l1.31 1.44C40.399 44.971 36.005 50.029 36 56v56c0 51.16 24.73 82.12 45.47 99.1 22.4 18.32 44.55 24.5 45.48 24.76 .688 .187 1.412 .187 2.1 0 1.37-.37 32.56-9.14 58.23-36.71L205 218.69c.956 1.078 2.417 1.558 3.826 1.258 1.409-.3 2.547-1.335 2.981-2.709 .433-1.374 .095-2.874-.887-3.929ZM128 227.82C112.811 222.708 98.678 214.877 86.29 204.71 58.23 181.63 44 150.44 44 112v-56c0-2.209 1.791-4 4-4h5.5L181.88 193.21C160.23 216.7 133.58 226.06 128 227.82ZM220 56v56c0 20-3.77 38.49-11.2 54.94-.646 1.437-2.075 2.361-3.65 2.36-.569-.003-1.131-.126-1.65-.36-2.013-.909-2.908-3.277-2-5.29 7-15.41 10.49-32.79 10.49-51.65v-56c0-2.209-1.791-4-4-4h-109.47c-2.209 0-4-1.791-4-4 0-2.209 1.791-4 4-4h109.48c6.627 0 12 5.373 12 12Z"),
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
        return _shieldSlash!!
    }

private var _shieldSlash: ImageVector? = null
