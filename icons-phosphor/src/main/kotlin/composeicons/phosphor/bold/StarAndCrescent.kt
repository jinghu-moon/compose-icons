package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.StarAndCrescent: ImageVector
    get() {
        if (_starAndCrescent != null) return _starAndCrescent!!
        _starAndCrescent = phosphorBoldIcon(
            name = "StarAndCrescent",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M157.46 195.72C131.992 182.747 115.956 156.582 115.956 128c0-28.582 16.036-54.747 41.504-67.72 4.013-2.051 6.538-6.178 6.538-10.685 0-4.507-2.525-8.634-6.538-10.685C115.39 17.462 64.051 28.366 34.33 65.062c-29.72 36.696-29.72 89.18 0 125.876 29.72 36.696 81.06 47.6 123.13 26.152 4.013-2.051 6.538-6.178 6.538-10.685 0-4.507-2.525-8.634-6.538-10.685ZM112 204C70.026 204 36 169.974 36 128 36 86.026 70.026 52 112 52c4.55-.004 9.091 .394 13.57 1.19C104.215 72.192 91.999 99.415 91.999 128c0 28.585 12.216 55.808 33.571 74.81-4.479 .796-9.02 1.194-13.57 1.19ZM248.75 117 224.47 106.5 222.35 79.08c-.375-4.88-3.676-9.044-8.342-10.522-4.666-1.478-9.762 .027-12.878 3.802l-17 20.58L158.87 86.69c-4.686-1.156-9.609 .608-12.494 4.478-2.885 3.869-3.171 9.091-.726 13.252L159.54 128l-13.88 23.58c-2.445 4.161-2.159 9.383 .726 13.252 2.885 3.869 7.808 5.634 12.494 4.478l25.26-6.25 17 20.58c2.281 2.763 5.677 4.362 9.26 4.36 1.228 .002 2.45-.187 3.62-.56 4.665-1.478 7.965-5.641 8.34-10.52l2.12-27.42L248.75 139c4.375-1.908 7.204-6.227 7.204-11 0-4.773-2.829-9.092-7.204-11ZM208.31 130.35c-4.09 1.765-6.865 5.649-7.21 10.09l-.39 5L197.84 142c-2.279-2.76-5.671-4.359-9.25-4.36-.971-.003-1.938 .115-2.88 .35l-4.89 1.21 3-5.07c2.214-3.758 2.214-8.422 0-12.18l-3-5.07 4.89 1.21c4.476 1.108 9.191-.447 12.13-4l2.87-3.48 .39 5c.344 4.441 3.12 8.325 7.21 10.09l5.4 2.33Z"),
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
        return _starAndCrescent!!
    }

private var _starAndCrescent: ImageVector? = null
