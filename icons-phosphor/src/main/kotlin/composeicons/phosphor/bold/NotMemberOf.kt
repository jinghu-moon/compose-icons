package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.NotMemberOf: ImageVector
    get() {
        if (_notMemberOf != null) return _notMemberOf!!
        _notMemberOf = phosphorBoldIcon(
            name = "NotMemberOf",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M216.07 31.12c-4.904-4.456-12.493-4.094-16.95 .81L195.42 36h-67.42C92.178 35.982 59.606 56.77 44.537 89.269c-15.07 32.498-9.894 70.79 13.263 98.121L39.12 207.93c-2.945 3.163-3.961 7.665-2.661 11.786 1.3 4.121 4.716 7.225 8.942 8.126 4.226 .901 8.611-.54 11.479-3.773L75.55 203.54C90.932 214.274 109.243 220.02 128 220h72c6.627 0 12-5.373 12-12 0-6.627-5.373-12-12-12h-72c-12.785 .014-25.31-3.603-36.12-10.43L133.31 140h66.69c6.627 0 12-5.373 12-12 0-6.627-5.373-12-12-12h-44.87L216.88 48.07c4.456-4.904 4.094-12.493-.81-16.95ZM74.13 169.42C67.498 160.799 63.039 150.708 61.13 140h39.79ZM61.08 116C66.927 83.617 95.093 60.047 128 60h45.6l-50.91 56Z"),
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
        return _notMemberOf!!
    }

private var _notMemberOf: ImageVector? = null
