package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.CassetteTape: ImageVector
    get() {
        if (_cassetteTape != null) return _cassetteTape!!
        _cassetteTape = phosphorDuotoneIcon(
            name = "CassetteTape",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M168 168l24 32h-128L88 168ZM176 88c-13.255 0-24 10.745-24 24 0 13.255 10.745 24 24 24 13.255 0 24-10.745 24-24C200 98.745 189.255 88 176 88ZM104 112C104 98.745 93.255 88 80 88 66.745 88 56 98.745 56 112c0 13.255 10.745 24 24 24 13.255 0 24-10.745 24-24Z"),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color(0xFF000000)),
                fillAlpha = 0.2f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
            )
            addPath(
                pathData = parseSvgPathData("M224 48h-192C23.163 48 16 55.163 16 64v128c0 8.837 7.163 16 16 16h192c8.837 0 16-7.163 16-16v-128c0-8.837-7.163-16-16-16ZM80 192 92 176h72l12 16ZM224 192h-28L174.4 163.2C172.889 161.186 170.518 160 168 160h-80c-2.518 0-4.889 1.186-6.4 3.2L60 192h-28v-128h192v128ZM176 80h-96C62.327 80 48 94.327 48 112c0 17.673 14.327 32 32 32h96c17.673 0 32-14.327 32-32C208 94.327 193.673 80 176 80ZM148.3 96c-5.733 9.896-5.733 22.104 0 32h-40.6c5.733-9.896 5.733-22.104 0-32ZM64 112c0-8.837 7.163-16 16-16 8.837 0 16 7.163 16 16 0 8.837-7.163 16-16 16-8.837 0-16-7.163-16-16ZM176 128c-8.837 0-16-7.163-16-16 0-8.837 7.163-16 16-16 8.837 0 16 7.163 16 16 0 8.837-7.163 16-16 16Z"),
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
