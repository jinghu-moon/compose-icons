package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.CassetteTape: ImageVector
    get() {
        if (_cassetteTape != null) return _cassetteTape!!
        _cassetteTape = phosphorFillIcon(
            name = "CassetteTape",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M156.3 96c-5.733 9.896-5.733 22.104 0 32h-56.6c5.733-9.896 5.733-22.104 0-32ZM72 96c-8.837 0-16 7.163-16 16 0 8.837 7.163 16 16 16 8.837 0 16-7.163 16-16C88 103.163 80.837 96 72 96ZM240 64v128c0 8.837-7.163 16-16 16h-192c-8.837 0-16-7.163-16-16v-128C16 55.163 23.163 48 32 48h192c8.837 0 16 7.163 16 16ZM186 192 170.4 171.2C168.889 169.186 166.518 168 164 168h-72c-2.518 0-4.889 1.186-6.4 3.2L70 192ZM216 112C216 94.327 201.673 80 184 80h-112C54.327 80 40 94.327 40 112c0 17.673 14.327 32 32 32h112c17.673 0 32-14.327 32-32ZM184 96c-8.837 0-16 7.163-16 16 0 8.837 7.163 16 16 16 8.837 0 16-7.163 16-16 0-8.837-7.163-16-16-16Z"),
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
        return _cassetteTape!!
    }

private var _cassetteTape: ImageVector? = null
