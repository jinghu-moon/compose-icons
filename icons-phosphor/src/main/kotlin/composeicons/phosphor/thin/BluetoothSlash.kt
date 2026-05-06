package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.BluetoothSlash: ImageVector
    get() {
        if (_bluetoothSlash != null) return _bluetoothSlash!!
        _bluetoothSlash = phosphorThinIcon(
            name = "BluetoothSlash",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M219 213.31 59 37.31C57.514 35.653 54.967 35.514 53.31 37c-1.657 1.486-1.796 4.033-.31 5.69l74 81.42h-.14c-.173 .051-.343 .111-.51 .18l-.15 .06h-.05c-.196 .101-.383 .218-.56 .35h-.05l-64 48c-1.767 1.325-2.125 3.833-.8 5.6 1.325 1.767 3.833 2.125 5.6 .8L124 136v88c-.001 1.516 .855 2.902 2.21 3.58 .557 .275 1.169 .419 1.79 .42 .865 0 1.708-.281 2.4-.8l53.74-40.3L213 218.69c.956 1.078 2.417 1.558 3.826 1.258 1.409-.3 2.547-1.335 2.981-2.709 .433-1.374 .095-2.874-.887-3.929ZM132 216v-80l18.44 13.83L178.73 181ZM124 71.63v-39.63c0-1.515 .856-2.9 2.211-3.578 1.355-.678 2.977-.531 4.189 .378l64 48c1.007 .755 1.6 1.941 1.6 3.2 0 1.259-.593 2.445-1.6 3.2l-33.53 25.15c-.692 .519-1.535 .8-2.4 .8-1.722 0-3.25-1.102-3.795-2.735-.544-1.633 .017-3.432 1.395-4.465l29.26-22L132 40v31.63c0 2.209-1.791 4-4 4-2.209 0-4-1.791-4-4Z"),
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
        return _bluetoothSlash!!
    }

private var _bluetoothSlash: ImageVector? = null
