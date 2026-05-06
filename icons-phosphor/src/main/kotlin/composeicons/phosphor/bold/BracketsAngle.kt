package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.BracketsAngle: ImageVector
    get() {
        if (_bracketsAngle != null) return _bracketsAngle!!
        _bracketsAngle = phosphorBoldIcon(
            name = "BracketsAngle",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M90.12 46.44 38.22 128l51.9 81.56c2.446 3.617 2.734 8.278 .752 12.17-1.982 3.891-5.922 6.398-10.287 6.546-4.365 .148-8.465-2.087-10.706-5.835l-56-88c-2.499-3.93-2.499-8.95 0-12.88L69.88 33.56c3.64-5.382 10.901-6.89 16.383-3.402 5.481 3.488 7.191 10.705 3.857 16.282ZM242.12 121.56l-56-88c-2.241-3.748-6.341-5.983-10.706-5.835-4.365 .148-8.304 2.655-10.287 6.546-1.982 3.891-1.694 8.552 .752 12.17L217.78 128l-51.9 81.56c-2.446 3.617-2.734 8.278-.752 12.17 1.982 3.891 5.922 6.398 10.287 6.546 4.365 .148 8.465-2.087 10.706-5.835l56-88c2.499-3.93 2.499-8.95 0-12.88Z"),
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
        return _bracketsAngle!!
    }

private var _bracketsAngle: ImageVector? = null
