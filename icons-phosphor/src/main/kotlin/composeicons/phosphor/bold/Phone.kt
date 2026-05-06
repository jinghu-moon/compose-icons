package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Phone: ImageVector
    get() {
        if (_phone != null) return _phone!!
        _phone = phosphorBoldIcon(
            name = "Phone",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M224 154.8 176.91 133.69l-.18-.08c-6.22-2.681-13.375-2.022-19 1.75-.388 .26-.762 .54-1.12 .84l-22.31 19c-13-7.05-26.43-20.37-33.49-33.21L119.87 99.33c.306-.366 .59-.75 .85-1.15 3.672-5.603 4.295-12.671 1.66-18.83-.031-.058-.058-.118-.08-.18L101.2 32C97.644 23.9 89.202 19.086 80.42 20.15 50.391 24.095 27.953 49.713 28 80c0 81.61 66.39 148 148 148 30.287 .047 55.905-22.391 59.85-52.42 1.064-8.782-3.75-17.224-11.85-20.78ZM176 204C107.551 203.917 52.083 148.449 52 80 51.953 62.929 63.809 48.134 80.48 44.46l18.82 42L80.14 109.28c-.31 .369-.597 .756-.86 1.16-3.841 5.869-4.327 13.322-1.28 19.64 9.42 19.28 28.83 38.56 48.31 48 6.361 3.016 13.839 2.465 19.69-1.45 .387-.261 .757-.545 1.11-.85l22.43-19.07 42 18.81C207.866 192.191 193.071 204.047 176 204Z"),
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
        return _phone!!
    }

private var _phone: ImageVector? = null
