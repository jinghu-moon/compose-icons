package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.BluetoothX: ImageVector
    get() {
        if (_bluetoothX != null) return _bluetoothX!!
        _bluetoothX = phosphorFillIcon(
            name = "BluetoothX",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M184 176c0 2.518-1.186 4.889-3.2 6.4l-64 48C115.415 231.439 113.731 232 112 232c-1.449 .004-2.87-.39-4.11-1.14-2.47-1.543-3.95-4.268-3.9-7.18v-79.68L52.76 182.4c-3.515 2.635-8.496 1.943-11.16-1.55-2.615-3.664-1.814-8.747 1.8-11.43L98.66 128 43.38 86.57C39.921 84.044 38.993 79.28 41.25 75.64c1.214-1.852 3.14-3.117 5.321-3.496 2.181-.379 4.422 .163 6.189 1.496L104 112v-79.76c-.041-2.428 .996-4.749 2.83-6.34 2.852-2.429 7.008-2.554 10-.3l33.62 25.2c.988 .766 1.562 1.95 1.55 3.2v52c0 1.259-.593 2.445-1.6 3.2L125.34 128l55.5 41.6c1.999 1.519 3.169 3.889 3.16 6.4ZM237.47 98.13 219.37 80 237.48 61.89c3.166-3.066 3.347-8.084 .41-11.37-1.482-1.579-3.541-2.489-5.707-2.523-2.165-.034-4.252 .812-5.783 2.343L208.05 68.69 189.93 50.58c-2.876-2.973-7.512-3.35-10.83-.88-1.819 1.411-2.941 3.537-3.081 5.835-.14 2.298 .717 4.544 2.351 6.165L196.73 80 178.58 98.13c-3.06 2.979-3.321 7.808-.6 11.1 1.453 1.682 3.54 2.684 5.761 2.766 2.221 .082 4.376-.765 5.949-2.336L208.05 91.31l18.35 18.35c1.573 1.575 3.73 2.423 5.954 2.341 2.224-.082 4.313-1.086 5.766-2.771 2.714-3.296 2.448-8.121-.61-11.1Z"),
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
        return _bluetoothX!!
    }

private var _bluetoothX: ImageVector? = null
